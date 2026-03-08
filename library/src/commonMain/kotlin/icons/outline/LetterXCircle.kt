package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterXCircle: ImageVector
    get() {
        if (_LetterXCircle != null) {
            return _LetterXCircle!!
        }
        _LetterXCircle = ImageVector.Builder(
            name = "Outline.LetterXCircle",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                moveTo(9f, 8f)
                lineToRelative(6f, 8f)
                moveToRelative(-6f, 0f)
                lineToRelative(6f, -8f)
            }
        }.build()

        return _LetterXCircle!!
    }

@Suppress("ObjectPropertyName")
private var _LetterXCircle: ImageVector? = null
