package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Wheel: ImageVector
    get() {
        if (_Wheel != null) {
            return _Wheel!!
        }
        _Wheel = ImageVector.Builder(
            name = "Filled.Wheel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.26f, 7.242f)
                lineToRelative(4.823f, 2.785f)
                quadToRelative(0.233f, -0.225f, 0.508f, -0.389f)
                lineToRelative(-1.442f, -5.38f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.89f, 2.984f)
                moveToRelative(5.338f, -3.372f)
                lineToRelative(1.441f, 5.38f)
                quadToRelative(0.319f, 0.004f, 0.635f, 0.083f)
                lineToRelative(2.785f, -4.824f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.861f, -0.64f)
                moveToRelative(6.16f, 1.39f)
                lineToRelative(-2.785f, 4.823f)
                quadToRelative(0.225f, 0.234f, 0.389f, 0.508f)
                lineToRelative(5.38f, -1.442f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.984f, -3.89f)
                moveToRelative(3.372f, 5.338f)
                lineToRelative(-5.38f, 1.441f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.083f, 0.635f)
                lineToRelative(4.824f, 2.785f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.64f, -4.861f)
                moveToRelative(-1.39f, 6.16f)
                lineToRelative(-4.823f, -2.785f)
                quadToRelative(-0.234f, 0.225f, -0.508f, 0.389f)
                lineToRelative(1.442f, 5.38f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.89f, -2.984f)
                moveToRelative(-5.338f, 3.372f)
                lineToRelative(-1.441f, -5.38f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.635f, -0.083f)
                lineTo(8.541f, 19.49f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.861f, 0.64f)
                moveToRelative(-6.16f, -1.39f)
                lineToRelative(2.785f, -4.823f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.389f, -0.508f)
                lineToRelative(-5.38f, 1.442f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.984f, 3.89f)
                moveTo(3.87f, 13.403f)
                lineToRelative(5.38f, -1.441f)
                quadToRelative(0.004f, -0.319f, 0.083f, -0.635f)
                lineTo(4.509f, 8.541f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.64f, 4.861f)
                moveToRelative(-0.314f, -6.277f)
                curveTo(6.25f, 2.462f, 12.212f, 0.864f, 16.875f, 3.556f)
                reflectiveCurveToRelative(6.261f, 8.656f, 3.569f, 13.319f)
                reflectiveCurveToRelative(-8.656f, 6.261f, -13.32f, 3.569f)
                curveTo(2.463f, 17.75f, 0.865f, 11.788f, 3.557f, 7.125f)
            }
        }.build()

        return _Wheel!!
    }

@Suppress("ObjectPropertyName")
private var _Wheel: ImageVector? = null
