package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ThreeSquare: ImageVector
    get() {
        if (_ThreeSquare != null) {
            return _ThreeSquare!!
        }
        _ThreeSquare = ImageVector.Builder(
            name = "Filled.ThreeSquare",
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
                moveToRelative(5.883f, 7.744f)
                curveToRelative(0f, -0.935f, -0.453f, -1.65f, -1.097f, -2.107f)
                curveToRelative(-0.622f, -0.441f, -1.408f, -0.637f, -2.153f, -0.637f)
                reflectiveCurveToRelative(-1.531f, 0.196f, -2.153f, 0.637f)
                curveToRelative(-0.643f, 0.456f, -1.097f, 1.172f, -1.097f, 2.107f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -0.394f, 0.172f, -0.675f, 0.465f, -0.884f)
                curveToRelative(0.316f, -0.224f, 0.78f, -0.36f, 1.285f, -0.36f)
                reflectiveCurveToRelative(0.969f, 0.136f, 1.285f, 0.36f)
                curveToRelative(0.292f, 0.207f, 0.463f, 0.486f, 0.465f, 0.877f)
                lineToRelative(-0.002f, 0.027f)
                curveToRelative(-0.003f, 0.03f, -0.008f, 0.08f, -0.021f, 0.141f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.176f, 0.445f)
                curveToRelative(-0.166f, 0.267f, -0.542f, 0.65f, -1.551f, 0.65f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                curveToRelative(1.01f, 0f, 1.385f, 0.383f, 1.551f, 0.65f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.199f, 0.613f)
                curveToRelative(-0.002f, 0.39f, -0.173f, 0.67f, -0.465f, 0.877f)
                curveToRelative(-0.316f, 0.224f, -0.78f, 0.36f, -1.285f, 0.36f)
                reflectiveCurveToRelative(-0.969f, -0.136f, -1.285f, -0.36f)
                curveToRelative(-0.293f, -0.209f, -0.465f, -0.49f, -0.465f, -0.884f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.5f, 0f)
                curveToRelative(0f, 0.935f, 0.454f, 1.65f, 1.097f, 2.107f)
                curveToRelative(0.622f, 0.441f, 1.408f, 0.637f, 2.153f, 0.637f)
                reflectiveCurveToRelative(1.531f, -0.196f, 2.153f, -0.637f)
                curveToRelative(0.643f, -0.456f, 1.097f, -1.172f, 1.097f, -2.107f)
                verticalLineToRelative(-0.002f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.426f, -1.398f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.517f, -0.606f)
                curveToRelative(0.211f, -0.184f, 0.382f, -0.39f, 0.517f, -0.606f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.426f, -1.398f)
                close()
            }
        }.build()

        return _ThreeSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ThreeSquare: ImageVector? = null
