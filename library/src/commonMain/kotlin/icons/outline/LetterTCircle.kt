package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterTCircle: ImageVector
    get() {
        if (_LetterTCircle != null) {
            return _LetterTCircle!!
        }
        _LetterTCircle = ImageVector.Builder(
            name = "Outline.LetterTCircle",
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
                horizontalLineToRelative(3f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(3f)
                moveToRelative(-3f, 0f)
                verticalLineToRelative(8f)
            }
        }.build()

        return _LetterTCircle!!
    }

@Suppress("ObjectPropertyName")
private var _LetterTCircle: ImageVector? = null
