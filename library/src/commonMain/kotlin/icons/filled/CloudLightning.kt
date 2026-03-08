package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CloudLightning: ImageVector
    get() {
        if (_CloudLightning != null) {
            return _CloudLightning!!
        }
        _CloudLightning = ImageVector.Builder(
            name = "Filled.CloudLightning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.596f, 8.388f)
                curveToRelative(-0.832f, -2.66f, -2.494f, -4.222f, -4.493f, -4.836f)
                curveToRelative(-2.087f, -0.641f, -4.42f, -0.215f, -6.354f, 0.832f)
                reflectiveCurveToRelative(-3.576f, 2.77f, -4.216f, 4.859f)
                curveToRelative(-0.651f, 2.13f, -0.228f, 4.533f, 1.773f, 6.796f)
                arcToRelative(6.14f, 6.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.72f, 2.211f)
                horizontalLineToRelative(4.012f)
                lineToRelative(-1.209f, 2.414f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.342f, 0.672f)
                lineToRelative(1.544f, -3.086f)
                horizontalLineToRelative(3.157f)
                curveToRelative(1.218f, 0f, 2.778f, -0.227f, 3.894f, -1.184f)
                curveToRelative(1.036f, -0.888f, 1.6f, -1.91f, 1.713f, -2.974f)
                curveToRelative(0.112f, -1.057f, -0.23f, -2.06f, -0.82f, -2.9f)
                curveToRelative(-1.065f, -1.52f, -3.012f, -2.627f, -5.063f, -2.804f)
                moveToRelative(-2.881f, 9.862f)
                horizontalLineToRelative(-1.677f)
                lineToRelative(0.75f, -1.5f)
                horizontalLineTo(9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.67f, -1.085f)
                lineToRelative(2.5f, -5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.342f, 0.67f)
                lineToRelative(-1.958f, 3.916f)
                horizontalLineToRelative(3.788f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.67f, 1.085f)
                close()
            }
        }.build()

        return _CloudLightning!!
    }

@Suppress("ObjectPropertyName")
private var _CloudLightning: ImageVector? = null
