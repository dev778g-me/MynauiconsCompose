package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterY: ImageVector
    get() {
        if (_LetterY != null) {
            return _LetterY!!
        }
        _LetterY = ImageVector.Builder(
            name = "Filled.LetterY",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.8f, 6.4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.6f, 1.2f)
                lineToRelative(3.55f, 4.733f)
                verticalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-4.667f)
                lineTo(16.3f, 7.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, -1.2f)
                lineToRelative(-2.95f, 3.933f)
                close()
            }
        }.build()

        return _LetterY!!
    }

@Suppress("ObjectPropertyName")
private var _LetterY: ImageVector? = null
