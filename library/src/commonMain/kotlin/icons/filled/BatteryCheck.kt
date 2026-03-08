package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BatteryCheck: ImageVector
    get() {
        if (_BatteryCheck != null) {
            return _BatteryCheck!!
        }
        _BatteryCheck = ImageVector.Builder(
            name = "Filled.BatteryCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 8f)
                curveToRelative(0f, -0.967f, 0.784f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(14f)
                curveToRelative(0.966f, 0f, 1.75f, 0.783f, 1.75f, 1.75f)
                verticalLineToRelative(8f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 17.75f)
                lineTo(4f, 17.75f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 16f)
                close()
                moveTo(13.352f, 10.94f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.216f, -0.88f)
                lineToRelative(-1.713f, 2.372f)
                lineToRelative(-0.599f, -0.684f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.128f, 0.988f)
                lineToRelative(1.034f, 1.181f)
                arcToRelative(0.974f, 0.974f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.522f, -0.07f)
                close()
                moveTo(21.75f, 11f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
            }
        }.build()

        return _BatteryCheck!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryCheck: ImageVector? = null
