package com.example.nanit_hb.features.showCard.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn

class BirthdayCardViewModel : ViewModel() {
  private val _state = MutableStateFlow(BirthdayCardState())
  val state = _state.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), _state.value)

  fun onAction(action: BirthdayCardAction) {}
}
