package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterW: ImageVector
    get() {
        if (_LetterW != null) {
            return _LetterW!!
        }
        _LetterW = ImageVector.Builder(
            name = "Outline.LetterW",
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
                moveTo(8f, 7f)
                verticalLineToRelative(10f)
                lineToRelative(3.75f, -5f)
                lineToRelative(3.75f, 5f)
                verticalLineTo(7f)
            }
        }.build()

        return _LetterW!!
    }

@Suppress("ObjectPropertyName")
private var _LetterW: ImageVector? = null
