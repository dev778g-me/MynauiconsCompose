package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.VolumeOff: ImageVector
    get() {
        if (_VolumeOff != null) {
            return _VolumeOff!!
        }
        _VolumeOff = ImageVector.Builder(
            name = "Filled.VolumeOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.63f, 19.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                curveToRelative(3.24f, -3.24f, 3.542f, -8.305f, 0.907f, -11.886f)
                lineTo(17.03f, 8.031f)
                arcToRelative(6.41f, 6.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 8.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.061f)
                arcToRelative(4.91f, 4.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.49f, -6.37f)
                lineToRelative(-2.21f, 2.21f)
                verticalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, 0.75f)
                curveToRelative(-2.07f, 0f, -3.782f, -1.34f, -4.907f, -2.524f)
                arcTo(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.06f, 18f)
                lineToRelative(-3.53f, 3.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(3.198f, -3.198f)
                curveToRelative(-0.24f, 0.006f, -0.498f, 0.005f, -0.758f, -0.008f)
                curveToRelative(-0.518f, -0.028f, -1.119f, -0.11f, -1.614f, -0.337f)
                curveToRelative(-0.52f, -0.24f, -1.046f, -0.713f, -1.046f, -1.508f)
                verticalLineTo(8.506f)
                curveToRelative(0f, -0.794f, 0.525f, -1.267f, 1.046f, -1.507f)
                curveToRelative(0.495f, -0.228f, 1.097f, -0.31f, 1.614f, -0.337f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.607f, 0.045f)
                quadToRelative(0.098f, -0.15f, 0.23f, -0.337f)
                curveToRelative(0.315f, -0.445f, 0.773f, -1.04f, 1.35f, -1.637f)
                curveTo(9.225f, 3.565f, 10.936f, 2.25f, 13f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(6.19f)
                lineToRelative(3.746f, -3.746f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.048f, -1.049f)
                lineTo(20.47f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, 1.06f)
                lineToRelative(-1.982f, 1.983f)
                curveToRelative(3.215f, 4.176f, 2.91f, 10.19f, -0.917f, 14.017f)
            }
        }.build()

        return _VolumeOff!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeOff: ImageVector? = null
