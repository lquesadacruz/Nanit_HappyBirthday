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

val LocalImages.Number6: ImageVector
  get() {
    if (_number6 != null) {
      return _number6!!
    }
    _number6 =
        Builder(
                name = "Number6",
                defaultWidth = 70.0.dp,
                defaultHeight = 91.0.dp,
                viewportWidth = 70.0f,
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
                    moveTo(47.296f, 61.385f)
                    curveToRelative(0.0f, -5.687f, -3.388f, -10.648f, -10.527f, -10.648f)
                    curveToRelative(-7.26f, 0.0f, -10.891f, 4.961f, -10.891f, 10.648f)
                    curveToRelative(0.0f, 6.171f, 4.356f, 10.77f, 10.89f, 10.77f)
                    curveToRelative(6.777f, 0.0f, 10.528f, -4.599f, 10.528f, -10.77f)
                    moveToRelative(9.922f, -57.598f)
                    lineTo(39.31f, 34.281f)
                    curveToRelative(17.908f, -1.332f, 29.766f, 9.558f, 29.766f, 27.104f)
                    curveToRelative(0.0f, 19.844f, -14.278f, 29.161f, -32.307f, 29.161f)
                    curveToRelative(-18.272f, 0.0f, -32.55f, -9.317f, -32.55f, -29.16f)
                    curveToRelative(0.0f, -5.81f, 1.21f, -11.617f, 4.477f, -16.579f)
                    lineToRelative(24.443f, -41.02f)
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
                    moveTo(33.519f, 42.737f)
                    curveToRelative(-9.356f, 0.0f, -15.891f, 6.435f, -15.891f, 15.648f)
                    curveToRelative(0.0f, 9.137f, 6.683f, 15.769f, 15.89f, 15.769f)
                    curveToRelative(9.144f, 0.0f, 15.528f, -6.484f, 15.528f, -15.77f)
                    curveToRelative(0.0f, -9.212f, -6.384f, -15.647f, -15.527f, -15.647f)
                    moveToRelative(0.0f, 39.81f)
                    curveToRelative(-8.283f, 0.0f, -27.55f, -2.355f, -27.55f, -24.162f)
                    curveToRelative(0.0f, -5.494f, 1.23f, -10.146f, 3.654f, -13.828f)
                    lineToRelative(0.119f, -0.19f)
                    lineTo(32.73f, 5.787f)
                    horizontalLineToRelative(12.503f)
                    lineTo(26.917f, 36.975f)
                    lineToRelative(9.514f, -0.707f)
                    arcToRelative(35.0f, 35.0f, 0.0f, false, true, 2.536f, -0.095f)
                    curveToRelative(13.484f, 0.0f, 21.86f, 8.51f, 21.86f, 22.213f)
                    curveToRelative(0.0f, 7.265f, -2.662f, 24.162f, -27.308f, 24.162f)
                  }
              path(
                  fill = SolidColor(Color(0xFFEF7B7B)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(44.046f, 58.135f)
                    curveToRelative(0.0f, -6.776f, -3.388f, -10.648f, -10.527f, -10.648f)
                    curveToRelative(-7.26f, 0.0f, -10.891f, 3.872f, -10.891f, 10.648f)
                    curveToRelative(0.0f, 6.896f, 3.63f, 10.77f, 10.89f, 10.77f)
                    curveToRelative(7.14f, 0.0f, 10.528f, -3.874f, 10.528f, -10.77f)
                    moveToRelative(10.164f, 0.0f)
                    curveToRelative(0.0f, 12.221f, -9.075f, 18.997f, -20.691f, 18.997f)
                    curveToRelative(-11.86f, 0.0f, -20.934f, -6.776f, -20.934f, -18.997f)
                    curveToRelative(0.0f, -11.979f, 9.075f, -18.756f, 20.934f, -18.756f)
                    curveToRelative(11.616f, 0.0f, 20.69f, 6.777f, 20.69f, 18.756f)
                    moveTo(33.519f, 38.29f)
                    curveToRelative(-5.688f, 0.0f, -11.011f, 1.574f, -14.763f, 4.357f)
                    lineToRelative(-0.241f, -0.12f)
                    curveTo(25.049f, 31.15f, 31.945f, 19.897f, 38.48f, 8.402f)
                    horizontalLineToRelative(-1.21f)
                    lineTo(14.4f, 47.123f)
                    curveToRelative(-2.057f, 3.63f, -3.025f, 6.777f, -3.025f, 11.012f)
                    curveToRelative(0.0f, 12.705f, 9.68f, 20.207f, 22.144f, 20.207f)
                    curveToRelative(12.1f, 0.0f, 21.9f, -7.502f, 21.9f, -20.207f)
                    reflectiveCurveToRelative(-9.8f, -19.845f, -21.9f, -19.845f)
                    moveTo(53.968f, 0.537f)
                    lineTo(36.06f, 31.031f)
                    curveToRelative(17.908f, -1.332f, 29.766f, 9.195f, 29.766f, 27.104f)
                    curveToRelative(0.0f, 20.207f, -13.915f, 29.161f, -32.307f, 29.161f)
                    curveToRelative(-18.635f, 0.0f, -32.55f, -8.954f, -32.55f, -29.16f)
                    curveToRelative(0.0f, -5.81f, 1.21f, -11.617f, 4.477f, -16.579f)
                    lineTo(29.889f, 0.537f)
                    close()
                  }
            }
            .build()
    return _number6!!
  }

private var _number6: ImageVector? = null

@Preview
@Composable
private fun Preview() {
  Box(modifier = Modifier.padding(12.dp)) {
    Image(imageVector = LocalImages.Number6, contentDescription = null)
  }
}
