package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.DoorOpen: ImageVector
    get() {
        if (_DoorOpen != null) {
            return _DoorOpen!!
        }
        _DoorOpen = ImageVector.Builder(
            name = "Filled.DoorOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 19.53f)
                horizontalLineToRelative(-1.917f)
                verticalLineTo(5.665f)
                curveToRelative(0f, -1.51f, -1.251f, -2.695f, -2.75f, -2.695f)
                horizontalLineToRelative(-1.161f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.85f, -1.211f)
                lineToRelative(-0.2f, 0.032f)
                lineToRelative(-6.611f, 1.44f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.591f, 0.733f)
                verticalLineTo(5.61f)
                lineToRelative(-0.003f, 0.058f)
                verticalLineTo(19.53f)
                horizontalLineTo(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineTo(7f)
                lineToRelative(0.077f, -0.004f)
                quadToRelative(0.03f, -0.003f, 0.062f, -0.01f)
                lineToRelative(5.483f, 1.193f)
                lineToRelative(0.2f, 0.032f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.85f, -1.21f)
                horizontalLineTo(20.5f)
                lineToRelative(0.077f, -0.005f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.492f)
                close()
                moveTo(17.083f, 5.665f)
                verticalLineTo(19.53f)
                horizontalLineTo(14.75f)
                verticalLineTo(4.47f)
                horizontalLineToRelative(1.083f)
                curveToRelative(0.71f, 0f, 1.25f, 0.553f, 1.25f, 1.195f)
                moveToRelative(-6.833f, 5.36f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(1.95f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                close()
            }
        }.build()

        return _DoorOpen!!
    }

@Suppress("ObjectPropertyName")
private var _DoorOpen: ImageVector? = null
