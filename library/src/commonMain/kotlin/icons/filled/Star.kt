package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Star: ImageVector
    get() {
        if (_Star != null) {
            return _Star!!
        }
        _Star = ImageVector.Builder(
            name = "Filled.Star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.51f, 3.139f)
                curveToRelative(-0.652f, -1.185f, -2.368f, -1.185f, -3.021f, 0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.114f, 4.894f)
                arcToRelative(0.35f, 0.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.33f, 0.223f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.375f, 0.436f)
                curveToRelative(-1.337f, 0.233f, -1.926f, 1.837f, -0.91f, 2.83f)
                quadToRelative(0.192f, 0.188f, 0.388f, 0.374f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.103f, 2.587f)
                arcToRelative(0.274f, 0.274f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.11f, 0.31f)
                arcToRelative(27.6f, 27.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.172f, 5.065f)
                curveToRelative(-0.19f, 1.424f, 1.318f, 2.298f, 2.495f, 1.694f)
                arcToRelative(29.3f, 29.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.085f, -2.537f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.462f, 0f)
                arcToRelative(29f, 29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.085f, 2.537f)
                curveToRelative(1.177f, 0.604f, 2.685f, -0.27f, 2.495f, -1.694f)
                arcToRelative(27.6f, 27.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.171f, -5.065f)
                arcToRelative(0.274f, 0.274f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.11f, -0.31f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.49f, -2.96f)
                curveToRelative(1.016f, -0.994f, 0.427f, -2.598f, -0.91f, -2.831f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.376f, -0.436f)
                arcToRelative(0.35f, 0.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.329f, -0.223f)
                arcToRelative(27.7f, 27.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.114f, -4.894f)
            }
        }.build()

        return _Star!!
    }

@Suppress("ObjectPropertyName")
private var _Star: ImageVector? = null
