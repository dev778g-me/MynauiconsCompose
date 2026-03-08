package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Moon: ImageVector
    get() {
        if (_Moon != null) {
            return _Moon!!
        }
        _Moon = ImageVector.Builder(
            name = "Filled.Moon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.712f, 3.45f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.668f, -1.197f)
                curveToRelative(-5.414f, 0.494f, -8.436f, 4.752f, -8.764f, 9.105f)
                curveToRelative(-0.328f, 4.361f, 2.037f, 8.975f, 7.451f, 10.166f)
                curveToRelative(5.686f, 1.25f, 11.472f, -2.837f, 12.016f, -8.646f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.189f, -0.676f)
                curveToRelative(-2.837f, 2.069f, -6.08f, 1.316f, -8.136f, -0.724f)
                curveToRelative(-2.054f, -2.039f, -2.8f, -5.239f, -0.71f, -8.028f)
            }
        }.build()

        return _Moon!!
    }

@Suppress("ObjectPropertyName")
private var _Moon: ImageVector? = null
