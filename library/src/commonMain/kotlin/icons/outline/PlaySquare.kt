package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.PlaySquare: ImageVector
    get() {
        if (_PlaySquare != null) {
            return _PlaySquare!!
        }
        _PlaySquare = ImageVector.Builder(
            name = "Outline.PlaySquare",
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
                moveTo(3f, 9.4f)
                curveToRelative(0f, -2.24f, 0f, -3.36f, 0.436f, -4.216f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.748f, -1.748f)
                curveTo(6.04f, 3f, 7.16f, 3f, 9.4f, 3f)
                horizontalLineToRelative(5.2f)
                curveToRelative(2.24f, 0f, 3.36f, 0f, 4.216f, 0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.748f, 1.748f)
                curveTo(21f, 6.04f, 21f, 7.16f, 21f, 9.4f)
                verticalLineToRelative(5.2f)
                curveToRelative(0f, 2.24f, 0f, 3.36f, -0.436f, 4.216f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, 1.748f)
                curveTo(17.96f, 21f, 16.84f, 21f, 14.6f, 21f)
                horizontalLineTo(9.4f)
                curveToRelative(-2.24f, 0f, -3.36f, 0f, -4.216f, -0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, -1.748f)
                curveTo(3f, 17.96f, 3f, 16.84f, 3f, 14.6f)
                close()
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

        return _PlaySquare!!
    }

@Suppress("ObjectPropertyName")
private var _PlaySquare: ImageVector? = null
