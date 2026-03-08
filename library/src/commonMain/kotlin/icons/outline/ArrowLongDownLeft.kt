package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ArrowLongDownLeft: ImageVector
    get() {
        if (_ArrowLongDownLeft != null) {
            return _ArrowLongDownLeft!!
        }
        _ArrowLongDownLeft = ImageVector.Builder(
            name = "Outline.ArrowLongDownLeft",
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
                moveTo(11f, 19f)
                horizontalLineTo(5f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(-6f)
                moveToRelative(0f, 6f)
                lineTo(19f, 5f)
            }
        }.build()

        return _ArrowLongDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLongDownLeft: ImageVector? = null
