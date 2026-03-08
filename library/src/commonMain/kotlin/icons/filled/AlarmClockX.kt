package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.AlarmClockX: ImageVector
    get() {
        if (_AlarmClockX != null) {
            return _AlarmClockX!!
        }
        _AlarmClockX = ImageVector.Builder(
            name = "Filled.AlarmClockX",
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
                moveToRelative(6.22f, -2.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                lineTo(12f, 11.94f)
                lineToRelative(1.47f, -1.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, 1.06f)
                lineTo(13.06f, 13f)
                lineToRelative(1.47f, 1.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, 1.06f)
                lineTo(12f, 14.06f)
                lineToRelative(-1.47f, 1.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                lineTo(10.94f, 13f)
                lineToRelative(-1.47f, -1.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
            }
        }.build()

        return _AlarmClockX!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmClockX: ImageVector? = null
