package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Earth: ImageVector
    get() {
        if (_Earth != null) {
            return _Earth!!
        }
        _Earth = ImageVector.Builder(
            name = "Outline.Earth",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 3.048f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.982f, 8.3f)
                curveToRelative(2.018f, 1.013f, 2.789f, -0.352f, 3.881f, 0.384f)
                curveToRelative(0.71f, 0.478f, 0.897f, 1.44f, 0.42f, 2.149f)
                curveToRelative(-0.501f, 0.742f, -1.283f, 1.119f, -1.148f, 2.336f)
                curveToRelative(0.077f, 0.687f, 0.499f, 1.278f, 1.045f, 1.783f)
                moveTo(4f, 9.28f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.806f, 1.846f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.992f, 3.424f)
                curveToRelative(-0.052f, 0.626f, 0.356f, 1.258f, 0.881f, 1.603f)
                arcTo(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 20.44f)
            }
        }.build()

        return _Earth!!
    }

@Suppress("ObjectPropertyName")
private var _Earth: ImageVector? = null
