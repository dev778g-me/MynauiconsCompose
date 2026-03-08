package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.RewindDiamond: ImageVector
    get() {
        if (_RewindDiamond != null) {
            return _RewindDiamond!!
        }
        _RewindDiamond = ImageVector.Builder(
            name = "Outline.RewindDiamond",
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
                moveTo(2.707f, 10.295f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.41f)
                lineToRelative(7.588f, 7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.41f, 0f)
                lineToRelative(7.588f, -7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.41f)
                lineToRelative(-7.588f, -7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.41f, 0f)
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

        return _RewindDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _RewindDiamond: ImageVector? = null
