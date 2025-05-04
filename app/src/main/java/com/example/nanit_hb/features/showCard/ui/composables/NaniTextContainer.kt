package com.example.nanit_hb.features.showCard.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.nanit_hb.R

@Composable
fun NaniTextContainer(modifier: Modifier = Modifier) {
  Image(
      painter = painterResource(R.drawable.nanit),
      contentDescription = stringResource(R.string.nanit),
      modifier = modifier,
  )
}

@Preview
@Composable
fun TextContainerPreview() {
  NaniTextContainer()
}
