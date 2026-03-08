package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CornerLeftDown: ImageVector
    get() {
        if (_CornerLeftDown != null) {
            return _CornerLeftDown!!
        }
        _CornerLeftDown = ImageVector.Builder(
            name = "Outline.CornerLeftDown",
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
                moveTo(10.027f, 19f)
                verticalLineTo(9f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                horizontalLineTo(19f)
                moveToRelative(-8.973f, 14f)
                lineToRelative(5.028f, -4.78f)
                moveTo(10.027f, 19f)
                lineTo(5f, 14.22f)
            }
        }.build()

        return _CornerLeftDown!!
    }

@Suppress("ObjectPropertyName")
private var _CornerLeftDown: ImageVector? = null
