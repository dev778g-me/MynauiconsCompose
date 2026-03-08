package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Earth: ImageVector
    get() {
        if (_Earth != null) {
            return _Earth!!
        }
        _Earth = ImageVector.Builder(
            name = "Filled.Earth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.467f, 8.63f)
                arcToRelative(5.73f, 5.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.938f, 2.044f)
                arcToRelative(5.73f, 5.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.14f, 3.939f)
                curveToRelative(-0.023f, 0.275f, 0.178f, 0.672f, 0.546f, 0.912f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.15f, 4.537f)
                arcTo(8.3f, 8.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20.25f)
                curveToRelative(2.054f, 0f, 3.932f, -0.75f, 5.376f, -1.992f)
                curveToRelative(-0.486f, -0.518f, -0.898f, -1.169f, -0.986f, -1.958f)
                curveToRelative(-0.09f, -0.816f, 0.136f, -1.396f, 0.47f, -1.864f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.42f, -0.51f)
                lineToRelative(0.033f, -0.037f)
                curveToRelative(0.142f, -0.16f, 0.254f, -0.289f, 0.347f, -0.428f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.216f, -1.107f)
                curveToRelative(-0.217f, -0.146f, -0.322f, -0.124f, -0.909f, 0f)
                lineToRelative(-0.11f, 0.024f)
                curveToRelative(-0.682f, 0.144f, -1.568f, 0.249f, -2.78f, -0.36f)
                arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.267f, -8.246f)
                arcToRelative(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.91f, 4.858f)
                moveToRelative(8.51f, -6.332f)
                quadToRelative(0.105f, -0.003f, 0.209f, 0.023f)
                curveTo(18.01f, 2.906f, 21.75f, 7.017f, 21.75f, 12f)
                curveToRelative(0f, 5.385f, -4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                reflectiveCurveTo(6.615f, 2.25f, 12f, 2.25f)
                quadToRelative(0.495f, 0f, 0.977f, 0.048f)
            }
        }.build()

        return _Earth!!
    }

@Suppress("ObjectPropertyName")
private var _Earth: ImageVector? = null
