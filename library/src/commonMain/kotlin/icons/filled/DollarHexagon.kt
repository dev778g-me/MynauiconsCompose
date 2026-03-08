package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.DollarHexagon: ImageVector
    get() {
        if (_DollarHexagon != null) {
            return _DollarHexagon!!
        }
        _DollarHexagon = ImageVector.Builder(
            name = "Filled.DollarHexagon",
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
                verticalLineTo(8.198f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.318f, -2.291f)
                lineToRelative(0.003f, -0.002f)
                close()
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

        return _DollarHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _DollarHexagon: ImageVector? = null
