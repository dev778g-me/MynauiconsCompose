package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Cloudy: ImageVector
    get() {
        if (_Cloudy != null) {
            return _Cloudy!!
        }
        _Cloudy = ImageVector.Builder(
            name = "Filled.Cloudy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.555f, 2.815f)
                curveToRelative(-1.47f, -0.69f, -3.155f, -0.703f, -4.696f, -0.28f)
                curveToRelative(-1.541f, 0.421f, -3f, 1.292f, -4.043f, 2.456f)
                curveTo(4.86f, 6.056f, 4.227f, 7.4f, 4.252f, 8.88f)
                curveToRelative(-1.43f, 1.154f, -2.535f, 2.726f, -2.886f, 4.532f)
                curveToRelative(-0.382f, 1.97f, 0.155f, 4.112f, 1.948f, 6.136f)
                arcToRelative(6.14f, 6.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.712f, 2.203f)
                horizontalLineToRelative(8.846f)
                curveToRelative(1.217f, 0f, 2.778f, -0.227f, 3.894f, -1.184f)
                lineToRelative(0.256f, -0.23f)
                curveToRelative(1.223f, -1.167f, 1.657f, -2.524f, 1.414f, -3.847f)
                curveToRelative(-0.18f, -0.972f, -0.712f, -1.852f, -1.434f, -2.573f)
                quadToRelative(0.104f, -0.072f, 0.203f, -0.151f)
                lineToRelative(0.166f, -0.14f)
                curveToRelative(0.805f, -0.706f, 1.263f, -1.519f, 1.36f, -2.383f)
                curveToRelative(0.102f, -0.915f, -0.211f, -1.772f, -0.735f, -2.478f)
                curveToRelative(-0.93f, -1.257f, -2.607f, -2.158f, -4.366f, -2.32f)
                curveToRelative(-0.613f, -1.796f, -1.713f, -2.988f, -3.075f, -3.629f)
                moveToRelative(-0.639f, 1.358f)
                curveToRelative(1.05f, 0.494f, 1.964f, 1.473f, 2.43f, 3.19f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.724f, 0.553f)
                curveToRelative(1.522f, 0f, 2.997f, 0.765f, 3.721f, 1.741f)
                curveToRelative(0.353f, 0.477f, 0.5f, 0.964f, 0.45f, 1.418f)
                curveToRelative(-0.045f, 0.391f, -0.245f, 0.846f, -0.747f, 1.32f)
                lineToRelative(-0.234f, 0.206f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.54f, 0.316f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.76f, -0.401f)
                lineToRelative(-0.39f, -0.165f)
                arcToRelative(7.2f, 7.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.975f, -0.462f)
                curveToRelative(-0.927f, -2.966f, -2.88f, -4.554f, -5.155f, -5.004f)
                curveToRelative(-1.85f, -0.366f, -3.836f, 0.036f, -5.548f, 0.927f)
                curveToRelative(0.184f, -0.647f, 0.541f, -1.263f, 1.04f, -1.819f)
                curveToRelative(0.838f, -0.935f, 2.04f, -1.66f, 3.323f, -2.012f)
                curveToRelative(1.284f, -0.351f, 2.589f, -0.313f, 3.661f, 0.192f)
            }
        }.build()

        return _Cloudy!!
    }

@Suppress("ObjectPropertyName")
private var _Cloudy: ImageVector? = null
