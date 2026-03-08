package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.AlarmClockCheck: ImageVector
    get() {
        if (_AlarmClockCheck != null) {
            return _AlarmClockCheck!!
        }
        _AlarmClockCheck = ImageVector.Builder(
            name = "Filled.AlarmClockCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.284f, 2.388f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.867f, 1.224f)
                lineToRelative(3.15f, 2.231f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.867f, -1.224f)
                close()
                moveTo(6.584f, 3.612f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.867f, -1.224f)
                lineToRelative(-3.15f, 2.231f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.867f, 1.224f)
                close()
                moveTo(3.25f, 13f)
                arcToRelative(8.75f, 8.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 17.5f, 0f)
                arcToRelative(8.75f, 8.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -17.5f, 0f)
                moveToRelative(11.834f, -2.608f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.169f, 1.047f)
                lineToRelative(-2.8f, 3.876f)
                arcToRelative(1.05f, 1.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.639f, 0.077f)
                lineToRelative(-1.378f, -1.576f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.128f, -0.987f)
                lineToRelative(1.005f, 1.148f)
                lineToRelative(2.468f, -3.416f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.047f, -0.169f)
            }
        }.build()

        return _AlarmClockCheck!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmClockCheck: ImageVector? = null
