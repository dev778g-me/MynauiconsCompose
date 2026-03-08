package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChartNoAxesColumn: ImageVector
    get() {
        if (_ChartNoAxesColumn != null) {
            return _ChartNoAxesColumn!!
        }
        _ChartNoAxesColumn = ImageVector.Builder(
            name = "Outline.ChartNoAxesColumn",
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
                moveTo(18f, 8f)
                verticalLineToRelative(13f)
                moveTo(12f, 3f)
                verticalLineToRelative(18f)
                moveToRelative(-6f, -9f)
                verticalLineToRelative(9f)
            }
        }.build()

        return _ChartNoAxesColumn!!
    }

@Suppress("ObjectPropertyName")
private var _ChartNoAxesColumn: ImageVector? = null
