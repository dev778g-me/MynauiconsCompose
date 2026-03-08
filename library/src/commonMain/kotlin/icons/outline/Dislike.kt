package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Dislike: ImageVector
    get() {
        if (_Dislike != null) {
            return _Dislike!!
        }
        _Dislike = ImageVector.Builder(
            name = "Outline.Dislike",
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
                moveTo(10.46f, 13.895f)
                horizontalLineTo(4.927f)
                curveTo(2.381f, 13.895f, 5.691f, 3f, 7.515f, 3f)
                horizontalLineToRelative(12.521f)
                curveToRelative(0.532f, 0f, 0.964f, 0.424f, 0.964f, 0.947f)
                verticalLineToRelative(9.385f)
                arcToRelative(0.95f, 0.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.502f, 0.832f)
                curveToRelative(-2.062f, 1.106f, -4.481f, 2.012f, -5.678f, 4.129f)
                lineToRelative(-1.28f, 2.266f)
                arcToRelative(0.87f, 0.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.762f, 0.441f)
                curveToRelative(-3.18f, 0f, -2.237f, -4.63f, -1.805f, -6.47f)
                arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.513f, -0.635f)
            }
        }.build()

        return _Dislike!!
    }

@Suppress("ObjectPropertyName")
private var _Dislike: ImageVector? = null
