package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.DoorClosed: ImageVector
    get() {
        if (_DoorClosed != null) {
            return _DoorClosed!!
        }
        _DoorClosed = ImageVector.Builder(
            name = "Filled.DoorClosed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 19.75f)
                horizontalLineToRelative(-1.917f)
                verticalLineTo(5.497f)
                arcToRelative(2.747f, 2.747f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.75f, -2.747f)
                horizontalLineTo(8.167f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.75f, 2.75f)
                verticalLineToRelative(14.25f)
                horizontalLineTo(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(17f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                moveTo(14.25f, 11f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                close()
            }
        }.build()

        return _DoorClosed!!
    }

@Suppress("ObjectPropertyName")
private var _DoorClosed: ImageVector? = null
