package com.example.nanit_hb.core.ui.composables

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.coroutines.delay

@Composable
fun AnimatedImageVectorWithFadeScale(
    imageVector: ImageVector,
    contentDescription: String? = null,
    modifier: Modifier = Modifier,
    triggerKey: Any = imageVector // change this value to re-trigger the animation
) {
  var animateToggle by remember(triggerKey) { mutableStateOf(false) }

  val scale by
      animateFloatAsState(
          targetValue = if (animateToggle) 1f else 0.8f,
          animationSpec = tween(200),
          label = "scaleAnim")

  val alpha by
      animateFloatAsState(
          targetValue = if (animateToggle) 1f else 0f,
          animationSpec = tween(200),
          label = "alphaAnim")

  // Restart animation on triggerKey change
  LaunchedEffect(triggerKey) {
    animateToggle = false
    delay(1) // small delay to trigger re-animation
    animateToggle = true
  }

  Image(
      imageVector = imageVector,
      contentDescription = contentDescription,
      modifier =
          modifier.graphicsLayer {
            this.alpha = alpha
            this.scaleX = scale
            this.scaleY = scale
          },
  )
}
