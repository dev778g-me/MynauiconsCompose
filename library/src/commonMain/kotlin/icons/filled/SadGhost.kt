package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SadGhost: ImageVector
    get() {
        if (_SadGhost != null) {
            return _SadGhost!!
        }
        _SadGhost = ImageVector.Builder(
            name = "Filled.SadGhost",
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
                moveToRelative(6.303f, 3.354f)
                arcTo(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14.25f)
                curveToRelative(1.285f, 0f, 2.474f, 0.427f, 3.447f, 1.148f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.894f, 1.204f)
                arcTo(4.27f, 4.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15.75f)
                arcToRelative(4.27f, 4.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.553f, 0.852f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.894f, -1.204f)
                moveTo(10.25f, 10f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                moveToRelative(4.25f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
            }
        }.build()

        return _SadGhost!!
    }

@Suppress("ObjectPropertyName")
private var _SadGhost: ImageVector? = null
