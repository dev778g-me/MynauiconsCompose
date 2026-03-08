package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CornerLeftUp: ImageVector
    get() {
        if (_CornerLeftUp != null) {
            return _CornerLeftUp!!
        }
        _CornerLeftUp = ImageVector.Builder(
            name = "Outline.CornerLeftUp",
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
                moveTo(10.027f, 5f)
                verticalLineToRelative(10f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineTo(19f)
                moveTo(10.027f, 5f)
                lineToRelative(5.028f, 4.78f)
                moveTo(10.027f, 5f)
                lineTo(5f, 9.78f)
            }
        }.build()

        return _CornerLeftUp!!
    }

@Suppress("ObjectPropertyName")
private var _CornerLeftUp: ImageVector? = null
