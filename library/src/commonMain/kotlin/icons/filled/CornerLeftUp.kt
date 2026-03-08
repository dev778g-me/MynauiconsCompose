package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CornerLeftUp: ImageVector
    get() {
        if (_CornerLeftUp != null) {
            return _CornerLeftUp!!
        }
        _CornerLeftUp = ImageVector.Builder(
            name = "Filled.CornerLeftUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.483f, 9.237f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.026f, 1.06f)
                horizontalLineToRelative(4.82f)
                verticalLineTo(15f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.75f, 4.75f)
                horizontalLineTo(19f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-4.973f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.25f, -3.25f)
                verticalLineToRelative(-4.703f)
                horizontalLineToRelative(4.821f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.027f, -1.06f)
                lineToRelative(-5.027f, -4.78f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.034f, 0f)
                close()
            }
        }.build()

        return _CornerLeftUp!!
    }

@Suppress("ObjectPropertyName")
private var _CornerLeftUp: ImageVector? = null
