package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.HashSquare: ImageVector
    get() {
        if (_HashSquare != null) {
            return _HashSquare!!
        }
        _HashSquare = ImageVector.Builder(
            name = "Filled.HashSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.769f, 13f)
                horizontalLineToRelative(1.976f)
                lineToRelative(0.359f, -2f)
                horizontalLineToRelative(-1.976f)
                close()
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
                curveToRelative(0.55f, 0.281f, 1.154f, 0.403f, 1.868f, 0.461f)
                curveToRelative(0.697f, 0.057f, 1.563f, 0.057f, 2.655f, 0.057f)
                horizontalLineToRelative(5.266f)
                curveToRelative(1.092f, 0f, 1.958f, 0f, 2.655f, -0.057f)
                curveToRelative(0.714f, -0.058f, 1.317f, -0.18f, 1.869f, -0.46f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.075f, -2.076f)
                curveToRelative(0.281f, -0.552f, 0.403f, -1.155f, 0.461f, -1.869f)
                curveToRelative(0.057f, -0.697f, 0.057f, -1.563f, 0.057f, -2.655f)
                lineTo(21.75f, 9.367f)
                curveToRelative(0f, -1.092f, 0f, -1.958f, -0.057f, -2.655f)
                curveToRelative(-0.058f, -0.714f, -0.18f, -1.317f, -0.46f, -1.868f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.076f, -2.076f)
                curveToRelative(-0.552f, -0.281f, -1.155f, -0.403f, -1.869f, -0.461f)
                curveToRelative(-0.697f, -0.057f, -1.563f, -0.057f, -2.655f, -0.057f)
                close()
                moveTo(11.037f, 7.262f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.606f, 0.87f)
                lineTo(11.397f, 9.5f)
                horizontalLineToRelative(1.976f)
                lineToRelative(0.293f, -1.633f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.477f, 0.266f)
                lineTo(14.897f, 9.5f)
                horizontalLineToRelative(1.385f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-1.654f)
                lineToRelative(-0.36f, 2f)
                horizontalLineToRelative(2.014f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                lineTo(14f, 14.5f)
                lineToRelative(-0.293f, 1.633f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.477f, -0.265f)
                lineToRelative(0.246f, -1.368f)
                lineTo(10.5f, 14.5f)
                lineToRelative(-0.293f, 1.633f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.477f, -0.265f)
                lineToRelative(0.246f, -1.368f)
                lineTo(7.718f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.527f)
                lineToRelative(0.359f, -2f)
                lineTo(7.718f, 11f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(2.155f)
                lineToRelative(0.293f, -1.633f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.871f, -0.605f)
            }
        }.build()

        return _HashSquare!!
    }

@Suppress("ObjectPropertyName")
private var _HashSquare: ImageVector? = null
