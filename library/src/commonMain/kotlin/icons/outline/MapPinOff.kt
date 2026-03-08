package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MapPinOff: ImageVector
    get() {
        if (_MapPinOff != null) {
            return _MapPinOff!!
        }
        _MapPinOff = ImageVector.Builder(
            name = "Outline.MapPinOff",
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
                moveTo(14f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 2f)
                moveToRelative(9f, -9f)
                lineTo(3f, 21f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.597f, 21.8f)
                arcToRelative(0.995f, 0.995f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.194f, 0f)
                curveTo(6.253f, 17.976f, 0.785f, 10.109f, 6.31f, 4.425f)
                arcTo(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                curveToRelative(2.134f, 0f, 4.18f, 0.872f, 5.689f, 2.424f)
                curveToRelative(5.526f, 5.684f, 0.059f, 13.55f, -5.092f, 17.377f)
            }
        }.build()

        return _MapPinOff!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinOff: ImageVector? = null
