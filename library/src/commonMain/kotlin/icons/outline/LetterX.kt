package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterX: ImageVector
    get() {
        if (_LetterX != null) {
            return _LetterX!!
        }
        _LetterX = ImageVector.Builder(
            name = "Outline.LetterX",
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
                moveToRelative(8f, 7f)
                lineToRelative(7.5f, 10f)
                moveTo(8f, 17f)
                lineToRelative(7.5f, -10f)
            }
        }.build()

        return _LetterX!!
    }

@Suppress("ObjectPropertyName")
private var _LetterX: ImageVector? = null
