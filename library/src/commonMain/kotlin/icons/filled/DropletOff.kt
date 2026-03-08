package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.DropletOff: ImageVector
    get() {
        if (_DropletOff != null) {
            return _DropletOff!!
        }
        _DropletOff = ImageVector.Builder(
            name = "Filled.DropletOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.691f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.342f, -0.1f)
                lineToRelative(-0.05f, 0.102f)
                curveToRelative(-0.412f, 1.032f, -1.089f, 1.979f, -1.9f, 2.91f)
                curveToRelative(-0.518f, 0.597f, -1.058f, 1.151f, -1.607f, 1.716f)
                curveToRelative(-0.33f, 0.338f, -0.663f, 0.68f, -0.997f, 1.038f)
                curveToRelative(-1.653f, 1.765f, -3.237f, 3.792f, -2.91f, 6.475f)
                lineToRelative(0.038f, 0.262f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.488f, -0.169f)
                lineToRelative(-0.009f, -0.077f)
                curveToRelative(-0.337f, -2.035f, 0.783f, -3.645f, 2.488f, -5.466f)
                curveToRelative(0.292f, -0.312f, 0.606f, -0.635f, 0.928f, -0.967f)
                arcToRelative(46f, 46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.713f, -1.827f)
                curveToRelative(0.53f, -0.61f, 1.037f, -1.26f, 1.465f, -1.963f)
                quadToRelative(0.32f, 0.522f, 0.687f, 1.005f)
                lineToRelative(0.239f, 0.308f)
                lineToRelative(0.05f, 0.057f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.169f, -0.928f)
                lineToRelative(-0.045f, -0.063f)
                lineToRelative(-0.217f, -0.28f)
                arcToRelative(9.3f, 9.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.059f, -1.73f)
                close()
                moveTo(20.47f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, 1.06f)
                lineToRelative(-4.586f, 4.585f)
                curveToRelative(0.996f, 1.043f, 1.971f, 2.15f, 2.576f, 3.393f)
                curveToRelative(0.688f, 1.416f, 0.896f, 2.992f, 0.242f, 4.81f)
                lineToRelative(-0.143f, 0.367f)
                curveToRelative(-1.27f, 3.048f, -4.328f, 5.065f, -7.62f, 5.065f)
                curveToRelative(-2.313f, 0f, -4.506f, -0.998f, -6.047f, -2.643f)
                lineTo(3.53f, 21.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                close()
            }
        }.build()

        return _DropletOff!!
    }

@Suppress("ObjectPropertyName")
private var _DropletOff: ImageVector? = null
