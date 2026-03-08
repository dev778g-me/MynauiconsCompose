package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterBCircle: ImageVector
    get() {
        if (_LetterBCircle != null) {
            return _LetterBCircle!!
        }
        _LetterBCircle = ImageVector.Builder(
            name = "Outline.LetterBCircle",
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
                moveTo(9.5f, 12f)
                verticalLineTo(8f)
                horizontalLineToRelative(3.671f)
                curveToRelative(2.192f, 0f, 2.5f, 3.258f, 0.456f, 4f)
                moveTo(9.5f, 12f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3.671f)
                curveToRelative(2.192f, 0f, 2.5f, -3.258f, 0.456f, -4f)
                moveTo(9.5f, 12f)
                horizontalLineToRelative(4.127f)
            }
        }.build()

        return _LetterBCircle!!
    }

@Suppress("ObjectPropertyName")
private var _LetterBCircle: ImageVector? = null
