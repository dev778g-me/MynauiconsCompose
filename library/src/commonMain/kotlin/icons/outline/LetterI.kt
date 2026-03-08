package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterI: ImageVector
    get() {
        if (_LetterI != null) {
            return _LetterI!!
        }
        _LetterI = ImageVector.Builder(
            name = "Outline.LetterI",
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
                horizontalLineToRelative(3.125f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(3.125f)
                moveToRelative(-3.125f, 0f)
                verticalLineToRelative(10f)
                moveToRelative(3.125f, 0f)
                horizontalLineToRelative(-3.125f)
                moveToRelative(0f, 0f)
                horizontalLineTo(9f)
            }
        }.build()

        return _LetterI!!
    }

@Suppress("ObjectPropertyName")
private var _LetterI: ImageVector? = null
