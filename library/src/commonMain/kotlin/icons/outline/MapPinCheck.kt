package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MapPinCheck: ImageVector
    get() {
        if (_MapPinCheck != null) {
            return _MapPinCheck!!
        }
        _MapPinCheck = ImageVector.Builder(
            name = "Outline.MapPinCheck",
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
                moveTo(19.743f, 12f)
                curveToRelative(0.62f, -2.608f, 0.187f, -5.271f, -2.054f, -7.576f)
                arcTo(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                curveToRelative(-2.134f, 0f, -4.18f, 0.872f, -5.689f, 2.424f)
                curveToRelative(-5.526f, 5.684f, -0.059f, 13.55f, 5.092f, 17.377f)
                arcToRelative(0.995f, 0.995f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.194f, 0f)
                quadToRelative(0.704f, -0.522f, 1.403f, -1.138f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                moveToRelative(3f, 5.323f)
                lineToRelative(1.379f, 1.575f)
                arcToRelative(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.466f, -0.022f)
                lineToRelative(2.8f, -3.876f)
            }
        }.build()

        return _MapPinCheck!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinCheck: ImageVector? = null
