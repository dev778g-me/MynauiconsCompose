package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ShieldOff: ImageVector
    get() {
        if (_ShieldOff != null) {
            return _ShieldOff!!
        }
        _ShieldOff = ImageVector.Builder(
            name = "Filled.ShieldOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.775f, 2.49f)
                arcToRelative(1.37f, 1.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.55f, 0f)
                lineToRelative(-0.61f, 0.417f)
                arcToRelative(11.3f, 11.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.234f, 1.92f)
                arcToRelative(1.264f, 1.264f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.131f, 1.26f)
                verticalLineToRelative(4.93f)
                curveToRelative(0f, 2.091f, 0.904f, 4.027f, 2.035f, 5.637f)
                lineTo(2.47f, 20.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(3.68f, -3.678f)
                curveToRelative(1.423f, 1.69f, 2.998f, 2.961f, 3.807f, 3.568f)
                arcToRelative(1.63f, 1.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.966f, 0f)
                curveToRelative(0.841f, -0.63f, 2.511f, -1.98f, 3.977f, -3.772f)
                curveToRelative(1.455f, -1.778f, 2.79f, -4.09f, 2.79f, -6.63f)
                verticalLineTo(6.086f)
                curveToRelative(0f, -0.221f, -0.057f, -0.433f, -0.16f, -0.617f)
                lineToRelative(1.94f, -1.94f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, -1.06f)
                lineTo(18.168f, 4.77f)
                arcToRelative(11.3f, 11.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.783f, -1.864f)
                close()
            }
        }.build()

        return _ShieldOff!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldOff: ImageVector? = null
