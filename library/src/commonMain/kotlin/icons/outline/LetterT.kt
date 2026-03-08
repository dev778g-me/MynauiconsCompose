package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterT: ImageVector
    get() {
        if (_LetterT != null) {
            return _LetterT!!
        }
        _LetterT = ImageVector.Builder(
            name = "Outline.LetterT",
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
                horizontalLineToRelative(3.75f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(3.75f)
                moveToRelative(-3.75f, 0f)
                verticalLineToRelative(10f)
            }
        }.build()

        return _LetterT!!
    }

@Suppress("ObjectPropertyName")
private var _LetterT: ImageVector? = null
