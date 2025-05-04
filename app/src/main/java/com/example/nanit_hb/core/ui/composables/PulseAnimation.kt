package com.example.nanit_hb.core.ui.composables

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun PulseAnimation(
    modifier: Modifier = Modifier,
    childImageVector: ImageVector? = null,
    childImageContentDescription: String? = null,
    childImageBorderColorResourceId: Int = 0,
) {
  val transition = rememberInfiniteTransition()
  val progress by
      transition.animateFloat(
          initialValue = 0f,
          targetValue = 1f,
          animationSpec =
              infiniteRepeatable(
                  animation = tween(1500), // speed is inversely proportional to this number
                  repeatMode = RepeatMode.Restart,
              ),
      )

  Box(
      modifier =
          modifier.graphicsLayer {
            scaleX = progress
            scaleY = progress
            alpha = 1f - progress / 2
          },
  ) {
    if (childImageVector != null) {
      Image(
          imageVector = childImageVector,
          contentDescription = childImageContentDescription,
          contentScale = ContentScale.Crop,
          modifier =
              Modifier.border(
                  width = 1.dp,
                  color = Color(childImageBorderColorResourceId),
                  shape = CircleShape,
              ),
      )
    }
  }
}
