package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.UserOctagon: ImageVector
    get() {
        if (_UserOctagon != null) {
            return _UserOctagon!!
        }
        _UserOctagon = ImageVector.Builder(
            name = "Filled.UserOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.5f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.5f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.937f, 2.25f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.9f, 0.158f)
                curveToRelative(-0.299f, 0.122f, -0.54f, 0.31f, -0.762f, 0.53f)
                lineTo(2.938f, 7.275f)
                curveToRelative(-0.213f, 0.214f, -0.4f, 0.45f, -0.525f, 0.748f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.163f, 0.914f)
                verticalLineToRelative(6.126f)
                curveToRelative(0f, 0.302f, 0.036f, 0.602f, 0.158f, 0.9f)
                reflectiveCurveToRelative(0.31f, 0.54f, 0.53f, 0.762f)
                lineToRelative(3.312f, 3.312f)
                lineToRelative(0.001f, -0.575f)
                curveTo(6.434f, 15.883f, 9.272f, 14.11f, 12f, 14.11f)
                reflectiveCurveToRelative(5.566f, 1.773f, 5.749f, 5.352f)
                verticalLineToRelative(0.575f)
                lineToRelative(3.313f, -3.312f)
                curveToRelative(0.213f, -0.214f, 0.4f, -0.45f, 0.524f, -0.748f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.164f, -0.914f)
                lineTo(21.75f, 8.937f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.158f, -0.9f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.53f, -0.762f)
                lineToRelative(-4.337f, -4.337f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.762f, -0.53f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.9f, -0.158f)
                close()
                moveTo(8.75f, 9.25f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.5f, 0f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.262f, 21.439f)
                lineToRelative(-0.011f, -1.9f)
                curveToRelative(-0.134f, -2.609f, -2.137f, -3.93f, -4.251f, -3.93f)
                reflectiveCurveToRelative(-4.117f, 1.321f, -4.251f, 3.93f)
                curveToRelative(-0.002f, 0.031f, -0.005f, 0.698f, -0.01f, 1.9f)
                quadToRelative(0.132f, 0.083f, 0.284f, 0.148f)
                curveToRelative(0.298f, 0.124f, 0.601f, 0.163f, 0.914f, 0.163f)
                horizontalLineToRelative(6.126f)
                curveToRelative(0.302f, 0f, 0.602f, -0.035f, 0.9f, -0.158f)
                quadToRelative(0.159f, -0.065f, 0.299f, -0.153f)
            }
        }.build()

        return _UserOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _UserOctagon: ImageVector? = null
