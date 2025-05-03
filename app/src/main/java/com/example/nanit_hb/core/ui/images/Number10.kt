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

val LocalImages.Number10: ImageVector
  get() {
    if (_number10 != null) {
      return _number10!!
    }
    _number10 =
        Builder(
                name = "Number10",
                defaultWidth = 122.0.dp,
                defaultHeight = 92.0.dp,
                viewportWidth = 122.0f,
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
                    moveTo(5.07f, 23.06f)
                    verticalLineTo(5.51f)
                    horizontalLineToRelative(32.55f)
                    verticalLineToRelative(67.04f)
                    horizontalLineToRelative(12.83f)
                    verticalLineToRelative(17.67f)
                    horizontalLineTo(3.98f)
                    verticalLineTo(72.55f)
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
                    moveTo(5.73f, 82.21f)
                    verticalLineTo(74.55f)
                    horizontalLineTo(18.31f)
                    verticalLineTo(15.06f)
                    horizontalLineTo(6.82f)
                    verticalLineTo(7.51f)
                    horizontalLineToRelative(22.55f)
                    verticalLineTo(74.55f)
                    horizontalLineToRelative(12.83f)
                    verticalLineToRelative(7.67f)
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
                    moveTo(24.32f, 10.49f)
                    horizontalLineTo(9.8f)
                    verticalLineToRelative(0.97f)
                    horizontalLineToRelative(13.43f)
                    verticalLineToRelative(66.31f)
                    horizontalLineTo(8.11f)
                    verticalLineToRelative(0.97f)
                    horizontalLineToRelative(31.58f)
                    verticalLineToRelative(-0.97f)
                    horizontalLineTo(24.32f)
                    close()
                    moveTo(1.82f, 20.53f)
                    verticalLineTo(2.26f)
                    horizontalLineToRelative(32.55f)
                    verticalLineToRelative(66.31f)
                    horizontalLineToRelative(13.43f)
                    verticalLineToRelative(18.39f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(68.57f)
                    horizontalLineToRelative(13.31f)
                    verticalLineTo(20.53f)
                    close()
                  }
              path(
                  fill = SolidColor(Color(0xFF25304A)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(101.27f, 62.26f)
                    verticalLineTo(33.47f)
                    curveToRelative(0.0f, -6.66f, -4.96f, -10.16f, -11.38f, -10.16f)
                    curveToRelative(-6.17f, 0.0f, -11.01f, 3.51f, -11.01f, 10.16f)
                    verticalLineToRelative(28.8f)
                    curveToRelative(0.0f, 6.89f, 4.84f, 10.4f, 11.01f, 10.4f)
                    curveToRelative(6.41f, 0.0f, 11.38f, -3.51f, 11.38f, -10.41f)
                    moveToRelative(20.45f, -29.16f)
                    verticalLineToRelative(29.65f)
                    curveToRelative(0.0f, 18.51f, -14.28f, 29.16f, -31.82f, 29.16f)
                    curveToRelative(-17.18f, 0.0f, -31.58f, -10.65f, -31.58f, -29.16f)
                    verticalLineTo(33.1f)
                    curveToRelative(0.0f, -18.51f, 14.4f, -29.16f, 31.58f, -29.16f)
                    curveToRelative(17.55f, 0.0f, 31.82f, 10.65f, 31.82f, 29.16f)
                  }
              path(
                  fill = SolidColor(Color(0xFFFFFFFF)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(86.65f, 15.3f)
                    curveToRelative(-9.43f, 0.0f, -16.01f, 6.24f, -16.01f, 15.16f)
                    verticalLineToRelative(28.8f)
                    curveToRelative(0.0f, 9.21f, 6.43f, 15.4f, 16.01f, 15.4f)
                    curveToRelative(9.79f, 0.0f, 16.38f, -6.19f, 16.38f, -15.41f)
                    verticalLineTo(30.47f)
                    curveToRelative(0.0f, -8.93f, -6.73f, -15.16f, -16.38f, -15.16f)
                    moveToRelative(0.0f, 68.61f)
                    curveToRelative(-13.23f, 0.0f, -26.58f, -7.47f, -26.58f, -24.16f)
                    verticalLineTo(30.1f)
                    curveToRelative(0.0f, -16.69f, 13.35f, -24.16f, 26.58f, -24.16f)
                    curveToRelative(13.35f, 0.0f, 26.82f, 7.47f, 26.82f, 24.16f)
                    verticalLineToRelative(29.65f)
                    curveToRelative(0.0f, 16.69f, -13.47f, 24.16f, -26.82f, 24.16f)
                  }
              path(
                  fill = SolidColor(Color(0xFFEF7B7B)),
                  stroke = null,
                  strokeLineWidth = 0.0f,
                  strokeLineCap = Butt,
                  strokeLineJoin = Miter,
                  strokeLineMiter = 4.0f,
                  pathFillType = EvenOdd) {
                    moveTo(98.02f, 59.01f)
                    verticalLineTo(30.22f)
                    curveToRelative(0.0f, -6.66f, -4.96f, -10.16f, -11.38f, -10.16f)
                    curveToRelative(-6.17f, 0.0f, -11.01f, 3.51f, -11.01f, 10.16f)
                    verticalLineToRelative(28.8f)
                    curveToRelative(0.0f, 6.89f, 4.84f, 10.4f, 11.01f, 10.4f)
                    curveToRelative(6.41f, 0.0f, 11.38f, -3.51f, 11.38f, -10.41f)
                    moveToRelative(9.44f, -28.8f)
                    verticalLineToRelative(28.8f)
                    curveToRelative(0.0f, 12.34f, -9.2f, 19.48f, -20.81f, 19.48f)
                    curveToRelative(-11.25f, 0.0f, -20.69f, -7.14f, -20.69f, -19.48f)
                    verticalLineToRelative(-28.8f)
                    curveToRelative(0.0f, -12.46f, 9.44f, -19.36f, 20.69f, -19.36f)
                    curveToRelative(11.62f, 0.0f, 20.81f, 6.9f, 20.81f, 19.36f)
                    moveToRelative(1.45f, 28.8f)
                    verticalLineToRelative(-28.8f)
                    curveToRelative(0.0f, -13.07f, -10.04f, -20.45f, -22.26f, -20.45f)
                    curveToRelative(-11.86f, 0.0f, -22.02f, 7.38f, -22.02f, 20.45f)
                    verticalLineToRelative(28.8f)
                    curveToRelative(0.0f, 12.95f, 10.16f, 20.57f, 22.02f, 20.57f)
                    curveToRelative(12.22f, 0.0f, 22.26f, -7.62f, 22.26f, -20.57f)
                    moveToRelative(9.56f, -29.16f)
                    verticalLineToRelative(29.65f)
                    curveToRelative(0.0f, 18.51f, -14.28f, 29.16f, -31.82f, 29.16f)
                    curveToRelative(-17.18f, 0.0f, -31.58f, -10.65f, -31.58f, -29.16f)
                    verticalLineTo(29.85f)
                    curveToRelative(0.0f, -18.51f, 14.4f, -29.16f, 31.58f, -29.16f)
                    curveToRelative(17.55f, 0.0f, 31.82f, 10.65f, 31.82f, 29.16f)
                  }
            }
            .build()
    return _number10!!
  }

private var _number10: ImageVector? = null

@Preview
@Composable
private fun Preview() {
  Box(modifier = Modifier.padding(12.dp)) {
    Image(imageVector = LocalImages.Number10, contentDescription = null)
  }
}
