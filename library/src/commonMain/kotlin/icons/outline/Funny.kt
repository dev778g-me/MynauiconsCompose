package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Funny: ImageVector
    get() {
        if (_Funny != null) {
            return _Funny!!
        }
        _Funny = ImageVector.Builder(
            name = "Outline.Funny",
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
                moveToRelative(8.699f, 10.646f)
                lineToRelative(-0.104f, -0.49f)
                moveToRelative(4.995f, -0.55f)
                lineToRelative(-0.104f, -0.49f)
                moveTo(8.5f, 15.57f)
                curveToRelative(1.258f, 0.316f, 2.686f, 0.316f, 4.123f, -0.069f)
                curveToRelative(1.436f, -0.385f, 2.672f, -1.099f, 3.604f, -2.001f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(12.587f, 15.637f)
                lineToRelative(0.478f, 0.974f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.693f, -1.322f)
                lineToRelative(-0.46f, -0.935f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
            }
        }.build()

        return _Funny!!
    }

@Suppress("ObjectPropertyName")
private var _Funny: ImageVector? = null
