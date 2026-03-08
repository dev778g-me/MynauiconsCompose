package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ArrowLongUp: ImageVector
    get() {
        if (_ArrowLongUp != null) {
            return _ArrowLongUp!!
        }
        _ArrowLongUp = ImageVector.Builder(
            name = "Outline.ArrowLongUp",
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
                moveToRelative(8f, 6f)
                lineToRelative(4f, -4f)
                moveToRelative(0f, 0f)
                lineToRelative(4f, 4f)
                moveToRelative(-4f, -4f)
                verticalLineToRelative(20f)
            }
        }.build()

        return _ArrowLongUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLongUp: ImageVector? = null
