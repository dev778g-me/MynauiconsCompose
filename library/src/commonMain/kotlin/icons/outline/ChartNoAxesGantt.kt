package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChartNoAxesGantt: ImageVector
    get() {
        if (_ChartNoAxesGantt != null) {
            return _ChartNoAxesGantt!!
        }
        _ChartNoAxesGantt = ImageVector.Builder(
            name = "Outline.ChartNoAxesGantt",
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
                moveTo(5f, 14f)
                horizontalLineToRelative(11f)
                moveToRelative(-7f, -4f)
                horizontalLineToRelative(11f)
                moveTo(7f, 18f)
                horizontalLineToRelative(11f)
                moveTo(6f, 6f)
                horizontalLineToRelative(11f)
            }
        }.build()

        return _ChartNoAxesGantt!!
    }

@Suppress("ObjectPropertyName")
private var _ChartNoAxesGantt: ImageVector? = null
