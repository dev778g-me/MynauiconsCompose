package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ArrowLongUpLeft: ImageVector
    get() {
        if (_ArrowLongUpLeft != null) {
            return _ArrowLongUpLeft!!
        }
        _ArrowLongUpLeft = ImageVector.Builder(
            name = "Outline.ArrowLongUpLeft",
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
                moveTo(5f, 11f)
                verticalLineTo(5f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(6f)
                moveTo(5f, 5f)
                lineToRelative(14f, 14f)
            }
        }.build()

        return _ArrowLongUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLongUpLeft: ImageVector? = null
