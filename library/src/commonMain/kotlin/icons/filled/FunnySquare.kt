package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FunnySquare: ImageVector
    get() {
        if (_FunnySquare != null) {
            return _FunnySquare!!
        }
        _FunnySquare = ImageVector.Builder(
            name = "Filled.FunnySquare",
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
                moveTo(16.767f, 12.978f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.018f, 1.06f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.536f, 0.476f)
                lineToRelative(0.218f, 0.445f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.039f, 1.983f)
                lineToRelative(-0.273f, -0.557f)
                arcToRelative(8.9f, 8.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.801f, -0.087f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.364f, -1.455f)
                curveToRelative(1.13f, 0.283f, 2.429f, 0.287f, 3.746f, -0.066f)
                reflectiveCurveToRelative(2.44f, -1.005f, 3.278f, -1.816f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0.017f)
                moveToRelative(-3.028f, 3.303f)
                lineToRelative(-0.147f, -0.299f)
                quadToRelative(0.721f, -0.26f, 1.366f, -0.62f)
                lineToRelative(0.127f, 0.258f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.346f, 0.66f)
                moveTo(9.329f, 10f)
                lineToRelative(0.103f, 0.489f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.467f, 0.311f)
                lineToRelative(-0.104f, -0.489f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.328f, 10f)
                moveToRelative(4f, -1.618f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.89f, 0.578f)
                lineToRelative(0.104f, 0.489f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.467f, 0.312f)
                lineToRelative(-0.104f, -0.49f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.578f, -0.889f)
            }
        }.build()

        return _FunnySquare!!
    }

@Suppress("ObjectPropertyName")
private var _FunnySquare: ImageVector? = null
