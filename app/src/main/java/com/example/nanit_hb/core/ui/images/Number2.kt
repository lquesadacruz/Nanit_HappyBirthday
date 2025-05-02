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

val LocalImages.Number2: ImageVector
  get() {
    if (_number2 != null) {
      return _number2!!
    }
    _number2 =
        Builder(
                name = "Number2",
                defaultWidth = 63.0.dp,
                defaultHeight = 91.0.dp,
                viewportWidth = 63.0f,
                viewportHeight = 91.0f)
            .apply {
              path(
                  fill = SolidColor(Color(0xFF25304A)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(32.078f, 23.543f)
                    curveToRelative(-4.84f, 0.0f, -8.349f, 2.3f, -8.349f, 8.228f)
                    horizontalLineTo(5.337f)
                    curveTo(5.095f, 13.5f, 17.437f, 4.545f, 32.441f, 4.183f)
                    curveToRelative(24.322f, -0.606f, 34.97f, 23.473f, 22.386f, 42.955f)
                    lineTo(37.765f, 70.855f)
                    horizontalLineToRelative(25.168f)
                    verticalLineToRelative(19.36f)
                    horizontalLineTo(3.4f)
                    verticalLineToRelative(-3.267f)
                    lineToRelative(31.824f, -46.586f)
                    curveToRelative(4.235f, -5.687f, 7.502f, -16.819f, -3.146f, -16.819f)
                  }
              path(
                  fill = SolidColor(Color(0xFF000000)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveToRelative(7.39f, 82.215f)
                    lineToRelative(28.66f, -41.954f)
                    curveToRelative(2.949f, -4.003f, 6.99f, -12.384f, 3.738f, -18.859f)
                    curveToRelative(-1.098f, -2.189f, -3.983f, -5.859f, -10.96f, -5.859f)
                    curveToRelative(-6.387f, 0.0f, -10.897f, 3.051f, -12.6f, 8.228f)
                    horizontalLineTo(7.398f)
                    curveTo(9.733f, 7.975f, 24.492f, 6.298f, 29.313f, 6.182f)
                    quadToRelative(0.392f, -0.01f, 0.774f, -0.01f)
                    curveToRelative(8.637f, 0.0f, 15.665f, 3.808f, 19.28f, 10.447f)
                    curveToRelative(3.943f, 7.241f, 3.204f, 16.697f, -1.924f, 24.704f)
                    lineTo(24.76f, 72.855f)
                    horizontalLineToRelative(29.924f)
                    verticalLineToRelative(9.36f)
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
                    moveTo(28.95f, 10.008f)
                    curveToRelative(-7.745f, -0.12f, -14.279f, 3.146f, -17.063f, 10.77f)
                    horizontalLineToRelative(1.332f)
                    curveToRelative(2.662f, -6.898f, 8.833f, -9.923f, 15.73f, -9.68f)
                    curveToRelative(17.908f, 0.361f, 21.538f, 15.85f, 12.584f, 28.918f)
                    lineTo(15.638f, 77.89f)
                    horizontalLineToRelative(34.85f)
                    verticalLineToRelative(-1.21f)
                    horizontalLineTo(17.695f)
                    lineToRelative(24.926f, -36.059f)
                    curveToRelative(9.56f, -13.794f, 5.203f, -30.372f, -13.673f, -30.613f)
                    moveToRelative(-0.122f, 10.285f)
                    curveToRelative(-4.84f, 0.0f, -8.349f, 2.3f, -8.349f, 8.228f)
                    horizontalLineTo(2.087f)
                    curveTo(1.845f, 10.25f, 14.187f, 1.295f, 29.191f, 0.933f)
                    curveToRelative(24.321f, -0.606f, 34.97f, 23.473f, 22.386f, 42.955f)
                    lineTo(34.515f, 67.605f)
                    horizontalLineToRelative(25.168f)
                    verticalLineToRelative(19.36f)
                    horizontalLineTo(0.15f)
                    verticalLineToRelative(-3.267f)
                    lineToRelative(31.824f, -46.586f)
                    curveToRelative(4.235f, -5.687f, 7.502f, -16.819f, -3.146f, -16.819f)
                  }
            }
            .build()
    return _number2!!
  }

private var _number2: ImageVector? = null

@Preview
@Composable
private fun Preview() {
  Box(modifier = Modifier.padding(12.dp)) {
    Image(imageVector = LocalImages.Number2, contentDescription = null)
  }
}
