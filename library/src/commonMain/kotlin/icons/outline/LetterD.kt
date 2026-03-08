package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterD: ImageVector
    get() {
        if (_LetterD != null) {
            return _LetterD!!
        }
        _LetterD = ImageVector.Builder(
            name = "Outline.LetterD",
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
                moveTo(8f, 16.375f)
                verticalLineToRelative(-8.75f)
                curveTo(8f, 7.28f, 8.28f, 7f, 8.625f, 7f)
                horizontalLineToRelative(2.5f)
                arcToRelative(4.375f, 4.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.375f, 4.375f)
                verticalLineToRelative(1.25f)
                arcTo(4.375f, 4.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.125f, 17f)
                horizontalLineToRelative(-2.5f)
                arcTo(0.625f, 0.625f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 16.375f)
            }
        }.build()

        return _LetterD!!
    }

@Suppress("ObjectPropertyName")
private var _LetterD: ImageVector? = null
