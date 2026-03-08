package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChartNoAxesColumnDecreasing: ImageVector
    get() {
        if (_ChartNoAxesColumnDecreasing != null) {
            return _ChartNoAxesColumnDecreasing!!
        }
        _ChartNoAxesColumnDecreasing = ImageVector.Builder(
            name = "Outline.ChartNoAxesColumnDecreasing",
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
                moveTo(7f, 21f)
                verticalLineTo(3f)
                moveToRelative(5f, 18f)
                verticalLineTo(9f)
                moveToRelative(5f, 12f)
                verticalLineToRelative(-5f)
            }
        }.build()

        return _ChartNoAxesColumnDecreasing!!
    }

@Suppress("ObjectPropertyName")
private var _ChartNoAxesColumnDecreasing: ImageVector? = null
