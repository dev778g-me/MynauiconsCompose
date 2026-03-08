package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BatteryMinus: ImageVector
    get() {
        if (_BatteryMinus != null) {
            return _BatteryMinus!!
        }
        _BatteryMinus = ImageVector.Builder(
            name = "Filled.BatteryMinus",
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
                horizontalLineTo(4f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 16f)
                close()
                moveTo(9f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
                moveTo(21.75f, 11f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
            }
        }.build()

        return _BatteryMinus!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryMinus: ImageVector? = null
