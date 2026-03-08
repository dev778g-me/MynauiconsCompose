package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterKCircle: ImageVector
    get() {
        if (_LetterKCircle != null) {
            return _LetterKCircle!!
        }
        _LetterKCircle = ImageVector.Builder(
            name = "Outline.LetterKCircle",
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
                moveTo(9.75f, 8f)
                verticalLineToRelative(4f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(4f)
                moveToRelative(0f, -4f)
                horizontalLineToRelative(0.5f)
                moveToRelative(0f, 0f)
                lineToRelative(4.5f, 4f)
                moveToRelative(-4.5f, -4f)
                lineToRelative(4.5f, -4f)
            }
        }.build()

        return _LetterKCircle!!
    }

@Suppress("ObjectPropertyName")
private var _LetterKCircle: ImageVector? = null
