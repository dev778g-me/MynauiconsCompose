package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Six: ImageVector
    get() {
        if (_Six != null) {
            return _Six!!
        }
        _Six = ImageVector.Builder(
            name = "Filled.Six",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 10.75f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, -4.5f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                lineTo(12.5f, 7.75f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(0.442f)
                curveToRelative(0.69f, -0.402f, 1.53f, -0.567f, 2.375f, -0.567f)
                curveToRelative(0.96f, 0f, 1.915f, 0.213f, 2.65f, 0.745f)
                curveToRelative(0.766f, 0.555f, 1.225f, 1.41f, 1.225f, 2.505f)
                arcToRelative(3.875f, 3.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.75f, 0f)
                close()
                moveTo(9.5f, 13.875f)
                arcToRelative(2.375f, 2.375f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.75f, 0f)
                curveToRelative(0f, -0.63f, -0.24f, -1.026f, -0.605f, -1.29f)
                curveToRelative(-0.396f, -0.286f, -1.005f, -0.46f, -1.77f, -0.46f)
                reflectiveCurveToRelative(-1.374f, 0.174f, -1.77f, 0.46f)
                curveToRelative(-0.364f, 0.264f, -0.605f, 0.66f, -0.605f, 1.29f)
            }
        }.build()

        return _Six!!
    }

@Suppress("ObjectPropertyName")
private var _Six: ImageVector? = null
