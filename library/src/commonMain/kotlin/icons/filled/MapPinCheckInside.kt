package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MapPinCheckInside: ImageVector
    get() {
        if (_MapPinCheckInside != null) {
            return _MapPinCheckInside!!
        }
        _MapPinCheckInside = ImageVector.Builder(
            name = "Filled.MapPinCheckInside",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.286f, 3.843f)
                arcTo(8.77f, 8.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1.167f)
                arcToRelative(8.77f, 8.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.286f, 2.676f)
                curveToRelative(-3.06f, 3.147f, -3.04f, 6.919f, -1.63f, 10.288f)
                curveToRelative(1.393f, 3.33f, 4.163f, 6.363f, 6.822f, 8.339f)
                arcToRelative(1.83f, 1.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.188f, 0f)
                curveToRelative(2.66f, -1.976f, 5.43f, -5.01f, 6.822f, -8.34f)
                curveToRelative(1.41f, -3.368f, 1.43f, -7.14f, -1.63f, -10.287f)
                moveToRelative(-3.554f, 3.481f)
                curveToRelative(0.374f, 0.27f, 0.458f, 0.791f, 0.189f, 1.164f)
                lineToRelative(-2.8f, 3.876f)
                curveToRelative(-0.426f, 0.59f, -1.29f, 0.63f, -1.77f, 0.083f)
                lineToRelative(-1.378f, -1.576f)
                arcToRelative(0.834f, 0.834f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.195f, -1.158f)
                lineToRelative(0.06f, 0.06f)
                lineToRelative(0.935f, 1.07f)
                lineToRelative(2.406f, -3.331f)
                arcToRelative(0.833f, 0.833f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.163f, -0.188f)
            }
        }.build()

        return _MapPinCheckInside!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinCheckInside: ImageVector? = null
