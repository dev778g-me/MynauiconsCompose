package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CornerDownRight: ImageVector
    get() {
        if (_CornerDownRight != null) {
            return _CornerDownRight!!
        }
        _CornerDownRight = ImageVector.Builder(
            name = "Outline.CornerDownRight",
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
                moveTo(19f, 13.973f)
                horizontalLineTo(9f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                verticalLineTo(5f)
                moveToRelative(14f, 8.973f)
                lineToRelative(-4.78f, -5.027f)
                moveTo(19f, 13.973f)
                lineTo(14.22f, 19f)
            }
        }.build()

        return _CornerDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _CornerDownRight: ImageVector? = null
