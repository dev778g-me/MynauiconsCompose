package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChevronUpRight: ImageVector
    get() {
        if (_ChevronUpRight != null) {
            return _ChevronUpRight!!
        }
        _ChevronUpRight = ImageVector.Builder(
            name = "Outline.ChevronUpRight",
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
                moveTo(16.121f, 16.364f)
                verticalLineTo(7.879f)
                horizontalLineTo(7.636f)
            }
        }.build()

        return _ChevronUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUpRight: ImageVector? = null
