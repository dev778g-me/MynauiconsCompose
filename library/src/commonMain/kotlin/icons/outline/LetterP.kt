package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterP: ImageVector
    get() {
        if (_LetterP != null) {
            return _LetterP!!
        }
        _LetterP = ImageVector.Builder(
            name = "Outline.LetterP",
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
                lineTo(9f, 7.625f)
                curveTo(9f, 7.28f, 9.28f, 7f, 9.625f, 7f)
                horizontalLineToRelative(3.75f)
                curveToRelative(1.036f, 0f, 1.875f, 0.84f, 1.875f, 1.875f)
                verticalLineToRelative(1.25f)
                curveToRelative(0f, 1.036f, -0.84f, 1.875f, -1.875f, 1.875f)
                close()
                moveTo(9f, 12f)
                verticalLineToRelative(5f)
            }
        }.build()

        return _LetterP!!
    }

@Suppress("ObjectPropertyName")
private var _LetterP: ImageVector? = null
