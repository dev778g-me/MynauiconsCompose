package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterQ: ImageVector
    get() {
        if (_LetterQ != null) {
            return _LetterQ!!
        }
        _LetterQ = ImageVector.Builder(
            name = "Outline.LetterQ",
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
                moveTo(15.385f, 16.882f)
                lineTo(15.385f, 9.471f)
                arcTo(2.466f, 2.466f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.923f, 7f)
                horizontalLineToRelative(-2.462f)
                arcTo(2.466f, 2.466f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 9.47f)
                verticalLineToRelative(4.942f)
                arcToRelative(2.466f, 2.466f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.461f, 2.47f)
                close()
                moveTo(15.385f, 16.882f)
                lineTo(12.923f, 14.412f)
                moveToRelative(2.462f, 2.47f)
                lineTo(16f, 17.5f)
            }
        }.build()

        return _LetterQ!!
    }

@Suppress("ObjectPropertyName")
private var _LetterQ: ImageVector? = null
