package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.AlarmClock: ImageVector
    get() {
        if (_AlarmClock != null) {
            return _AlarmClock!!
        }
        _AlarmClock = ImageVector.Builder(
            name = "Filled.AlarmClock",
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
                arcToRelative(8.75f, 8.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17.5f, 0f)
                arcToRelative(8.75f, 8.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -17.5f, 0f)
                moveToRelative(9.5f, -4.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.25f, 0.125f, 0.485f, 0.334f, 0.624f)
                lineToRelative(3f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.832f, -1.248f)
                lineToRelative(-2.666f, -1.777f)
                close()
            }
        }.build()

        return _AlarmClock!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmClock: ImageVector? = null
