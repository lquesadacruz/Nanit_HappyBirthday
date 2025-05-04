package com.example.nanit_hb.features.showCard.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.example.nanit_hb.features.showCard.domain.BirthdayCardTheme
import com.example.nanit_hb.features.showCard.util.toCameraImageVector

@Composable
fun CameraContainer(
    imageVector: ImageVector,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    onCameraClicked: () -> Unit = {}
) {
  Image(
      imageVector = imageVector,
      contentDescription = contentDescription,
      modifier =
          modifier.clickable(
              onClick = { onCameraClicked() },
          ),
  )
}

@Preview
@Composable
fun CameraContainerPreview() {
  CameraContainer(BirthdayCardTheme.Elephant.toCameraImageVector(), null)
}
