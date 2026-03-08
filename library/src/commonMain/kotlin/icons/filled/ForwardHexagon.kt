package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ForwardHexagon: ImageVector
    get() {
        if (_ForwardHexagon != null) {
            return _ForwardHexagon!!
        }
        _ForwardHexagon = ImageVector.Builder(
            name = "Filled.ForwardHexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.75f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.32f, 0.355f)
                lineToRelative(-6.61f, 3.8f)
                lineToRelative(-0.002f, 0.002f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.75f, 8.198f)
                verticalLineToRelative(7.603f)
                arcToRelative(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.318f, 2.292f)
                lineToRelative(0.003f, 0.002f)
                lineToRelative(6.608f, 3.799f)
                horizontalLineToRelative(0.002f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.639f, 0f)
                horizontalLineToRelative(0.001f)
                lineToRelative(6.608f, -3.8f)
                horizontalLineToRelative(0.003f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.25f, 15.8f)
                lineTo(21.25f, 8.2f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.318f, -2.292f)
                lineToRelative(-6.61f, -3.8f)
                lineToRelative(-0.002f, -0.002f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1.75f)
                moveTo(9.603f, 9.338f)
                curveToRelative(0.183f, 0.112f, 0.366f, 0.229f, 0.532f, 0.345f)
                curveToRelative(0.189f, 0.133f, 0.388f, 0.287f, 0.581f, 0.445f)
                lineToRelative(0.04f, 0.033f)
                curveToRelative(0.301f, 0.245f, 0.599f, 0.488f, 0.811f, 0.735f)
                curveToRelative(0.254f, 0.295f, 0.433f, 0.648f, 0.433f, 1.104f)
                reflectiveCurveToRelative(-0.18f, 0.809f, -0.433f, 1.104f)
                curveToRelative(-0.212f, 0.247f, -0.51f, 0.49f, -0.81f, 0.736f)
                lineToRelative(-0.04f, 0.032f)
                curveToRelative(-0.194f, 0.158f, -0.393f, 0.312f, -0.582f, 0.445f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.532f, 0.345f)
                lineToRelative(-0.048f, 0.03f)
                curveToRelative(-0.292f, 0.177f, -0.6f, 0.365f, -0.88f, 0.465f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.586f, 0.09f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.632f, -0.24f)
                curveToRelative(-0.368f, -0.278f, -0.504f, -0.672f, -0.569f, -1.01f)
                curveToRelative(-0.061f, -0.314f, -0.084f, -0.711f, -0.109f, -1.144f)
                lineToRelative(-0.003f, -0.046f)
                arcTo(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.75f, 12f)
                curveToRelative(0f, -0.254f, 0.01f, -0.531f, 0.026f, -0.807f)
                lineToRelative(0.003f, -0.046f)
                curveToRelative(0.025f, -0.433f, 0.048f, -0.83f, 0.109f, -1.145f)
                curveToRelative(0.065f, -0.337f, 0.2f, -0.731f, 0.57f, -1.008f)
                curveToRelative(0.18f, -0.136f, 0.392f, -0.223f, 0.63f, -0.24f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.588f, 0.09f)
                curveToRelative(0.278f, 0.1f, 0.587f, 0.287f, 0.879f, 0.465f)
                close()
                moveTo(15.305f, 9.308f)
                lineTo(15.353f, 9.338f)
                curveToRelative(0.183f, 0.112f, 0.366f, 0.229f, 0.532f, 0.345f)
                curveToRelative(0.189f, 0.133f, 0.388f, 0.287f, 0.581f, 0.445f)
                lineToRelative(0.04f, 0.033f)
                curveToRelative(0.301f, 0.245f, 0.599f, 0.488f, 0.811f, 0.735f)
                curveToRelative(0.254f, 0.295f, 0.433f, 0.648f, 0.433f, 1.104f)
                reflectiveCurveToRelative(-0.18f, 0.809f, -0.433f, 1.104f)
                curveToRelative(-0.212f, 0.247f, -0.51f, 0.49f, -0.81f, 0.736f)
                lineToRelative(-0.04f, 0.032f)
                curveToRelative(-0.194f, 0.158f, -0.393f, 0.312f, -0.582f, 0.445f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.532f, 0.345f)
                lineToRelative(-0.048f, 0.03f)
                curveToRelative(-0.292f, 0.177f, -0.6f, 0.365f, -0.88f, 0.465f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.586f, 0.09f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.632f, -0.24f)
                curveToRelative(-0.368f, -0.278f, -0.504f, -0.672f, -0.569f, -1.01f)
                curveToRelative(-0.061f, -0.314f, -0.084f, -0.711f, -0.109f, -1.144f)
                lineToRelative(-0.002f, -0.046f)
                arcTo(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 12f)
                curveToRelative(0f, -0.254f, 0.01f, -0.531f, 0.027f, -0.807f)
                lineToRelative(0.002f, -0.046f)
                curveToRelative(0.025f, -0.433f, 0.048f, -0.83f, 0.109f, -1.145f)
                curveToRelative(0.065f, -0.337f, 0.2f, -0.731f, 0.57f, -1.008f)
                curveToRelative(0.18f, -0.136f, 0.392f, -0.223f, 0.63f, -0.24f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.588f, 0.09f)
                curveToRelative(0.278f, 0.1f, 0.587f, 0.287f, 0.879f, 0.465f)
            }
        }.build()

        return _ForwardHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _ForwardHexagon: ImageVector? = null
