package com.example.nanit_hb

import com.example.nanit_hb.features.showCard.domain.BirthdayCardTheme
import kotlinx.serialization.Serializable

sealed class Route {
  @Serializable data object Connect : Route()

  @Serializable data object BirthdayCard : Route()

  @Serializable
  data class BirthdayCardDetails(
      val name: String,
      val years: Int,
      val months: Int,
      val theme: BirthdayCardTheme
  ) : Route()
}
