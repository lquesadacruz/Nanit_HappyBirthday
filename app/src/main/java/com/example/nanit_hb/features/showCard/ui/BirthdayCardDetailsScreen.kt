package com.example.nanit_hb.features.showCard.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.nanit_hb.features.showCard.domain.BirthdayCardTheme

@Composable
fun BirthdayCardDetailsScreen(name: String, years: Int, months: Int, theme: BirthdayCardTheme) {
  Scaffold { innerPadding ->
    Box(Modifier.padding(innerPadding).fillMaxSize(), contentAlignment = Alignment.Center) {
      Text("$name | $years years | $months months | $theme")
    }
  }
}
