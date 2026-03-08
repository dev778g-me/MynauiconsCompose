package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Eight: ImageVector
    get() {
        if (_Eight != null) {
            return _Eight!!
        }
        _Eight = ImageVector.Builder(
            name = "Filled.Eight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.092f, 8.164f)
                curveToRelative(-0.339f, 0.234f, -0.592f, 0.614f, -0.592f, 1.336f)
                curveToRelative(0f, 0.47f, 0.4f, 0.908f, 1.148f, 1.282f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.227f, 0.448f)
                arcToRelative(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.227f, -0.448f)
                curveToRelative(0.749f, -0.374f, 1.148f, -0.812f, 1.148f, -1.282f)
                curveToRelative(0f, -0.722f, -0.253f, -1.102f, -0.591f, -1.336f)
                curveToRelative(-0.386f, -0.267f, -0.99f, -0.414f, -1.784f, -0.414f)
                reflectiveCurveToRelative(-1.398f, 0.147f, -1.783f, 0.414f)
                moveTo(9.742f, 12f)
                curveTo(8.958f, 11.561f, 8f, 10.774f, 8f, 9.5f)
                curveToRelative(0f, -1.153f, 0.446f, -2.023f, 1.239f, -2.57f)
                curveToRelative(0.745f, -0.515f, 1.704f, -0.68f, 2.636f, -0.68f)
                reflectiveCurveToRelative(1.89f, 0.165f, 2.636f, 0.68f)
                curveToRelative(0.793f, 0.547f, 1.239f, 1.417f, 1.239f, 2.57f)
                curveToRelative(0f, 1.274f, -0.957f, 2.061f, -1.743f, 2.5f)
                curveToRelative(0.786f, 0.439f, 1.743f, 1.226f, 1.743f, 2.5f)
                curveToRelative(0f, 1.153f, -0.446f, 2.023f, -1.239f, 2.57f)
                curveToRelative(-0.745f, 0.515f, -1.704f, 0.68f, -2.636f, 0.68f)
                reflectiveCurveToRelative(-1.89f, -0.165f, -2.636f, -0.68f)
                curveTo(8.446f, 16.523f, 8f, 15.653f, 8f, 14.5f)
                curveToRelative(0f, -1.274f, 0.957f, -2.061f, 1.743f, -2.5f)
                moveToRelative(2.133f, 0.77f)
                arcToRelative(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.227f, 0.448f)
                curveToRelative(-0.749f, 0.374f, -1.148f, 0.812f, -1.148f, 1.282f)
                curveToRelative(0f, 0.722f, 0.253f, 1.102f, 0.591f, 1.336f)
                curveToRelative(0.386f, 0.266f, 0.99f, 0.414f, 1.784f, 0.414f)
                reflectiveCurveToRelative(1.398f, -0.148f, 1.784f, -0.414f)
                curveToRelative(0.338f, -0.234f, 0.591f, -0.614f, 0.591f, -1.336f)
                curveToRelative(0f, -0.47f, -0.4f, -0.908f, -1.148f, -1.282f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.227f, -0.448f)
            }
        }.build()

        return _Eight!!
    }

@Suppress("ObjectPropertyName")
private var _Eight: ImageVector? = null
