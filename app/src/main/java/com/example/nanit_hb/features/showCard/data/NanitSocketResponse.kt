package com.example.nanit_hb.features.showCard.data

import com.example.nanit_hb.features.showCard.domain.BirthdayCardData
import com.example.nanit_hb.features.showCard.domain.BirthdayCardTheme
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.periodUntil
import kotlinx.datetime.toLocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class NanitSocketResponse(
    val name: String,
    val dob: Long,
    val theme: String,
)

fun NanitSocketResponse.toBirthdayCardData(): BirthdayCardData {
  val date = dob.toLocalDateFromMillis()
  val today = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault()).date
  val period = date.periodUntil(today)
  val birthdayCardTheme =
      BirthdayCardTheme.entries.first { it -> it.name.lowercase() == theme.lowercase() }
  return BirthdayCardData(name, period.years, period.months, birthdayCardTheme)
}

fun Long.toLocalDateFromMillis(): LocalDate {
  return Instant.fromEpochMilliseconds(this).toLocalDateTime(TimeZone.currentSystemDefault()).date
}
