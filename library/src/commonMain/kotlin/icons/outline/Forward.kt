package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Forward: ImageVector
    get() {
        if (_Forward != null) {
            return _Forward!!
        }
        _Forward = ImageVector.Builder(
            name = "Outline.Forward",
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
                moveTo(9.985f, 9.419f)
                curveTo(11.328f, 10.515f, 12f, 11.063f, 12f, 12f)
                reflectiveCurveToRelative(-0.672f, 1.485f, -2.015f, 2.582f)
                curveToRelative(-0.371f, 0.302f, -0.74f, 0.587f, -1.077f, 0.824f)
                arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.98f, 0.635f)
                curveToRelative(-1.341f, 0.816f, -2.011f, 1.223f, -2.612f, 0.772f)
                curveToRelative(-0.602f, -0.451f, -0.656f, -1.396f, -0.766f, -3.285f)
                arcTo(27f, 27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 12f)
                curveToRelative(0f, -0.47f, 0.02f, -0.993f, 0.05f, -1.528f)
                curveToRelative(0.11f, -1.89f, 0.164f, -2.834f, 0.766f, -3.285f)
                curveToRelative(0.6f, -0.451f, 1.27f, -0.044f, 2.611f, 0.771f)
                curveToRelative(0.348f, 0.212f, 0.684f, 0.427f, 0.98f, 0.636f)
                curveToRelative(0.339f, 0.237f, 0.707f, 0.522f, 1.078f, 0.825f)
                moveToRelative(7.5f, 0f)
                curveTo(18.828f, 10.515f, 19.5f, 11.063f, 19.5f, 12f)
                reflectiveCurveToRelative(-0.672f, 1.485f, -2.015f, 2.582f)
                curveToRelative(-0.371f, 0.302f, -0.74f, 0.587f, -1.077f, 0.824f)
                curveToRelative(-0.297f, 0.209f, -0.633f, 0.424f, -0.98f, 0.635f)
                curveToRelative(-1.341f, 0.816f, -2.011f, 1.223f, -2.613f, 0.772f)
                curveToRelative(-0.6f, -0.451f, -0.655f, -1.396f, -0.764f, -3.285f)
                arcTo(27f, 27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                curveToRelative(0f, -0.47f, 0.02f, -0.993f, 0.05f, -1.528f)
                curveToRelative(0.11f, -1.89f, 0.164f, -2.834f, 0.765f, -3.285f)
                curveToRelative(0.602f, -0.451f, 1.272f, -0.044f, 2.612f, 0.771f)
                curveToRelative(0.348f, 0.212f, 0.684f, 0.427f, 0.98f, 0.636f)
                curveToRelative(0.339f, 0.237f, 0.707f, 0.522f, 1.078f, 0.825f)
            }
        }.build()

        return _Forward!!
    }

@Suppress("ObjectPropertyName")
private var _Forward: ImageVector? = null
