package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Store: ImageVector
    get() {
        if (_Store != null) {
            return _Store!!
        }
        _Store = ImageVector.Builder(
            name = "Filled.Store",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.993f, 2.25f)
                horizontalLineToRelative(9.959f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.66f, 2.056f)
                lineToRelative(1.044f, 4.007f)
                curveToRelative(0.247f, 0.944f, -0.01f, 1.771f, -0.57f, 2.36f)
                quadToRelative(-0.159f, 0.165f, -0.34f, 0.3f)
                verticalLineTo(19f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.75f, 2.75f)
                horizontalLineTo(6.004f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.254f, 19f)
                verticalLineToRelative(-8.026f)
                quadToRelative(-0.181f, -0.135f, -0.34f, -0.302f)
                curveToRelative(-0.56f, -0.588f, -0.817f, -1.415f, -0.57f, -2.36f)
                lineToRelative(1.044f, -4.006f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.66f, -2.056f)
                close()
                moveTo(12f, 10.746f)
                quadToRelative(-0.102f, 0.108f, -0.214f, 0.205f)
                curveToRelative(-0.576f, 0.496f, -1.32f, 0.725f, -2.035f, 0.725f)
                reflectiveCurveToRelative(-1.459f, -0.23f, -2.035f, -0.725f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.217f, -0.208f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.35f, 0.305f)
                curveToRelative(-0.65f, 0.47f, -1.463f, 0.624f, -2.204f, 0.554f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.19f, -0.023f)
                verticalLineTo(19f)
                curveToRelative(0f, 0.69f, 0.559f, 1.25f, 1.248f, 1.25f)
                horizontalLineToRelative(11.994f)
                curveToRelative(0.69f, 0f, 1.249f, -0.56f, 1.249f, -1.25f)
                verticalLineToRelative(-7.421f)
                quadToRelative(-0.096f, 0.014f, -0.19f, 0.023f)
                curveToRelative(-0.742f, 0.07f, -1.555f, -0.084f, -2.204f, -0.554f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.352f, -0.305f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.216f, 0.208f)
                curveToRelative(-0.576f, 0.496f, -1.32f, 0.725f, -2.035f, 0.725f)
                reflectiveCurveToRelative(-1.459f, -0.23f, -2.035f, -0.725f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.214f, -0.205f)
            }
        }.build()

        return _Store!!
    }

@Suppress("ObjectPropertyName")
private var _Store: ImageVector? = null
