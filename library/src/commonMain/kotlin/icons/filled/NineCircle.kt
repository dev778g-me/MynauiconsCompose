package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.NineCircle: ImageVector
    get() {
        if (_NineCircle != null) {
            return _NineCircle!!
        }
        _NineCircle = ImageVector.Builder(
            name = "Filled.NineCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.25f, 10.5f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3.5f, 0f)
                curveToRelative(0f, 0.458f, -0.171f, 0.729f, -0.422f, 0.91f)
                curveToRelative(-0.283f, 0.205f, -0.735f, 0.34f, -1.328f, 0.34f)
                reflectiveCurveToRelative(-1.045f, -0.135f, -1.328f, -0.34f)
                curveToRelative(-0.251f, -0.181f, -0.422f, -0.452f, -0.422f, -0.91f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, 5.385f, 4.365f, 9.75f, 9.75f, 9.75f)
                reflectiveCurveToRelative(9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                reflectiveCurveTo(2.25f, 6.615f, 2.25f, 12f)
                moveToRelative(11.5f, 1f)
                verticalLineToRelative(-0.105f)
                curveToRelative(-0.533f, 0.252f, -1.144f, 0.355f, -1.75f, 0.355f)
                curveToRelative(-0.788f, 0f, -1.586f, -0.175f, -2.207f, -0.625f)
                curveToRelative(-0.654f, -0.473f, -1.043f, -1.202f, -1.043f, -2.125f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 0f)
                verticalLineTo(13f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.75f, 3.75f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.75f, 13f)
            }
        }.build()

        return _NineCircle!!
    }

@Suppress("ObjectPropertyName")
private var _NineCircle: ImageVector? = null
