package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.UserHexagon: ImageVector
    get() {
        if (_UserHexagon != null) {
            return _UserHexagon!!
        }
        _UserHexagon = ImageVector.Builder(
            name = "Filled.UserHexagon",
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
                moveTo(12f, 1.75f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.32f, 0.355f)
                lineToRelative(-6.61f, 3.8f)
                lineToRelative(-0.002f, 0.002f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.75f, 8.198f)
                verticalLineToRelative(7.603f)
                arcToRelative(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.318f, 2.292f)
                lineToRelative(0.003f, 0.002f)
                lineToRelative(2.186f, 1.257f)
                curveTo(6.492f, 15.847f, 9.3f, 14.11f, 12f, 14.11f)
                reflectiveCurveToRelative(5.508f, 1.737f, 5.743f, 5.242f)
                lineToRelative(2.186f, -1.257f)
                lineToRelative(0.003f, -0.002f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.318f, -2.291f)
                verticalLineTo(8.199f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.318f, -2.292f)
                lineToRelative(-6.61f, -3.8f)
                lineToRelative(-0.002f, -0.002f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1.75f)
                moveToRelative(-3.25f, 7.5f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.5f, 0f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.256f, 20.207f)
                lineToRelative(-0.005f, -0.669f)
                curveTo(16.117f, 16.93f, 14.114f, 15.61f, 12f, 15.61f)
                reflectiveCurveToRelative(-4.117f, 1.32f, -4.251f, 3.928f)
                curveToRelative(0f, 0.019f, -0.003f, 0.248f, -0.005f, 0.669f)
                lineToRelative(2.935f, 1.687f)
                horizontalLineToRelative(0.002f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.639f, 0f)
                horizontalLineToRelative(0.001f)
                close()
            }
        }.build()

        return _UserHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _UserHexagon: ImageVector? = null
