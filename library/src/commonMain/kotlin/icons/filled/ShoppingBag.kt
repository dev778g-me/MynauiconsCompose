package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ShoppingBag: ImageVector
    get() {
        if (_ShoppingBag != null) {
            return _ShoppingBag!!
        }
        _ShoppingBag = ImageVector.Builder(
            name = "Filled.ShoppingBag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.815f, 5f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(0.412f)
                curveToRelative(1.451f, 0f, 2.68f, 1.101f, 2.786f, 2.553f)
                lineToRelative(0.73f, 10f)
                curveToRelative(0.117f, 1.609f, -1.182f, 2.947f, -2.786f, 2.947f)
                horizontalLineTo(7.043f)
                curveToRelative(-1.604f, 0f, -2.903f, -1.338f, -2.786f, -2.947f)
                lineToRelative(0.73f, -10f)
                curveTo(5.093f, 7.35f, 6.322f, 6.25f, 7.773f, 6.25f)
                horizontalLineToRelative(0.412f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.534f, 1.266f, -2.75f, 2.794f, -2.75f)
                horizontalLineToRelative(2.043f)
                curveToRelative(1.527f, 0f, 2.793f, 1.216f, 2.793f, 2.75f)
                moveToRelative(-6.13f, 0f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(4.63f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.675f, -0.564f, -1.25f, -1.293f, -1.25f)
                horizontalLineToRelative(-2.043f)
                curveToRelative(-0.73f, 0f, -1.294f, 0.575f, -1.294f, 1.25f)
            }
        }.build()

        return _ShoppingBag!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingBag: ImageVector? = null
