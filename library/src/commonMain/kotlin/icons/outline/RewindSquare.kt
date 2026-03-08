package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.RewindSquare: ImageVector
    get() {
        if (_RewindSquare != null) {
            return _RewindSquare!!
        }
        _RewindSquare = ImageVector.Builder(
            name = "Outline.RewindSquare",
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
                moveTo(8.008f, 10.71f)
                curveTo(7.336f, 11.256f, 7f, 11.53f, 7f, 12f)
                reflectiveCurveToRelative(0.336f, 0.743f, 1.008f, 1.29f)
                curveToRelative(0.185f, 0.152f, 0.37f, 0.295f, 0.538f, 0.413f)
                curveToRelative(0.149f, 0.104f, 0.316f, 0.212f, 0.49f, 0.318f)
                curveToRelative(0.67f, 0.407f, 1.006f, 0.611f, 1.306f, 0.385f)
                reflectiveCurveToRelative(0.328f, -0.697f, 0.383f, -1.642f)
                curveToRelative(0.015f, -0.267f, 0.025f, -0.53f, 0.025f, -0.764f)
                curveToRelative(0f, -0.235f, -0.01f, -0.497f, -0.025f, -0.764f)
                curveToRelative(-0.055f, -0.945f, -0.082f, -1.417f, -0.383f, -1.642f)
                curveToRelative(-0.3f, -0.226f, -0.635f, -0.022f, -1.306f, 0.385f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.49f, 0.318f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.538f, 0.412f)
                moveToRelative(5.75f, 0.001f)
                curveToRelative(-0.672f, 0.547f, -1.008f, 0.821f, -1.008f, 1.29f)
                reflectiveCurveToRelative(0.336f, 0.743f, 1.008f, 1.29f)
                curveToRelative(0.185f, 0.152f, 0.37f, 0.295f, 0.538f, 0.413f)
                curveToRelative(0.149f, 0.104f, 0.316f, 0.212f, 0.49f, 0.318f)
                curveToRelative(0.67f, 0.407f, 1.006f, 0.611f, 1.306f, 0.385f)
                reflectiveCurveToRelative(0.328f, -0.697f, 0.383f, -1.642f)
                curveToRelative(0.015f, -0.267f, 0.025f, -0.53f, 0.025f, -0.764f)
                curveToRelative(0f, -0.235f, -0.01f, -0.497f, -0.025f, -0.764f)
                curveToRelative(-0.055f, -0.945f, -0.082f, -1.417f, -0.383f, -1.642f)
                curveToRelative(-0.3f, -0.226f, -0.635f, -0.022f, -1.306f, 0.385f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.49f, 0.318f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.538f, 0.412f)
            }
        }.build()

        return _RewindSquare!!
    }

@Suppress("ObjectPropertyName")
private var _RewindSquare: ImageVector? = null
