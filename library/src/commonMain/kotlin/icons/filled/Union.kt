package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Union: ImageVector
    get() {
        if (_Union != null) {
            return _Union!!
        }
        _Union = ImageVector.Builder(
            name = "Filled.Union",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.768f, 2.25f)
                curveToRelative(-0.813f, 0f, -1.469f, 0f, -2f, 0.043f)
                curveToRelative(-0.546f, 0.045f, -1.026f, 0.14f, -1.47f, 0.366f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.64f, 1.639f)
                curveToRelative(-0.226f, 0.444f, -0.32f, 0.924f, -0.365f, 1.47f)
                curveToRelative(-0.043f, 0.531f, -0.043f, 1.187f, -0.043f, 2f)
                verticalLineToRelative(2.164f)
                curveToRelative(0f, 0.813f, 0f, 1.469f, 0.043f, 2f)
                curveToRelative(0.045f, 0.546f, 0.14f, 1.026f, 0.366f, 1.47f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.639f, 1.64f)
                curveToRelative(0.444f, 0.226f, 0.924f, 0.32f, 1.47f, 0.365f)
                curveToRelative(0.531f, 0.043f, 1.187f, 0.043f, 2f, 0.043f)
                horizontalLineToRelative(0.782f)
                verticalLineToRelative(0.782f)
                curveToRelative(0f, 0.813f, 0f, 1.469f, 0.043f, 2f)
                curveToRelative(0.045f, 0.546f, 0.14f, 1.026f, 0.366f, 1.47f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.639f, 1.64f)
                curveToRelative(0.444f, 0.226f, 0.924f, 0.32f, 1.47f, 0.365f)
                curveToRelative(0.531f, 0.043f, 1.187f, 0.043f, 2f, 0.043f)
                horizontalLineToRelative(2.164f)
                curveToRelative(0.813f, 0f, 1.469f, 0f, 2f, -0.043f)
                curveToRelative(0.546f, -0.045f, 1.026f, -0.14f, 1.47f, -0.366f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.64f, -1.639f)
                curveToRelative(0.226f, -0.444f, 0.32f, -0.924f, 0.365f, -1.47f)
                curveToRelative(0.043f, -0.531f, 0.043f, -1.187f, 0.043f, -2f)
                verticalLineToRelative(-2.164f)
                curveToRelative(0f, -0.813f, 0f, -1.469f, -0.043f, -2f)
                curveToRelative(-0.045f, -0.546f, -0.14f, -1.026f, -0.366f, -1.47f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.639f, -1.64f)
                curveToRelative(-0.444f, -0.226f, -0.924f, -0.32f, -1.47f, -0.365f)
                curveToRelative(-0.531f, -0.043f, -1.187f, -0.043f, -2f, -0.043f)
                horizontalLineToRelative(-0.782f)
                verticalLineToRelative(-0.782f)
                curveToRelative(0f, -0.813f, 0f, -1.469f, -0.043f, -2f)
                curveToRelative(-0.045f, -0.546f, -0.14f, -1.026f, -0.366f, -1.47f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.639f, -1.64f)
                curveToRelative(-0.444f, -0.226f, -0.924f, -0.32f, -1.47f, -0.365f)
                curveToRelative(-0.531f, -0.043f, -1.187f, -0.043f, -2f, -0.043f)
                close()
            }
        }.build()

        return _Union!!
    }

@Suppress("ObjectPropertyName")
private var _Union: ImageVector? = null
