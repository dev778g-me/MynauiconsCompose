package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Activity: ImageVector
    get() {
        if (_Activity != null) {
            return _Activity!!
        }
        _Activity = ImageVector.Builder(
            name = "Filled.Activity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.292f, 2.396f)
                curveToRelative(0.124f, 0.124f, 0.206f, 0.254f, 0.258f, 0.35f)
                curveToRelative(0.079f, 0.145f, 0.138f, 0.3f, 0.185f, 0.44f)
                curveToRelative(0.09f, 0.268f, 0.182f, 0.625f, 0.287f, 1.032f)
                lineToRelative(3.68f, 14.24f)
                lineTo(16.31f, 12.4f)
                lineToRelative(0.013f, -0.05f)
                lineToRelative(0.003f, -0.011f)
                curveToRelative(0.044f, -0.17f, 0.117f, -0.454f, 0.283f, -0.693f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.599f, -0.509f)
                curveToRelative(0.191f, -0.09f, 0.369f, -0.117f, 0.5f, -0.127f)
                curveToRelative(0.105f, -0.01f, 0.22f, -0.009f, 0.308f, -0.009f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-2.78f)
                lineToRelative(-1.804f, 6.795f)
                curveToRelative(-0.108f, 0.406f, -0.202f, 0.762f, -0.294f, 1.03f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.188f, 0.44f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.454f, 0.501f)
                arcToRelative(1.44f, 1.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.58f, -0.006f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.45f, -0.505f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.185f, -0.441f)
                curveToRelative(-0.09f, -0.268f, -0.182f, -0.625f, -0.287f, -1.032f)
                lineToRelative(-3.68f, -14.24f)
                lineTo(7.69f, 11.6f)
                lineToRelative(-0.013f, 0.05f)
                lineToRelative(-0.003f, 0.011f)
                curveToRelative(-0.044f, 0.17f, -0.118f, 0.454f, -0.283f, 0.693f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.599f, 0.509f)
                curveToRelative(-0.191f, 0.09f, -0.369f, 0.117f, -0.5f, 0.127f)
                curveToRelative(-0.105f, 0.01f, -0.22f, 0.009f, -0.308f, 0.009f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(2.78f)
                lineToRelative(1.804f, -6.796f)
                curveToRelative(0.108f, -0.405f, 0.202f, -0.762f, 0.294f, -1.028f)
                curveToRelative(0.048f, -0.14f, 0.108f, -0.295f, 0.188f, -0.44f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.454f, -0.502f)
                arcToRelative(1.435f, 1.435f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.772f, 0.162f)
            }
        }.build()

        return _Activity!!
    }

@Suppress("ObjectPropertyName")
private var _Activity: ImageVector? = null
