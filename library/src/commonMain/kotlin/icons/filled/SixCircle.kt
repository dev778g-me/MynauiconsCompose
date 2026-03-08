package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SixCircle: ImageVector
    get() {
        if (_SixCircle != null) {
            return _SixCircle!!
        }
        _SixCircle = ImageVector.Builder(
            name = "Filled.SixCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15.25f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.75f, -1.75f)
                curveToRelative(0f, -0.458f, 0.171f, -0.729f, 0.422f, -0.91f)
                curveToRelative(0.283f, -0.205f, 0.735f, -0.34f, 1.328f, -0.34f)
                reflectiveCurveToRelative(1.045f, 0.135f, 1.328f, 0.34f)
                curveToRelative(0.251f, 0.181f, 0.422f, 0.452f, 0.422f, 0.91f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15.25f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                moveTo(12.5f, 7.25f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.75f, 11f)
                verticalLineToRelative(2.5f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 0f)
                curveToRelative(0f, -0.923f, -0.389f, -1.652f, -1.043f, -2.125f)
                curveToRelative(-0.621f, -0.45f, -1.419f, -0.625f, -2.207f, -0.625f)
                curveToRelative(-0.606f, 0f, -1.217f, 0.103f, -1.75f, 0.355f)
                verticalLineTo(11f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, -2.25f)
                horizontalLineToRelative(1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
            }
        }.build()

        return _SixCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SixCircle: ImageVector? = null
