package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ArrowLeftRight: ImageVector
    get() {
        if (_ArrowLeftRight != null) {
            return _ArrowLeftRight!!
        }
        _ArrowLeftRight = ImageVector.Builder(
            name = "Outline.ArrowLeftRight",
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
                moveTo(6.5f, 7.5f)
                horizontalLineToRelative(11f)
                moveToRelative(0f, 0f)
                lineTo(14f, 11f)
                moveToRelative(3.5f, -3.5f)
                lineTo(14f, 4f)
                moveToRelative(3.5f, 12.5f)
                horizontalLineToRelative(-11f)
                moveToRelative(0f, 0f)
                lineTo(10f, 20f)
                moveToRelative(-3.5f, -3.5f)
                lineTo(10f, 13f)
            }
        }.build()

        return _ArrowLeftRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftRight: ImageVector? = null
