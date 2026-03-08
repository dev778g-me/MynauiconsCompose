package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterN: ImageVector
    get() {
        if (_LetterN != null) {
            return _LetterN!!
        }
        _LetterN = ImageVector.Builder(
            name = "Outline.LetterN",
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
                moveTo(8f, 17f)
                verticalLineTo(7f)
                lineToRelative(7.5f, 10f)
                verticalLineTo(7f)
            }
        }.build()

        return _LetterN!!
    }

@Suppress("ObjectPropertyName")
private var _LetterN: ImageVector? = null
