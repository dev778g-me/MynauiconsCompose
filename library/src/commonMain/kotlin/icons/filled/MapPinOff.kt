package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MapPinOff: ImageVector
    get() {
        if (_MapPinOff != null) {
            return _MapPinOff!!
        }
        _MapPinOff = ImageVector.Builder(
            name = "Filled.MapPinOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.167f)
                curveToRelative(2.362f, 0f, 4.623f, 0.965f, 6.286f, 2.676f)
                quadToRelative(0.172f, 0.178f, 0.333f, 0.36f)
                lineToRelative(1.792f, -1.792f)
                arcTo(0.832f, 0.832f, 0f, isMoreThanHalf = true, isPositiveArc = true, 21.59f, 3.59f)
                lineToRelative(-1.97f, 1.966f)
                curveToRelative(1.673f, 2.748f, 1.457f, 5.798f, 0.295f, 8.575f)
                curveToRelative(-1.393f, 3.33f, -4.163f, 6.363f, -6.822f, 8.339f)
                arcToRelative(1.83f, 1.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.188f, 0f)
                arcToRelative(23.5f, 23.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.179f, -4.02f)
                lineTo(3.59f, 21.588f)
                arcToRelative(0.832f, 0.832f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.18f, -1.178f)
                lineToRelative(3.31f, -3.31f)
                arcToRelative(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.637f, -2.97f)
                curveToRelative(-1.41f, -3.37f, -1.43f, -7.141f, 1.63f, -10.288f)
                arcTo(8.77f, 8.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1.167f)
                moveTo(7.91f, 17.266f)
                arcToRelative(21.8f, 21.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.988f, 3.866f)
                arcToRelative(0.16f, 0.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.202f, 0f)
                curveToRelative(2.49f, -1.85f, 5.03f, -4.664f, 6.277f, -7.645f)
                curveToRelative(0.954f, -2.281f, 1.137f, -4.6f, 0.02f, -6.709f)
                close()
                moveTo(12f, 2.833f)
                arcToRelative(7.1f, 7.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.092f, 2.172f)
                curveToRelative(-2.466f, 2.537f, -2.516f, 5.54f, -1.286f, 8.482f)
                curveToRelative(0.344f, 0.823f, 0.788f, 1.631f, 1.3f, 2.411f)
                lineToRelative(3.53f, -3.528f)
                arcToRelative(2.833f, 2.833f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3.919f, -3.919f)
                lineToRelative(3.066f, -3.067f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.345f, -0.38f)
                arcTo(7.1f, 7.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2.834f)
                moveTo(10.833f, 10f)
                curveToRelative(0f, 0.54f, 0.366f, 0.991f, 0.863f, 1.125f)
                lineToRelative(1.429f, -1.429f)
                arcToRelative(1.166f, 1.166f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.292f, 0.304f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.908f, 5.005f)
                arcTo(7.1f, 7.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.833f)
                curveToRelative(1.905f, 0f, 3.737f, 0.779f, 5.092f, 2.172f)
                quadToRelative(0.181f, 0.188f, 0.345f, 0.379f)
                lineTo(14.37f, 8.45f)
                arcToRelative(2.833f, 2.833f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.919f, 3.919f)
                lineToRelative(-3.528f, 3.528f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.301f, -2.41f)
                curveToRelative(-1.23f, -2.942f, -1.18f, -5.946f, 1.286f, -8.483f)
                moveTo(11.9f, 21.132f)
                arcToRelative(21.8f, 21.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.989f, -3.866f)
                lineTo(18.398f, 6.778f)
                curveToRelative(1.117f, 2.11f, 0.934f, 4.428f, -0.02f, 6.71f)
                curveToRelative(-1.247f, 2.98f, -3.786f, 5.793f, -6.277f, 7.644f)
                arcToRelative(0.16f, 0.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.202f, 0f)
            }
        }.build()

        return _MapPinOff!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinOff: ImageVector? = null
