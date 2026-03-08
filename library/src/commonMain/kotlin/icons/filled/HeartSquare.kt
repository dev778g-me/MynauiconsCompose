package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.HeartSquare: ImageVector
    get() {
        if (_HeartSquare != null) {
            return _HeartSquare!!
        }
        _HeartSquare = ImageVector.Builder(
            name = "Filled.HeartSquare",
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
                moveToRelative(2.934f, 13.874f)
                lineToRelative(0.005f, -0.003f)
                lineToRelative(0.009f, -0.006f)
                lineToRelative(0.032f, -0.022f)
                lineToRelative(0.117f, -0.081f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.628f, -1.341f)
                curveToRelative(0.444f, -0.427f, 0.91f, -0.938f, 1.27f, -1.492f)
                curveToRelative(0.354f, -0.545f, 0.648f, -1.2f, 0.648f, -1.898f)
                curveToRelative(0f, -0.782f, -0.262f, -1.443f, -0.767f, -1.902f)
                curveToRelative(-0.494f, -0.449f, -1.136f, -0.629f, -1.764f, -0.629f)
                arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.594f, 0.565f)
                arcTo(2.531f, 2.531f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.76f, 11.28f)
                curveToRelative(0f, 0.698f, 0.294f, 1.353f, 0.648f, 1.898f)
                curveToRelative(0.36f, 0.554f, 0.826f, 1.065f, 1.27f, 1.491f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.745f, 1.423f)
                lineToRelative(0.032f, 0.022f)
                lineToRelative(0.01f, 0.006f)
                lineToRelative(0.004f, 0.003f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.832f, 0f)
            }
        }.build()

        return _HeartSquare!!
    }

@Suppress("ObjectPropertyName")
private var _HeartSquare: ImageVector? = null
