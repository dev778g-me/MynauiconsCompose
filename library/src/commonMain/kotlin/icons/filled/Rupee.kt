package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Rupee: ImageVector
    get() {
        if (_Rupee != null) {
            return _Rupee!!
        }
        _Rupee = ImageVector.Builder(
            name = "Filled.Rupee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.75f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(11f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-4.461f)
                quadToRelative(0.112f, 0.114f, 0.217f, 0.236f)
                curveToRelative(0.729f, 0.845f, 1.15f, 1.903f, 1.282f, 2.986f)
                horizontalLineTo(17.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-2.962f)
                curveToRelative(-0.132f, 1.083f, -0.553f, 2.141f, -1.282f, 2.987f)
                curveToRelative(-0.911f, 1.055f, -2.267f, 1.735f, -4.006f, 1.735f)
                horizontalLineToRelative(-0.9f)
                lineToRelative(6.464f, 6.268f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.044f, 1.076f)
                lineToRelative(-7.792f, -7.555f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.522f, -1.289f)
                horizontalLineToRelative(2.75f)
                curveToRelative(1.316f, 0f, 2.253f, -0.5f, 2.87f, -1.215f)
                curveToRelative(0.475f, -0.551f, 0.781f, -1.254f, 0.904f, -2.007f)
                horizontalLineTo(6.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(6.524f)
                curveToRelative(-0.123f, -0.752f, -0.429f, -1.456f, -0.904f, -2.006f)
                curveToRelative(-0.617f, -0.716f, -1.554f, -1.216f, -2.87f, -1.216f)
                horizontalLineTo(6.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
            }
        }.build()

        return _Rupee!!
    }

@Suppress("ObjectPropertyName")
private var _Rupee: ImageVector? = null
