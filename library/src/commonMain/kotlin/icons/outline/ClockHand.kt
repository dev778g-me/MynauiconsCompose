package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ClockHand: ImageVector
    get() {
        if (_ClockHand != null) {
            return _ClockHand!!
        }
        _ClockHand = ImageVector.Builder(
            name = "Outline.ClockHand",
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
                moveTo(12.147f, 3f)
                verticalLineToRelative(9f)
                lineToRelative(6f, 3f)
            }
        }.build()

        return _ClockHand!!
    }

@Suppress("ObjectPropertyName")
private var _ClockHand: ImageVector? = null
