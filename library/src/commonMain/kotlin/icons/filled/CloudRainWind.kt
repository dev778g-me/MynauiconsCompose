package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CloudRainWind: ImageVector
    get() {
        if (_CloudRainWind != null) {
            return _CloudRainWind!!
        }
        _CloudRainWind = ImageVector.Builder(
            name = "Filled.CloudRainWind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.596f, 9.388f)
                curveToRelative(-0.832f, -2.66f, -2.494f, -4.222f, -4.493f, -4.836f)
                curveToRelative(-2.087f, -0.641f, -4.42f, -0.215f, -6.354f, 0.832f)
                reflectiveCurveToRelative(-3.576f, 2.77f, -4.216f, 4.859f)
                curveToRelative(-0.651f, 2.13f, -0.228f, 4.533f, 1.773f, 6.796f)
                arcToRelative(6.14f, 6.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.72f, 2.211f)
                horizontalLineToRelative(3.813f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.048f, -0.148f)
                lineToRelative(-1.044f, -4.89f)
                lineToRelative(-0.013f, -0.076f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.46f, -0.311f)
                lineToRelative(0.02f, 0.074f)
                lineToRelative(1.044f, 4.89f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.049f, 0.461f)
                horizontalLineToRelative(2.187f)
                lineToRelative(-0.65f, -3.039f)
                lineToRelative(-0.012f, -0.075f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.46f, -0.311f)
                lineToRelative(0.02f, 0.074f)
                lineToRelative(0.715f, 3.35f)
                curveToRelative(1.209f, -0.006f, 2.738f, -0.24f, 3.837f, -1.183f)
                curveToRelative(1.036f, -0.888f, 1.6f, -1.91f, 1.713f, -2.974f)
                curveToRelative(0.112f, -1.057f, -0.23f, -2.06f, -0.82f, -2.9f)
                curveToRelative(-1.065f, -1.52f, -3.012f, -2.627f, -5.063f, -2.804f)
                moveToRelative(-9.272f, 1.934f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.87f, 0.503f)
                lineToRelative(0.02f, 0.074f)
                lineToRelative(1.044f, 4.89f)
                lineToRelative(0.011f, 0.076f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.478f, 0.237f)
                lineToRelative(-1.044f, -4.89f)
                lineToRelative(-0.013f, -0.076f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.59f, -0.814f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.396f, 19.25f)
                lineToRelative(0.395f, 1.852f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.467f, -0.314f)
                lineToRelative(-0.329f, -1.538f)
                close()
                moveTo(11.839f, 19.25f)
                horizontalLineToRelative(1.37f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.37f, 0f)
            }
        }.build()

        return _CloudRainWind!!
    }

@Suppress("ObjectPropertyName")
private var _CloudRainWind: ImageVector? = null
