package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TextAlignRight: ImageVector
    get() {
        if (_TextAlignRight != null) {
            return _TextAlignRight!!
        }
        _TextAlignRight = ImageVector.Builder(
            name = "Outline.TextAlignRight",
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
                moveToRelative(-10f, 4f)
                horizontalLineToRelative(10f)
                moveToRelative(-15f, 4f)
                horizontalLineToRelative(15f)
                moveToRelative(-10f, 4f)
                horizontalLineToRelative(10f)
            }
        }.build()

        return _TextAlignRight!!
    }

@Suppress("ObjectPropertyName")
private var _TextAlignRight: ImageVector? = null
