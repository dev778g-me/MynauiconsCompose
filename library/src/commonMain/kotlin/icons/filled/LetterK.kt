package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterK: ImageVector
    get() {
        if (_LetterK != null) {
            return _LetterK!!
        }
        _LetterK = ImageVector.Builder(
            name = "Filled.LetterK",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.997f, 6.336f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.411f, -0.083f)
                lineTo(10f, 10.329f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-3.329f)
                lineToRelative(4.586f, 4.076f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.328f, -1.494f)
                lineTo(11.13f, 12f)
                lineToRelative(4.784f, -4.253f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.083f, -1.411f)
            }
        }.build()

        return _LetterK!!
    }

@Suppress("ObjectPropertyName")
private var _LetterK: ImageVector? = null
