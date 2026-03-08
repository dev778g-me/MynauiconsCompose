package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.SquareDashed: ImageVector
    get() {
        if (_SquareDashed != null) {
            return _SquareDashed!!
        }
        _SquareDashed = ImageVector.Builder(
            name = "Outline.SquareDashed",
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
                moveTo(9.4f, 21f)
                horizontalLineToRelative(5.2f)
                moveToRelative(-9.416f, -0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, -1.748f)
                moveTo(3f, 14.6f)
                verticalLineTo(9.4f)
                moveToRelative(18f, 5.2f)
                verticalLineTo(9.4f)
                moveToRelative(-0.436f, 9.416f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, 1.748f)
                moveTo(14.6f, 3f)
                horizontalLineTo(9.4f)
                moveToRelative(9.416f, 0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.748f, 1.748f)
                moveTo(5.184f, 3.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.748f, 1.748f)
            }
        }.build()

        return _SquareDashed!!
    }

@Suppress("ObjectPropertyName")
private var _SquareDashed: ImageVector? = null
