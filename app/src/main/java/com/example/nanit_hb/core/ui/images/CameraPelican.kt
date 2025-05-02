package com.example.nanit_hb.core.ui.images

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val LocalImages.CameraPelican: ImageVector
  get() {
    if (_cameraPelican != null) {
      return _cameraPelican!!
    }
    _cameraPelican =
        Builder(
                name = "CameraPelican",
                defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp,
                viewportWidth = 36.0f,
                viewportHeight = 36.0f)
            .apply {
              path(
                  fill = SolidColor(Color(0xFF8BD3E4)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = NonZero) {
                    moveTo(18.0f, 18.0f)
                    moveToRelative(-18.0f, 0.0f)
                    arcToRelative(18.0f, 18.0f, 0.0f, true, true, 36.0f, 0.0f)
                    arcToRelative(18.0f, 18.0f, 0.0f, true, true, -36.0f, 0.0f)
                  }
              path(
                  fill = SolidColor(Color(0xFF000000)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(21.0f, 8.0f)
                    horizontalLineToRelative(-6.0f)
                    lineToRelative(-1.0f, 2.0f)
                    horizontalLineToRelative(-3.0f)
                    arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                    verticalLineToRelative(10.0f)
                    arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                    horizontalLineToRelative(9.026f)
                    arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.798f, -2.595f)
                    lineTo(23.0f, 21.4f)
                    lineToRelative(0.999f, -0.001f)
                    lineToRelative(0.001f, -0.75f)
                    arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                    lineTo(27.0f, 12.0f)
                    arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                    horizontalLineToRelative(-3.0f)
                    close()
                    moveTo(23.0f, 17.0f)
                    arcToRelative(5.0f, 5.0f, 0.0f, true, true, -10.0f, 0.0f)
                    arcToRelative(5.0f, 5.0f, 0.0f, false, true, 10.0f, 0.0f)
                    moveToRelative(-2.0f, 0.0f)
                    arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                    arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                  }
              path(
                  fill = SolidColor(Color(0xFF000000)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = NonZero) {
                    moveTo(27.0f, 19.648f)
                    arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.884f)
                    lineToRelative(0.007f, 0.116f)
                    verticalLineTo(23.4f)
                    lineToRelative(3.0f, 0.001f)
                    arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.117f, 1.993f)
                    lineTo(31.0f, 25.4f)
                    lineToRelative(-3.0f, -0.001f)
                    verticalLineToRelative(3.25f)
                    arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.993f, 0.116f)
                    lineTo(26.0f, 28.648f)
                    verticalLineTo(25.4f)
                    lineToRelative(-3.0f, 0.001f)
                    arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.117f, -1.993f)
                    lineTo(23.0f, 23.4f)
                    lineToRelative(2.999f, -0.001f)
                    lineToRelative(0.001f, -2.75f)
                    arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                  }
            }
            .build()
    return _cameraPelican!!
  }

private var _cameraPelican: ImageVector? = null

@Preview
@Composable
private fun Preview() {
  Box(modifier = Modifier.padding(12.dp)) {
    Image(imageVector = LocalImages.CameraPelican, contentDescription = null)
  }
}
