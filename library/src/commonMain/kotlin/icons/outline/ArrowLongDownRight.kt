package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ArrowLongDownRight: ImageVector
    get() {
        if (_ArrowLongDownRight != null) {
            return _ArrowLongDownRight!!
        }
        _ArrowLongDownRight = ImageVector.Builder(
            name = "Outline.ArrowLongDownRight",
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
                moveTo(19f, 13f)
                verticalLineToRelative(6f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-6f)
                moveToRelative(6f, 0f)
                lineTo(5f, 5f)
            }
        }.build()

        return _ArrowLongDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLongDownRight: ImageVector? = null
