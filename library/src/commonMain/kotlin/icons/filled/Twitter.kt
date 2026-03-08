package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Twitter: ImageVector
    get() {
        if (_Twitter != null) {
            return _Twitter!!
        }
        _Twitter = ImageVector.Builder(
            name = "Filled.Twitter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.517f, 4.903f)
                curveToRelative(-1.271f, -1.12f, -2.966f, -1.074f, -4.423f, -0.526f)
                curveToRelative(-1.155f, 0.435f, -1.891f, 1.19f, -2.32f, 2.113f)
                curveToRelative(-0.306f, 0.661f, -0.446f, 1.389f, -0.498f, 2.112f)
                curveTo(8.9f, 8.459f, 6.811f, 7.276f, 5.411f, 5.31f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.652f, -0.313f)
                curveToRelative(-0.307f, 0.016f, -0.532f, 0.22f, -0.666f, 0.481f)
                quadToRelative(-0.046f, 0.088f, -0.12f, 0.246f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.354f, 0.875f)
                curveToRelative(-0.255f, 0.73f, -0.519f, 1.756f, -0.53f, 2.904f)
                curveToRelative(-0.012f, 1.154f, 0.233f, 2.446f, 1.007f, 3.676f)
                curveToRelative(0.599f, 0.95f, 1.494f, 1.832f, 2.769f, 2.578f)
                curveToRelative(-1.227f, 0.672f, -2.447f, 1.052f, -3.836f, 0.998f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.39f, 1.407f)
                curveToRelative(3.105f, 1.7f, 6.555f, 2.323f, 9.602f, 1.435f)
                curveToRelative(4.96f, -1.449f, 7.853f, -6.09f, 7.873f, -11.001f)
                quadToRelative(0.044f, -0.1f, 0.137f, -0.285f)
                quadToRelative(0.105f, -0.211f, 0.238f, -0.467f)
                quadToRelative(0.12f, -0.23f, 0.258f, -0.504f)
                curveToRelative(0.364f, -0.719f, 0.818f, -1.65f, 0.981f, -2.31f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, -0.853f)
                curveToRelative(-0.612f, 0.302f, -1.193f, 0.462f, -1.859f, 0.645f)
                close()
            }
        }.build()

        return _Twitter!!
    }

@Suppress("ObjectPropertyName")
private var _Twitter: ImageVector? = null
