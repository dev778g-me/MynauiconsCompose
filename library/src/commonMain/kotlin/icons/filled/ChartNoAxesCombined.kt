package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChartNoAxesCombined: ImageVector
    get() {
        if (_ChartNoAxesCombined != null) {
            return _ChartNoAxesCombined!!
        }
        _ChartNoAxesCombined = ImageVector.Builder(
            name = "Filled.ChartNoAxesCombined",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 21f)
                verticalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                moveToRelative(5f, 0f)
                verticalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                moveToRelative(4.5f, 0f)
                verticalLineToRelative(-7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                moveToRelative(4.5f, 0f)
                verticalLineTo(11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                moveToRelative(2.342f, -17.253f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.316f, 1.506f)
                lineToRelative(-5.846f, 5.114f)
                curveToRelative(-0.818f, 0.716f, -1.716f, 1.274f, -2.754f, 1.26f)
                curveToRelative(-0.92f, -0.011f, -1.723f, -0.465f, -2.467f, -1.137f)
                lineToRelative(-0.316f, -0.3f)
                lineToRelative(-0.007f, -0.007f)
                curveToRelative(-0.654f, -0.655f, -1.054f, -0.826f, -1.332f, -0.843f)
                curveToRelative(-0.233f, -0.015f, -0.589f, 0.067f, -1.174f, 0.505f)
                lineToRelative(-0.265f, 0.21f)
                lineToRelative(-3.856f, 3.214f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.282f, -1.537f)
                lineTo(6.217f, 8.52f)
                lineToRelative(0.334f, -0.266f)
                curveToRelative(0.786f, -0.59f, 1.61f, -0.967f, 2.512f, -0.91f)
                curveToRelative(1.021f, 0.066f, 1.864f, 0.67f, 2.62f, 1.426f)
                lineToRelative(0.006f, 0.006f)
                lineToRelative(0.251f, 0.239f)
                curveToRelative(0.556f, 0.499f, 0.909f, 0.61f, 1.143f, 0.614f)
                curveToRelative(0.28f, 0.004f, 0.7f, -0.141f, 1.413f, -0.766f)
                close()
            }
        }.build()

        return _ChartNoAxesCombined!!
    }

@Suppress("ObjectPropertyName")
private var _ChartNoAxesCombined: ImageVector? = null
