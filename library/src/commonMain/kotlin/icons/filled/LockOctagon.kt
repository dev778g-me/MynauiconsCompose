package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LockOctagon: ImageVector
    get() {
        if (_LockOctagon != null) {
            return _LockOctagon!!
        }
        _LockOctagon = ImageVector.Builder(
            name = "Filled.LockOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.746f, 8.925f)
                verticalLineToRelative(1.271f)
                horizontalLineToRelative(2.508f)
                verticalLineToRelative(-1.27f)
                curveToRelative(0f, -0.454f, -0.163f, -0.725f, -0.36f, -0.893f)
                curveToRelative(-0.216f, -0.182f, -0.53f, -0.29f, -0.88f, -0.283f)
                curveToRelative(-0.717f, 0.014f, -1.268f, 0.451f, -1.268f, 1.175f)
                moveTo(8.75f, 11.957f)
                curveToRelative(0f, -0.15f, 0.119f, -0.26f, 0.252f, -0.26f)
                horizontalLineToRelative(5.996f)
                curveToRelative(0.133f, 0f, 0.252f, 0.11f, 0.252f, 0.26f)
                verticalLineToRelative(3.032f)
                curveToRelative(0f, 0.15f, -0.119f, 0.261f, -0.252f, 0.261f)
                horizontalLineTo(9.002f)
                arcToRelative(0.257f, 0.257f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.252f, -0.26f)
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
                moveToRelative(6.717f, 6.517f)
                curveToRelative(0f, -0.868f, -0.338f, -1.568f, -0.891f, -2.037f)
                curveToRelative(-0.537f, -0.454f, -1.224f, -0.65f, -1.877f, -0.637f)
                curveToRelative(-1.287f, 0.024f, -2.74f, 0.906f, -2.74f, 2.674f)
                verticalLineToRelative(1.271f)
                horizontalLineToRelative(-0.244f)
                curveToRelative(-0.974f, 0f, -1.752f, 0.795f, -1.752f, 1.761f)
                verticalLineToRelative(3.032f)
                curveToRelative(0f, 0.967f, 0.778f, 1.761f, 1.752f, 1.761f)
                horizontalLineToRelative(5.996f)
                curveToRelative(0.974f, 0f, 1.752f, -0.794f, 1.752f, -1.76f)
                verticalLineToRelative(-3.033f)
                curveToRelative(0f, -0.966f, -0.778f, -1.76f, -1.752f, -1.76f)
                horizontalLineToRelative(-0.244f)
                close()
            }
        }.build()

        return _LockOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _LockOctagon: ImageVector? = null
