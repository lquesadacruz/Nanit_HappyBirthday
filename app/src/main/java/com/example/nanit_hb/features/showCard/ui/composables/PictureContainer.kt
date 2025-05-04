package com.example.nanit_hb.features.showCard.ui.composables

import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.nanit_hb.features.showCard.domain.BirthdayCardTheme
import com.example.nanit_hb.features.showCard.util.toBorderColorResourceId
import com.example.nanit_hb.features.showCard.util.toPlaceholderImageVector

@Composable
fun PictureContainer(
    imageUri: Uri?,
    borderColorResourceId: Int,
    placeholderImageVector: ImageVector,
    modifier: Modifier = Modifier
) {
  imageUri?.let {
    Image(
        painter = rememberAsyncImagePainter(it),
        contentDescription = null,
        modifier =
            modifier
                .clip(CircleShape)
                .border(
                    width = 5.dp,
                    shape = CircleShape,
                    color = Color(borderColorResourceId),
                ),
    )
  }
      ?: Image(
          imageVector = placeholderImageVector,
          contentDescription = null,
          modifier = modifier,
      )
}

@Preview
@Composable
fun PictureContainerPreview() {
  PictureContainer(
      null,
      BirthdayCardTheme.Fox.toBorderColorResourceId(),
      BirthdayCardTheme.Fox.toPlaceholderImageVector())
}
