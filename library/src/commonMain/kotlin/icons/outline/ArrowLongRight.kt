package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ArrowLongRight: ImageVector
    get() {
        if (_ArrowLongRight != null) {
            return _ArrowLongRight!!
        }
        _ArrowLongRight = ImageVector.Builder(
            name = "Outline.ArrowLongRight",
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
                moveToRelative(18f, 8f)
                lineToRelative(4f, 4f)
                moveToRelative(0f, 0f)
                lineToRelative(-4f, 4f)
                moveToRelative(4f, -4f)
                horizontalLineTo(2f)
            }
        }.build()

        return _ArrowLongRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLongRight: ImageVector? = null
