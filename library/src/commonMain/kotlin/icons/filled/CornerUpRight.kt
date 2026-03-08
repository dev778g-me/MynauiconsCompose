package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CornerUpRight: ImageVector
    get() {
        if (_CornerUpRight != null) {
            return _CornerUpRight!!
        }
        _CornerUpRight = ImageVector.Builder(
            name = "Filled.CornerUpRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.763f, 4.483f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, -0.026f)
                verticalLineToRelative(4.82f)
                horizontalLineTo(9f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.75f, 4.75f)
                verticalLineTo(19f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-4.973f)
                arcTo(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 10.777f)
                horizontalLineToRelative(4.703f)
                verticalLineToRelative(4.821f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, -0.027f)
                lineToRelative(4.78f, -5.027f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.034f)
                close()
            }
        }.build()

        return _CornerUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _CornerUpRight: ImageVector? = null
