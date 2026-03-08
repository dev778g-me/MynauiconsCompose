package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.EuroSquare: ImageVector
    get() {
        if (_EuroSquare != null) {
            return _EuroSquare!!
        }
        _EuroSquare = ImageVector.Builder(
            name = "Filled.EuroSquare",
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
                moveToRelative(-0.506f, 6.52f)
                curveToRelative(-0.59f, 0.708f, -0.937f, 1.583f, -1.06f, 2.48f)
                horizontalLineToRelative(-0.8f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 12.75f)
                horizontalLineToRelative(0.812f)
                curveToRelative(0.339f, 2.069f, 2.044f, 4f, 4.438f, 4f)
                curveToRelative(1.305f, 0f, 2.448f, -0.287f, 3.27f, -1.075f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.04f, -1.083f)
                curveToRelative(-0.427f, 0.41f, -1.117f, 0.658f, -2.23f, 0.658f)
                curveToRelative(-1.432f, 0f, -2.593f, -1.134f, -2.913f, -2.5f)
                horizontalLineTo(12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineTo(9.321f)
                curveToRelative(0.11f, -0.573f, 0.345f, -1.102f, 0.693f, -1.52f)
                curveToRelative(0.481f, -0.578f, 1.207f, -0.98f, 2.236f, -0.98f)
                curveToRelative(1.113f, 0f, 1.803f, 0.248f, 2.23f, 0.658f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.04f, -1.083f)
                curveToRelative(-0.822f, -0.788f, -1.965f, -1.075f, -3.27f, -1.075f)
                curveToRelative(-1.471f, 0f, -2.62f, 0.598f, -3.389f, 1.52f)
            }
        }.build()

        return _EuroSquare!!
    }

@Suppress("ObjectPropertyName")
private var _EuroSquare: ImageVector? = null
