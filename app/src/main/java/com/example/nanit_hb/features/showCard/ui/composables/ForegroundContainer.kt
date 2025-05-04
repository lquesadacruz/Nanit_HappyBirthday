package com.example.nanit_hb.features.showCard.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.nanit_hb.features.showCard.domain.BirthdayCardTheme
import com.example.nanit_hb.features.showCard.util.toForegroundResourceId

@Composable
fun ForegroundContainer(theme: BirthdayCardTheme) {
  Image(
      painter = painterResource(id = theme.toForegroundResourceId()),
      contentDescription = null,
      modifier = Modifier.fillMaxSize(),
  )
}

@Preview
@Composable
fun ForegroundContainerPreview() {
  ForegroundContainer(BirthdayCardTheme.Pelican)
}
