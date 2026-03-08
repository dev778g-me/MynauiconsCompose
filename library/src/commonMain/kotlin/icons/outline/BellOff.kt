package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.BellOff: ImageVector
    get() {
        if (_BellOff != null) {
            return _BellOff!!
        }
        _BellOff = ImageVector.Builder(
            name = "Outline.BellOff",
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
                moveTo(15.019f, 17f)
                horizontalLineToRelative(-6.04f)
                moveToRelative(6.04f, 0f)
                horizontalLineToRelative(3.614f)
                curveToRelative(1.876f, 0f, 1.559f, -1.86f, 0.61f, -2.804f)
                curveToRelative(-1.903f, -1.89f, -1.242f, -5.145f, -1.78f, -7.66f)
                moveTo(15.02f, 17f)
                curveToRelative(0f, 1.925f, -0.648f, 4f, -3.02f, 4f)
                reflectiveCurveToRelative(-3.02f, -2.075f, -3.02f, -4f)
                moveToRelative(0f, 0f)
                horizontalLineTo(7f)
                moveToRelative(-4f, 4f)
                lineToRelative(4f, -4f)
                moveTo(21f, 3f)
                lineToRelative(-3.536f, 3.536f)
                moveToRelative(0f, 0f)
                lineTo(7f, 17f)
                moveToRelative(8.5f, -13.312f)
                curveTo(14.687f, 3.253f, 13.563f, 3f, 12f, 3f)
                curveToRelative(-8.68f, 0f, -3.826f, 7.8f, -7.244f, 11.196f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.626f, 0.99f)
            }
        }.build()

        return _BellOff!!
    }

@Suppress("ObjectPropertyName")
private var _BellOff: ImageVector? = null
