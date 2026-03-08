package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ToggleRight: ImageVector
    get() {
        if (_ToggleRight != null) {
            return _ToggleRight!!
        }
        _ToggleRight = ImageVector.Builder(
            name = "Filled.ToggleRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 6.25f)
                arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 11.5f)
                horizontalLineToRelative(8f)
                arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -11.5f)
                close()
                moveTo(12.75f, 12f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.5f, 0f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.5f, 0f)
            }
        }.build()

        return _ToggleRight!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleRight: ImageVector? = null
