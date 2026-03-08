package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.UserSettings: ImageVector
    get() {
        if (_UserSettings != null) {
            return _UserSettings!!
        }
        _UserSettings = ImageVector.Builder(
            name = "Filled.UserSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3.75f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 7.5f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -7.5f)
                moveToRelative(8.249f, 16.712f)
                curveToRelative(-0.262f, -5.148f, -4.307f, -7.712f, -8.249f, -7.712f)
                reflectiveCurveToRelative(-7.987f, 2.563f, -8.249f, 7.712f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 0.787f)
                curveToRelative(3.365f, 0.171f, 12.998f, 0.106f, 15.077f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.711f, -0.787f)
                moveToRelative(-8.876f, -5.325f)
                curveToRelative(0.18f, -0.075f, 0.386f, -0.137f, 0.627f, -0.137f)
                reflectiveCurveToRelative(0.446f, 0.062f, 0.627f, 0.137f)
                curveToRelative(0.159f, 0.066f, 0.334f, 0.16f, 0.511f, 0.254f)
                lineToRelative(0.18f, 0.096f)
                curveToRelative(0.177f, 0.094f, 0.353f, 0.188f, 0.495f, 0.282f)
                curveToRelative(0.16f, 0.106f, 0.332f, 0.247f, 0.465f, 0.458f)
                curveToRelative(0.134f, 0.215f, 0.183f, 0.433f, 0.204f, 0.628f)
                curveToRelative(0.018f, 0.167f, 0.018f, 0.36f, 0.018f, 0.546f)
                verticalLineToRelative(0.198f)
                curveToRelative(0f, 0.186f, 0f, 0.38f, -0.018f, 0.546f)
                curveToRelative(-0.02f, 0.195f, -0.07f, 0.413f, -0.204f, 0.628f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.465f, 0.458f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.495f, 0.282f)
                lineToRelative(-0.18f, 0.096f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.511f, 0.254f)
                curveToRelative(-0.18f, 0.076f, -0.386f, 0.137f, -0.627f, 0.137f)
                reflectiveCurveToRelative(-0.446f, -0.061f, -0.627f, -0.137f)
                curveToRelative(-0.159f, -0.066f, -0.334f, -0.16f, -0.511f, -0.254f)
                lineToRelative(-0.18f, -0.096f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.495f, -0.282f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.465f, -0.458f)
                arcToRelative(1.44f, 1.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.204f, -0.628f)
                curveToRelative(-0.018f, -0.167f, -0.018f, -0.36f, -0.018f, -0.546f)
                verticalLineTo(17.4f)
                curveToRelative(0f, -0.186f, 0f, -0.38f, 0.018f, -0.546f)
                curveToRelative(0.02f, -0.195f, 0.07f, -0.413f, 0.204f, -0.628f)
                curveToRelative(0.133f, -0.211f, 0.305f, -0.352f, 0.465f, -0.458f)
                curveToRelative(0.143f, -0.094f, 0.318f, -0.188f, 0.495f, -0.282f)
                lineToRelative(0.18f, -0.096f)
                curveToRelative(0.177f, -0.094f, 0.352f, -0.188f, 0.511f, -0.254f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.545f, 16.727f)
                curveToRelative(0.209f, -0.111f, 0.321f, -0.17f, 0.407f, -0.206f)
                lineToRelative(0.048f, -0.018f)
                quadToRelative(0.014f, 0.004f, 0.048f, 0.018f)
                curveToRelative(0.086f, 0.036f, 0.198f, 0.095f, 0.408f, 0.206f)
                lineToRelative(0.133f, 0.071f)
                curveToRelative(0.21f, 0.112f, 0.32f, 0.172f, 0.396f, 0.222f)
                lineToRelative(0.007f, 0.005f)
                quadToRelative(0.005f, 0.046f, 0.006f, 0.14f)
                curveToRelative(0.002f, 0.073f, 0.002f, 0.157f, 0.002f, 0.264f)
                verticalLineToRelative(0.142f)
                curveToRelative(0f, 0.107f, 0f, 0.191f, -0.002f, 0.263f)
                quadToRelative(0f, 0.096f, -0.006f, 0.142f)
                lineToRelative(-0.007f, 0.004f)
                curveToRelative(-0.075f, 0.05f, -0.186f, 0.11f, -0.396f, 0.222f)
                lineToRelative(-0.133f, 0.07f)
                curveToRelative(-0.21f, 0.112f, -0.322f, 0.171f, -0.408f, 0.207f)
                lineToRelative(-0.048f, 0.018f)
                lineToRelative(-0.048f, -0.018f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.408f, -0.206f)
                lineToRelative(-0.133f, -0.071f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.396f, -0.222f)
                lineToRelative(-0.007f, -0.005f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.006f, -0.14f)
                curveTo(11f, 17.761f, 11f, 17.677f, 11f, 17.57f)
                verticalLineToRelative(-0.142f)
                curveToRelative(0f, -0.107f, 0f, -0.191f, 0.002f, -0.263f)
                quadToRelative(0f, -0.096f, 0.006f, -0.142f)
                lineToRelative(0.007f, -0.004f)
                curveToRelative(0.075f, -0.05f, 0.186f, -0.11f, 0.396f, -0.222f)
                close()
            }
        }.build()

        return _UserSettings!!
    }

@Suppress("ObjectPropertyName")
private var _UserSettings: ImageVector? = null
