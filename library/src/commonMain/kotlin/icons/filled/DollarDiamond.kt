package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.DollarDiamond: ImageVector
    get() {
        if (_DollarDiamond != null) {
            return _DollarDiamond!!
        }
        _DollarDiamond = ImageVector.Builder(
            name = "Filled.DollarDiamond",
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
                moveTo(10.79f, 1.49f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.445f, 0.687f)
                lineToRelative(7.588f, 7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.47f)
                lineToRelative(-7.588f, 7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.47f, 0f)
                lineToRelative(-7.588f, -7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.47f)
                lineToRelative(7.588f, -7.589f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.025f, -0.685f)
                moveToRelative(1.96f, 5.01f)
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

        return _DollarDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _DollarDiamond: ImageVector? = null
