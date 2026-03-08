package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FunnyGhost: ImageVector
    get() {
        if (_FunnyGhost != null) {
            return _FunnyGhost!!
        }
        _FunnyGhost = ImageVector.Builder(
            name = "Filled.FunnyGhost",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12.044f)
                verticalLineToRelative(6.517f)
                curveToRelative(0f, 0.764f, 0.308f, 1.57f, 0.8f, 2.127f)
                curveToRelative(0.501f, 0.567f, 1.354f, 1.012f, 2.287f, 0.543f)
                curveToRelative(0.696f, -0.35f, 1.275f, -0.363f, 1.746f, -0.047f)
                curveToRelative(1.126f, 0.755f, 2.708f, 0.755f, 3.834f, 0f)
                curveToRelative(0.345f, -0.23f, 0.607f, -0.308f, 0.825f, -0.31f)
                curveToRelative(0.218f, -0.001f, 0.485f, 0.072f, 0.84f, 0.31f)
                curveToRelative(1.127f, 0.755f, 2.709f, 0.755f, 3.835f, 0f)
                curveToRelative(0.213f, -0.142f, 0.58f, -0.237f, 1.044f, -0.226f)
                curveToRelative(0.454f, 0.01f, 0.898f, 0.12f, 1.202f, 0.273f)
                curveToRelative(0.933f, 0.469f, 1.786f, 0.024f, 2.287f, -0.543f)
                curveToRelative(0.492f, -0.557f, 0.8f, -1.363f, 0.8f, -2.126f)
                verticalLineToRelative(-6.518f)
                curveToRelative(0f, -5.405f, -4.362f, -9.794f, -9.75f, -9.794f)
                reflectiveCurveToRelative(-9.75f, 4.389f, -9.75f, 9.794f)
                moveToRelative(14.516f, 0.934f)
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
                moveToRelative(-3.027f, 3.303f)
                lineToRelative(-0.147f, -0.299f)
                quadToRelative(0.721f, -0.26f, 1.366f, -0.62f)
                lineToRelative(0.127f, 0.258f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.346f, 0.66f)
                moveTo(9.329f, 10f)
                lineToRelative(0.103f, 0.489f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.467f, 0.311f)
                lineToRelative(-0.104f, -0.489f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.328f, 10f)
                moveToRelative(4f, -1.618f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.89f, 0.578f)
                lineToRelative(0.104f, 0.489f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.467f, 0.312f)
                lineToRelative(-0.104f, -0.49f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.578f, -0.889f)
            }
        }.build()

        return _FunnyGhost!!
    }

@Suppress("ObjectPropertyName")
private var _FunnyGhost: ImageVector? = null
