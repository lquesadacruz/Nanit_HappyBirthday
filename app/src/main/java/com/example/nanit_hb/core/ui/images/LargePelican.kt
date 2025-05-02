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

val LocalImages.LargePelican: ImageVector
  get() {
    if (_largePelican != null) {
      return _largePelican!!
    }
    _largePelican =
        Builder(
                name = "LargePelican",
                defaultWidth = 208.0.dp,
                defaultHeight = 208.0.dp,
                viewportWidth = 208.0f,
                viewportHeight = 208.0f)
            .apply {
              path(
                  fill = SolidColor(Color(0xFFB9E5EF)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(204.18f, 103.59f)
                    curveToRelative(0.0f, 55.0f, -44.59f, 99.59f, -99.59f, 99.59f)
                    reflectiveCurveTo(5.0f, 158.59f, 5.0f, 103.59f)
                    reflectiveCurveTo(49.59f, 4.0f, 104.59f, 4.0f)
                    reflectiveCurveToRelative(99.59f, 44.59f, 99.59f, 99.59f)
                  }
              path(
                  fill = SolidColor(Color(0x00000000)),
                  stroke = SolidColor(Color(0xFF8BD3E4)),
                  strokeLineWidth = 5.381f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = NonZero) {
                    moveTo(104.13f, 156.52f)
                    curveToRelative(29.49f, 0.0f, 53.39f, -23.9f, 53.39f, -53.39f)
                    reflectiveCurveTo(133.62f, 49.74f, 104.13f, 49.74f)
                    reflectiveCurveToRelative(-53.39f, 23.91f, -53.39f, 53.39f)
                    reflectiveCurveToRelative(23.9f, 53.39f, 53.39f, 53.39f)
                    close()
                  }
              path(
                  fill = SolidColor(Color(0x00000000)),
                  stroke = SolidColor(Color(0xFF8BD3E4)),
                  strokeLineWidth = 5.381f,
                  strokeLineCap = Round,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = NonZero) {
                    moveTo(69.57f, 104.04f)
                    reflectiveCurveToRelative(3.3f, -2.28f, 9.71f, -2.28f)
                    reflectiveCurveToRelative(9.71f, 2.28f, 9.71f, 2.28f)
                    moveTo(115.14f, 125.08f)
                    reflectiveCurveToRelative(-4.71f, 4.3f, -11.12f, 4.3f)
                    curveToRelative(-6.41f, 0.0f, -11.12f, -4.3f, -11.12f, -4.3f)
                    moveTo(118.0f, 104.04f)
                    reflectiveCurveToRelative(3.3f, -2.28f, 9.71f, -2.28f)
                    reflectiveCurveToRelative(9.71f, 2.28f, 9.71f, 2.28f)
                    moveTo(102.85f, 51.53f)
                    reflectiveCurveToRelative(-7.06f, 8.55f, -3.64f, 13.35f)
                    curveToRelative(3.42f, 4.79f, 12.14f, 6.07f, 15.77f, 3.64f)
                  }
              path(
                  fill = SolidColor(Color(0x00000000)),
                  stroke = SolidColor(Color(0xFF8BD3E4)),
                  fillAlpha = 0.78f,
                  strokeAlpha = 0.78f,
                  strokeLineWidth = 7.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = NonZero) {
                    moveTo(104.0f, 104.0f)
                    moveToRelative(-100.0f, 0.0f)
                    arcToRelative(100.0f, 100.0f, 0.0f, true, true, 200.0f, 0.0f)
                    arcToRelative(100.0f, 100.0f, 0.0f, true, true, -200.0f, 0.0f)
                  }
            }
            .build()
    return _largePelican!!
  }

private var _largePelican: ImageVector? = null

@Preview
@Composable
private fun Preview() {
  Box(modifier = Modifier.padding(12.dp)) {
    Image(imageVector = LocalImages.LargePelican, contentDescription = null)
  }
}
