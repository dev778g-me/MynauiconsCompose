package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ForwardWaves: ImageVector
    get() {
        if (_ForwardWaves != null) {
            return _ForwardWaves!!
        }
        _ForwardWaves = ImageVector.Builder(
            name = "Outline.ForwardWaves",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.713f, 3.64f)
                curveToRelative(0.581f, -0.495f, 0.872f, -0.743f, 1.176f, -0.888f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.222f, 0f)
                curveToRelative(0.304f, 0.145f, 0.595f, 0.393f, 1.176f, 0.888f)
                curveToRelative(0.599f, 0.51f, 1.207f, 0.768f, 2.007f, 0.831f)
                curveToRelative(0.761f, 0.061f, 1.142f, 0.092f, 1.46f, 0.204f)
                curveToRelative(0.734f, 0.26f, 1.312f, 0.837f, 1.571f, 1.572f)
                curveToRelative(0.112f, 0.317f, 0.143f, 0.698f, 0.204f, 1.46f)
                curveToRelative(0.063f, 0.8f, 0.32f, 1.407f, 0.83f, 2.006f)
                curveToRelative(0.496f, 0.581f, 0.744f, 0.872f, 0.889f, 1.176f)
                curveToRelative(0.336f, 0.703f, 0.336f, 1.52f, 0f, 2.222f)
                curveToRelative(-0.145f, 0.304f, -0.393f, 0.595f, -0.888f, 1.176f)
                arcToRelative(3.3f, 3.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.831f, 2.007f)
                curveToRelative(-0.061f, 0.761f, -0.092f, 1.142f, -0.204f, 1.46f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.572f, 1.571f)
                curveToRelative(-0.317f, 0.112f, -0.698f, 0.143f, -1.46f, 0.204f)
                curveToRelative(-0.8f, 0.063f, -1.407f, 0.32f, -2.006f, 0.83f)
                curveToRelative(-0.581f, 0.496f, -0.872f, 0.744f, -1.176f, 0.889f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.222f, 0f)
                curveToRelative(-0.304f, -0.145f, -0.595f, -0.393f, -1.176f, -0.888f)
                arcToRelative(3.3f, 3.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.007f, -0.831f)
                curveToRelative(-0.761f, -0.061f, -1.142f, -0.092f, -1.46f, -0.204f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.571f, -1.572f)
                curveToRelative(-0.112f, -0.317f, -0.143f, -0.698f, -0.204f, -1.46f)
                arcToRelative(3.3f, 3.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.83f, -2.006f)
                curveToRelative(-0.496f, -0.581f, -0.744f, -0.872f, -0.89f, -1.176f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.001f, -2.222f)
                curveToRelative(0.145f, -0.304f, 0.393f, -0.595f, 0.888f, -1.176f)
                curveToRelative(0.52f, -0.611f, 0.769f, -1.223f, 0.831f, -2.007f)
                curveToRelative(0.061f, -0.761f, 0.092f, -1.142f, 0.204f, -1.46f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.572f, -1.571f)
                curveToRelative(0.317f, -0.112f, 0.698f, -0.143f, 1.46f, -0.204f)
                arcToRelative(3.3f, 3.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.006f, -0.83f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.242f, 10.71f)
                curveToRelative(0.672f, 0.547f, 1.008f, 0.821f, 1.008f, 1.29f)
                reflectiveCurveToRelative(-0.336f, 0.743f, -1.008f, 1.29f)
                curveToRelative(-0.185f, 0.152f, -0.37f, 0.295f, -0.538f, 0.413f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.49f, 0.318f)
                curveToRelative(-0.67f, 0.407f, -1.006f, 0.611f, -1.306f, 0.385f)
                reflectiveCurveToRelative(-0.328f, -0.697f, -0.383f, -1.642f)
                arcTo(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 12f)
                curveToRelative(0f, -0.235f, 0.01f, -0.497f, 0.025f, -0.764f)
                curveToRelative(0.055f, -0.945f, 0.082f, -1.417f, 0.383f, -1.642f)
                curveToRelative(0.3f, -0.226f, 0.635f, -0.022f, 1.306f, 0.385f)
                curveToRelative(0.174f, 0.106f, 0.342f, 0.214f, 0.49f, 0.318f)
                curveToRelative(0.169f, 0.118f, 0.353f, 0.261f, 0.538f, 0.412f)
                moveToRelative(5.75f, 0.001f)
                curveToRelative(0.672f, 0.546f, 1.008f, 0.82f, 1.008f, 1.29f)
                reflectiveCurveToRelative(-0.336f, 0.743f, -1.008f, 1.29f)
                curveToRelative(-0.185f, 0.152f, -0.37f, 0.295f, -0.538f, 0.413f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.49f, 0.318f)
                curveToRelative(-0.67f, 0.407f, -1.006f, 0.611f, -1.306f, 0.385f)
                reflectiveCurveToRelative(-0.328f, -0.697f, -0.383f, -1.642f)
                arcTo(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.25f, 12f)
                curveToRelative(0f, -0.235f, 0.01f, -0.497f, 0.025f, -0.764f)
                curveToRelative(0.055f, -0.945f, 0.082f, -1.417f, 0.383f, -1.642f)
                curveToRelative(0.3f, -0.226f, 0.636f, -0.022f, 1.306f, 0.385f)
                curveToRelative(0.174f, 0.106f, 0.341f, 0.214f, 0.49f, 0.318f)
                curveToRelative(0.169f, 0.118f, 0.353f, 0.261f, 0.538f, 0.412f)
            }
        }.build()

        return _ForwardWaves!!
    }

@Suppress("ObjectPropertyName")
private var _ForwardWaves: ImageVector? = null
