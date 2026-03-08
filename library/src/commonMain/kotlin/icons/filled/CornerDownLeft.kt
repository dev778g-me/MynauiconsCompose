package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CornerDownLeft: ImageVector
    get() {
        if (_CornerDownLeft != null) {
            return _CornerDownLeft!!
        }
        _CornerDownLeft = ImageVector.Builder(
            name = "Filled.CornerDownLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.237f, 19.517f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 0.027f)
                verticalLineToRelative(-4.821f)
                horizontalLineTo(15f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.75f, -4.75f)
                verticalLineTo(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(4.973f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.25f, 3.25f)
                horizontalLineToRelative(-4.703f)
                verticalLineTo(8.402f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 0.027f)
                lineToRelative(-4.78f, 5.027f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.034f)
                close()
            }
        }.build()

        return _CornerDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _CornerDownLeft: ImageVector? = null
