package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CheckOctagon: ImageVector
    get() {
        if (_CheckOctagon != null) {
            return _CheckOctagon!!
        }
        _CheckOctagon = ImageVector.Builder(
            name = "Filled.CheckOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.275f, 2.938f)
                curveToRelative(0.221f, -0.22f, 0.463f, -0.408f, 0.762f, -0.53f)
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
                lineTo(8.937f, 21.75f)
                curveToRelative(-0.313f, 0f, -0.616f, -0.039f, -0.914f, -0.163f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.748f, -0.525f)
                lineToRelative(-4.337f, -4.337f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.53f, -0.762f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.158f, -0.9f)
                lineTo(2.25f, 8.937f)
                curveToRelative(0f, -0.313f, 0.039f, -0.616f, 0.163f, -0.914f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.525f, -0.748f)
                close()
                moveTo(14.725f, 8.861f)
                lineTo(11.128f, 13.842f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.391f, 0.018f)
                lineToRelative(-1.506f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.129f, 0.987f)
                lineToRelative(1.506f, 1.721f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.736f, -0.128f)
                lineToRelative(3.597f, -4.98f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.216f, -0.88f)
            }
        }.build()

        return _CheckOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _CheckOctagon: ImageVector? = null
