package com.example.nanit_hb.features.showCard.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nanit_hb.core.domain.IConnectionService
import com.example.nanit_hb.features.showCard.data.NanitSocketResponse
import com.example.nanit_hb.features.showCard.data.toBirthdayCardData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json

class BirthdayCardViewModel(val connectionService: IConnectionService) : ViewModel() {
  private val _state = MutableStateFlow(BirthdayCardState())
  val state = _state.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), _state.value)

  init {
    viewModelScope.launch {
      try {
        connectionService.messages.collectLatest { message ->
          val response = Json.decodeFromString<NanitSocketResponse>(message)
          val data = response.toBirthdayCardData()
          _state.update { it.copy(data = data) }
        }
      } catch (_: Exception) {
        connectionService.close()
      }
    }
  }

  fun onAction(action: BirthdayCardAction) {
    when (action) {
      is BirthdayCardAction.SendMessage -> sendMessage(action.message)
    }
  }

  private fun sendMessage(message: String) {
    viewModelScope.launch {
      try {
        connectionService.sendMessage(message)
      } catch (_: Exception) {
        connectionService.close()
      }
    }
  }
}
