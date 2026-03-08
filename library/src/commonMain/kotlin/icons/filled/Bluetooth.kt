package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Bluetooth: ImageVector
    get() {
        if (_Bluetooth != null) {
            return _Bluetooth!!
        }
        _Bluetooth = ImageVector.Builder(
            name = "Filled.Bluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.37f, 10.665f)
                lineToRelative(-4.397f, -3.57f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.946f, 1.165f)
                lineToRelative(4.938f, 4.009f)
                lineToRelative(-4.966f, 4.456f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.002f, 1.116f)
                lineToRelative(4.368f, -3.92f)
                verticalLineTo(19.9f)
                curveToRelative(0f, 0.247f, 0f, 0.484f, 0.018f, 0.675f)
                curveToRelative(0.018f, 0.181f, 0.062f, 0.492f, 0.288f, 0.748f)
                curveToRelative(0.258f, 0.292f, 0.633f, 0.442f, 1.01f, 0.426f)
                curveToRelative(0.322f, -0.014f, 0.575f, -0.176f, 0.727f, -0.284f)
                curveToRelative(0.158f, -0.113f, 0.342f, -0.27f, 0.54f, -0.439f)
                lineToRelative(3.608f, -3.084f)
                curveToRelative(0.103f, -0.088f, 0.213f, -0.182f, 0.3f, -0.27f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.298f, -0.453f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.011f, -0.844f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.309f, -0.444f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.308f, -0.263f)
                lineToRelative(-4.256f, -3.456f)
                lineToRelative(4.347f, -3.901f)
                curveToRelative(0.096f, -0.087f, 0.2f, -0.18f, 0.282f, -0.267f)
                curveToRelative(0.091f, -0.097f, 0.21f, -0.24f, 0.28f, -0.442f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.01f, -0.821f)
                curveToRelative(-0.076f, -0.2f, -0.198f, -0.34f, -0.291f, -0.435f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.29f, -0.26f)
                lineToRelative(-3.64f, -3.112f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.54f, -0.439f)
                curveToRelative(-0.152f, -0.108f, -0.405f, -0.27f, -0.727f, -0.284f)
                arcToRelative(1.27f, 1.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.01f, 0.426f)
                curveToRelative(-0.226f, 0.256f, -0.27f, 0.567f, -0.288f, 0.748f)
                curveToRelative(-0.018f, 0.19f, -0.018f, 0.428f, -0.018f, 0.675f)
                close()
            }
        }.build()

        return _Bluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _Bluetooth: ImageVector? = null
