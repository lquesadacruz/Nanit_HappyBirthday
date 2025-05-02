package com.example.nanit_hb.features.showCard.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.nanit_hb.features.showCard.domain.BirthdayCardTheme
import com.example.nanit_hb.features.showCard.util.toDrawableResourceId

@Composable
fun BirthdayCardDetailsScreen(name: String, years: Int, months: Int, theme: BirthdayCardTheme) {
  Box(modifier = Modifier.fillMaxSize()) {
    Image(
        painter = painterResource(id = theme.toDrawableResourceId()),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize())

    // Add your content here
    Box(modifier = Modifier.align(Alignment.Center)) {
      Text("$name | $years years | $months months | $theme")
    }
  }
}
