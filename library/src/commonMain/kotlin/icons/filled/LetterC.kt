package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterC: ImageVector
    get() {
        if (_LetterC != null) {
            return _LetterC!!
        }
        _LetterC = ImageVector.Builder(
            name = "Filled.LetterC",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 6f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 9.5f)
                verticalLineToRelative(5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 3.5f)
                horizontalLineToRelative(2.813f)
                arcToRelative(3.19f, 3.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.187f, -3.187f)
                verticalLineTo(14.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(0.313f)
                curveToRelative(0f, 0.655f, -0.532f, 1.187f, -1.187f, 1.187f)
                horizontalLineTo(10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 14.5f)
                verticalLineToRelative(-5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 8f)
                horizontalLineToRelative(2.813f)
                curveToRelative(0.655f, 0f, 1.187f, 0.532f, 1.187f, 1.188f)
                verticalLineTo(9.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-0.312f)
                arcTo(3.19f, 3.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.313f, 6f)
                close()
            }
        }.build()

        return _LetterC!!
    }

@Suppress("ObjectPropertyName")
private var _LetterC: ImageVector? = null
