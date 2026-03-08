package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.HeartOctagon: ImageVector
    get() {
        if (_HeartOctagon != null) {
            return _HeartOctagon!!
        }
        _HeartOctagon = ImageVector.Builder(
            name = "Filled.HeartOctagon",
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
                moveTo(12.3f, 16.124f)
                lineToRelative(0.005f, -0.003f)
                lineToRelative(0.009f, -0.006f)
                lineToRelative(0.032f, -0.022f)
                lineToRelative(0.117f, -0.081f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.628f, -1.341f)
                curveToRelative(0.444f, -0.427f, 0.91f, -0.938f, 1.27f, -1.492f)
                curveToRelative(0.354f, -0.545f, 0.648f, -1.2f, 0.648f, -1.898f)
                curveToRelative(0f, -0.782f, -0.262f, -1.443f, -0.767f, -1.902f)
                curveToRelative(-0.494f, -0.449f, -1.136f, -0.629f, -1.764f, -0.629f)
                arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.594f, 0.565f)
                arcTo(2.531f, 2.531f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.76f, 11.28f)
                curveToRelative(0f, 0.698f, 0.294f, 1.353f, 0.648f, 1.898f)
                curveToRelative(0.36f, 0.554f, 0.826f, 1.065f, 1.27f, 1.491f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.745f, 1.423f)
                lineToRelative(0.032f, 0.022f)
                lineToRelative(0.01f, 0.006f)
                lineToRelative(0.004f, 0.003f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.832f, 0f)
            }
        }.build()

        return _HeartOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _HeartOctagon: ImageVector? = null
