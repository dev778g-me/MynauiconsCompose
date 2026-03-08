package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.StopHexagon: ImageVector
    get() {
        if (_StopHexagon != null) {
            return _StopHexagon!!
        }
        _StopHexagon = ImageVector.Builder(
            name = "Filled.StopHexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.68f, 2.105f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.64f, 0f)
                lineToRelative(0.001f, 0.001f)
                lineToRelative(6.611f, 3.8f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.25f, 8.2f)
                verticalLineToRelative(7.603f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.318f, 2.291f)
                lineToRelative(-0.003f, 0.002f)
                lineToRelative(-6.608f, 3.799f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.639f, 0f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-6.608f, -3.8f)
                horizontalLineToRelative(-0.003f)
                arcTo(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.75f, 15.8f)
                lineTo(2.75f, 8.198f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.318f, -2.291f)
                lineToRelative(0.003f, -0.002f)
                close()
                moveTo(10.528f, 8.802f)
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

        return _StopHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _StopHexagon: ImageVector? = null
