package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Figma: ImageVector
    get() {
        if (_Figma != null) {
            return _Figma!!
        }
        _Figma = ImageVector.Builder(
            name = "Filled.Figma",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.75f, 3.75f)
                verticalLineToRelative(4.5f)
                horizontalLineTo(15f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.5f)
                close()
                moveTo(17.25f, 9f)
                arcToRelative(3.76f, 3.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.215f, 1.565f)
                arcTo(3.751f, 3.751f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.75f, 15f)
                verticalLineToRelative(3f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, -3f)
                arcToRelative(3.76f, 3.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, -3f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, -3f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2.25f)
                horizontalLineToRelative(6f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.25f, 9f)
                moveToRelative(-6f, 0.75f)
                horizontalLineTo(9f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4.5f)
                horizontalLineToRelative(2.25f)
                close()
            }
        }.build()

        return _Figma!!
    }

@Suppress("ObjectPropertyName")
private var _Figma: ImageVector? = null
