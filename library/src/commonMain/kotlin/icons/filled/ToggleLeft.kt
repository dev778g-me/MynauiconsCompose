package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ToggleLeft: ImageVector
    get() {
        if (_ToggleLeft != null) {
            return _ToggleLeft!!
        }
        _ToggleLeft = ImageVector.Builder(
            name = "Filled.ToggleLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                arcTo(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 6.25f)
                horizontalLineToRelative(8f)
                arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.5f)
                horizontalLineTo(8f)
                arcTo(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 12f)
                moveToRelative(2.5f, 0f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.5f, 0f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.5f, 0f)
            }
        }.build()

        return _ToggleLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleLeft: ImageVector? = null
