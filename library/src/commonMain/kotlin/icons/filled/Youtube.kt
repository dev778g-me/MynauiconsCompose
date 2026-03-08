package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Youtube: ImageVector
    get() {
        if (_Youtube != null) {
            return _Youtube!!
        }
        _Youtube = ImageVector.Builder(
            name = "Filled.Youtube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.443f, 4.381f)
                curveTo(7.84f, 4.25f, 9.637f, 4.25f, 11.96f, 4.25f)
                horizontalLineToRelative(0.082f)
                curveToRelative(2.322f, 0f, 4.119f, 0f, 5.516f, 0.131f)
                curveToRelative(1.407f, 0.133f, 2.517f, 0.406f, 3.409f, 1.03f)
                curveToRelative(0.928f, 0.65f, 1.377f, 1.511f, 1.587f, 2.607f)
                curveToRelative(0.197f, 1.024f, 0.197f, 2.321f, 0.197f, 3.907f)
                verticalLineToRelative(0.15f)
                curveToRelative(0f, 1.586f, 0f, 2.883f, -0.197f, 3.907f)
                curveToRelative(-0.21f, 1.096f, -0.659f, 1.957f, -1.587f, 2.607f)
                curveToRelative(-0.892f, 0.624f, -2.002f, 0.897f, -3.41f, 1.03f)
                curveToRelative(-1.396f, 0.131f, -3.193f, 0.131f, -5.515f, 0.131f)
                horizontalLineToRelative(-0.082f)
                curveToRelative(-2.322f, 0f, -4.119f, 0f, -5.516f, -0.131f)
                curveToRelative(-1.407f, -0.133f, -2.517f, -0.406f, -3.409f, -1.03f)
                curveToRelative(-0.928f, -0.65f, -1.377f, -1.511f, -1.587f, -2.607f)
                curveToRelative(-0.197f, -1.024f, -0.197f, -2.321f, -0.197f, -3.907f)
                verticalLineToRelative(-0.15f)
                curveToRelative(0f, -1.586f, 0f, -2.883f, 0.197f, -3.907f)
                curveToRelative(0.21f, -1.096f, 0.659f, -1.957f, 1.587f, -2.607f)
                curveToRelative(0.892f, -0.624f, 2.002f, -0.897f, 3.41f, -1.03f)
                moveToRelative(5.115f, 4.564f)
                arcToRelative(1.166f, 1.166f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.608f, 0.313f)
                curveToRelative(-0.13f, 0.191f, -0.2f, 0.418f, -0.2f, 0.65f)
                verticalLineToRelative(4.184f)
                arcToRelative(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.8f, 0.968f)
                lineToRelative(3.175f, -2.074f)
                arcToRelative(1.155f, 1.155f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.008f, -1.931f)
                close()
            }
        }.build()

        return _Youtube!!
    }

@Suppress("ObjectPropertyName")
private var _Youtube: ImageVector? = null
