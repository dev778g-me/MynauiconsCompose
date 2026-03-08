package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Cart: ImageVector
    get() {
        if (_Cart != null) {
            return _Cart!!
        }
        _Cart = ImageVector.Builder(
            name = "Filled.Cart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.787f, 2.28f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.932f, 0.507f)
                lineToRelative(0.55f, 1.863f)
                horizontalLineToRelative(14.655f)
                curveToRelative(1.84f, 0f, 3.245f, 1.717f, 2.715f, 3.51f)
                lineToRelative(-1.655f, 5.6f)
                curveToRelative(-0.352f, 1.193f, -1.471f, 1.99f, -2.715f, 1.99f)
                horizontalLineTo(8.113f)
                curveToRelative(-1.244f, 0f, -2.362f, -0.797f, -2.715f, -1.99f)
                lineTo(2.281f, 3.212f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.506f, -0.931f)
                moveTo(6.25f, 19.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, 0f)
                moveToRelative(8f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, 0f)
            }
        }.build()

        return _Cart!!
    }

@Suppress("ObjectPropertyName")
private var _Cart: ImageVector? = null
