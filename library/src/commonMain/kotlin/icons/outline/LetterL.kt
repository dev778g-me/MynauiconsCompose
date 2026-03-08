package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterL: ImageVector
    get() {
        if (_LetterL != null) {
            return _LetterL!!
        }
        _LetterL = ImageVector.Builder(
            name = "Outline.LetterL",
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
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(7f)
            }
        }.build()

        return _LetterL!!
    }

@Suppress("ObjectPropertyName")
private var _LetterL: ImageVector? = null
