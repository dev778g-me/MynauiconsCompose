package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MapPinSnoozeInside: ImageVector
    get() {
        if (_MapPinSnoozeInside != null) {
            return _MapPinSnoozeInside!!
        }
        _MapPinSnoozeInside = ImageVector.Builder(
            name = "Outline.MapPinSnoozeInside",
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
                moveTo(10.75f, 8f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-2.5f, 4f)
                horizontalLineToRelative(2.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.597f, 21.8f)
                arcToRelative(0.995f, 0.995f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.194f, 0f)
                curveTo(6.253f, 17.976f, 0.785f, 10.109f, 6.31f, 4.425f)
                arcTo(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                curveToRelative(2.134f, 0f, 4.18f, 0.872f, 5.689f, 2.424f)
                curveToRelative(5.526f, 5.684f, 0.059f, 13.55f, -5.092f, 17.377f)
            }
        }.build()

        return _MapPinSnoozeInside!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinSnoozeInside: ImageVector? = null
