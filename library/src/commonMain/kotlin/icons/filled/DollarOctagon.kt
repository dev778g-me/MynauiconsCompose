package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.DollarOctagon: ImageVector
    get() {
        if (_DollarOctagon != null) {
            return _DollarOctagon!!
        }
        _DollarOctagon = ImageVector.Builder(
            name = "Filled.DollarOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.333f, 8.472f)
                horizontalLineToRelative(0.917f)
                verticalLineToRelative(2.778f)
                horizontalLineToRelative(-0.917f)
                curveToRelative(-0.937f, 0f, -1.583f, -0.682f, -1.583f, -1.389f)
                reflectiveCurveToRelative(0.646f, -1.389f, 1.583f, -1.389f)
                moveToRelative(2.417f, 7.056f)
                verticalLineTo(12.75f)
                horizontalLineToRelative(0.917f)
                curveToRelative(0.937f, 0f, 1.583f, 0.682f, 1.583f, 1.389f)
                reflectiveCurveToRelative(-0.646f, 1.389f, -1.583f, 1.389f)
                close()
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
                moveTo(12.75f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(0.472f)
                horizontalLineToRelative(-0.917f)
                curveToRelative(-1.64f, 0f, -3.083f, 1.234f, -3.083f, 2.89f)
                curveToRelative(0f, 1.655f, 1.443f, 2.888f, 3.083f, 2.888f)
                horizontalLineToRelative(0.917f)
                verticalLineToRelative(2.778f)
                horizontalLineTo(8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(0.472f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-0.472f)
                horizontalLineToRelative(0.917f)
                curveToRelative(1.64f, 0f, 3.083f, -1.233f, 3.083f, -2.89f)
                curveToRelative(0f, -1.655f, -1.443f, -2.888f, -3.083f, -2.888f)
                horizontalLineToRelative(-0.917f)
                verticalLineTo(8.472f)
                horizontalLineToRelative(2.583f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineTo(12.75f)
                close()
            }
        }.build()

        return _DollarOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _DollarOctagon: ImageVector? = null
