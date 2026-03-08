package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterH: ImageVector
    get() {
        if (_LetterH != null) {
            return _LetterH!!
        }
        _LetterH = ImageVector.Builder(
            name = "Outline.LetterH",
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
                moveTo(9f, 7f)
                verticalLineToRelative(5f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(5f)
                moveToRelative(0f, -5f)
                horizontalLineToRelative(6.25f)
                moveToRelative(0f, -5f)
                verticalLineToRelative(5f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(5f)
            }
        }.build()

        return _LetterH!!
    }

@Suppress("ObjectPropertyName")
private var _LetterH: ImageVector? = null
