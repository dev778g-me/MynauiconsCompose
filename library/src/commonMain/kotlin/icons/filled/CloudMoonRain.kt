package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CloudMoonRain: ImageVector
    get() {
        if (_CloudMoonRain != null) {
            return _CloudMoonRain!!
        }
        _CloudMoonRain = ImageVector.Builder(
            name = "Filled.CloudMoonRain",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 21f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                moveTo(5.651f, 10.889f)
                curveToRelative(1.544f, -0.815f, 3.43f, -1.161f, 5.142f, -0.648f)
                curveToRelative(1.59f, 0.477f, 2.904f, 1.66f, 3.605f, 3.598f)
                curveToRelative(1.569f, 0.21f, 3.039f, 1.056f, 3.878f, 2.223f)
                curveToRelative(0.497f, 0.692f, 0.805f, 1.544f, 0.705f, 2.463f)
                curveToRelative(-0.1f, 0.93f, -0.604f, 1.785f, -1.458f, 2.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.283f, -1.535f)
                curveToRelative(0.543f, -0.454f, 0.719f, -0.866f, 0.753f, -1.181f)
                curveToRelative(0.036f, -0.326f, -0.064f, -0.695f, -0.34f, -1.079f)
                curveToRelative(-0.575f, -0.798f, -1.771f, -1.443f, -3.004f, -1.443f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.966f, -0.745f)
                curveToRelative(-0.461f, -1.75f, -1.426f, -2.573f, -2.464f, -2.885f)
                curveToRelative(-1.098f, -0.329f, -2.439f, -0.13f, -3.634f, 0.5f)
                curveToRelative(-1.196f, 0.631f, -2.105f, 1.62f, -2.44f, 2.689f)
                curveToRelative(-0.316f, 1.005f, -0.172f, 2.226f, 1.019f, 3.538f)
                lineToRelative(0.065f, 0.079f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.545f, 1.265f)
                lineToRelative(-0.29f, -0.335f)
                curveToRelative(-1.373f, -1.69f, -1.673f, -3.504f, -1.158f, -5.146f)
                curveToRelative(0.53f, -1.688f, 1.873f, -3.044f, 3.415f, -3.858f)
                moveTo(6.5f, 19f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                moveToRelative(6f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                moveTo(10f, 8.089f)
                curveToRelative(0f, -2.804f, 1.86f, -5.761f, 5.416f, -6.085f)
                lineToRelative(0.146f, -0.002f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.745f, 1.598f)
                curveToRelative(-0.953f, 1.27f, -0.64f, 2.725f, 0.338f, 3.696f)
                curveToRelative(0.98f, 0.972f, 2.465f, 1.293f, 3.766f, 0.345f)
                lineToRelative(0.123f, -0.078f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.462f, 0.979f)
                curveToRelative(-0.182f, 1.943f, -1.312f, 3.559f, -2.835f, 4.51f)
                lineToRelative(-0.089f, 0.05f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.97f, -1.745f)
                lineToRelative(0.192f, -0.127f)
                curveToRelative(0.41f, -0.289f, 0.764f, -0.647f, 1.044f, -1.055f)
                curveToRelative(-1.56f, 0.199f, -3.066f, -0.432f, -4.102f, -1.46f)
                curveToRelative(-1.04f, -1.032f, -1.68f, -2.542f, -1.466f, -4.1f)
                curveTo(12.618f, 5.372f, 12f, 6.705f, 12f, 8.09f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
            }
        }.build()

        return _CloudMoonRain!!
    }

@Suppress("ObjectPropertyName")
private var _CloudMoonRain: ImageVector? = null
