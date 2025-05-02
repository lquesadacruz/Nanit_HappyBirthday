package com.example.nanit_hb.core.ui.images

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val LocalImages.Number7: ImageVector
  get() {
    if (_number7 != null) {
      return _number7!!
    }
    _number7 =
        Builder(
                name = "Number7",
                defaultWidth = 66.0.dp,
                defaultHeight = 89.0.dp,
                viewportWidth = 66.0f,
                viewportHeight = 89.0f)
            .apply {
              path(
                  fill = SolidColor(Color(0xFF25304A)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(65.683f, 6.78f)
                    lineTo(31.44f, 88.217f)
                    horizontalLineTo(9.175f)
                    lineToRelative(27.95f, -65.341f)
                    horizontalLineTo(3.852f)
                    verticalLineTo(3.514f)
                    horizontalLineToRelative(61.832f)
                    close()
                  }
              path(
                  fill = SolidColor(Color(0xFF000000)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveToRelative(13.502f, 80.215f)
                    lineToRelative(27.951f, -65.34f)
                    horizontalLineTo(5.601f)
                    verticalLineToRelative(-9.36f)
                    horizontalLineToRelative(50.678f)
                    lineToRelative(-31.411f, 74.7f)
                    close()
                  }
              path(
                  fill = SolidColor(Color(0xFFEF7B7B)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(20.808f, 77.1f)
                    lineTo(49.244f, 9.339f)
                    horizontalLineTo(7.74f)
                    verticalLineToRelative(1.089f)
                    horizontalLineToRelative(39.688f)
                    lineTo(19.477f, 77.1f)
                    close()
                    moveTo(62.433f, 3.531f)
                    lineTo(28.19f, 84.965f)
                    horizontalLineTo(5.925f)
                    lineTo(33.15f, 19.624f)
                    horizontalLineTo(0.6f)
                    verticalLineTo(0.264f)
                    horizontalLineToRelative(61.832f)
                    close()
                  }
            }
            .build()
    return _number7!!
  }

private var _number7: ImageVector? = null

@Preview
@Composable
private fun Preview() {
  Box(modifier = Modifier.padding(12.dp)) {
    Image(imageVector = LocalImages.Number7, contentDescription = null)
  }
}
