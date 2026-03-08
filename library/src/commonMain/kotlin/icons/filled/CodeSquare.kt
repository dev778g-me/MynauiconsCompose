package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CodeSquare: ImageVector
    get() {
        if (_CodeSquare != null) {
            return _CodeSquare!!
        }
        _CodeSquare = ImageVector.Builder(
            name = "Filled.CodeSquare",
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
                lineTo(9.367f, 21.75f)
                curveToRelative(-1.092f, 0f, -1.958f, 0f, -2.655f, -0.057f)
                curveToRelative(-0.714f, -0.058f, -1.317f, -0.18f, -1.868f, -0.46f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.076f, -2.076f)
                curveToRelative(-0.281f, -0.552f, -0.403f, -1.155f, -0.461f, -1.869f)
                curveToRelative(-0.057f, -0.697f, -0.057f, -1.563f, -0.057f, -2.655f)
                lineTo(2.25f, 9.367f)
                curveToRelative(0f, -1.092f, 0f, -1.958f, 0.057f, -2.655f)
                curveToRelative(0.058f, -0.714f, 0.18f, -1.317f, 0.46f, -1.868f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.077f, -2.076f)
                curveToRelative(0.55f, -0.281f, 1.154f, -0.403f, 1.868f, -0.461f)
                curveToRelative(0.697f, -0.057f, 1.563f, -0.057f, 2.655f, -0.057f)
                moveToRelative(4.43f, 5.944f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.45f, -0.388f)
                lineToRelative(-2.143f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.449f, 0.388f)
                close()
                moveTo(15.438f, 9.169f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.06f, 1.06f)
                lineToRelative(0.131f, 0.132f)
                curveToRelative(0.527f, 0.526f, 0.867f, 0.869f, 1.085f, 1.155f)
                curveToRelative(0.205f, 0.268f, 0.23f, 0.396f, 0.23f, 0.484f)
                reflectiveCurveToRelative(-0.025f, 0.216f, -0.23f, 0.484f)
                curveToRelative(-0.218f, 0.286f, -0.558f, 0.629f, -1.085f, 1.155f)
                lineToRelative(-0.131f, 0.131f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(0.167f, -0.166f)
                curveToRelative(0.482f, -0.48f, 0.895f, -0.894f, 1.181f, -1.27f)
                curveToRelative(0.307f, -0.402f, 0.537f, -0.846f, 0.537f, -1.394f)
                reflectiveCurveToRelative(-0.23f, -0.992f, -0.537f, -1.394f)
                curveToRelative(-0.286f, -0.376f, -0.7f, -0.79f, -1.18f, -1.27f)
                close()
                moveTo(9.622f, 9.169f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 0f)
                lineToRelative(-0.167f, 0.167f)
                curveToRelative(-0.481f, 0.48f, -0.895f, 0.894f, -1.181f, 1.27f)
                curveToRelative(-0.307f, 0.402f, -0.537f, 0.846f, -0.537f, 1.394f)
                reflectiveCurveToRelative(0.23f, 0.992f, 0.537f, 1.394f)
                curveToRelative(0.286f, 0.376f, 0.7f, 0.79f, 1.18f, 1.27f)
                lineToRelative(0.168f, 0.167f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, -1.06f)
                lineToRelative(-0.131f, -0.132f)
                curveToRelative(-0.527f, -0.526f, -0.867f, -0.869f, -1.085f, -1.155f)
                curveToRelative(-0.205f, -0.268f, -0.23f, -0.396f, -0.23f, -0.484f)
                reflectiveCurveToRelative(0.025f, -0.216f, 0.23f, -0.484f)
                curveToRelative(0.218f, -0.286f, 0.558f, -0.629f, 1.085f, -1.155f)
                lineToRelative(0.131f, -0.131f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.061f)
            }
        }.build()

        return _CodeSquare!!
    }

@Suppress("ObjectPropertyName")
private var _CodeSquare: ImageVector? = null
