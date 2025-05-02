package com.example.nanit_hb.core.ui.images

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

val LocalImages.LeftSwirls: ImageVector
  get() {
    if (_leftSwirls != null) {
      return _leftSwirls!!
    }
    _leftSwirls =
        Builder(
                name = "LeftSwirls",
                defaultWidth = 52.0.dp,
                defaultHeight = 46.0.dp,
                viewportWidth = 52.0f,
                viewportHeight = 46.0f)
            .apply {
              path(
                  fill = SolidColor(Color(0x00000000)),
                  stroke = SolidColor(Color(0xFF394562)),
                  strokeLineWidth = 1.0f,
                  strokeLineCap = strokeCapRound,
                  strokeLineJoin = strokeJoinRound,
                  strokeLineMiter = 4.0f,
                  pathFillType = NonZero) {
                    moveTo(6.415f, 9.92f)
                    arcToRelative(4.217f, 4.217f, 0.0f, false, false, 5.734f, 1.64f)
                    arcToRelative(5.27f, 5.27f, 0.0f, false, false, 2.049f, -7.169f)
                    arcToRelative(6.59f, 6.59f, 0.0f, false, false, -8.961f, -2.56f)
                    arcToRelative(8.24f, 8.24f, 0.0f, false, false, -3.2f, 11.2f)
                    curveToRelative(2.762f, 4.97f, 10.982f, 6.0f, 16.667f, 6.0f)
                    horizontalLineToRelative(32.5f)
                    moveTo(6.415f, 35.61f)
                    arcToRelative(4.217f, 4.217f, 0.0f, false, true, 5.734f, -1.638f)
                    arcToRelative(5.27f, 5.27f, 0.0f, false, true, 2.049f, 7.168f)
                    arcToRelative(6.59f, 6.59f, 0.0f, false, true, -8.961f, 2.56f)
                    arcToRelative(8.24f, 8.24f, 0.0f, false, true, -3.2f, -11.2f)
                    curveToRelative(2.762f, -4.97f, 10.982f, -6.0f, 16.667f, -6.0f)
                    horizontalLineToRelative(32.5f)
                  }
            }
            .build()
    return _leftSwirls!!
  }

private var _leftSwirls: ImageVector? = null

@Preview
@Composable
private fun Preview() {
  Box(modifier = Modifier.padding(12.dp)) {
    Image(imageVector = LocalImages.LeftSwirls, contentDescription = null)
  }
}
