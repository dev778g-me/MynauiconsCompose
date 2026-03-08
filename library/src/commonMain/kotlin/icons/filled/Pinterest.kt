package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Pinterest: ImageVector
    get() {
        if (_Pinterest != null) {
            return _Pinterest!!
        }
        _Pinterest = ImageVector.Builder(
            name = "Filled.Pinterest",
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
                moveToRelative(4.999f, -3.331f)
                curveToRelative(1.049f, -1.557f, 2.99f, -2.576f, 5.78f, -2.18f)
                curveToRelative(1.608f, 0.23f, 2.78f, 1.039f, 3.517f, 2.135f)
                curveToRelative(0.726f, 1.08f, 1.006f, 2.398f, 0.93f, 3.647f)
                curveToRelative(-0.076f, 1.247f, -0.51f, 2.489f, -1.295f, 3.412f)
                curveToRelative(-0.8f, 0.94f, -1.96f, 1.54f, -3.388f, 1.435f)
                curveToRelative(-0.84f, -0.06f, -1.483f, -0.41f, -1.943f, -0.923f)
                curveToRelative(-0.375f, 1.53f, -0.762f, 3.138f, -1.08f, 4.48f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.46f, -0.347f)
                arcToRelative(645f, 645f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.6f, -6.587f)
                curveToRelative(-0.095f, -1.002f, 0.037f, -1.995f, 0.198f, -2.562f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.317f, -0.7f)
                curveToRelative(0.068f, -0.09f, 0.186f, -0.227f, 0.368f, -0.318f)
                arcToRelative(0.83f, 0.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.834f, 0.05f)
                curveToRelative(0.237f, 0.16f, 0.325f, 0.391f, 0.36f, 0.51f)
                curveToRelative(0.039f, 0.137f, 0.05f, 0.275f, 0.05f, 0.395f)
                curveToRelative(0f, 0.243f, -0.045f, 0.53f, -0.129f, 0.85f)
                curveToRelative(-0.134f, 0.516f, -0.297f, 1.157f, -0.476f, 1.872f)
                curveToRelative(0.073f, 0.5f, 0.218f, 0.929f, 0.437f, 1.234f)
                curveToRelative(0.217f, 0.301f, 0.526f, 0.514f, 1.033f, 0.55f)
                curveToRelative(0.9f, 0.066f, 1.612f, -0.293f, 2.136f, -0.91f)
                curveToRelative(0.54f, -0.635f, 0.88f, -1.55f, 0.94f, -2.531f)
                curveToRelative(0.06f, -0.979f, -0.165f, -1.959f, -0.677f, -2.72f)
                curveToRelative(-0.5f, -0.745f, -1.297f, -1.318f, -2.483f, -1.486f)
                curveToRelative(-2.281f, -0.324f, -3.63f, 0.5f, -4.326f, 1.532f)
                curveToRelative(-0.736f, 1.092f, -0.792f, 2.474f, -0.367f, 3.342f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.346f, 0.66f)
                curveToRelative(-0.683f, -1.393f, -0.54f, -3.344f, 0.47f, -4.84f)
            }
        }.build()

        return _Pinterest!!
    }

@Suppress("ObjectPropertyName")
private var _Pinterest: ImageVector? = null
