package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Rewind: ImageVector
    get() {
        if (_Rewind != null) {
            return _Rewind!!
        }
        _Rewind = ImageVector.Builder(
            name = "Outline.Rewind",
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
                moveTo(6.515f, 9.419f)
                curveTo(5.172f, 10.515f, 4.5f, 11.063f, 4.5f, 12f)
                reflectiveCurveToRelative(0.672f, 1.485f, 2.015f, 2.582f)
                curveToRelative(0.371f, 0.302f, 0.74f, 0.587f, 1.077f, 0.824f)
                curveToRelative(0.297f, 0.209f, 0.633f, 0.424f, 0.98f, 0.635f)
                curveToRelative(1.341f, 0.816f, 2.011f, 1.223f, 2.613f, 0.772f)
                curveToRelative(0.6f, -0.451f, 0.655f, -1.396f, 0.765f, -3.285f)
                curveToRelative(0.03f, -0.535f, 0.05f, -1.058f, 0.05f, -1.528f)
                reflectiveCurveToRelative(-0.02f, -0.993f, -0.05f, -1.528f)
                curveToRelative(-0.11f, -1.89f, -0.164f, -2.834f, -0.765f, -3.285f)
                curveToRelative(-0.602f, -0.451f, -1.272f, -0.044f, -2.612f, 0.771f)
                arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.98f, 0.636f)
                curveToRelative(-0.339f, 0.237f, -0.707f, 0.522f, -1.078f, 0.825f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.016f, 9.419f)
                curveTo(12.672f, 10.515f, 12f, 11.063f, 12f, 12f)
                reflectiveCurveToRelative(0.672f, 1.485f, 2.015f, 2.582f)
                curveToRelative(0.371f, 0.302f, 0.74f, 0.587f, 1.077f, 0.824f)
                curveToRelative(0.297f, 0.209f, 0.633f, 0.424f, 0.98f, 0.635f)
                curveToRelative(1.341f, 0.816f, 2.011f, 1.223f, 2.613f, 0.772f)
                curveToRelative(0.6f, -0.451f, 0.655f, -1.396f, 0.765f, -3.285f)
                curveToRelative(0.03f, -0.535f, 0.05f, -1.058f, 0.05f, -1.528f)
                reflectiveCurveToRelative(-0.02f, -0.993f, -0.05f, -1.528f)
                curveToRelative(-0.11f, -1.89f, -0.164f, -2.834f, -0.765f, -3.285f)
                curveToRelative(-0.602f, -0.451f, -1.272f, -0.044f, -2.612f, 0.771f)
                arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.98f, 0.636f)
                arcToRelative(19f, 19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.078f, 0.825f)
            }
        }.build()

        return _Rewind!!
    }

@Suppress("ObjectPropertyName")
private var _Rewind: ImageVector? = null
