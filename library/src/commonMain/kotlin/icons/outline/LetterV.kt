package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterV: ImageVector
    get() {
        if (_LetterV != null) {
            return _LetterV!!
        }
        _LetterV = ImageVector.Builder(
            name = "Outline.LetterV",
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
                lineToRelative(3.75f, 10f)
                lineTo(15.5f, 7f)
            }
        }.build()

        return _LetterV!!
    }

@Suppress("ObjectPropertyName")
private var _LetterV: ImageVector? = null
