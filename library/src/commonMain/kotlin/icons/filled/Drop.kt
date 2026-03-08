package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Drop: ImageVector
    get() {
        if (_Drop != null) {
            return _Drop!!
        }
        _Drop = ImageVector.Builder(
            name = "Filled.Drop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.024f, 2.468f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.058f, 0f)
                curveToRelative(-0.508f, 0.506f, -1.04f, 1.002f, -1.594f, 1.52f)
                curveToRelative(-0.428f, 0.4f, -0.87f, 0.813f, -1.327f, 1.254f)
                curveToRelative(-1.015f, 0.98f, -2.032f, 2.036f, -2.863f, 3.18f)
                curveToRelative(-1.677f, 2.306f, -2.642f, 5.043f, -1.301f, 8.264f)
                curveTo(6.15f, 19.734f, 9.208f, 21.75f, 12.5f, 21.75f)
                reflectiveCurveToRelative(6.35f, -2.016f, 7.62f, -5.064f)
                curveToRelative(1.341f, -3.223f, 0.374f, -5.96f, -1.305f, -8.267f)
                curveToRelative(-0.832f, -1.143f, -1.85f, -2.2f, -2.866f, -3.179f)
                curveToRelative(-0.457f, -0.44f, -0.901f, -0.854f, -1.33f, -1.254f)
                arcToRelative(68f, 68f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.595f, -1.518f)
            }
        }.build()

        return _Drop!!
    }

@Suppress("ObjectPropertyName")
private var _Drop: ImageVector? = null
