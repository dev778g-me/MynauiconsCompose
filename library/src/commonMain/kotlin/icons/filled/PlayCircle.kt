package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.PlayCircle: ImageVector
    get() {
        if (_PlayCircle != null) {
            return _PlayCircle!!
        }
        _PlayCircle = ImageVector.Builder(
            name = "Filled.PlayCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, 5.385f, 4.365f, 9.75f, 9.75f, 9.75f)
                reflectiveCurveToRelative(9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                reflectiveCurveTo(2.25f, 6.615f, 2.25f, 12f)
                moveToRelative(10.305f, -2.691f)
                lineToRelative(0.048f, 0.03f)
                curveToRelative(0.183f, 0.11f, 0.366f, 0.228f, 0.532f, 0.344f)
                curveToRelative(0.189f, 0.133f, 0.388f, 0.287f, 0.581f, 0.445f)
                lineToRelative(0.04f, 0.033f)
                curveToRelative(0.301f, 0.245f, 0.599f, 0.488f, 0.811f, 0.735f)
                curveToRelative(0.254f, 0.295f, 0.433f, 0.648f, 0.433f, 1.104f)
                reflectiveCurveToRelative(-0.18f, 0.809f, -0.433f, 1.104f)
                curveToRelative(-0.212f, 0.247f, -0.51f, 0.49f, -0.81f, 0.735f)
                lineToRelative(-0.04f, 0.033f)
                curveToRelative(-0.194f, 0.158f, -0.393f, 0.312f, -0.582f, 0.445f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.532f, 0.345f)
                lineToRelative(-0.048f, 0.03f)
                curveToRelative(-0.292f, 0.177f, -0.6f, 0.365f, -0.88f, 0.465f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.586f, 0.09f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.632f, -0.24f)
                curveToRelative(-0.368f, -0.278f, -0.504f, -0.672f, -0.569f, -1.01f)
                curveToRelative(-0.061f, -0.314f, -0.084f, -0.711f, -0.109f, -1.144f)
                lineToRelative(-0.003f, -0.046f)
                arcTo(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.75f, 12f)
                curveToRelative(0f, -0.254f, 0.01f, -0.531f, 0.026f, -0.807f)
                lineToRelative(0.003f, -0.046f)
                curveToRelative(0.025f, -0.433f, 0.048f, -0.83f, 0.109f, -1.145f)
                curveToRelative(0.065f, -0.337f, 0.2f, -0.731f, 0.57f, -1.008f)
                curveToRelative(0.18f, -0.136f, 0.392f, -0.223f, 0.63f, -0.24f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.588f, 0.09f)
                curveToRelative(0.278f, 0.1f, 0.587f, 0.287f, 0.879f, 0.465f)
            }
        }.build()

        return _PlayCircle!!
    }

@Suppress("ObjectPropertyName")
private var _PlayCircle: ImageVector? = null
