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

val LocalImages.Number9: ImageVector
  get() {
    if (_number9 != null) {
      return _number9!!
    }
    _number9 =
        Builder(
                name = "Number9",
                defaultWidth = 68.0.dp,
                defaultHeight = 91.0.dp,
                viewportWidth = 68.0f,
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
                    moveTo(24.812f, 32.344f)
                    curveToRelative(0.0f, 6.171f, 4.235f, 10.648f, 10.648f, 10.648f)
                    curveToRelative(7.018f, 0.0f, 10.649f, -4.114f, 10.649f, -10.648f)
                    curveToRelative(0.0f, -5.929f, -3.993f, -10.527f, -10.65f, -10.527f)
                    curveToRelative(-6.412f, 0.0f, -10.647f, 4.598f, -10.647f, 10.527f)
                    moveTo(14.769f, 90.062f)
                    lineToRelative(18.029f, -30.614f)
                    curveTo(14.89f, 60.78f, 3.274f, 48.438f, 3.274f, 32.344f)
                    curveToRelative(0.0f, -19.965f, 13.552f, -29.04f, 32.186f, -29.04f)
                    curveToRelative(18.513f, 0.0f, 32.55f, 9.075f, 32.55f, 29.04f)
                    curveToRelative(0.0f, 5.81f, -1.09f, 11.737f, -4.477f, 16.698f)
                    lineToRelative(-24.685f, 41.02f)
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
                    moveTo(32.21f, 13.817f)
                    curveToRelative(-8.92f, 0.0f, -15.648f, 6.676f, -15.648f, 15.527f)
                    curveToRelative(0.0f, 9.068f, 6.581f, 15.649f, 15.648f, 15.649f)
                    curveToRelative(9.506f, 0.0f, 15.648f, -6.143f, 15.648f, -15.65f)
                    curveToRelative(0.0f, -8.996f, -6.58f, -15.526f, -15.648f, -15.526f)
                    moveTo(20.266f, 82.062f)
                    lineToRelative(18.438f, -31.307f)
                    lineToRelative(-9.527f, 0.708f)
                    curveToRelative(-0.755f, 0.056f, -1.51f, 0.084f, -2.245f, 0.084f)
                    curveToRelative(-6.51f, 0.0f, -12.04f, -2.185f, -15.996f, -6.321f)
                    curveToRelative(-3.813f, -3.986f, -5.913f, -9.627f, -5.913f, -15.882f)
                    curveToRelative(0.0f, -10.966f, 4.717f, -24.04f, 27.187f, -24.04f)
                    curveToRelative(10.29f, 0.0f, 27.55f, 3.123f, 27.55f, 24.04f)
                    curveToRelative(0.0f, 5.785f, -1.18f, 10.325f, -3.607f, 13.879f)
                    lineToRelative(-0.08f, 0.118f)
                    lineToRelative(-23.3f, 38.72f)
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
                    moveTo(21.562f, 29.094f)
                    curveToRelative(0.0f, 6.897f, 3.509f, 10.648f, 10.648f, 10.648f)
                    curveToRelative(7.38f, 0.0f, 10.649f, -3.75f, 10.649f, -10.648f)
                    curveToRelative(0.0f, -6.655f, -3.268f, -10.527f, -10.65f, -10.527f)
                    curveToRelative(-7.138f, 0.0f, -10.647f, 3.872f, -10.647f, 10.527f)
                    moveToRelative(-10.285f, 0.0f)
                    curveToRelative(0.0f, -11.979f, 9.317f, -18.876f, 20.933f, -18.876f)
                    curveToRelative(11.738f, 0.0f, 20.813f, 6.897f, 20.813f, 18.876f)
                    curveToRelative(0.0f, 12.101f, -9.075f, 18.876f, -20.813f, 18.876f)
                    curveToRelative(-11.616f, 0.0f, -20.933f, -6.775f, -20.933f, -18.876f)
                    moveTo(32.21f, 49.18f)
                    curveToRelative(5.566f, 0.0f, 10.89f, -1.815f, 14.883f, -4.598f)
                    lineToRelative(0.12f, 0.121f)
                    curveToRelative(-6.654f, 11.374f, -13.43f, 22.991f, -20.085f, 34.365f)
                    horizontalLineToRelative(1.453f)
                    lineToRelative(22.627f, -38.962f)
                    curveToRelative(2.056f, -3.51f, 3.025f, -6.656f, 3.025f, -11.012f)
                    curveToRelative(0.0f, -12.584f, -9.56f, -19.965f, -22.023f, -19.965f)
                    curveToRelative(-12.342f, 0.0f, -21.901f, 7.381f, -21.901f, 19.965f)
                    curveToRelative(0.0f, 12.705f, 9.68f, 20.086f, 21.9f, 20.086f)
                    moveTo(11.519f, 86.812f)
                    lineToRelative(18.029f, -30.614f)
                    curveTo(11.64f, 57.53f, 0.024f, 47.002f, 0.024f, 29.094f)
                    curveTo(0.024f, 9.13f, 13.576f, 0.054f, 32.21f, 0.054f)
                    curveToRelative(18.513f, 0.0f, 32.55f, 9.075f, 32.55f, 29.04f)
                    curveToRelative(0.0f, 5.81f, -1.09f, 11.737f, -4.477f, 16.698f)
                    lineToRelative(-24.685f, 41.02f)
                    close()
                  }
            }
            .build()
    return _number9!!
  }

private var _number9: ImageVector? = null

@Preview
@Composable
private fun Preview() {
  Box(modifier = Modifier.padding(12.dp)) {
    Image(imageVector = LocalImages.Number9, contentDescription = null)
  }
}
