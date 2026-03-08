package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterECircle: ImageVector
    get() {
        if (_LetterECircle != null) {
            return _LetterECircle!!
        }
        _LetterECircle = ImageVector.Builder(
            name = "Outline.LetterECircle",
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
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 8f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(4f)
                moveToRelative(5f, 4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(4f)
            }
        }.build()

        return _LetterECircle!!
    }

@Suppress("ObjectPropertyName")
private var _LetterECircle: ImageVector? = null
