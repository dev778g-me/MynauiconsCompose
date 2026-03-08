package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TextAlignCenter: ImageVector
    get() {
        if (_TextAlignCenter != null) {
            return _TextAlignCenter!!
        }
        _TextAlignCenter = ImageVector.Builder(
            name = "Outline.TextAlignCenter",
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
                moveTo(4.5f, 6f)
                horizontalLineToRelative(15f)
                moveTo(7f, 10f)
                horizontalLineToRelative(10f)
                moveTo(4.5f, 14f)
                horizontalLineToRelative(15f)
                moveTo(7f, 18f)
                horizontalLineToRelative(10f)
            }
        }.build()

        return _TextAlignCenter!!
    }

@Suppress("ObjectPropertyName")
private var _TextAlignCenter: ImageVector? = null
