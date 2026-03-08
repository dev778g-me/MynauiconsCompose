package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CornerDownLeft: ImageVector
    get() {
        if (_CornerDownLeft != null) {
            return _CornerDownLeft!!
        }
        _CornerDownLeft = ImageVector.Builder(
            name = "Outline.CornerDownLeft",
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
                moveTo(5f, 13.973f)
                horizontalLineToRelative(10f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                verticalLineTo(5f)
                moveTo(5f, 13.973f)
                lineToRelative(4.78f, -5.027f)
                moveTo(5f, 13.973f)
                lineTo(9.78f, 19f)
            }
        }.build()

        return _CornerDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _CornerDownLeft: ImageVector? = null
