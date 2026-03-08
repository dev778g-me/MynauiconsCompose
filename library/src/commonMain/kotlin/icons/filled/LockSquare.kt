package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LockSquare: ImageVector
    get() {
        if (_LockSquare != null) {
            return _LockSquare!!
        }
        _LockSquare = ImageVector.Builder(
            name = "Filled.LockSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.746f, 8.925f)
                verticalLineToRelative(1.271f)
                horizontalLineToRelative(2.508f)
                verticalLineToRelative(-1.27f)
                curveToRelative(0f, -0.454f, -0.163f, -0.725f, -0.36f, -0.893f)
                curveToRelative(-0.216f, -0.182f, -0.53f, -0.29f, -0.88f, -0.283f)
                curveToRelative(-0.717f, 0.014f, -1.268f, 0.451f, -1.268f, 1.175f)
                moveTo(8.75f, 11.957f)
                curveToRelative(0f, -0.15f, 0.119f, -0.26f, 0.252f, -0.26f)
                horizontalLineToRelative(5.996f)
                curveToRelative(0.133f, 0f, 0.252f, 0.11f, 0.252f, 0.26f)
                verticalLineToRelative(3.032f)
                curveToRelative(0f, 0.15f, -0.119f, 0.261f, -0.252f, 0.261f)
                horizontalLineTo(9.002f)
                arcToRelative(0.257f, 0.257f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.252f, -0.26f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.367f, 2.25f)
                horizontalLineToRelative(5.266f)
                curveToRelative(1.092f, 0f, 1.958f, 0f, 2.655f, 0.057f)
                curveToRelative(0.714f, 0.058f, 1.317f, 0.18f, 1.869f, 0.46f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.075f, 2.077f)
                curveToRelative(0.281f, 0.55f, 0.403f, 1.154f, 0.461f, 1.868f)
                curveToRelative(0.057f, 0.697f, 0.057f, 1.563f, 0.057f, 2.655f)
                verticalLineToRelative(5.266f)
                curveToRelative(0f, 1.092f, 0f, 1.958f, -0.057f, 2.655f)
                curveToRelative(-0.058f, 0.714f, -0.18f, 1.317f, -0.46f, 1.869f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.076f, 2.075f)
                curveToRelative(-0.552f, 0.281f, -1.155f, 0.403f, -1.869f, 0.461f)
                curveToRelative(-0.697f, 0.057f, -1.563f, 0.057f, -2.655f, 0.057f)
                horizontalLineTo(9.367f)
                curveToRelative(-1.092f, 0f, -1.958f, 0f, -2.655f, -0.057f)
                curveToRelative(-0.714f, -0.058f, -1.317f, -0.18f, -1.868f, -0.46f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.076f, -2.076f)
                curveToRelative(-0.281f, -0.552f, -0.403f, -1.155f, -0.461f, -1.869f)
                curveToRelative(-0.057f, -0.697f, -0.057f, -1.563f, -0.057f, -2.655f)
                verticalLineTo(9.367f)
                curveToRelative(0f, -1.092f, 0f, -1.958f, 0.057f, -2.655f)
                curveToRelative(0.058f, -0.714f, 0.18f, -1.317f, 0.46f, -1.868f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.077f, -2.076f)
                curveToRelative(0.55f, -0.281f, 1.154f, -0.403f, 1.868f, -0.461f)
                curveToRelative(0.697f, -0.057f, 1.563f, -0.057f, 2.655f, -0.057f)
                moveToRelative(5.387f, 6.675f)
                curveToRelative(0f, -0.868f, -0.338f, -1.568f, -0.891f, -2.037f)
                curveToRelative(-0.537f, -0.454f, -1.224f, -0.65f, -1.877f, -0.637f)
                curveToRelative(-1.287f, 0.024f, -2.74f, 0.906f, -2.74f, 2.674f)
                verticalLineToRelative(1.271f)
                horizontalLineToRelative(-0.244f)
                curveToRelative(-0.974f, 0f, -1.752f, 0.795f, -1.752f, 1.761f)
                verticalLineToRelative(3.032f)
                curveToRelative(0f, 0.967f, 0.778f, 1.761f, 1.752f, 1.761f)
                horizontalLineToRelative(5.996f)
                curveToRelative(0.974f, 0f, 1.752f, -0.794f, 1.752f, -1.76f)
                verticalLineToRelative(-3.033f)
                curveToRelative(0f, -0.966f, -0.778f, -1.76f, -1.752f, -1.76f)
                horizontalLineToRelative(-0.244f)
                close()
            }
        }.build()

        return _LockSquare!!
    }

@Suppress("ObjectPropertyName")
private var _LockSquare: ImageVector? = null
