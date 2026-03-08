package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.UserSquare: ImageVector
    get() {
        if (_UserSquare != null) {
            return _UserSquare!!
        }
        _UserSquare = ImageVector.Builder(
            name = "Filled.UserSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.5f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.5f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.367f, 2.25f)
                curveToRelative(-1.092f, 0f, -1.958f, 0f, -2.655f, 0.057f)
                curveToRelative(-0.714f, 0.058f, -1.317f, 0.18f, -1.868f, 0.46f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.076f, 2.077f)
                curveToRelative(-0.281f, 0.55f, -0.403f, 1.154f, -0.461f, 1.868f)
                curveToRelative(-0.057f, 0.697f, -0.057f, 1.563f, -0.057f, 2.655f)
                verticalLineToRelative(5.266f)
                curveToRelative(0f, 1.092f, 0f, 1.958f, 0.057f, 2.655f)
                curveToRelative(0.058f, 0.714f, 0.18f, 1.317f, 0.46f, 1.869f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.077f, 2.075f)
                curveToRelative(0.428f, 0.219f, 0.89f, 0.341f, 1.409f, 0.412f)
                arcToRelative(331f, 331f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.002f, -2.182f)
                curveTo(6.434f, 15.883f, 9.272f, 14.11f, 12f, 14.11f)
                reflectiveCurveToRelative(5.566f, 1.773f, 5.749f, 5.352f)
                curveToRelative(0.002f, 0.034f, 0.001f, 0.803f, -0.002f, 2.182f)
                curveToRelative(0.52f, -0.071f, 0.98f, -0.193f, 1.41f, -0.412f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.075f, -2.075f)
                curveToRelative(0.281f, -0.552f, 0.403f, -1.155f, 0.461f, -1.869f)
                curveToRelative(0.057f, -0.697f, 0.057f, -1.563f, 0.057f, -2.655f)
                lineTo(21.75f, 9.367f)
                curveToRelative(0f, -1.092f, 0f, -1.958f, -0.057f, -2.655f)
                curveToRelative(-0.058f, -0.714f, -0.18f, -1.317f, -0.46f, -1.868f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.076f, -2.076f)
                curveToRelative(-0.552f, -0.281f, -1.155f, -0.403f, -1.869f, -0.461f)
                curveToRelative(-0.697f, -0.057f, -1.563f, -0.057f, -2.655f, -0.057f)
                close()
                moveTo(8.75f, 9.25f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.5f, 0f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.263f, 21.74f)
                arcToRelative(421f, 421f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.012f, -2.202f)
                curveTo(16.117f, 16.93f, 14.114f, 15.61f, 12f, 15.61f)
                reflectiveCurveToRelative(-4.117f, 1.32f, -4.251f, 3.928f)
                curveToRelative(-0.002f, 0.035f, -0.006f, 0.81f, -0.012f, 2.202f)
                curveToRelative(0.48f, 0.01f, 1.02f, 0.01f, 1.63f, 0.01f)
                horizontalLineToRelative(5.266f)
                curveToRelative(0.61f, 0f, 1.15f, 0f, 1.63f, -0.01f)
            }
        }.build()

        return _UserSquare!!
    }

@Suppress("ObjectPropertyName")
private var _UserSquare: ImageVector? = null
