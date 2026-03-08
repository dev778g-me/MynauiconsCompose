package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterACircle: ImageVector
    get() {
        if (_LetterACircle != null) {
            return _LetterACircle!!
        }
        _LetterACircle = ImageVector.Builder(
            name = "Outline.LetterACircle",
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
                moveTo(14f, 12.833f)
                lineTo(12f, 7.5f)
                lineToRelative(-2f, 5.333f)
                moveToRelative(4f, 0f)
                lineToRelative(1f, 2.667f)
                moveToRelative(-1f, -2.667f)
                horizontalLineToRelative(-4f)
                moveTo(9f, 15.5f)
                lineToRelative(1f, -2.667f)
            }
        }.build()

        return _LetterACircle!!
    }

@Suppress("ObjectPropertyName")
private var _LetterACircle: ImageVector? = null
