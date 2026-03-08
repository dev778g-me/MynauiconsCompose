package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.PlaySquare: ImageVector
    get() {
        if (_PlaySquare != null) {
            return _PlaySquare!!
        }
        _PlaySquare = ImageVector.Builder(
            name = "Filled.PlaySquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveToRelative(3.188f, 7.059f)
                curveToRelative(-0.292f, -0.178f, -0.6f, -0.366f, -0.88f, -0.466f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.586f, -0.09f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.632f, 0.24f)
                curveToRelative(-0.368f, 0.278f, -0.504f, 0.672f, -0.569f, 1.01f)
                curveToRelative(-0.061f, 0.314f, -0.084f, 0.711f, -0.109f, 1.144f)
                lineToRelative(-0.003f, 0.046f)
                curveToRelative(-0.015f, 0.276f, -0.026f, 0.553f, -0.026f, 0.807f)
                reflectiveCurveToRelative(0.01f, 0.531f, 0.026f, 0.807f)
                lineToRelative(0.003f, 0.046f)
                curveToRelative(0.025f, 0.433f, 0.048f, 0.83f, 0.109f, 1.145f)
                curveToRelative(0.065f, 0.337f, 0.2f, 0.731f, 0.57f, 1.008f)
                curveToRelative(0.18f, 0.136f, 0.392f, 0.223f, 0.63f, 0.24f)
                curveToRelative(0.225f, 0.017f, 0.426f, -0.031f, 0.588f, -0.09f)
                curveToRelative(0.278f, -0.1f, 0.587f, -0.287f, 0.879f, -0.465f)
                lineToRelative(0.048f, -0.03f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.113f, -0.789f)
                lineToRelative(0.04f, -0.033f)
                curveToRelative(0.301f, -0.245f, 0.599f, -0.488f, 0.811f, -0.735f)
                curveToRelative(0.254f, -0.295f, 0.433f, -0.648f, 0.433f, -1.104f)
                reflectiveCurveToRelative(-0.18f, -0.809f, -0.433f, -1.104f)
                curveToRelative(-0.212f, -0.247f, -0.51f, -0.49f, -0.81f, -0.735f)
                lineToRelative(-0.04f, -0.033f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.582f, -0.445f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.532f, -0.345f)
                close()
            }
        }.build()

        return _PlaySquare!!
    }

@Suppress("ObjectPropertyName")
private var _PlaySquare: ImageVector? = null
