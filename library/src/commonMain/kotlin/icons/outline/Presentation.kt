package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Presentation: ImageVector
    get() {
        if (_Presentation != null) {
            return _Presentation!!
        }
        _Presentation = ImageVector.Builder(
            name = "Outline.Presentation",
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
                moveTo(3f, 4f)
                horizontalLineToRelative(18f)
                moveToRelative(-1.9f, 0f)
                verticalLineToRelative(9.778f)
                curveToRelative(0f, 0.471f, -0.19f, 0.923f, -0.527f, 1.257f)
                curveToRelative(-0.338f, 0.333f, -0.796f, 0.52f, -1.273f, 0.52f)
                horizontalLineTo(6.7f)
                curveToRelative(-0.477f, 0f, -0.935f, -0.187f, -1.273f, -0.52f)
                arcToRelative(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.527f, -1.257f)
                verticalLineTo(4f)
                moveToRelative(2.6f, 16f)
                lineToRelative(4.5f, -4.444f)
                lineTo(16.5f, 20f)
            }
        }.build()

        return _Presentation!!
    }

@Suppress("ObjectPropertyName")
private var _Presentation: ImageVector? = null
