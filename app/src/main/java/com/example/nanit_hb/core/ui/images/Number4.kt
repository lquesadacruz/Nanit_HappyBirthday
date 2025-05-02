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

val LocalImages.Number4: ImageVector
  get() {
    if (_number4 != null) {
      return _number4!!
    }
    _number4 =
        Builder(
                name = "Number4",
                defaultWidth = 68.0.dp,
                defaultHeight = 89.0.dp,
                viewportWidth = 68.0f,
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
                    moveTo(27.941f, 54.456f)
                    horizontalLineToRelative(13.553f)
                    lineTo(41.494f, 41.75f)
                    lineToRelative(1.572f, -12.947f)
                    horizontalLineToRelative(-0.242f)
                    close()
                    moveTo(60.733f, 88.216f)
                    lineTo(40.646f, 88.216f)
                    lineTo(40.646f, 72.122f)
                    lineTo(3.741f, 72.122f)
                    verticalLineToRelative(-9.437f)
                    lineToRelative(33.76f, -59.17f)
                    horizontalLineToRelative(23.232f)
                    verticalLineToRelative(50.94f)
                    horizontalLineToRelative(7.26f)
                    verticalLineToRelative(17.667f)
                    horizontalLineToRelative(-7.26f)
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
                    moveTo(16.01f, 56.456f)
                    horizontalLineToRelative(27.234f)
                    lineTo(43.244f, 39.053f)
                    lineToRelative(2.216f, -18.25f)
                    horizontalLineToRelative(-8.765f)
                    close()
                    moveTo(42.397f, 80.216f)
                    lineTo(42.397f, 64.122f)
                    lineTo(5.49f, 64.122f)
                    lineTo(5.49f, 61.01f)
                    lineTo(37.155f, 5.514f)
                    horizontalLineToRelative(15.329f)
                    verticalLineToRelative(50.94f)
                    horizontalLineToRelative(7.259f)
                    verticalLineToRelative(7.666f)
                    horizontalLineToRelative(-7.26f)
                    verticalLineToRelative(16.095f)
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
                    moveTo(26.023f, 51.206f)
                    horizontalLineToRelative(12.222f)
                    lineTo(38.245f, 38.5f)
                    lineToRelative(1.572f, -12.947f)
                    horizontalLineToRelative(-0.242f)
                    close()
                    moveTo(12.108f, 59.797f)
                    lineTo(40.179f, 9.703f)
                    horizontalLineToRelative(6.535f)
                    verticalLineToRelative(50.096f)
                    close()
                    moveTo(47.923f, 76.857f)
                    lineTo(47.923f, 60.767f)
                    lineTo(57.0f, 60.767f)
                    verticalLineToRelative(-0.968f)
                    horizontalLineToRelative(-9.076f)
                    lineTo(47.924f, 8.734f)
                    horizontalLineToRelative(-8.349f)
                    lineToRelative(-28.676f, 50.7f)
                    verticalLineToRelative(1.332f)
                    horizontalLineToRelative(35.816f)
                    verticalLineToRelative(16.092f)
                    close()
                    moveTo(57.483f, 84.966f)
                    lineTo(37.398f, 84.966f)
                    lineTo(37.398f, 68.872f)
                    lineTo(0.49f, 68.872f)
                    verticalLineToRelative(-9.437f)
                    lineTo(34.251f, 0.264f)
                    horizontalLineToRelative(23.233f)
                    verticalLineToRelative(50.94f)
                    horizontalLineToRelative(7.26f)
                    verticalLineToRelative(17.667f)
                    horizontalLineToRelative(-7.26f)
                    close()
                  }
            }
            .build()
    return _number4!!
  }

private var _number4: ImageVector? = null

@Preview
@Composable
private fun Preview() {
  Box(modifier = Modifier.padding(12.dp)) {
    Image(imageVector = LocalImages.Number4, contentDescription = null)
  }
}
