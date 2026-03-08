package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.EightSquare: ImageVector
    get() {
        if (_EightSquare != null) {
            return _EightSquare!!
        }
        _EightSquare = ImageVector.Builder(
            name = "Filled.EightSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.008f, 9.935f)
                curveToRelative(0f, -0.597f, 0.212f, -0.91f, 0.496f, -1.104f)
                curveToRelative(0.324f, -0.22f, 0.83f, -0.342f, 1.496f, -0.342f)
                reflectiveCurveToRelative(1.172f, 0.122f, 1.496f, 0.342f)
                curveToRelative(0.284f, 0.193f, 0.496f, 0.507f, 0.496f, 1.104f)
                curveToRelative(0f, 0.388f, -0.335f, 0.75f, -0.963f, 1.06f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.029f, 0.369f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.03f, -0.37f)
                curveToRelative(-0.627f, -0.31f, -0.962f, -0.67f, -0.962f, -1.06f)
                moveToRelative(1.763f, 2.764f)
                curveToRelative(0.091f, -0.027f, 0.17f, -0.047f, 0.229f, -0.062f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.03f, 0.37f)
                curveToRelative(0.627f, 0.31f, 0.962f, 0.67f, 0.962f, 1.06f)
                curveToRelative(0f, 0.596f, -0.212f, 0.91f, -0.496f, 1.103f)
                curveToRelative(-0.324f, 0.22f, -0.83f, 0.342f, -1.496f, 0.342f)
                reflectiveCurveToRelative(-1.172f, -0.122f, -1.496f, -0.342f)
                curveToRelative(-0.284f, -0.193f, -0.496f, -0.507f, -0.496f, -1.104f)
                curveToRelative(0f, -0.388f, 0.335f, -0.75f, 0.963f, -1.06f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, -0.307f)
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
                moveTo(8.75f, 9.935f)
                curveToRelative(0f, 1.053f, 0.803f, 1.702f, 1.462f, 2.065f)
                curveToRelative(-0.66f, 0.363f, -1.462f, 1.012f, -1.462f, 2.065f)
                curveToRelative(0f, 0.952f, 0.374f, 1.671f, 1.04f, 2.123f)
                curveToRelative(0.624f, 0.426f, 1.428f, 0.562f, 2.21f, 0.562f)
                reflectiveCurveToRelative(1.586f, -0.136f, 2.21f, -0.562f)
                curveToRelative(0.666f, -0.452f, 1.04f, -1.17f, 1.04f, -2.123f)
                curveToRelative(0f, -1.053f, -0.803f, -1.702f, -1.462f, -2.065f)
                curveToRelative(0.66f, -0.363f, 1.462f, -1.012f, 1.462f, -2.065f)
                curveToRelative(0f, -0.952f, -0.374f, -1.671f, -1.04f, -2.123f)
                curveToRelative(-0.624f, -0.426f, -1.428f, -0.562f, -2.21f, -0.562f)
                reflectiveCurveToRelative(-1.586f, 0.136f, -2.21f, 0.562f)
                curveToRelative(-0.666f, 0.452f, -1.04f, 1.17f, -1.04f, 2.123f)
            }
        }.build()

        return _EightSquare!!
    }

@Suppress("ObjectPropertyName")
private var _EightSquare: ImageVector? = null
