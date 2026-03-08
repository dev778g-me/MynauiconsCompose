package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CameraOff: ImageVector
    get() {
        if (_CameraOff != null) {
            return _CameraOff!!
        }
        _CameraOff = ImageVector.Builder(
            name = "Filled.CameraOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.256f, 3.748f)
                lineToRelative(-0.234f, 0.002f)
                curveToRelative(-0.487f, 0f, -0.813f, 0f, -1.066f, 0.018f)
                curveToRelative(-0.246f, 0.017f, -0.366f, 0.048f, -0.444f, 0.081f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.663f, 0.663f)
                curveToRelative(-0.033f, 0.078f, -0.064f, 0.198f, -0.08f, 0.444f)
                curveToRelative(-0.019f, 0.253f, -0.019f, 0.58f, -0.019f, 1.066f)
                verticalLineToRelative(9.734f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-9.76f)
                curveToRelative(0f, -0.454f, 0f, -0.833f, 0.022f, -1.145f)
                curveToRelative(0.022f, -0.324f, 0.071f, -0.63f, 0.197f, -0.926f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.925f, 2.47f)
                curveToRelative(0.296f, -0.126f, 0.602f, -0.175f, 0.926f, -0.197f)
                curveToRelative(0.312f, -0.022f, 0.691f, -0.022f, 1.146f, -0.022f)
                horizontalLineToRelative(0.025f)
                lineToRelative(0.131f, -0.001f)
                curveToRelative(0.212f, -0.004f, 0.515f, -0.009f, 0.794f, 0.036f)
                curveToRelative(0.933f, 0.152f, 1.54f, 0.743f, 1.969f, 1.158f)
                lineToRelative(0.122f, 0.118f)
                curveToRelative(0.463f, 0.441f, 0.792f, 0.689f, 1.345f, 0.689f)
                horizontalLineToRelative(4.309f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-4.309f)
                curveToRelative(-1.17f, 0f, -1.871f, -0.618f, -2.38f, -1.103f)
                lineToRelative(-0.079f, -0.075f)
                curveToRelative(-0.49f, -0.468f, -0.768f, -0.733f, -1.217f, -0.806f)
                curveToRelative(-0.136f, -0.022f, -0.262f, -0.02f, -0.451f, -0.018f)
                moveTo(15.25f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                lineTo(16f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                moveToRelative(5.22f, -0.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, 1.06f)
                lineToRelative(-1.042f, 1.042f)
                curveToRelative(0.23f, 0.142f, 0.438f, 0.324f, 0.613f, 0.539f)
                curveToRelative(0.427f, 0.522f, 0.649f, 1.203f, 0.649f, 1.889f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.686f, -0.222f, 1.367f, -0.649f, 1.89f)
                curveToRelative(-0.43f, 0.525f, -1.05f, 0.86f, -1.737f, 0.86f)
                lineTo(4.636f, 21.75f)
                curveToRelative(-0.375f, 0f, -0.732f, -0.1f, -1.048f, -0.277f)
                lineToRelative(-0.058f, 0.057f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -1.06f)
                close()
                moveTo(10.597f, 14.464f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.367f, -4.367f)
                close()
            }
        }.build()

        return _CameraOff!!
    }

@Suppress("ObjectPropertyName")
private var _CameraOff: ImageVector? = null
