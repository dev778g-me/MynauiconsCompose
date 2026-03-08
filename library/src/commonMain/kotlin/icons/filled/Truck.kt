package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Truck: ImageVector
    get() {
        if (_Truck != null) {
            return _Truck!!
        }
        _Truck = ImageVector.Builder(
            name = "Filled.Truck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.748f, 17.205f)
                horizontalLineTo(9.872f)
                curveToRelative(-0.331f, 1.448f, -1.602f, 2.545f, -3.148f, 2.545f)
                curveToRelative(-1.545f, 0f, -2.816f, -1.097f, -3.148f, -2.546f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(9.793f)
                curveToRelative(0.967f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(1.432f)
                horizontalLineToRelative(1.51f)
                curveToRelative(0.742f, 0f, 1.452f, 0.299f, 1.97f, 0.83f)
                lineToRelative(2.514f, 2.578f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.213f, 0.524f)
                verticalLineToRelative(5.09f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.705f, 0.75f)
                curveToRelative(-0.331f, 1.448f, -1.603f, 2.546f, -3.148f, 2.546f)
                reflectiveCurveToRelative(-2.817f, -1.097f, -3.149f, -2.546f)
                moveToRelative(-8.024f, -2.546f)
                curveToRelative(-0.94f, 0f, -1.733f, 0.786f, -1.733f, 1.795f)
                curveToRelative(0f, 1.01f, 0.794f, 1.796f, 1.733f, 1.796f)
                reflectiveCurveToRelative(1.733f, -0.786f, 1.733f, -1.796f)
                curveToRelative(0f, -1.009f, -0.793f, -1.795f, -1.733f, -1.795f)
                moveToRelative(11.173f, 0f)
                curveToRelative(-0.94f, 0f, -1.733f, 0.786f, -1.733f, 1.795f)
                curveToRelative(0f, 1.01f, 0.793f, 1.796f, 1.733f, 1.796f)
                curveToRelative(0.939f, 0f, 1.732f, -0.786f, 1.732f, -1.796f)
                curveToRelative(0f, -1.009f, -0.793f, -1.795f, -1.732f, -1.795f)
            }
        }.build()

        return _Truck!!
    }

@Suppress("ObjectPropertyName")
private var _Truck: ImageVector? = null
