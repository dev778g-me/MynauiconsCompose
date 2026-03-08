package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChartLine: ImageVector
    get() {
        if (_ChartLine != null) {
            return _ChartLine!!
        }
        _ChartLine = ImageVector.Builder(
            name = "Filled.ChartLine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(10.365f)
                lineToRelative(2.217f, -1.846f)
                lineToRelative(0.334f, -0.266f)
                curveToRelative(0.786f, -0.59f, 1.61f, -0.966f, 2.512f, -0.91f)
                curveToRelative(1.021f, 0.066f, 1.864f, 0.67f, 2.62f, 1.426f)
                lineToRelative(0.007f, 0.006f)
                lineToRelative(0.25f, 0.239f)
                curveToRelative(0.556f, 0.499f, 0.909f, 0.61f, 1.143f, 0.614f)
                curveToRelative(0.28f, 0.004f, 0.7f, -0.142f, 1.413f, -0.766f)
                lineToRelative(5.846f, -5.115f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.316f, 1.506f)
                lineToRelative(-5.846f, 5.114f)
                curveToRelative(-0.818f, 0.716f, -1.716f, 1.274f, -2.754f, 1.26f)
                curveToRelative(-0.92f, -0.011f, -1.723f, -0.465f, -2.467f, -1.137f)
                lineToRelative(-0.316f, -0.3f)
                lineToRelative(-0.006f, -0.007f)
                curveToRelative(-0.655f, -0.655f, -1.055f, -0.826f, -1.332f, -0.843f)
                curveToRelative(-0.234f, -0.015f, -0.59f, 0.067f, -1.175f, 0.505f)
                lineToRelative(-0.265f, 0.21f)
                lineToRelative(-3.491f, 2.908f)
                curveToRelative(0.006f, 0.463f, 0.018f, 0.849f, 0.045f, 1.182f)
                curveToRelative(0.05f, 0.606f, 0.142f, 0.954f, 0.276f, 1.217f)
                lineToRelative(0.115f, 0.206f)
                curveToRelative(0.289f, 0.47f, 0.702f, 0.853f, 1.196f, 1.105f)
                lineToRelative(0.103f, 0.049f)
                curveToRelative(0.251f, 0.108f, 0.584f, 0.184f, 1.113f, 0.227f)
                curveTo(7.471f, 20f, 8.264f, 20f, 9.4f, 20f)
                horizontalLineTo(21f)
                lineToRelative(0.102f, 0.005f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.99f)
                lineTo(21f, 22f)
                horizontalLineTo(9.4f)
                curveToRelative(-1.103f, 0f, -1.991f, 0.001f, -2.709f, -0.058f)
                curveToRelative(-0.637f, -0.052f, -1.208f, -0.154f, -1.737f, -0.381f)
                lineToRelative(-0.224f, -0.106f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.092f, -2.01f)
                lineToRelative(-0.093f, -0.175f)
                curveToRelative(-0.302f, -0.593f, -0.428f, -1.233f, -0.487f, -1.961f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.053f, -1.714f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.001f, -0.185f)
                quadTo(2f, 15.026f, 2f, 14.6f)
                close()
            }
        }.build()

        return _ChartLine!!
    }

@Suppress("ObjectPropertyName")
private var _ChartLine: ImageVector? = null
