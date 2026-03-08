package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CornerLeftDown: ImageVector
    get() {
        if (_CornerLeftDown != null) {
            return _CornerLeftDown!!
        }
        _CornerLeftDown = ImageVector.Builder(
            name = "Filled.CornerLeftDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.483f, 14.763f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.026f, -1.06f)
                horizontalLineToRelative(4.82f)
                verticalLineTo(9f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.75f, -4.75f)
                horizontalLineTo(19f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-4.973f)
                arcTo(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.777f, 9f)
                verticalLineToRelative(4.703f)
                horizontalLineToRelative(4.821f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.027f, 1.06f)
                lineToRelative(-5.027f, 4.78f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.034f, 0f)
                close()
            }
        }.build()

        return _CornerLeftDown!!
    }

@Suppress("ObjectPropertyName")
private var _CornerLeftDown: ImageVector? = null
