package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Funny: ImageVector
    get() {
        if (_Funny != null) {
            return _Funny!!
        }
        _Funny = ImageVector.Builder(
            name = "Filled.Funny",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.25f)
                curveToRelative(-5.385f, 0f, -9.75f, 4.365f, -9.75f, 9.75f)
                reflectiveCurveToRelative(4.365f, 9.75f, 9.75f, 9.75f)
                reflectiveCurveToRelative(9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                moveToRelative(1.33f, 6.133f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.89f, 0.578f)
                lineToRelative(0.103f, 0.489f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.467f, 0.312f)
                lineToRelative(-0.104f, -0.49f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.578f, -0.889f)
                moveToRelative(-4.891f, 1.04f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.89f, 0.578f)
                lineToRelative(0.103f, 0.489f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.467f, 0.311f)
                lineToRelative(-0.104f, -0.489f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.578f, -0.89f)
                moveToRelative(8.327f, 3.555f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.017f, 1.06f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.536f, 0.476f)
                lineToRelative(0.218f, 0.445f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.039f, 1.983f)
                lineToRelative(-0.273f, -0.557f)
                arcToRelative(8.9f, 8.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.801f, -0.087f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.364f, -1.455f)
                curveToRelative(1.13f, 0.283f, 2.429f, 0.287f, 3.746f, -0.066f)
                reflectiveCurveToRelative(2.44f, -1.005f, 3.278f, -1.816f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0.017f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.592f, 15.982f)
                quadToRelative(0.721f, -0.26f, 1.366f, -0.62f)
                lineToRelative(0.127f, 0.258f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.346f, 0.66f)
                close()
            }
        }.build()

        return _Funny!!
    }

@Suppress("ObjectPropertyName")
private var _Funny: ImageVector? = null
