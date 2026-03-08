package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterE: ImageVector
    get() {
        if (_LetterE != null) {
            return _LetterE!!
        }
        _LetterE = ImageVector.Builder(
            name = "Outline.LetterE",
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
                moveTo(15.25f, 7f)
                horizontalLineTo(9f)
                verticalLineToRelative(5f)
                moveToRelative(6.25f, 5f)
                horizontalLineTo(9f)
                verticalLineToRelative(-5f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(5f)
            }
        }.build()

        return _LetterE!!
    }

@Suppress("ObjectPropertyName")
private var _LetterE: ImageVector? = null
