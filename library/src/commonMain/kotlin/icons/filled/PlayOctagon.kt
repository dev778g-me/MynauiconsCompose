package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.PlayOctagon: ImageVector
    get() {
        if (_PlayOctagon != null) {
            return _PlayOctagon!!
        }
        _PlayOctagon = ImageVector.Builder(
            name = "Filled.PlayOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.037f, 2.408f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, -0.158f)
                horizontalLineToRelative(6.126f)
                curveToRelative(0.302f, 0f, 0.602f, 0.036f, 0.9f, 0.158f)
                reflectiveCurveToRelative(0.54f, 0.31f, 0.762f, 0.53f)
                lineToRelative(4.337f, 4.337f)
                curveToRelative(0.22f, 0.221f, 0.408f, 0.463f, 0.53f, 0.762f)
                curveToRelative(0.123f, 0.298f, 0.158f, 0.598f, 0.158f, 0.9f)
                verticalLineToRelative(6.126f)
                curveToRelative(0f, 0.313f, -0.039f, 0.616f, -0.163f, 0.914f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.525f, 0.748f)
                lineToRelative(-4.337f, 4.337f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.762f, 0.53f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, 0.158f)
                horizontalLineTo(8.937f)
                curveToRelative(-0.313f, 0f, -0.616f, -0.039f, -0.914f, -0.163f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.748f, -0.525f)
                lineToRelative(-4.337f, -4.337f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.53f, -0.762f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.158f, -0.9f)
                verticalLineTo(8.937f)
                curveToRelative(0f, -0.313f, 0.039f, -0.616f, 0.163f, -0.914f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.525f, -0.748f)
                lineToRelative(4.337f, -4.337f)
                curveToRelative(0.221f, -0.22f, 0.463f, -0.408f, 0.762f, -0.53f)
                moveToRelative(4.518f, 6.9f)
                curveToRelative(-0.292f, -0.177f, -0.6f, -0.365f, -0.88f, -0.465f)
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

        return _PlayOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _PlayOctagon: ImageVector? = null
