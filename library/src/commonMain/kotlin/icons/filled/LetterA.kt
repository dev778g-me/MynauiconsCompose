package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterA: ImageVector
    get() {
        if (_LetterA != null) {
            return _LetterA!!
        }
        _LetterA = ImageVector.Builder(
            name = "Filled.LetterA",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.75f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.936f, 0.649f)
                lineToRelative(-3.75f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.872f, 0.702f)
                lineToRelative(1.007f, -2.684f)
                horizontalLineToRelative(3.614f)
                lineToRelative(1.007f, 2.684f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.872f, -0.702f)
                lineToRelative(-3.75f, -10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.75f, 6f)
                moveToRelative(0f, 3.848f)
                lineToRelative(1.057f, 2.819f)
                horizontalLineToRelative(-2.114f)
                close()
            }
        }.build()

        return _LetterA!!
    }

@Suppress("ObjectPropertyName")
private var _LetterA: ImageVector? = null
