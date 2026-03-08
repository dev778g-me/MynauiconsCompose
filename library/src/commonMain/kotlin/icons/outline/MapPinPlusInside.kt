package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MapPinPlusInside: ImageVector
    get() {
        if (_MapPinPlusInside != null) {
            return _MapPinPlusInside!!
        }
        _MapPinPlusInside = ImageVector.Builder(
            name = "Outline.MapPinPlusInside",
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
                moveTo(9.5f, 10f)
                horizontalLineToRelative(5f)
                moveTo(12f, 7.5f)
                verticalLineToRelative(5f)
                moveToRelative(0.597f, 9.3f)
                arcToRelative(0.995f, 0.995f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.194f, 0f)
                curveTo(6.253f, 17.976f, 0.785f, 10.109f, 6.31f, 4.425f)
                arcTo(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                curveToRelative(2.134f, 0f, 4.18f, 0.872f, 5.689f, 2.424f)
                curveToRelative(5.526f, 5.684f, 0.059f, 13.55f, -5.092f, 17.377f)
            }
        }.build()

        return _MapPinPlusInside!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinPlusInside: ImageVector? = null
