package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BatteryPlus: ImageVector
    get() {
        if (_BatteryPlus != null) {
            return _BatteryPlus!!
        }
        _BatteryPlus = ImageVector.Builder(
            name = "Filled.BatteryPlus",
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
                moveTo(11.75f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(1.25f)
                lineTo(9f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.25f)
                lineTo(10.25f, 14f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-1.25f)
                lineTo(13f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-1.25f)
                close()
                moveTo(21.75f, 11f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
            }
        }.build()

        return _BatteryPlus!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryPlus: ImageVector? = null
