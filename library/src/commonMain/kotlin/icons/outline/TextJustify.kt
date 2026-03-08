package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TextJustify: ImageVector
    get() {
        if (_TextJustify != null) {
            return _TextJustify!!
        }
        _TextJustify = ImageVector.Builder(
            name = "Outline.TextJustify",
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
                moveToRelative(-15f, 4f)
                horizontalLineToRelative(15f)
                moveToRelative(-15f, 4f)
                horizontalLineToRelative(15f)
                moveToRelative(-15f, 4f)
                horizontalLineToRelative(15f)
            }
        }.build()

        return _TextJustify!!
    }

@Suppress("ObjectPropertyName")
private var _TextJustify: ImageVector? = null
