package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterX: ImageVector
    get() {
        if (_LetterX != null) {
            return _LetterX!!
        }
        _LetterX = ImageVector.Builder(
            name = "Filled.LetterX",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.8f, 6.4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.6f, 1.2f)
                lineToRelative(3.3f, 4.4f)
                lineToRelative(-3.3f, 4.4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, 1.2f)
                lineToRelative(2.95f, -3.933f)
                lineTo(14.7f, 17.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.6f, -1.2f)
                lineTo(13f, 12f)
                lineToRelative(3.3f, -4.4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, -1.2f)
                lineToRelative(-2.95f, 3.933f)
                close()
            }
        }.build()

        return _LetterX!!
    }

@Suppress("ObjectPropertyName")
private var _LetterX: ImageVector? = null
