package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MapPinUserInside: ImageVector
    get() {
        if (_MapPinUserInside != null) {
            return _MapPinUserInside!!
        }
        _MapPinUserInside = ImageVector.Builder(
            name = "Outline.MapPinUserInside",
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
                moveTo(15f, 14f)
                curveToRelative(0f, -3.861f, -6f, -3.861f, -6f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
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

        return _MapPinUserInside!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinUserInside: ImageVector? = null
