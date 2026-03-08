package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterY: ImageVector
    get() {
        if (_LetterY != null) {
            return _LetterY!!
        }
        _LetterY = ImageVector.Builder(
            name = "Outline.LetterY",
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
                lineToRelative(3.75f, 5f)
                moveToRelative(3.75f, -5f)
                lineToRelative(-3.75f, 5f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(5f)
            }
        }.build()

        return _LetterY!!
    }

@Suppress("ObjectPropertyName")
private var _LetterY: ImageVector? = null
