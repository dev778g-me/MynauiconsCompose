package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CornerUpRight: ImageVector
    get() {
        if (_CornerUpRight != null) {
            return _CornerUpRight!!
        }
        _CornerUpRight = ImageVector.Builder(
            name = "Outline.CornerUpRight",
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
                moveTo(19f, 10.027f)
                horizontalLineTo(9f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                verticalLineTo(19f)
                moveToRelative(14f, -8.973f)
                lineToRelative(-4.78f, 5.028f)
                moveTo(19f, 10.027f)
                lineTo(14.22f, 5f)
            }
        }.build()

        return _CornerUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _CornerUpRight: ImageVector? = null
