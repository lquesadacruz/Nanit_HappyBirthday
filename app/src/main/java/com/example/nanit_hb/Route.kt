package com.example.nanit_hb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

sealed class Route {
  @Serializable @SerialName("connect") data object Connect : Route()

  @Serializable @SerialName("birthday_card") data object BirthdayCard : Route()
}
