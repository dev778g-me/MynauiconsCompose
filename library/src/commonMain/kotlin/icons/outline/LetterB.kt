package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterB: ImageVector
    get() {
        if (_LetterB != null) {
            return _LetterB!!
        }
        _LetterB = ImageVector.Builder(
            name = "Outline.LetterB",
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
                moveTo(9f, 12f)
                verticalLineTo(7f)
                horizontalLineToRelative(4.589f)
                curveToRelative(2.74f, 0f, 3.124f, 4.072f, 0.57f, 5f)
                moveTo(9f, 12f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4.589f)
                curveToRelative(2.74f, 0f, 3.124f, -4.072f, 0.57f, -5f)
                moveTo(9f, 12f)
                horizontalLineToRelative(5.158f)
            }
        }.build()

        return _LetterB!!
    }

@Suppress("ObjectPropertyName")
private var _LetterB: ImageVector? = null
