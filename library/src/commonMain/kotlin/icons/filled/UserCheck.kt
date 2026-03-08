package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.UserCheck: ImageVector
    get() {
        if (_UserCheck != null) {
            return _UserCheck!!
        }
        _UserCheck = ImageVector.Builder(
            name = "Filled.UserCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.25f, 7.5f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.5f, 0f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.5f, 0f)
                moveToRelative(11.999f, 12.962f)
                curveToRelative(-0.262f, -5.148f, -4.307f, -7.712f, -8.249f, -7.712f)
                reflectiveCurveToRelative(-7.987f, 2.563f, -8.249f, 7.712f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 0.787f)
                curveToRelative(3.365f, 0.171f, 12.998f, 0.106f, 15.077f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.711f, -0.787f)
                moveToRelative(-6.068f, -5.32f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.169f, 1.047f)
                lineToRelative(-2.1f, 2.907f)
                arcToRelative(0.974f, 0.974f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.522f, 0.072f)
                lineToRelative(-1.034f, -1.182f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.129f, -0.988f)
                lineToRelative(0.598f, 0.684f)
                lineToRelative(1.713f, -2.371f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.047f, -0.169f)
            }
        }.build()

        return _UserCheck!!
    }

@Suppress("ObjectPropertyName")
private var _UserCheck: ImageVector? = null
