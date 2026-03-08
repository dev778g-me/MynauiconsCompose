package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterZ: ImageVector
    get() {
        if (_LetterZ != null) {
            return _LetterZ!!
        }
        _LetterZ = ImageVector.Builder(
            name = "Outline.LetterZ",
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
                horizontalLineToRelative(7.5f)
                lineTo(8f, 17f)
                horizontalLineToRelative(7.5f)
            }
        }.build()

        return _LetterZ!!
    }

@Suppress("ObjectPropertyName")
private var _LetterZ: ImageVector? = null
