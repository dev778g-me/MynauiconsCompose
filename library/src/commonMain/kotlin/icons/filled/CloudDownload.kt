package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CloudDownload: ImageVector
    get() {
        if (_CloudDownload != null) {
            return _CloudDownload!!
        }
        _CloudDownload = ImageVector.Builder(
            name = "Filled.CloudDownload",
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
                horizontalLineToRelative(1.125f)
                lineToRelative(2.28f, 2.28f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.061f, 0f)
                lineToRelative(2.28f, -2.28f)
                horizontalLineToRelative(2.1f)
                curveToRelative(1.218f, 0f, 2.778f, -0.227f, 3.894f, -1.184f)
                curveToRelative(1.036f, -0.888f, 1.6f, -1.91f, 1.713f, -2.974f)
                curveToRelative(0.112f, -1.057f, -0.23f, -2.06f, -0.82f, -2.9f)
                curveToRelative(-1.065f, -1.52f, -3.012f, -2.627f, -5.063f, -2.804f)
                moveToRelative(-1.823f, 9.862f)
                horizontalLineTo(9.15f)
                lineToRelative(-0.901f, -0.902f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, -1.06f)
                lineToRelative(1.902f, 1.902f)
                lineToRelative(0.004f, -7.054f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                lineToRelative(-0.004f, 7.053f)
                lineToRelative(1.902f, -1.901f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 1.06f)
                close()
            }
        }.build()

        return _CloudDownload!!
    }

@Suppress("ObjectPropertyName")
private var _CloudDownload: ImageVector? = null
