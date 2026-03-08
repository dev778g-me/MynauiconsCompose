package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Glasses: ImageVector
    get() {
        if (_Glasses != null) {
            return _Glasses!!
        }
        _Glasses = ImageVector.Builder(
            name = "Filled.Glasses",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.212f, 5.764f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.476f, 0.948f)
                curveToRelative(-0.88f, 0.292f, -1.265f, 0.466f, -1.492f, 0.695f)
                curveToRelative(-0.186f, 0.189f, -0.347f, 0.505f, -0.425f, 1.365f)
                lineTo(5.544f, 11.8f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.622f, 2.405f)
                arcToRelative(4.6f, 4.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.668f, 0f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.622f, -2.405f)
                lineToRelative(-0.275f, -3.028f)
                curveToRelative(-0.078f, -0.86f, -0.239f, -1.177f, -0.425f, -1.365f)
                curveToRelative(-0.227f, -0.229f, -0.61f, -0.402f, -1.492f, -0.695f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.472f, -1.424f)
                curveToRelative(0.817f, 0.272f, 1.564f, 0.537f, 2.085f, 1.063f)
                curveToRelative(0.562f, 0.567f, 0.766f, 1.32f, 0.854f, 2.285f)
                lineToRelative(0.52f, 5.716f)
                quadToRelative(0.055f, 0.316f, 0.055f, 0.648f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.428f, 0.736f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.644f, 0f)
                arcToRelative(3.751f, 3.751f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.372f, -1.384f)
                lineToRelative(0.52f, -5.716f)
                curveToRelative(0.087f, -0.965f, 0.292f, -1.718f, 0.853f, -2.285f)
                curveToRelative(0.521f, -0.526f, 1.268f, -0.792f, 2.085f, -1.063f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.948f, 0.476f)
            }
        }.build()

        return _Glasses!!
    }

@Suppress("ObjectPropertyName")
private var _Glasses: ImageVector? = null
