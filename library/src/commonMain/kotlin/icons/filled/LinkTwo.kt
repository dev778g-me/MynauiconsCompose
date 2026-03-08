package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LinkTwo: ImageVector
    get() {
        if (_LinkTwo != null) {
            return _LinkTwo!!
        }
        _LinkTwo = ImageVector.Builder(
            name = "Filled.LinkTwo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.997f, 7.75f)
                horizontalLineToRelative(3.401f)
                curveToRelative(2.384f, 0f, 4.352f, 1.883f, 4.352f, 4.25f)
                reflectiveCurveToRelative(-1.968f, 4.25f, -4.352f, 4.25f)
                horizontalLineToRelative(-3.4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(3.4f)
                curveToRelative(1.595f, 0f, 2.851f, -1.251f, 2.851f, -2.75f)
                reflectiveCurveToRelative(-1.256f, -2.75f, -2.85f, -2.75f)
                horizontalLineToRelative(-3.402f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -1.5f)
                moveTo(7.002f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(8.489f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(7.752f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.003f, 7.75f)
                horizontalLineTo(6.602f)
                curveTo(4.218f, 7.75f, 2.25f, 9.633f, 2.25f, 12f)
                reflectiveCurveToRelative(1.968f, 4.25f, 4.352f, 4.25f)
                horizontalLineToRelative(3.4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-3.4f)
                curveToRelative(-1.595f, 0f, -2.851f, -1.251f, -2.851f, -2.75f)
                reflectiveCurveTo(5.007f, 9.25f, 6.6f, 9.25f)
                horizontalLineToRelative(3.402f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -1.5f)
                moveTo(16.998f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.75f)
                horizontalLineTo(7.759f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(8.489f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
            }
        }.build()

        return _LinkTwo!!
    }

@Suppress("ObjectPropertyName")
private var _LinkTwo: ImageVector? = null
