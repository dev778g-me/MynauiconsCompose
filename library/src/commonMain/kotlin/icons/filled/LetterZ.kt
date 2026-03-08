package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterZ: ImageVector
    get() {
        if (_LetterZ != null) {
            return _LetterZ!!
        }
        _LetterZ = ImageVector.Builder(
            name = "Filled.LetterZ",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(5.5f)
                lineToRelative(-6.3f, 8.4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 18f)
                horizontalLineToRelative(7.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(10f)
                lineToRelative(6.3f, -8.4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -1.6f)
                close()
            }
        }.build()

        return _LetterZ!!
    }

@Suppress("ObjectPropertyName")
private var _LetterZ: ImageVector? = null
