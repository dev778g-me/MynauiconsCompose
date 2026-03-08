package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.DangerTriangle: ImageVector
    get() {
        if (_DangerTriangle != null) {
            return _DangerTriangle!!
        }
        _DangerTriangle = ImageVector.Builder(
            name = "Filled.DangerTriangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.583f, 4.507f)
                curveTo(9.538f, 3.159f, 10.582f, 2.25f, 12f, 2.25f)
                reflectiveCurveToRelative(2.462f, 0.91f, 3.417f, 2.257f)
                curveToRelative(0.948f, 1.338f, 1.953f, 3.318f, 3.24f, 5.852f)
                lineToRelative(0.39f, 0.769f)
                curveToRelative(1.065f, 2.098f, 1.904f, 3.75f, 2.344f, 5.076f)
                curveToRelative(0.448f, 1.348f, 0.55f, 2.552f, -0.121f, 3.623f)
                curveToRelative(-0.67f, 1.066f, -1.801f, 1.511f, -3.22f, 1.719f)
                curveToRelative(-1.398f, 0.204f, -3.272f, 0.204f, -5.656f, 0.204f)
                horizontalLineToRelative(-0.788f)
                curveToRelative(-2.384f, 0f, -4.258f, 0f, -5.656f, -0.204f)
                curveToRelative(-1.419f, -0.208f, -2.55f, -0.653f, -3.22f, -1.72f)
                curveToRelative(-0.671f, -1.07f, -0.569f, -2.274f, -0.12f, -3.622f)
                curveToRelative(0.44f, -1.325f, 1.278f, -2.978f, 2.344f, -5.076f)
                lineToRelative(0.39f, -0.768f)
                curveToRelative(1.286f, -2.535f, 2.29f, -4.515f, 3.24f, -5.853f)
                moveTo(12.75f, 8.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                lineTo(11.25f, 14f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
                moveTo(12.75f, 16.747f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
            }
        }.build()

        return _DangerTriangle!!
    }

@Suppress("ObjectPropertyName")
private var _DangerTriangle: ImageVector? = null
