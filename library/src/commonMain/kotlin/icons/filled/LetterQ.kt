package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterQ: ImageVector
    get() {
        if (_LetterQ != null) {
            return _LetterQ!!
        }
        _LetterQ = ImageVector.Builder(
            name = "Filled.LetterQ",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.462f, 6f)
                arcTo(3.466f, 3.466f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 9.47f)
                verticalLineToRelative(4.942f)
                arcToRelative(3.466f, 3.466f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.461f, 3.47f)
                horizontalLineToRelative(4.508f)
                lineToRelative(0.323f, 0.324f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.416f, -1.412f)
                lineToRelative(-0.323f, -0.325f)
                verticalLineTo(9.471f)
                arcTo(3.466f, 3.466f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.923f, 6f)
                close()
                moveTo(9f, 9.47f)
                curveTo(9f, 8.656f, 9.658f, 8f, 10.461f, 8f)
                horizontalLineToRelative(2.462f)
                curveToRelative(0.804f, 0f, 1.462f, 0.655f, 1.462f, 1.47f)
                verticalLineToRelative(4.992f)
                lineToRelative(-0.753f, -0.756f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.417f, 1.412f)
                lineToRelative(0.762f, 0.764f)
                horizontalLineTo(10.46f)
                arcTo(1.466f, 1.466f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 14.412f)
                close()
            }
        }.build()

        return _LetterQ!!
    }

@Suppress("ObjectPropertyName")
private var _LetterQ: ImageVector? = null
