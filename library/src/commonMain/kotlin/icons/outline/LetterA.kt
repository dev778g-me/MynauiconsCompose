package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterA: ImageVector
    get() {
        if (_LetterA != null) {
            return _LetterA!!
        }
        _LetterA = ImageVector.Builder(
            name = "Outline.LetterA",
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
                moveTo(14.25f, 13.667f)
                lineTo(11.75f, 7f)
                lineToRelative(-2.5f, 6.667f)
                moveToRelative(5f, 0f)
                lineTo(15.5f, 17f)
                moveToRelative(-1.25f, -3.333f)
                horizontalLineToRelative(-5f)
                moveTo(8f, 17f)
                lineToRelative(1.25f, -3.333f)
            }
        }.build()

        return _LetterA!!
    }

@Suppress("ObjectPropertyName")
private var _LetterA: ImageVector? = null
