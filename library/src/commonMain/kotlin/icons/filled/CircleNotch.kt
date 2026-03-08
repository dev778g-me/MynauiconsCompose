package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CircleNotch: ImageVector
    get() {
        if (_CircleNotch != null) {
            return _CircleNotch!!
        }
        _CircleNotch = ImageVector.Builder(
            name = "Filled.CircleNotch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.625f, 3.641f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.017f, -0.3f)
                arcToRelative(9.8f, 9.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.108f, 8.615f)
                curveToRelative(0f, 5.406f, -4.362f, 9.794f, -9.75f, 9.794f)
                reflectiveCurveToRelative(-9.75f, -4.388f, -9.75f, -9.794f)
                arcToRelative(9.8f, 9.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.108f, -8.615f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.717f, 1.318f)
                arcToRelative(8.3f, 8.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.325f, 7.297f)
                curveToRelative(0f, 4.584f, 3.697f, 8.294f, 8.25f, 8.294f)
                reflectiveCurveToRelative(8.25f, -3.71f, 8.25f, -8.294f)
                arcToRelative(8.3f, 8.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.325f, -7.297f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.3f, -1.018f)
            }
        }.build()

        return _CircleNotch!!
    }

@Suppress("ObjectPropertyName")
private var _CircleNotch: ImageVector? = null
