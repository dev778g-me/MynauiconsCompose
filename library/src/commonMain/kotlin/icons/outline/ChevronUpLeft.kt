package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChevronUpLeft: ImageVector
    get() {
        if (_ChevronUpLeft != null) {
            return _ChevronUpLeft!!
        }
        _ChevronUpLeft = ImageVector.Builder(
            name = "Outline.ChevronUpLeft",
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
                moveTo(7.879f, 16.364f)
                verticalLineTo(7.879f)
                horizontalLineToRelative(8.485f)
            }
        }.build()

        return _ChevronUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUpLeft: ImageVector? = null
