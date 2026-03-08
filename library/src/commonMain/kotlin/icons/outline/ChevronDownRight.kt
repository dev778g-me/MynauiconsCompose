package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChevronDownRight: ImageVector
    get() {
        if (_ChevronDownRight != null) {
            return _ChevronDownRight!!
        }
        _ChevronDownRight = ImageVector.Builder(
            name = "Outline.ChevronDownRight",
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
                moveTo(16.121f, 7.636f)
                verticalLineToRelative(8.485f)
                horizontalLineTo(7.636f)
            }
        }.build()

        return _ChevronDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDownRight: ImageVector? = null
