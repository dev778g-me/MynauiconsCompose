package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChartNoAxesColumnIncreasing: ImageVector
    get() {
        if (_ChartNoAxesColumnIncreasing != null) {
            return _ChartNoAxesColumnIncreasing!!
        }
        _ChartNoAxesColumnIncreasing = ImageVector.Builder(
            name = "Outline.ChartNoAxesColumnIncreasing",
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
                moveTo(17f, 21f)
                verticalLineTo(3f)
                moveToRelative(-5f, 18f)
                verticalLineTo(9f)
                moveTo(7f, 21f)
                verticalLineToRelative(-5f)
            }
        }.build()

        return _ChartNoAxesColumnIncreasing!!
    }

@Suppress("ObjectPropertyName")
private var _ChartNoAxesColumnIncreasing: ImageVector? = null
