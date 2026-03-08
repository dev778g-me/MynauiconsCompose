package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SixOctagon: ImageVector
    get() {
        if (_SixOctagon != null) {
            return _SixOctagon!!
        }
        _SixOctagon = ImageVector.Builder(
            name = "Filled.SixOctagon",
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
                moveTo(8.037f, 2.408f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, -0.158f)
                horizontalLineToRelative(6.126f)
                curveToRelative(0.302f, 0f, 0.602f, 0.036f, 0.9f, 0.158f)
                reflectiveCurveToRelative(0.54f, 0.31f, 0.762f, 0.53f)
                lineToRelative(4.337f, 4.337f)
                curveToRelative(0.22f, 0.221f, 0.408f, 0.463f, 0.53f, 0.762f)
                curveToRelative(0.123f, 0.298f, 0.158f, 0.598f, 0.158f, 0.9f)
                verticalLineToRelative(6.126f)
                curveToRelative(0f, 0.313f, -0.039f, 0.616f, -0.163f, 0.914f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.525f, 0.748f)
                lineToRelative(-4.337f, 4.337f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.762f, 0.53f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, 0.158f)
                horizontalLineTo(8.937f)
                curveToRelative(-0.313f, 0f, -0.616f, -0.039f, -0.914f, -0.163f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.748f, -0.525f)
                lineToRelative(-4.337f, -4.337f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.53f, -0.762f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.158f, -0.9f)
                verticalLineTo(8.937f)
                curveToRelative(0f, -0.313f, 0.039f, -0.616f, 0.163f, -0.914f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.525f, -0.748f)
                lineToRelative(4.337f, -4.337f)
                curveToRelative(0.221f, -0.22f, 0.463f, -0.408f, 0.762f, -0.53f)
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

        return _SixOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _SixOctagon: ImageVector? = null
