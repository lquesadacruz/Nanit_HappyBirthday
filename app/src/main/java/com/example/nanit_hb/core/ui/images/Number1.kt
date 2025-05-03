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

val LocalImages.Number1: ImageVector
  get() {
    if (_number1 != null) {
      return _number1!!
    }
    _number1 =
        Builder(
                name = "Number1",
                defaultWidth = 51.0.dp,
                defaultHeight = 89.0.dp,
                viewportWidth = 51.0f,
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
                    moveTo(5.065f, 21.059f)
                    verticalLineTo(3.514f)
                    horizontalLineToRelative(32.55f)
                    verticalLineToRelative(67.035f)
                    horizontalLineToRelative(12.826f)
                    verticalLineToRelative(17.666f)
                    horizontalLineTo(3.976f)
                    verticalLineTo(70.549f)
                    horizontalLineTo(16.56f)
                    verticalLineToRelative(-49.49f)
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
                    moveTo(5.727f, 80.215f)
                    verticalLineTo(72.55f)
                    horizontalLineTo(18.31f)
                    verticalLineTo(13.06f)
                    horizontalLineTo(6.816f)
                    verticalLineTo(5.514f)
                    horizontalLineToRelative(22.55f)
                    verticalLineTo(72.55f)
                    horizontalLineToRelative(12.826f)
                    verticalLineToRelative(7.666f)
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
                    moveTo(24.321f, 8.492f)
                    horizontalLineTo(9.801f)
                    verticalLineToRelative(0.968f)
                    horizontalLineToRelative(13.431f)
                    verticalLineToRelative(66.309f)
                    horizontalLineTo(8.107f)
                    verticalLineToRelative(0.968f)
                    horizontalLineToRelative(31.581f)
                    verticalLineToRelative(-0.968f)
                    horizontalLineTo(24.321f)
                    close()
                    moveTo(1.815f, 18.535f)
                    verticalLineTo(0.264f)
                    horizontalLineToRelative(32.55f)
                    verticalLineToRelative(66.309f)
                    horizontalLineToRelative(13.431f)
                    verticalLineToRelative(18.393f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(66.573f)
                    horizontalLineToRelative(13.31f)
                    verticalLineTo(18.535f)
                    close()
                  }
            }
            .build()
    return _number1!!
  }

private var _number1: ImageVector? = null

@Preview
@Composable
private fun Preview() {
  Box(modifier = Modifier.padding(12.dp)) {
    Image(imageVector = LocalImages.Number1, contentDescription = null)
  }
}
