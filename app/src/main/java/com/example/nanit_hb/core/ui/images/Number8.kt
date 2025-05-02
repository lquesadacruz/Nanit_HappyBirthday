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

val LocalImages.Number8: ImageVector
  get() {
    if (_number8 != null) {
      return _number8!!
    }
    _number8 =
        Builder(
                name = "Number8",
                defaultWidth = 69.0.dp,
                defaultHeight = 92.0.dp,
                viewportWidth = 69.0f,
                viewportHeight = 92.0f)
            .apply {
              path(
                  fill = SolidColor(Color(0xFF25304A)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(36.223f, 21.124f)
                    curveToRelative(-10.527f, 0.0f, -10.527f, 13.552f, 0.0f, 13.552f)
                    curveToRelative(10.406f, 0.0f, 10.406f, -13.553f, 0.0f, -13.553f)
                    moveToRelative(0.0f, 31.218f)
                    curveToRelative(-14.521f, 0.0f, -14.521f, 21.054f, 0.0f, 21.054f)
                    curveToRelative(14.64f, 0.0f, 14.64f, -21.054f, 0.0f, -21.054f)
                    moveToRelative(0.0f, 39.326f)
                    curveToRelative(-34.486f, 0.0f, -41.625f, -35.213f, -21.418f, -49.733f)
                    curveTo(2.463f, 28.505f, 9.844f, 4.063f, 36.223f, 4.063f)
                    reflectiveCurveTo(69.862f, 28.747f, 57.64f, 42.057f)
                    curveToRelative(19.966f, 14.64f, 12.826f, 49.61f, -21.417f, 49.61f)
                  }
              path(
                  fill = SolidColor(Color(0xFF000000)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(32.973f, 13.124f)
                    curveToRelative(-4.751f, 0.0f, -7.731f, 1.913f, -9.395f, 3.52f)
                    arcToRelative(11.38f, 11.38f, 0.0f, false, false, -3.501f, 8.255f)
                    curveToRelative(0.0f, 7.65f, 6.645f, 11.776f, 12.896f, 11.776f)
                    curveToRelative(4.729f, 0.0f, 7.693f, -1.925f, 9.347f, -3.54f)
                    arcToRelative(11.42f, 11.42f, 0.0f, false, false, 3.458f, -8.236f)
                    curveToRelative(0.0f, -7.649f, -6.598f, -11.776f, -12.805f, -11.776f)
                    moveToRelative(0.0f, 31.218f)
                    curveToRelative(-10.433f, 0.0f, -15.891f, 7.81f, -15.891f, 15.526f)
                    reflectiveCurveToRelative(5.458f, 15.527f, 15.89f, 15.527f)
                    curveToRelative(10.492f, 0.0f, 15.98f, -7.81f, 15.98f, -15.526f)
                    reflectiveCurveToRelative(-5.488f, -15.527f, -15.98f, -15.527f)
                    moveToRelative(0.0f, 39.326f)
                    curveToRelative(-13.353f, 0.0f, -23.284f, -6.086f, -26.566f, -16.278f)
                    curveToRelative(-2.91f, -9.035f, 0.332f, -18.836f, 8.066f, -24.394f)
                    lineToRelative(4.579f, -3.291f)
                    lineToRelative(-3.815f, -4.152f)
                    curveToRelative(-4.554f, -4.956f, -5.765f, -12.101f, -3.085f, -18.202f)
                    curveToRelative(3.15f, -7.174f, 10.739f, -11.29f, 20.82f, -11.29f)
                    curveToRelative(10.022f, 0.0f, 17.58f, 4.127f, 20.742f, 11.32f)
                    curveToRelative(2.71f, 6.171f, 1.53f, 13.35f, -3.007f, 18.294f)
                    lineToRelative(-3.776f, 4.111f)
                    lineToRelative(4.502f, 3.303f)
                    curveToRelative(7.677f, 5.629f, 10.852f, 15.465f, 7.902f, 24.474f)
                    curveToRelative(-3.3f, 10.084f, -13.156f, 16.105f, -26.362f, 16.105f)
                  }
              path(
                  fill = SolidColor(Color(0xFFEF7B7B)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(32.973f, 18.72f)
                    curveToRelative(-9.56f, 0.0f, -9.56f, 12.342f, 0.0f, 12.342f)
                    curveToRelative(9.438f, 0.0f, 9.438f, -12.342f, 0.0f, -12.342f)
                    moveToRelative(0.0f, 30.371f)
                    curveToRelative(-14.521f, 0.0f, -14.521f, 21.055f, 0.0f, 21.055f)
                    curveToRelative(14.64f, 0.0f, 14.64f, -21.055f, 0.0f, -21.055f)
                    moveToRelative(0.0f, -38.478f)
                    curveToRelative(21.296f, 0.0f, 21.296f, 29.041f, 0.0f, 29.041f)
                    curveToRelative(-21.297f, 0.0f, -21.297f, -29.04f, 0.0f, -29.04f)
                    moveToRelative(0.0f, 30.008f)
                    curveToRelative(27.467f, 0.0f, 27.467f, 37.753f, 0.0f, 37.753f)
                    curveToRelative(-27.59f, 0.0f, -27.59f, -37.753f, 0.0f, -37.753f)
                    moveToRelative(-5.81f, -0.484f)
                    curveTo(3.812f, 44.978f, 5.87f, 79.463f, 32.974f, 79.463f)
                    curveToRelative(26.983f, 0.0f, 28.919f, -34.727f, 5.323f, -39.447f)
                    curveToRelative(17.546f, -4.598f, 15.61f, -30.613f, -5.323f, -30.613f)
                    curveToRelative(-20.812f, 0.0f, -22.75f, 25.652f, -5.81f, 30.492f)
                    close()
                    moveTo(32.973f, 88.418f)
                    curveToRelative(-34.486f, 0.0f, -41.625f, -35.212f, -21.418f, -49.732f)
                    curveTo(-0.787f, 25.255f, 6.594f, 0.812f, 32.973f, 0.812f)
                    reflectiveCurveTo(66.612f, 25.496f, 54.39f, 38.806f)
                    curveToRelative(19.966f, 14.642f, 12.826f, 49.611f, -21.417f, 49.611f)
                  }
            }
            .build()
    return _number8!!
  }

private var _number8: ImageVector? = null

@Preview
@Composable
private fun Preview() {
  Box(modifier = Modifier.padding(12.dp)) {
    Image(imageVector = LocalImages.Number8, contentDescription = null)
  }
}
