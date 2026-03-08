package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Nine: ImageVector
    get() {
        if (_Nine != null) {
            return _Nine!!
        }
        _Nine = ImageVector.Builder(
            name = "Filled.Nine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.875f, 7.75f)
                arcToRelative(2.375f, 2.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.375f, 2.375f)
                curveToRelative(0f, 0.63f, -0.24f, 1.026f, -0.605f, 1.29f)
                curveToRelative(-0.396f, 0.286f, -1.005f, 0.46f, -1.77f, 0.46f)
                reflectiveCurveToRelative(-1.374f, -0.174f, -1.77f, -0.46f)
                curveToRelative(-0.364f, -0.264f, -0.605f, -0.66f, -0.605f, -1.29f)
                arcToRelative(2.375f, 2.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.375f, -2.375f)
                moveToRelative(2.375f, 5.058f)
                verticalLineToRelative(0.442f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.25f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, -4.5f)
                verticalLineToRelative(-3.125f)
                arcToRelative(3.875f, 3.875f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.75f, 0f)
                curveToRelative(0f, 1.095f, 0.459f, 1.95f, 1.226f, 2.505f)
                curveToRelative(0.734f, 0.532f, 1.688f, 0.745f, 2.649f, 0.745f)
                curveToRelative(0.845f, 0f, 1.685f, -0.165f, 2.375f, -0.567f)
            }
        }.build()

        return _Nine!!
    }

@Suppress("ObjectPropertyName")
private var _Nine: ImageVector? = null
