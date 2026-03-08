package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.StopOctagon: ImageVector
    get() {
        if (_StopOctagon != null) {
            return _StopOctagon!!
        }
        _StopOctagon = ImageVector.Builder(
            name = "Filled.StopOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveToRelative(2.491f, 6.394f)
                curveToRelative(-0.423f, 0.057f, -0.847f, 0.188f, -1.192f, 0.534f)
                curveToRelative(-0.346f, 0.345f, -0.477f, 0.769f, -0.534f, 1.192f)
                curveToRelative(-0.052f, 0.391f, -0.052f, 0.876f, -0.052f, 1.425f)
                verticalLineToRelative(0.094f)
                curveToRelative(0f, 0.549f, 0f, 1.034f, 0.052f, 1.425f)
                curveToRelative(0.057f, 0.423f, 0.188f, 0.847f, 0.534f, 1.192f)
                curveToRelative(0.345f, 0.346f, 0.769f, 0.477f, 1.192f, 0.534f)
                curveToRelative(0.391f, 0.052f, 0.876f, 0.052f, 1.425f, 0.052f)
                horizontalLineToRelative(0.095f)
                curveToRelative(0.548f, 0f, 1.033f, 0f, 1.424f, -0.052f)
                curveToRelative(0.423f, -0.057f, 0.847f, -0.188f, 1.192f, -0.534f)
                curveToRelative(0.346f, -0.345f, 0.477f, -0.769f, 0.534f, -1.192f)
                curveToRelative(0.052f, -0.391f, 0.052f, -0.876f, 0.052f, -1.424f)
                verticalLineToRelative(-0.095f)
                curveToRelative(0f, -0.549f, 0f, -1.034f, -0.052f, -1.424f)
                curveToRelative(-0.057f, -0.424f, -0.188f, -0.848f, -0.534f, -1.193f)
                curveToRelative(-0.345f, -0.346f, -0.769f, -0.477f, -1.192f, -0.534f)
                curveToRelative(-0.391f, -0.052f, -0.876f, -0.052f, -1.425f, -0.052f)
                horizontalLineToRelative(-0.094f)
                curveToRelative(-0.549f, 0f, -1.034f, 0f, -1.424f, 0.052f)
            }
        }.build()

        return _StopOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _StopOctagon: ImageVector? = null
