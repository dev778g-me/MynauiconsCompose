package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FiveSquare: ImageVector
    get() {
        if (_FiveSquare != null) {
            return _FiveSquare!!
        }
        _FiveSquare = ImageVector.Builder(
            name = "Filled.FiveSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.712f, 2.307f)
                curveToRelative(0.697f, -0.057f, 1.563f, -0.057f, 2.655f, -0.057f)
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
                moveTo(9.025f, 7.42f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.75f, 8f)
                verticalLineToRelative(2.852f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, 0.75f)
                horizontalLineToRelative(2.778f)
                curveToRelative(0.927f, 0f, 1.472f, 0.621f, 1.472f, 1.152f)
                verticalLineToRelative(1.12f)
                curveToRelative(0f, 0.453f, -0.19f, 0.768f, -0.484f, 0.992f)
                curveToRelative(-0.316f, 0.239f, -0.774f, 0.382f, -1.269f, 0.384f)
                reflectiveCurveToRelative(-0.95f, -0.139f, -1.264f, -0.375f)
                curveToRelative(-0.292f, -0.22f, -0.483f, -0.537f, -0.483f, -1.001f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                curveToRelative(0f, 0.961f, 0.434f, 1.71f, 1.08f, 2.198f)
                curveToRelative(0.624f, 0.471f, 1.417f, 0.68f, 2.173f, 0.678f)
                curveToRelative(0.755f, -0.003f, 1.547f, -0.218f, 2.169f, -0.689f)
                arcToRelative(2.67f, 2.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.078f, -2.187f)
                verticalLineToRelative(-1.12f)
                curveToRelative(0f, -1.57f, -1.444f, -2.652f, -2.972f, -2.652f)
                horizontalLineTo(10.25f)
                verticalLineTo(8.87f)
                curveToRelative(0.206f, 0.024f, 0.441f, 0.047f, 0.697f, 0.066f)
                curveToRelative(0.906f, 0.064f, 2.123f, 0.07f, 3.235f, -0.208f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.364f, -1.456f)
                curveToRelative(-0.749f, 0.188f, -1.601f, 0.22f, -2.356f, 0.19f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.431f, -0.134f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.364f, -0.06f)
                arcToRelative(0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.642f, 0.152f)
            }
        }.build()

        return _FiveSquare!!
    }

@Suppress("ObjectPropertyName")
private var _FiveSquare: ImageVector? = null
