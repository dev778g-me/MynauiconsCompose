package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TypeItalic: ImageVector
    get() {
        if (_TypeItalic != null) {
            return _TypeItalic!!
        }
        _TypeItalic = ImageVector.Builder(
            name = "Outline.TypeItalic",
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
                moveTo(19f, 3f)
                horizontalLineTo(9f)
                moveToRelative(6f, 18f)
                horizontalLineTo(5f)
                moveToRelative(9.5f, -18f)
                lineTo(10f, 21f)
            }
        }.build()

        return _TypeItalic!!
    }

@Suppress("ObjectPropertyName")
private var _TypeItalic: ImageVector? = null
