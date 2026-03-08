package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.PlayHexagon: ImageVector
    get() {
        if (_PlayHexagon != null) {
            return _PlayHexagon!!
        }
        _PlayHexagon = ImageVector.Builder(
            name = "Filled.PlayHexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.68f, 2.105f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.64f, 0f)
                lineToRelative(0.001f, 0.001f)
                lineToRelative(6.611f, 3.8f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.25f, 8.2f)
                verticalLineToRelative(7.603f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.318f, 2.291f)
                lineToRelative(-0.003f, 0.002f)
                lineToRelative(-6.608f, 3.799f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.639f, 0f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-6.608f, -3.8f)
                horizontalLineToRelative(-0.003f)
                arcTo(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.75f, 15.8f)
                lineTo(2.75f, 8.198f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.318f, -2.291f)
                lineToRelative(0.003f, -0.002f)
                close()
                moveTo(12.555f, 9.309f)
                curveToRelative(-0.292f, -0.178f, -0.6f, -0.366f, -0.88f, -0.466f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.586f, -0.09f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.632f, 0.24f)
                curveToRelative(-0.368f, 0.278f, -0.504f, 0.672f, -0.569f, 1.01f)
                curveToRelative(-0.061f, 0.314f, -0.084f, 0.711f, -0.109f, 1.144f)
                lineToRelative(-0.003f, 0.046f)
                curveToRelative(-0.015f, 0.276f, -0.026f, 0.553f, -0.026f, 0.807f)
                reflectiveCurveToRelative(0.01f, 0.531f, 0.026f, 0.807f)
                lineToRelative(0.003f, 0.046f)
                curveToRelative(0.025f, 0.433f, 0.048f, 0.83f, 0.109f, 1.145f)
                curveToRelative(0.065f, 0.337f, 0.2f, 0.731f, 0.57f, 1.008f)
                curveToRelative(0.18f, 0.136f, 0.392f, 0.223f, 0.63f, 0.24f)
                curveToRelative(0.225f, 0.017f, 0.426f, -0.031f, 0.588f, -0.09f)
                curveToRelative(0.278f, -0.1f, 0.587f, -0.287f, 0.879f, -0.465f)
                lineToRelative(0.048f, -0.03f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.113f, -0.789f)
                lineToRelative(0.04f, -0.033f)
                curveToRelative(0.301f, -0.245f, 0.599f, -0.488f, 0.811f, -0.735f)
                curveToRelative(0.254f, -0.295f, 0.433f, -0.648f, 0.433f, -1.104f)
                reflectiveCurveToRelative(-0.18f, -0.809f, -0.433f, -1.104f)
                curveToRelative(-0.212f, -0.247f, -0.51f, -0.49f, -0.81f, -0.735f)
                lineToRelative(-0.04f, -0.033f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.582f, -0.445f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.532f, -0.345f)
                close()
            }
        }.build()

        return _PlayHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _PlayHexagon: ImageVector? = null
