package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterD: ImageVector
    get() {
        if (_LetterD != null) {
            return _LetterD!!
        }
        _LetterD = ImageVector.Builder(
            name = "Filled.LetterD",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.625f, 6f)
                curveTo(7.728f, 6f, 7f, 6.728f, 7f, 7.625f)
                verticalLineToRelative(8.75f)
                curveTo(7f, 17.273f, 7.728f, 18f, 8.625f, 18f)
                horizontalLineToRelative(2.5f)
                arcToRelative(5.375f, 5.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.375f, -5.375f)
                verticalLineToRelative(-1.25f)
                arcTo(5.375f, 5.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.125f, 6f)
                close()
                moveTo(9f, 16f)
                verticalLineTo(8f)
                horizontalLineToRelative(2.125f)
                arcToRelative(3.375f, 3.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.375f, 3.375f)
                verticalLineToRelative(1.25f)
                arcTo(3.375f, 3.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.125f, 16f)
                close()
            }
        }.build()

        return _LetterD!!
    }

@Suppress("ObjectPropertyName")
private var _LetterD: ImageVector? = null
