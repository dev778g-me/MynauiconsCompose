package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterG: ImageVector
    get() {
        if (_LetterG != null) {
            return _LetterG!!
        }
        _LetterG = ImageVector.Builder(
            name = "Filled.LetterG",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.875f, 6f)
                arcTo(2.875f, 2.875f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8.875f)
                verticalLineToRelative(6.25f)
                arcTo(2.875f, 2.875f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.875f, 18f)
                horizontalLineToRelative(3.75f)
                curveToRelative(0.898f, 0f, 1.625f, -0.727f, 1.625f, -1.625f)
                verticalLineToRelative(-3.75f)
                curveToRelative(0f, -0.898f, -0.727f, -1.625f, -1.625f, -1.625f)
                horizontalLineToRelative(-1.458f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(1.083f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.375f)
                arcToRelative(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.875f, -0.875f)
                verticalLineToRelative(-6.25f)
                curveToRelative(0f, -0.483f, 0.392f, -0.875f, 0.875f, -0.875f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.483f, 0f, 0.875f, 0.392f, 0.875f, 0.875f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                arcTo(2.875f, 2.875f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.375f, 6f)
                close()
            }
        }.build()

        return _LetterG!!
    }

@Suppress("ObjectPropertyName")
private var _LetterG: ImageVector? = null
