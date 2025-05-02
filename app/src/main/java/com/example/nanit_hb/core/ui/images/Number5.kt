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

val LocalImages.Number5: ImageVector
  get() {
    if (_number5 != null) {
      return _number5!!
    }
    _number5 =
        Builder(
                name = "Number5",
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
                    moveTo(23.942f, 32.433f)
                    curveToRelative(19.723f, -1.21f, 38.842f, 2.783f, 38.963f, 27.952f)
                    curveToRelative(0.12f, 14.52f, -10.165f, 29.525f, -29.767f, 29.525f)
                    curveToRelative(-16.093f, 0.0f, -27.83f, -10.407f, -28.556f, -27.589f)
                    horizontalLineToRelative(18.633f)
                    curveToRelative(0.122f, 5.566f, 3.751f, 8.47f, 9.44f, 8.47f)
                    curveToRelative(5.928f, 0.0f, 9.558f, -3.509f, 9.68f, -10.406f)
                    curveToRelative(-0.243f, -5.082f, -2.905f, -7.744f, -7.624f, -9.075f)
                    curveToRelative(-8.59f, -2.541f, -22.385f, -0.727f, -28.677f, -0.606f)
                    verticalLineTo(3.514f)
                    horizontalLineToRelative(52.757f)
                    verticalLineToRelative(18.392f)
                    horizontalLineTo(23.942f)
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
                    moveTo(29.889f, 81.91f)
                    curveToRelative(-12.125f, 0.0f, -20.535f, -6.611f, -22.91f, -17.59f)
                    horizontalLineToRelative(8.866f)
                    curveToRelative(1.919f, 5.272f, 6.847f, 8.472f, 13.56f, 8.472f)
                    curveToRelative(8.888f, 0.0f, 14.513f, -5.87f, 14.679f, -15.32f)
                    lineToRelative(0.003f, -0.162f)
                    lineToRelative(-0.008f, -0.163f)
                    curveToRelative(-0.23f, -4.842f, -2.372f, -11.142f, -11.26f, -13.65f)
                    curveToRelative(-3.47f, -1.025f, -7.923f, -1.532f, -13.556f, -1.532f)
                    curveToRelative(-4.04f, 0.0f, -8.105f, 0.259f, -11.372f, 0.468f)
                    lineToRelative(-0.106f, 0.007f)
                    verticalLineTo(5.514f)
                    horizontalLineTo(50.54f)
                    verticalLineToRelative(8.392f)
                    horizontalLineTo(15.693f)
                    verticalLineTo(34.75f)
                    lineToRelative(5.306f, -0.326f)
                    arcToRelative(93.0f, 93.0f, 0.0f, false, true, 5.616f, -0.182f)
                    curveToRelative(19.577f, 0.0f, 27.962f, 6.929f, 28.04f, 23.168f)
                    curveToRelative(0.056f, 6.699f, -2.48f, 13.12f, -6.957f, 17.636f)
                    curveToRelative(-4.454f, 4.49f, -10.612f, 6.864f, -17.81f, 6.864f)
                  }
              path(
                  fill = SolidColor(Color(0xFFEF7B7B)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(11.012f, 8.855f)
                    verticalLineToRelative(29.403f)
                    curveToRelative(15.126f, -0.604f, 37.147f, -2.904f, 37.39f, 18.877f)
                    curveToRelative(-0.121f, 10.769f, -8.47f, 19.24f, -19.24f, 19.36f)
                    curveToRelative(-7.623f, 0.12f, -14.278f, -3.871f, -16.577f, -10.043f)
                    horizontalLineToRelative(-1.21f)
                    curveToRelative(2.42f, 6.776f, 9.439f, 11.132f, 17.787f, 11.01f)
                    curveToRelative(11.374f, 0.0f, 20.329f, -8.953f, 20.329f, -20.327f)
                    curveToRelative(0.0f, -21.901f, -21.66f, -21.054f, -37.39f, -19.966f)
                    lineTo(12.101f, 9.944f)
                    horizontalLineToRelative(35.696f)
                    verticalLineToRelative(-1.09f)
                    close()
                    moveTo(20.692f, 29.425f)
                    curveToRelative(19.723f, -1.21f, 38.842f, 2.54f, 38.964f, 27.71f)
                    curveToRelative(0.12f, 14.52f, -10.165f, 29.525f, -29.767f, 29.525f)
                    curveToRelative(-6.534f, 0.0f, -11.133f, -1.331f, -15.126f, -3.51f)
                    curveTo(6.898f, 78.673f, 0.848f, 70.083f, 0.727f, 59.07f)
                    horizontalLineToRelative(19.239f)
                    curveToRelative(0.12f, 5.567f, 3.75f, 8.229f, 9.439f, 8.229f)
                    curveToRelative(5.928f, 0.0f, 9.196f, -4.356f, 9.317f, -10.164f)
                    curveToRelative(-0.848f, -14.4f, -26.137f, -9.923f, -35.938f, -9.68f)
                    lineTo(2.784f, 0.264f)
                    lineTo(55.54f, 0.264f)
                    verticalLineToRelative(18.392f)
                    lineTo(20.693f, 18.656f)
                    close()
                  }
            }
            .build()
    return _number5!!
  }

private var _number5: ImageVector? = null

@Preview
@Composable
private fun Preview() {
  Box(modifier = Modifier.padding(12.dp)) {
    Image(imageVector = LocalImages.Number5, contentDescription = null)
  }
}
