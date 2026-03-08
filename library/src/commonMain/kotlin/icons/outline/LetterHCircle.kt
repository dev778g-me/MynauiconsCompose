package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterHCircle: ImageVector
    get() {
        if (_LetterHCircle != null) {
            return _LetterHCircle!!
        }
        _LetterHCircle = ImageVector.Builder(
            name = "Outline.LetterHCircle",
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
                moveTo(9.5f, 8f)
                verticalLineToRelative(4f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(4f)
                moveToRelative(0f, -4f)
                horizontalLineToRelative(5f)
                moveToRelative(0f, -4f)
                verticalLineToRelative(4f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(4f)
            }
        }.build()

        return _LetterHCircle!!
    }

@Suppress("ObjectPropertyName")
private var _LetterHCircle: ImageVector? = null
