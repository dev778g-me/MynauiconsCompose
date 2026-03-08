package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.BatteryChargingFour: ImageVector
    get() {
        if (_BatteryChargingFour != null) {
            return _BatteryChargingFour!!
        }
        _BatteryChargingFour = ImageVector.Builder(
            name = "Outline.BatteryChargingFour",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 7f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                moveToRelative(3f, 4f)
                verticalLineToRelative(2f)
                moveTo(6.5f, 10f)
                verticalLineToRelative(4f)
                moveToRelative(3f, -4f)
                verticalLineToRelative(4f)
                moveToRelative(3f, -4f)
                verticalLineToRelative(4f)
                moveToRelative(3f, -2f)
                verticalLineToRelative(2f)
            }
        }.build()

        return _BatteryChargingFour!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryChargingFour: ImageVector? = null
