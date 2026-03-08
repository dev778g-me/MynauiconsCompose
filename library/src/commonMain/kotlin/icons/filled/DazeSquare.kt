package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.DazeSquare: ImageVector
    get() {
        if (_DazeSquare != null) {
            return _DazeSquare!!
        }
        _DazeSquare = ImageVector.Builder(
            name = "Filled.DazeSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(8.883f, 14.65f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, 0f)
                lineToRelative(0.884f, 0.662f)
                lineToRelative(0.883f, -0.662f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, 0f)
                lineToRelative(0.883f, 0.662f)
                lineToRelative(0.884f, -0.662f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, 0f)
                lineToRelative(1.333f, 1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.9f, 1.2f)
                lineToRelative(-0.883f, -0.663f)
                lineToRelative(-0.884f, 0.663f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, 0f)
                lineTo(12f, 16.187f)
                lineToRelative(-0.883f, 0.663f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, 0f)
                lineToRelative(-0.884f, -0.663f)
                lineToRelative(-0.883f, 0.663f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.9f, -1.2f)
                close()
                moveTo(8.45f, 8.4f)
                lineToRelative(2f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.2f)
                lineToRelative(-2f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.9f, -1.2f)
                lineToRelative(1.2f, -0.9f)
                lineToRelative(-1.2f, -0.9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, -1.2f)
                moveToRelative(8.15f, 0.15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.15f, 1.05f)
                lineToRelative(-1.2f, 0.9f)
                lineToRelative(1.2f, 0.9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.9f, 1.2f)
                lineToRelative(-2f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.2f)
                lineToRelative(2f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.05f, 0.15f)
            }
        }.build()

        return _DazeSquare!!
    }

@Suppress("ObjectPropertyName")
private var _DazeSquare: ImageVector? = null
