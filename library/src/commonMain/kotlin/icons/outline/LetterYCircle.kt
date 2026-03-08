package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterYCircle: ImageVector
    get() {
        if (_LetterYCircle != null) {
            return _LetterYCircle!!
        }
        _LetterYCircle = ImageVector.Builder(
            name = "Outline.LetterYCircle",
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
                moveTo(9f, 8.25f)
                lineToRelative(3f, 4f)
                moveToRelative(3f, -4f)
                lineToRelative(-3f, 4f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(4f)
            }
        }.build()

        return _LetterYCircle!!
    }

@Suppress("ObjectPropertyName")
private var _LetterYCircle: ImageVector? = null
