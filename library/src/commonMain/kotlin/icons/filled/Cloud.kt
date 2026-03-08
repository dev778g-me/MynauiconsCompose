package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Cloud: ImageVector
    get() {
        if (_Cloud != null) {
            return _Cloud!!
        }
        _Cloud = ImageVector.Builder(
            name = "Filled.Cloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.103f, 4.552f)
                curveToRelative(2f, 0.614f, 3.66f, 2.175f, 4.493f, 4.836f)
                curveToRelative(2.05f, 0.177f, 3.997f, 1.285f, 5.063f, 2.803f)
                curveToRelative(0.59f, 0.842f, 0.932f, 1.844f, 0.82f, 2.9f)
                curveToRelative(-0.113f, 1.066f, -0.677f, 2.087f, -1.713f, 2.975f)
                curveToRelative(-1.116f, 0.957f, -2.676f, 1.184f, -3.894f, 1.184f)
                horizontalLineTo(8.026f)
                arcToRelative(6.14f, 6.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.72f, -2.211f)
                curveToRelative(-2f, -2.263f, -2.424f, -4.666f, -1.773f, -6.796f)
                curveToRelative(0.64f, -2.09f, 2.28f, -3.812f, 4.216f, -4.86f)
                curveToRelative(1.935f, -1.046f, 4.267f, -1.472f, 6.354f, -0.831f)
            }
        }.build()

        return _Cloud!!
    }

@Suppress("ObjectPropertyName")
private var _Cloud: ImageVector? = null
