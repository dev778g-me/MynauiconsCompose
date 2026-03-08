package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.PlayHexagon: ImageVector
    get() {
        if (_PlayHexagon != null) {
            return _PlayHexagon!!
        }
        _PlayHexagon = ImageVector.Builder(
            name = "Outline.PlayHexagon",
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
                moveTo(20.5f, 15.8f)
                verticalLineTo(8.2f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.944f, -1.645f)
                lineToRelative(-6.612f, -3.8f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.888f, 0f)
                lineToRelative(-6.612f, 3.8f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 8.2f)
                verticalLineToRelative(7.602f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.944f, 1.644f)
                lineToRelative(6.612f, 3.8f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.888f, 0f)
                lineToRelative(6.612f, -3.8f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 15.8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.242f, 10.71f)
                curveToRelative(0.672f, 0.547f, 1.008f, 0.821f, 1.008f, 1.29f)
                reflectiveCurveToRelative(-0.336f, 0.743f, -1.008f, 1.29f)
                curveToRelative(-0.185f, 0.152f, -0.37f, 0.295f, -0.538f, 0.413f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.49f, 0.318f)
                curveToRelative(-0.67f, 0.407f, -1.006f, 0.611f, -1.306f, 0.385f)
                reflectiveCurveToRelative(-0.328f, -0.697f, -0.383f, -1.642f)
                arcTo(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 12f)
                curveToRelative(0f, -0.235f, 0.01f, -0.497f, 0.025f, -0.764f)
                curveToRelative(0.055f, -0.945f, 0.082f, -1.417f, 0.383f, -1.642f)
                curveToRelative(0.3f, -0.226f, 0.636f, -0.022f, 1.306f, 0.385f)
                curveToRelative(0.174f, 0.106f, 0.341f, 0.214f, 0.49f, 0.318f)
                curveToRelative(0.169f, 0.118f, 0.353f, 0.261f, 0.538f, 0.412f)
            }
        }.build()

        return _PlayHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _PlayHexagon: ImageVector? = null
