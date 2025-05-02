package com.example.nanit_hb.features.showCard.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nanit_hb.features.connect.domain.IConnectionService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class BirthdayCardViewModel(val connectionService: IConnectionService) : ViewModel() {
  private val _state = MutableStateFlow(BirthdayCardState())
  val state = _state.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), _state.value)

  init {
    viewModelScope.launch {
      connectionService.messages.collectLatest { message ->
        _state.update { it.copy(message = message) }
      }
    }
  }

  fun onAction(action: BirthdayCardAction) {
    when (action) {
      is BirthdayCardAction.SendMessage -> sendMessage(action.message)
    }
  }

  private fun sendMessage(message: String) {
    viewModelScope.launch { connectionService.sendMessage(message) }
  }
}
