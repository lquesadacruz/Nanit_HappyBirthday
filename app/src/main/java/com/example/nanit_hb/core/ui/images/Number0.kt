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

val LocalImages.Number0: ImageVector
  get() {
    if (_number0 != null) {
      return _number0!!
    }
    _number0 =
        Builder(
                name = "Number0",
                defaultWidth = 67.0.dp,
                defaultHeight = 92.0.dp,
                viewportWidth = 67.0f,
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
                    moveTo(46.273f, 62.264f)
                    verticalLineTo(33.465f)
                    curveToRelative(0.0f, -6.655f, -4.962f, -10.164f, -11.375f, -10.164f)
                    curveToRelative(-6.17f, 0.0f, -11.01f, 3.51f, -11.01f, 10.164f)
                    verticalLineToRelative(28.8f)
                    curveToRelative(0.0f, 6.895f, 4.84f, 10.405f, 11.01f, 10.405f)
                    curveToRelative(6.413f, 0.0f, 11.375f, -3.51f, 11.375f, -10.406f)
                    moveToRelative(20.45f, -29.162f)
                    verticalLineToRelative(29.645f)
                    curveToRelative(0.0f, 18.514f, -14.279f, 29.163f, -31.825f, 29.163f)
                    curveToRelative(-17.182f, 0.0f, -31.58f, -10.649f, -31.58f, -29.163f)
                    verticalLineTo(33.102f)
                    curveToRelative(0.0f, -18.513f, 14.398f, -29.16f, 31.58f, -29.16f)
                    curveToRelative(17.546f, 0.0f, 31.824f, 10.647f, 31.824f, 29.16f)
                  }
              path(
                  fill = SolidColor(Color(0xFF000000)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(31.648f, 15.301f)
                    curveToRelative(-9.427f, 0.0f, -16.01f, 6.235f, -16.01f, 15.164f)
                    verticalLineToRelative(28.8f)
                    curveToRelative(0.0f, 9.214f, 6.434f, 15.405f, 16.01f, 15.405f)
                    curveToRelative(9.794f, 0.0f, 16.375f, -6.19f, 16.375f, -15.406f)
                    verticalLineTo(30.465f)
                    curveToRelative(0.0f, -8.929f, -6.733f, -15.164f, -16.375f, -15.164f)
                    moveToRelative(0.0f, 68.608f)
                    curveToRelative(-13.23f, 0.0f, -26.58f, -7.47f, -26.58f, -24.162f)
                    verticalLineTo(30.102f)
                    curveToRelative(0.0f, -16.69f, 13.35f, -24.16f, 26.58f, -24.16f)
                    curveToRelative(13.352f, 0.0f, 26.824f, 7.47f, 26.824f, 24.16f)
                    verticalLineToRelative(29.645f)
                    curveTo(58.472f, 76.44f, 45.0f, 83.91f, 31.648f, 83.91f)
                  }
              path(
                  fill = SolidColor(Color(0xFFEF7B7B)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(43.023f, 59.014f)
                    verticalLineTo(30.215f)
                    curveToRelative(0.0f, -6.655f, -4.962f, -10.164f, -11.375f, -10.164f)
                    curveToRelative(-6.17f, 0.0f, -11.01f, 3.51f, -11.01f, 10.164f)
                    verticalLineToRelative(28.8f)
                    curveToRelative(0.0f, 6.895f, 4.84f, 10.405f, 11.01f, 10.405f)
                    curveToRelative(6.413f, 0.0f, 11.375f, -3.51f, 11.375f, -10.406f)
                    moveToRelative(9.438f, -28.799f)
                    verticalLineToRelative(28.8f)
                    curveToRelative(0.0f, 12.341f, -9.197f, 19.48f, -20.813f, 19.48f)
                    curveToRelative(-11.253f, 0.0f, -20.69f, -7.139f, -20.69f, -19.48f)
                    verticalLineToRelative(-28.8f)
                    curveToRelative(0.0f, -12.463f, 9.437f, -19.36f, 20.69f, -19.36f)
                    curveToRelative(11.616f, 0.0f, 20.813f, 6.897f, 20.813f, 19.36f)
                    moveToRelative(1.452f, 28.8f)
                    verticalLineToRelative(-28.8f)
                    curveToRelative(0.0f, -13.068f, -10.043f, -20.449f, -22.265f, -20.449f)
                    curveToRelative(-11.857f, 0.0f, -22.022f, 7.381f, -22.022f, 20.45f)
                    verticalLineToRelative(28.798f)
                    curveToRelative(0.0f, 12.947f, 10.165f, 20.57f, 22.022f, 20.57f)
                    curveToRelative(12.222f, 0.0f, 22.265f, -7.623f, 22.265f, -20.57f)
                    moveToRelative(9.56f, -29.163f)
                    verticalLineToRelative(29.645f)
                    curveToRelative(0.0f, 18.514f, -14.279f, 29.163f, -31.825f, 29.163f)
                    curveToRelative(-17.182f, 0.0f, -31.58f, -10.649f, -31.58f, -29.163f)
                    verticalLineTo(29.852f)
                    curveTo(0.067f, 11.34f, 14.465f, 0.692f, 31.647f, 0.692f)
                    curveToRelative(17.546f, 0.0f, 31.824f, 10.647f, 31.824f, 29.16f)
                  }
            }
            .build()
    return _number0!!
  }

private var _number0: ImageVector? = null

@Preview
@Composable
private fun Preview() {
  Box(modifier = Modifier.padding(12.dp)) {
    Image(imageVector = LocalImages.Number0, contentDescription = null)
  }
}
