package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.AlarmClockSnooze: ImageVector
    get() {
        if (_AlarmClockSnooze != null) {
            return _AlarmClockSnooze!!
        }
        _AlarmClockSnooze = ImageVector.Builder(
            name = "Outline.AlarmClockSnooze",
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
                moveTo(3f, 5.231f)
                lineTo(6.15f, 3f)
                moveTo(21f, 5.231f)
                lineTo(17.85f, 3f)
                moveTo(20f, 13f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.75f, 11f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-2.5f, 4f)
                horizontalLineToRelative(2.5f)
            }
        }.build()

        return _AlarmClockSnooze!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmClockSnooze: ImageVector? = null
