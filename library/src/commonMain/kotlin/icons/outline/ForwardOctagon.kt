package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ForwardOctagon: ImageVector
    get() {
        if (_ForwardOctagon != null) {
            return _ForwardOctagon!!
        }
        _ForwardOctagon = ImageVector.Builder(
            name = "Outline.ForwardOctagon",
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
                moveTo(7.805f, 3.469f)
                curveTo(8.16f, 3.115f, 8.451f, 3f, 8.937f, 3f)
                horizontalLineToRelative(6.126f)
                curveToRelative(0.486f, 0f, 0.778f, 0.115f, 1.132f, 0.469f)
                lineToRelative(4.336f, 4.336f)
                curveToRelative(0.354f, 0.354f, 0.469f, 0.646f, 0.469f, 1.132f)
                verticalLineToRelative(6.126f)
                curveToRelative(0f, 0.5f, -0.125f, 0.788f, -0.469f, 1.132f)
                lineToRelative(-4.336f, 4.336f)
                curveToRelative(-0.354f, 0.354f, -0.646f, 0.469f, -1.132f, 0.469f)
                horizontalLineTo(8.937f)
                curveToRelative(-0.5f, 0f, -0.788f, -0.125f, -1.132f, -0.469f)
                lineTo(3.47f, 16.195f)
                curveToRelative(-0.355f, -0.355f, -0.47f, -0.646f, -0.47f, -1.132f)
                verticalLineTo(8.937f)
                curveToRelative(0f, -0.5f, 0.125f, -0.788f, 0.469f, -1.132f)
                close()
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

        return _ForwardOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _ForwardOctagon: ImageVector? = null
