package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CloudMoon: ImageVector
    get() {
        if (_CloudMoon != null) {
            return _CloudMoon!!
        }
        _CloudMoon = ImageVector.Builder(
            name = "Filled.CloudMoon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.416f, 2.004f)
                curveTo(11.861f, 2.328f, 10f, 5.285f, 10f, 8.089f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                curveToRelative(0f, -1.384f, 0.617f, -2.717f, 1.77f, -3.474f)
                curveToRelative(-0.214f, 1.558f, 0.425f, 3.068f, 1.466f, 4.1f)
                curveToRelative(1.036f, 1.028f, 2.542f, 1.659f, 4.102f, 1.46f)
                curveToRelative(-0.28f, 0.408f, -0.634f, 0.766f, -1.044f, 1.054f)
                lineToRelative(-0.192f, 0.128f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.97f, 1.745f)
                lineToRelative(0.09f, -0.05f)
                curveToRelative(1.522f, -0.951f, 2.652f, -2.567f, 2.834f, -4.51f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.462f, -0.979f)
                lineToRelative(-0.123f, 0.078f)
                curveToRelative(-1.3f, 0.948f, -2.786f, 0.627f, -3.766f, -0.345f)
                curveToRelative(-0.978f, -0.97f, -1.29f, -2.425f, -0.338f, -3.696f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.744f, -1.598f)
                close()
                moveTo(5.651f, 10.889f)
                curveToRelative(1.544f, -0.815f, 3.43f, -1.161f, 5.142f, -0.648f)
                curveToRelative(1.59f, 0.477f, 2.904f, 1.66f, 3.605f, 3.598f)
                curveToRelative(1.569f, 0.21f, 3.038f, 1.056f, 3.878f, 2.223f)
                curveToRelative(0.497f, 0.692f, 0.805f, 1.544f, 0.705f, 2.463f)
                curveToRelative(-0.095f, 0.872f, -0.542f, 1.678f, -1.301f, 2.364f)
                lineToRelative(-0.157f, 0.135f)
                curveToRelative(-0.965f, 0.808f, -2.275f, 0.976f, -3.228f, 0.976f)
                lineTo(7.577f, 22f)
                arcToRelative(5.14f, 5.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.893f, -1.773f)
                curveToRelative(-1.62f, -1.782f, -1.997f, -3.728f, -1.448f, -5.48f)
                curveToRelative(0.53f, -1.688f, 1.873f, -3.044f, 3.415f, -3.858f)
            }
        }.build()

        return _CloudMoon!!
    }

@Suppress("ObjectPropertyName")
private var _CloudMoon: ImageVector? = null
