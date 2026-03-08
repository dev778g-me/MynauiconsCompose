package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.RailSymbol: ImageVector
    get() {
        if (_RailSymbol != null) {
            return _RailSymbol!!
        }
        _RailSymbol = ImageVector.Builder(
            name = "Outline.RailSymbol",
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
                moveTo(4f, 15.375f)
                horizontalLineToRelative(16f)
                moveTo(4f, 8.625f)
                horizontalLineToRelative(16f)
                moveTo(16f, 20f)
                lineToRelative(-8f, -4.625f)
                lineToRelative(8f, -6.75f)
                lineTo(8f, 4f)
            }
        }.build()

        return _RailSymbol!!
    }

@Suppress("ObjectPropertyName")
private var _RailSymbol: ImageVector? = null
