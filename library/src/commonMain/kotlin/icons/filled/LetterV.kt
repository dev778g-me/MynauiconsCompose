package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterV: ImageVector
    get() {
        if (_LetterV != null) {
            return _LetterV!!
        }
        _LetterV = ImageVector.Builder(
            name = "Filled.LetterV",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.936f, 6.649f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.872f, 0.702f)
                lineToRelative(3.75f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.872f, 0f)
                lineToRelative(3.75f, -10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.872f, -0.702f)
                lineToRelative(-2.814f, 7.503f)
                close()
            }
        }.build()

        return _LetterV!!
    }

@Suppress("ObjectPropertyName")
private var _LetterV: ImageVector? = null
