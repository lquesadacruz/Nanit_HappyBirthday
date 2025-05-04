package com.example.nanit_hb.features.showCard.ui.logic

sealed interface BirthdayCardAction {
  data class SendMessage(val message: String) : BirthdayCardAction
}
