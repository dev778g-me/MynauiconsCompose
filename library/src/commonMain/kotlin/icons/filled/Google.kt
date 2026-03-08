package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Google: ImageVector
    get() {
        if (_Google != null) {
            return _Google!!
        }
        _Google = ImageVector.Builder(
            name = "Filled.Google",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.183f, 2.75f)
                curveToRelative(-3.683f, 0f, -6.902f, 2.031f, -8.419f, 5.088f)
                arcToRelative(9.05f, 9.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.325f)
                curveToRelative(1.517f, 3.056f, 4.736f, 5.087f, 8.419f, 5.087f)
                curveToRelative(2.54f, 0f, 4.72f, -0.827f, 6.244f, -2.224f)
                curveToRelative(2.484f, -2.173f, 3.185f, -5.599f, 2.658f, -8.688f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.246f, -0.208f)
                horizontalLineToRelative(-8.656f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, 0.25f)
                verticalLineToRelative(3.33f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(4.768f)
                curveToRelative(-0.166f, 0.74f, -0.687f, 1.747f, -1.685f, 2.423f)
                lineToRelative(-0.008f, 0.005f)
                curveToRelative(-0.685f, 0.502f, -1.735f, 0.852f, -3.075f, 0.852f)
                curveToRelative(-2.936f, 0f, -5.275f, -2.455f, -5.275f, -5.33f)
                curveToRelative(0f, -2.783f, 2.472f, -5.24f, 5.275f, -5.24f)
                curveToRelative(1.67f, 0f, 2.72f, 0.683f, 3.429f, 1.29f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.337f, -0.011f)
                lineToRelative(2.578f, -2.52f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.011f, -0.368f)
                curveToRelative(-1.609f, -1.388f, -3.784f, -2.311f, -6.333f, -2.311f)
            }
        }.build()

        return _Google!!
    }

@Suppress("ObjectPropertyName")
private var _Google: ImageVector? = null
