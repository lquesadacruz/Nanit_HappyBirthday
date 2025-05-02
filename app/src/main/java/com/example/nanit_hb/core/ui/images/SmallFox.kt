package com.example.nanit_hb.core.ui.images

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val LocalImages.SmallFox: ImageVector
  get() {
    if (_smallFox != null) {
      return _smallFox!!
    }
    _smallFox =
        Builder(
                name = "SmallFox",
                defaultWidth = 113.0.dp,
                defaultHeight = 113.0.dp,
                viewportWidth = 113.0f,
                viewportHeight = 113.0f)
            .apply {
              path(
                  fill = SolidColor(Color(0x00000000)),
                  stroke = SolidColor(Color(0xFF6FC5AF)),
                  strokeLineWidth = 5.381f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = NonZero) {
                    moveTo(56.39f, 109.78f)
                    curveToRelative(29.49f, 0.0f, 53.39f, -23.9f, 53.39f, -53.39f)
                    reflectiveCurveTo(85.88f, 3.0f, 56.39f, 3.0f)
                    curveTo(26.9f, 3.0f, 3.0f, 26.91f, 3.0f, 56.39f)
                    reflectiveCurveToRelative(23.9f, 53.39f, 53.39f, 53.39f)
                    close()
                  }
              path(
                  fill = SolidColor(Color(0x00000000)),
                  stroke = SolidColor(Color(0xFF6FC5AF)),
                  strokeLineWidth = 5.381f,
                  strokeLineCap = Round,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = NonZero) {
                    moveTo(21.83f, 57.3f)
                    reflectiveCurveToRelative(3.3f, -2.28f, 9.71f, -2.28f)
                    reflectiveCurveToRelative(9.71f, 2.28f, 9.71f, 2.28f)
                    moveTo(67.4f, 78.34f)
                    reflectiveCurveToRelative(-4.71f, 4.3f, -11.12f, 4.3f)
                    curveToRelative(-6.41f, 0.0f, -11.12f, -4.3f, -11.12f, -4.3f)
                    moveTo(70.26f, 57.3f)
                    reflectiveCurveToRelative(3.3f, -2.28f, 9.71f, -2.28f)
                    reflectiveCurveToRelative(9.71f, 2.28f, 9.71f, 2.28f)
                    moveTo(55.11f, 4.79f)
                    reflectiveCurveToRelative(-7.06f, 8.55f, -3.64f, 13.35f)
                    curveToRelative(3.42f, 4.79f, 12.14f, 6.07f, 15.77f, 3.64f)
                  }
            }
            .build()
    return _smallFox!!
  }

private var _smallFox: ImageVector? = null

@Preview
@Composable
private fun Preview() {
  Box(modifier = Modifier.padding(12.dp)) {
    Image(imageVector = LocalImages.SmallFox, contentDescription = null)
  }
}
