package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterR: ImageVector
    get() {
        if (_LetterR != null) {
            return _LetterR!!
        }
        _LetterR = ImageVector.Builder(
            name = "Filled.LetterR",
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
                horizontalLineToRelative(0.688f)
                lineToRelative(3.45f, 4.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, -1.2f)
                lineToRelative(-2.55f, -3.4f)
                horizontalLineToRelative(0.187f)
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

        return _LetterR!!
    }

@Suppress("ObjectPropertyName")
private var _LetterR: ImageVector? = null
