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

val LocalImages.Number3: ImageVector
  get() {
    if (_number3 != null) {
      return _number3!!
    }
    _number3 =
        Builder(
                name = "Number3",
                defaultWidth = 63.0.dp,
                defaultHeight = 90.0.dp,
                viewportWidth = 63.0f,
                viewportHeight = 90.0f)
            .apply {
              path(
                  fill = SolidColor(Color(0xFF25304A)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(22.915f, 62.32f)
                    curveToRelative(0.121f, 5.567f, 3.751f, 8.35f, 9.56f, 8.35f)
                    curveToRelative(5.928f, 0.0f, 9.196f, -4.477f, 9.317f, -10.164f)
                    curveToRelative(-0.121f, -12.221f, -12.222f, -11.737f, -21.418f, -11.374f)
                    verticalLineToRelative(-2.904f)
                    lineToRelative(11.253f, -23.474f)
                    horizontalLineTo(7.185f)
                    verticalLineTo(3.514f)
                    horizontalLineToRelative(53.846f)
                    verticalLineTo(6.66f)
                    lineTo(45.422f, 35.217f)
                    curveToRelative(13.431f, 3.387f, 17.303f, 14.278f, 17.303f, 25.168f)
                    curveToRelative(0.121f, 14.399f, -10.164f, 29.525f, -29.767f, 29.525f)
                    curveToRelative(-6.413f, 0.0f, -11.011f, -1.331f, -15.125f, -3.63f)
                    curveTo(9.847f, 81.802f, 3.918f, 73.212f, 3.918f, 62.32f)
                    close()
                  }
              path(
                  fill = SolidColor(Color(0xFFFFFFFF)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(29.708f, 81.91f)
                    curveToRelative(-5.066f, 0.0f, -8.98f, -0.924f, -12.687f, -2.995f)
                    curveToRelative(-5.635f, -3.16f, -9.472f, -8.421f, -10.82f, -14.594f)
                    horizontalLineToRelative(9.333f)
                    curveToRelative(1.903f, 5.252f, 6.813f, 8.35f, 13.69f, 8.35f)
                    curveToRelative(8.24f, 0.0f, 14.129f, -6.193f, 14.317f, -15.06f)
                    verticalLineToRelative(-0.155f)
                    curveToRelative(-0.104f, -10.523f, -6.77f, -16.047f, -19.814f, -16.435f)
                    lineToRelative(12.59f, -26.267f)
                    horizontalLineTo(8.936f)
                    verticalLineToRelative(-9.24f)
                    horizontalLineToRelative(42.134f)
                    lineToRelative(-16.382f, 29.97f)
                    lineToRelative(6.262f, 1.58f)
                    curveToRelative(9.102f, 2.296f, 13.526f, 8.944f, 13.526f, 20.322f)
                    curveToRelative(0.055f, 6.696f, -2.491f, 13.113f, -6.987f, 17.646f)
                    curveToRelative(-4.461f, 4.5f, -10.61f, 6.878f, -17.78f, 6.878f)
                  }
              path(
                  fill = SolidColor(Color(0xFFEF7B7B)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(12.042f, 10.307f)
                    horizontalLineToRelative(30.613f)
                    lineTo(28.619f, 37.654f)
                    curveToRelative(11.737f, 0.0f, 19.482f, 6.292f, 19.724f, 19.601f)
                    curveToRelative(-0.242f, 10.65f, -8.47f, 19.12f, -19.239f, 19.24f)
                    curveToRelative(-7.745f, 0.0f, -14.4f, -3.75f, -16.82f, -9.922f)
                    horizontalLineToRelative(-1.21f)
                    curveToRelative(2.662f, 6.655f, 9.559f, 11.011f, 17.908f, 11.011f)
                    curveToRelative(11.496f, -0.12f, 20.207f, -9.075f, 20.45f, -20.329f)
                    curveToRelative(0.0f, -12.099f, -7.623f, -20.449f, -19.24f, -20.449f)
                    lineToRelative(14.4f, -27.467f)
                    horizontalLineToRelative(-32.55f)
                    close()
                    moveTo(19.665f, 59.071f)
                    curveToRelative(0.121f, 5.566f, 3.751f, 8.35f, 9.56f, 8.35f)
                    curveToRelative(5.928f, 0.0f, 9.196f, -4.478f, 9.317f, -10.166f)
                    curveToRelative(-0.121f, -12.22f, -12.222f, -11.736f, -21.418f, -11.374f)
                    verticalLineToRelative(-2.903f)
                    lineToRelative(11.253f, -23.475f)
                    lineTo(3.935f, 19.503f)
                    lineTo(3.935f, 0.264f)
                    horizontalLineToRelative(53.846f)
                    lineTo(57.781f, 3.41f)
                    lineTo(42.172f, 31.966f)
                    curveToRelative(13.431f, 3.388f, 17.303f, 14.28f, 17.303f, 25.17f)
                    curveToRelative(0.121f, 14.398f, -10.164f, 29.524f, -29.767f, 29.524f)
                    curveToRelative(-6.413f, 0.0f, -11.011f, -1.332f, -15.125f, -3.63f)
                    curveTo(6.597f, 78.552f, 0.668f, 69.961f, 0.668f, 59.071f)
                    close()
                  }
            }
            .build()
    return _number3!!
  }

private var _number3: ImageVector? = null

@Preview
@Composable
private fun Preview() {
  Box(modifier = Modifier.padding(12.dp)) {
    Image(imageVector = LocalImages.Number3, contentDescription = null)
  }
}
