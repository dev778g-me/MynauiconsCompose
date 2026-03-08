package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Shrub: ImageVector
    get() {
        if (_Shrub != null) {
            return _Shrub!!
        }
        _Shrub = ImageVector.Builder(
            name = "Filled.Shrub",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.243f, 18.903f)
                verticalLineTo(20.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-1.597f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.043f, 17.326f)
                curveToRelative(0.93f, 0.911f, 2.093f, 1.578f, 3.351f, 1.578f)
                horizontalLineToRelative(1.849f)
                verticalLineTo(15.47f)
                lineToRelative(-1.15f, -0.575f)
                lineToRelative(-0.067f, -0.037f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.667f, -1.335f)
                lineToRelative(0.07f, 0.03f)
                lineToRelative(1.565f, 0.783f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.096f, 0.057f)
                lineToRelative(1.664f, -1.505f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.095f, 14f)
                lineToRelative(-2.352f, 2.128f)
                verticalLineToRelative(2.775f)
                horizontalLineToRelative(0.734f)
                lineToRelative(0.61f, 0.001f)
                horizontalLineToRelative(0.524f)
                lineToRelative(0.211f, -0.01f)
                curveToRelative(2.184f, -0.146f, 4.278f, -1.66f, 5.284f, -3.477f)
                curveToRelative(0.529f, -0.954f, 0.794f, -2.057f, 0.556f, -3.147f)
                curveToRelative(-0.202f, -0.922f, -0.748f, -1.755f, -1.65f, -2.428f)
                curveToRelative(0.738f, -1.883f, -0.164f, -3.922f, -1.512f, -5.17f)
                curveToRelative(-1.404f, -1.3f, -3.591f, -2.021f, -5.501f, -0.848f)
                curveToRelative(-1.664f, -1.106f, -3.722f, -1.324f, -5.225f, -0.806f)
                curveToRelative(-0.83f, 0.285f, -1.58f, 0.83f, -1.914f, 1.677f)
                curveToRelative(-0.267f, 0.68f, -0.219f, 1.431f, 0.11f, 2.202f)
                curveToRelative(-0.937f, 0.756f, -1.451f, 1.791f, -1.637f, 2.91f)
                curveToRelative(-0.218f, 1.315f, 0.011f, 2.75f, 0.503f, 4.055f)
                curveToRelative(0.492f, 1.309f, 1.268f, 2.545f, 2.207f, 3.464f)
            }
        }.build()

        return _Shrub!!
    }

@Suppress("ObjectPropertyName")
private var _Shrub: ImageVector? = null
