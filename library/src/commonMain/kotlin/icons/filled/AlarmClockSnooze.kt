package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.AlarmClockSnooze: ImageVector
    get() {
        if (_AlarmClockSnooze != null) {
            return _AlarmClockSnooze!!
        }
        _AlarmClockSnooze = ImageVector.Builder(
            name = "Filled.AlarmClockSnooze",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.584f, 3.612f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.867f, -1.224f)
                lineToRelative(-3.15f, 2.231f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.867f, 1.224f)
                close()
                moveTo(18.284f, 2.388f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.867f, 1.224f)
                lineToRelative(3.15f, 2.231f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.867f, -1.224f)
                close()
                moveTo(3.25f, 13f)
                arcToRelative(8.75f, 8.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17.5f, 0f)
                arcToRelative(8.75f, 8.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -17.5f, 0f)
                moveToRelative(7.5f, -2.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.147f)
                lineToRelative(-1.783f, 2.852f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.636f, 1.148f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-1.147f)
                lineToRelative(1.783f, -2.852f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.636f, -1.148f)
                close()
            }
        }.build()

        return _AlarmClockSnooze!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmClockSnooze: ImageVector? = null
