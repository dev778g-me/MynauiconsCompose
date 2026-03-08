package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterICircle: ImageVector
    get() {
        if (_LetterICircle != null) {
            return _LetterICircle!!
        }
        _LetterICircle = ImageVector.Builder(
            name = "Outline.LetterICircle",
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
                horizontalLineTo(12f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(2.5f)
                moveTo(12f, 8f)
                verticalLineToRelative(8f)
                moveToRelative(2.5f, 0f)
                horizontalLineTo(12f)
                moveToRelative(0f, 0f)
                horizontalLineTo(9.5f)
            }
        }.build()

        return _LetterICircle!!
    }

@Suppress("ObjectPropertyName")
private var _LetterICircle: ImageVector? = null
