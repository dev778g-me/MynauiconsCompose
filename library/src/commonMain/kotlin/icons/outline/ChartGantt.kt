package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChartGantt: ImageVector
    get() {
        if (_ChartGantt != null) {
            return _ChartGantt!!
        }
        _ChartGantt = ImageVector.Builder(
            name = "Outline.ChartGantt",
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
                moveTo(21f, 21f)
                horizontalLineTo(9.4f)
                curveToRelative(-2.24f, 0f, -3.36f, 0f, -4.216f, -0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, -1.748f)
                curveTo(3f, 17.96f, 3f, 16.84f, 3f, 14.6f)
                verticalLineTo(3f)
                moveToRelative(5f, 12f)
                horizontalLineToRelative(7f)
                moveToRelative(-3f, -4f)
                horizontalLineToRelative(7f)
                moveTo(9f, 7f)
                horizontalLineToRelative(7f)
            }
        }.build()

        return _ChartGantt!!
    }

@Suppress("ObjectPropertyName")
private var _ChartGantt: ImageVector? = null
