package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Ambulance: ImageVector
    get() {
        if (_Ambulance != null) {
            return _Ambulance!!
        }
        _Ambulance = ImageVector.Builder(
            name = "Filled.Ambulance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.872f, 17.205f)
                horizontalLineToRelative(4.876f)
                curveToRelative(0.332f, 1.448f, 1.603f, 2.545f, 3.149f, 2.545f)
                curveToRelative(1.545f, 0f, 2.817f, -1.098f, 3.148f, -2.547f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.705f, -0.748f)
                verticalLineToRelative(-5.091f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.213f, -0.524f)
                lineToRelative(-2.515f, -2.578f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.968f, -0.83f)
                horizontalLineToRelative(-1.51f)
                verticalLineTo(6f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.75f, -1.75f)
                horizontalLineTo(4f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 6f)
                verticalLineToRelative(10.455f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(0.576f)
                curveToRelative(0.332f, 1.448f, 1.603f, 2.545f, 3.148f, 2.545f)
                reflectiveCurveToRelative(2.817f, -1.097f, 3.148f, -2.546f)
                moveToRelative(-4.88f, -0.75f)
                curveToRelative(0f, -1.01f, 0.793f, -1.796f, 1.732f, -1.796f)
                curveToRelative(0.94f, 0f, 1.733f, 0.786f, 1.733f, 1.795f)
                curveToRelative(0f, 1.01f, -0.793f, 1.796f, -1.733f, 1.796f)
                reflectiveCurveToRelative(-1.733f, -0.786f, -1.733f, -1.796f)
                moveToRelative(11.172f, 0f)
                curveToRelative(0f, -1.01f, 0.793f, -1.796f, 1.733f, -1.796f)
                curveToRelative(0.939f, 0f, 1.732f, 0.786f, 1.732f, 1.795f)
                curveToRelative(0f, 1.01f, -0.793f, 1.796f, -1.732f, 1.796f)
                curveToRelative(-0.94f, 0f, -1.733f, -0.786f, -1.733f, -1.796f)
                moveTo(9.649f, 8f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(9.65f)
                verticalLineTo(12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-1.25f)
                horizontalLineTo(6.9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.25f)
                verticalLineTo(8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
            }
        }.build()

        return _Ambulance!!
    }

@Suppress("ObjectPropertyName")
private var _Ambulance: ImageVector? = null
