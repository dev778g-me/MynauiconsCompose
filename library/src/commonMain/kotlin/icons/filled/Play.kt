package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Play: ImageVector
    get() {
        if (_Play != null) {
            return _Play!!
        }
        _Play = ImageVector.Builder(
            name = "Filled.Play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.503f, 7.01f)
                lineToRelative(-0.066f, -0.04f)
                curveToRelative(-0.748f, -0.455f, -1.406f, -0.856f, -1.97f, -1.058f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.976f, -0.157f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.963f, 0.37f)
                curveToRelative(-0.579f, 0.434f, -0.829f, 1.073f, -0.966f, 1.78f)
                curveToRelative(-0.133f, 0.685f, -0.184f, 1.577f, -0.247f, 2.663f)
                lineToRelative(-0.003f, 0.056f)
                curveToRelative(-0.038f, 0.65f, -0.062f, 1.293f, -0.062f, 1.876f)
                reflectiveCurveToRelative(0.024f, 1.227f, 0.062f, 1.877f)
                lineToRelative(0.003f, 0.055f)
                curveToRelative(0.063f, 1.086f, 0.114f, 1.978f, 0.247f, 2.662f)
                curveToRelative(0.137f, 0.708f, 0.387f, 1.346f, 0.966f, 1.781f)
                curveToRelative(0.286f, 0.215f, 0.607f, 0.343f, 0.963f, 0.37f)
                curveToRelative(0.342f, 0.025f, 0.67f, -0.047f, 0.976f, -0.157f)
                curveToRelative(0.564f, -0.202f, 1.222f, -0.603f, 1.97f, -1.057f)
                lineToRelative(0.066f, -0.04f)
                curveToRelative(0.426f, -0.26f, 0.844f, -0.527f, 1.217f, -0.79f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.335f, -1.022f)
                lineToRelative(0.05f, -0.041f)
                curveToRelative(0.764f, -0.623f, 1.412f, -1.152f, 1.86f, -1.672f)
                curveToRelative(0.488f, -0.57f, 0.785f, -1.182f, 0.785f, -1.966f)
                reflectiveCurveToRelative(-0.297f, -1.397f, -0.786f, -1.966f)
                curveToRelative(-0.447f, -0.52f, -1.095f, -1.05f, -1.858f, -1.672f)
                lineToRelative(-0.05f, -0.041f)
                curveToRelative(-0.454f, -0.37f, -0.91f, -0.724f, -1.336f, -1.022f)
                arcToRelative(23f, 23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.217f, -0.79f)
            }
        }.build()

        return _Play!!
    }

@Suppress("ObjectPropertyName")
private var _Play: ImageVector? = null
