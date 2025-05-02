package com.example.nanit_hb.core.ui.images

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

val LocalImages.MediumFox: ImageVector
  get() {
    if (_mediumFox != null) {
      return _mediumFox!!
    }
    _mediumFox =
        Builder(
                name = "MediumFox",
                defaultWidth = 200.0.dp,
                defaultHeight = 200.0.dp,
                viewportWidth = 200.0f,
                viewportHeight = 200.0f)
            .apply {
              path(
                  fill = SolidColor(Color(0xFFA9DCCF)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(199.18f, 99.59f)
                    curveToRelative(0.0f, 55.0f, -44.59f, 99.59f, -99.59f, 99.59f)
                    reflectiveCurveTo(0.0f, 154.59f, 0.0f, 99.59f)
                    reflectiveCurveTo(44.59f, 0.0f, 99.59f, 0.0f)
                    reflectiveCurveToRelative(99.59f, 44.59f, 99.59f, 99.59f)
                  }
              path(
                  fill = SolidColor(Color(0x00000000)),
                  stroke = SolidColor(Color(0xFF6FC5AF)),
                  strokeLineWidth = 5.381f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = NonZero) {
                    moveTo(99.13f, 152.52f)
                    curveToRelative(29.49f, 0.0f, 53.39f, -23.9f, 53.39f, -53.39f)
                    reflectiveCurveTo(128.62f, 45.74f, 99.13f, 45.74f)
                    curveToRelative(-29.49f, 0.0f, -53.39f, 23.91f, -53.39f, 53.39f)
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
                    moveTo(64.57f, 100.04f)
                    reflectiveCurveToRelative(3.3f, -2.28f, 9.71f, -2.28f)
                    reflectiveCurveToRelative(9.71f, 2.28f, 9.71f, 2.28f)
                    moveTo(110.14f, 121.08f)
                    reflectiveCurveToRelative(-4.71f, 4.3f, -11.12f, 4.3f)
                    reflectiveCurveToRelative(-11.12f, -4.3f, -11.12f, -4.3f)
                    moveTo(113.0f, 100.04f)
                    reflectiveCurveToRelative(3.3f, -2.28f, 9.71f, -2.28f)
                    reflectiveCurveToRelative(9.71f, 2.28f, 9.71f, 2.28f)
                    moveTo(97.85f, 47.53f)
                    reflectiveCurveToRelative(-7.06f, 8.55f, -3.64f, 13.35f)
                    curveToRelative(3.42f, 4.79f, 12.13f, 6.07f, 15.77f, 3.64f)
                  }
            }
            .build()
    return _mediumFox!!
  }

private var _mediumFox: ImageVector? = null

@Preview
@Composable
private fun Preview() {
  Box(modifier = Modifier.padding(12.dp)) {
    Image(imageVector = LocalImages.MediumFox, contentDescription = null)
  }
}
