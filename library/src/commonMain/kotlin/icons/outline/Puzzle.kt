package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Puzzle: ImageVector
    get() {
        if (_Puzzle != null) {
            return _Puzzle!!
        }
        _Puzzle = ImageVector.Builder(
            name = "Outline.Puzzle",
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
                moveTo(19.4f, 12f)
                curveToRelative(0.56f, 0f, 0.84f, 0f, 1.054f, -0.109f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.437f, -0.437f)
                curveTo(21f, 11.24f, 21f, 10.96f, 21f, 10.4f)
                verticalLineTo(8.2f)
                curveToRelative(0f, -0.56f, 0f, -0.84f, -0.109f, -1.054f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.437f, -0.437f)
                curveTo(20.24f, 6.6f, 19.96f, 6.6f, 19.4f, 6.6f)
                horizontalLineToRelative(-1.55f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, -0.9f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.4f, 0f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, 0.9f)
                horizontalLineTo(9.1f)
                curveToRelative(-0.56f, 0f, -0.84f, 0f, -1.054f, 0.109f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.437f, 0.437f)
                curveTo(7.5f, 7.36f, 7.5f, 7.64f, 7.5f, 8.2f)
                verticalLineToRelative(2.2f)
                curveToRelative(0f, 0.56f, 0f, 0.84f, -0.109f, 1.054f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.437f, 0.437f)
                curveTo(6.74f, 12f, 6.46f, 12f, 5.9f, 12f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 5.4f)
                horizontalLineToRelative(0.2f)
                curveToRelative(0.56f, 0f, 0.84f, 0f, 1.054f, 0.109f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.437f, 0.437f)
                curveToRelative(0.109f, 0.214f, 0.109f, 0.494f, 0.109f, 1.054f)
                verticalLineToRelative(0.4f)
                curveToRelative(0f, 0.56f, 0f, 0.84f, 0.109f, 1.054f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.437f, 0.437f)
                curveTo(8.26f, 21f, 8.54f, 21f, 9.1f, 21f)
                horizontalLineToRelative(10.3f)
                curveToRelative(0.56f, 0f, 0.84f, 0f, 1.054f, -0.109f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.437f, -0.437f)
                curveTo(21f, 20.24f, 21f, 19.96f, 21f, 19.4f)
                verticalLineTo(19f)
                curveToRelative(0f, -0.56f, 0f, -0.84f, -0.109f, -1.054f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.437f, -0.437f)
                curveToRelative(-0.214f, -0.109f, -0.494f, -0.109f, -1.054f, -0.109f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -5.4f)
                close()
            }
        }.build()

        return _Puzzle!!
    }

@Suppress("ObjectPropertyName")
private var _Puzzle: ImageVector? = null
