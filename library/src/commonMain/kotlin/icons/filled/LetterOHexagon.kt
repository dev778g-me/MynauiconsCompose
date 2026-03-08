package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterOHexagon: ImageVector
    get() {
        if (_LetterOHexagon != null) {
            return _LetterOHexagon!!
        }
        _LetterOHexagon = ImageVector.Builder(
            name = "Filled.LetterOHexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.75f, 10f)
                curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(2f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.68f, 2.105f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.64f, 0f)
                lineToRelative(0.001f, 0.001f)
                lineToRelative(6.611f, 3.8f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.25f, 8.2f)
                verticalLineToRelative(7.603f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.318f, 2.291f)
                lineToRelative(-0.003f, 0.002f)
                lineToRelative(-6.608f, 3.799f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.639f, 0f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-6.608f, -3.8f)
                horizontalLineToRelative(-0.003f)
                arcTo(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.75f, 15.8f)
                verticalLineTo(8.198f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.318f, -2.291f)
                lineToRelative(0.003f, -0.002f)
                close()
                moveTo(11f, 7.25f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.25f, 10f)
                verticalLineToRelative(4f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 16.75f)
                horizontalLineToRelative(2f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.75f, 14f)
                verticalLineToRelative(-4f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 7.25f)
                close()
            }
        }.build()

        return _LetterOHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _LetterOHexagon: ImageVector? = null
