package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.VolumeHigh: ImageVector
    get() {
        if (_VolumeHigh != null) {
            return _VolumeHigh!!
        }
        _VolumeHigh = ImageVector.Builder(
            name = "Filled.VolumeHigh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.57f, 4.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                curveToRelative(4.16f, 4.159f, 4.16f, 10.901f, 0f, 15.06f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                arcToRelative(9.15f, 9.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -12.94f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.47f, 7.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                arcToRelative(6.407f, 6.407f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 9.06f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                arcToRelative(4.907f, 4.907f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6.94f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
                moveTo(6.748f, 6.369f)
                arcToRelative(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.231f, 0.337f)
                lineToRelative(-0.165f, -0.015f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.442f, -0.03f)
                curveToRelative(-0.518f, 0.028f, -1.119f, 0.11f, -1.614f, 0.337f)
                curveToRelative(-0.52f, 0.24f, -1.046f, 0.713f, -1.046f, 1.507f)
                verticalLineToRelative(6.914f)
                curveToRelative(0f, 0.795f, 0.525f, 1.268f, 1.046f, 1.508f)
                curveToRelative(0.495f, 0.227f, 1.097f, 0.309f, 1.614f, 0.337f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.603f, -0.044f)
                quadToRelative(0.099f, 0.151f, 0.231f, 0.343f)
                curveToRelative(0.314f, 0.452f, 0.772f, 1.056f, 1.35f, 1.663f)
                curveTo(9.217f, 20.41f, 10.93f, 21.75f, 13f, 21.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.75f)
                curveToRelative(-2.065f, 0f, -3.776f, 1.315f, -4.902f, 2.482f)
                arcToRelative(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.35f, 1.637f)
            }
        }.build()

        return _VolumeHigh!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeHigh: ImageVector? = null
