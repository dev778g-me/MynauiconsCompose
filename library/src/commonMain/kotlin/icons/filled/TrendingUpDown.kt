package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.TrendingUpDown: ImageVector
    get() {
        if (_TrendingUpDown != null) {
            return _TrendingUpDown!!
        }
        _TrendingUpDown = ImageVector.Builder(
            name = "Filled.TrendingUpDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.75f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.195f, 0.604f)
                lineToRelative(-0.085f, -0.074f)
                lineToRelative(-0.954f, -0.954f)
                lineToRelative(-2.38f, 2.416f)
                lineToRelative(2.383f, 2.428f)
                lineToRelative(0.95f, -0.95f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.281f, 0.53f)
                verticalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, 0.75f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.53f, -1.28f)
                lineToRelative(0.988f, -0.99f)
                lineToRelative(-2.374f, -2.42f)
                lineToRelative(-0.395f, 0.404f)
                lineToRelative(-0.002f, 0.002f)
                curveToRelative(-0.666f, 0.672f, -1.41f, 0.857f, -2.144f, 0.749f)
                curveToRelative(-0.652f, -0.096f, -1.286f, -0.427f, -1.768f, -0.667f)
                curveToRelative(-0.543f, -0.27f, -0.942f, -0.453f, -1.303f, -0.491f)
                curveToRelative(-0.283f, -0.03f, -0.573f, 0.025f, -0.928f, 0.397f)
                lineToRelative(-0.009f, 0.009f)
                lineToRelative(-4f, 4.063f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.07f, -1.052f)
                lineToRelative(4.002f, -4.063f)
                curveToRelative(0.666f, -0.694f, 1.408f, -0.925f, 2.161f, -0.846f)
                curveToRelative(0.678f, 0.07f, 1.321f, 0.394f, 1.816f, 0.64f)
                curveToRelative(0.553f, 0.276f, 0.952f, 0.472f, 1.317f, 0.525f)
                curveToRelative(0.283f, 0.042f, 0.544f, 0f, 0.86f, -0.32f)
                lineToRelative(3.834f, -3.894f)
                lineToRelative(-0.985f, -0.986f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 6.25f)
                horizontalLineToRelative(3f)
                lineToRelative(0.077f, 0.004f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.75f, 7f)
                close()
            }
        }.build()

        return _TrendingUpDown!!
    }

@Suppress("ObjectPropertyName")
private var _TrendingUpDown: ImageVector? = null
