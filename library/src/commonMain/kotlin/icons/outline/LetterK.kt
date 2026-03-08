package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterK: ImageVector
    get() {
        if (_LetterK != null) {
            return _LetterK!!
        }
        _LetterK = ImageVector.Builder(
            name = "Outline.LetterK",
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
                horizontalLineToRelative(0.625f)
                moveToRelative(0f, 0f)
                lineToRelative(5.625f, 5f)
                moveToRelative(-5.625f, -5f)
                lineToRelative(5.625f, -5f)
            }
        }.build()

        return _LetterK!!
    }

@Suppress("ObjectPropertyName")
private var _LetterK: ImageVector? = null
