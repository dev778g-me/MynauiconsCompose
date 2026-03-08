package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterP: ImageVector
    get() {
        if (_LetterP != null) {
            return _LetterP!!
        }
        _LetterP = ImageVector.Builder(
            name = "Filled.LetterP",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.625f, 6f)
                curveTo(8.728f, 6f, 8f, 6.728f, 8f, 7.625f)
                verticalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3.375f)
                arcToRelative(2.875f, 2.875f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.875f, -2.875f)
                verticalLineToRelative(-1.25f)
                arcTo(2.875f, 2.875f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.375f, 6f)
                close()
                moveTo(10f, 11f)
                verticalLineTo(8f)
                horizontalLineToRelative(3.375f)
                curveToRelative(0.483f, 0f, 0.875f, 0.392f, 0.875f, 0.875f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.875f, 0.875f)
                close()
            }
        }.build()

        return _LetterP!!
    }

@Suppress("ObjectPropertyName")
private var _LetterP: ImageVector? = null
