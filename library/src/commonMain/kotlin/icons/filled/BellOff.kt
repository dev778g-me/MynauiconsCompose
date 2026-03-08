package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BellOff: ImageVector
    get() {
        if (_BellOff != null) {
            return _BellOff!!
        }
        _BellOff = ImageVector.Builder(
            name = "Filled.BellOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.649f, 3.189f)
                curveTo(7.859f, 2.03f, 9.63f, 1.5f, 11.999f, 1.5f)
                reflectiveCurveToRelative(4.141f, 0.53f, 5.351f, 1.689f)
                curveToRelative(0.44f, 0.421f, 0.77f, 0.892f, 1.017f, 1.383f)
                lineTo(20.47f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, 1.06f)
                lineToRelative(-2.616f, 2.617f)
                curveToRelative(0.075f, 0.337f, 0.128f, 0.67f, 0.169f, 0.99f)
                curveToRelative(0.079f, 0.628f, 0.115f, 1.274f, 0.148f, 1.862f)
                lineToRelative(0.004f, 0.078f)
                curveToRelative(0.036f, 0.63f, 0.07f, 1.2f, 0.141f, 1.74f)
                curveToRelative(0.145f, 1.084f, 0.417f, 1.812f, 0.924f, 2.315f)
                curveToRelative(0.701f, 0.697f, 1.264f, 1.799f, 1.194f, 2.914f)
                curveToRelative(-0.038f, 0.604f, -0.274f, 1.278f, -0.861f, 1.784f)
                curveToRelative(-0.573f, 0.494f, -1.295f, 0.67f, -2f, 0.67f)
                horizontalLineToRelative(-2.237f)
                curveToRelative(-0.119f, 0.678f, -0.336f, 1.373f, -0.713f, 1.997f)
                curveToRelative(-0.726f, 1.201f, -1.963f, 2.003f, -3.684f, 2.003f)
                curveToRelative(-1.72f, 0f, -2.958f, -0.802f, -3.683f, -2.003f)
                curveToRelative(-0.377f, -0.624f, -0.595f, -1.319f, -0.713f, -1.997f)
                horizontalLineTo(6.561f)
                lineToRelative(-3.03f, 3.03f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.061f, -1.06f)
                lineToRelative(2.06f, -2.06f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.185f, -0.594f)
                curveToRelative(-0.59f, -0.52f, -0.813f, -1.206f, -0.842f, -1.807f)
                curveToRelative(-0.052f, -1.106f, 0.513f, -2.198f, 1.196f, -2.877f)
                curveToRelative(0.507f, -0.503f, 0.779f, -1.231f, 0.923f, -2.316f)
                curveToRelative(0.072f, -0.539f, 0.106f, -1.108f, 0.142f, -1.739f)
                lineTo(4.768f, 9f)
                curveToRelative(0.033f, -0.588f, 0.07f, -1.234f, 0.148f, -1.861f)
                curveToRelative(0.163f, -1.296f, 0.536f, -2.803f, 1.733f, -3.95f)
            }
        }.build()

        return _BellOff!!
    }

@Suppress("ObjectPropertyName")
private var _BellOff: ImageVector? = null
