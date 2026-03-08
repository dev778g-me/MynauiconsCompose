package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Rectangle: ImageVector
    get() {
        if (_Rectangle != null) {
            return _Rectangle!!
        }
        _Rectangle = ImageVector.Builder(
            name = "Filled.Rectangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.125f, 3.75f)
                curveToRelative(-0.813f, 0f, -1.468f, 0f, -2f, 0.043f)
                curveToRelative(-0.546f, 0.045f, -1.026f, 0.14f, -1.47f, 0.366f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.64f, 1.639f)
                curveToRelative(-0.225f, 0.444f, -0.32f, 0.924f, -0.364f, 1.47f)
                curveToRelative(-0.044f, 0.531f, -0.044f, 1.187f, -0.044f, 2f)
                verticalLineToRelative(5.464f)
                curveToRelative(0f, 0.813f, 0f, 1.469f, 0.044f, 2f)
                curveToRelative(0.044f, 0.546f, 0.139f, 1.026f, 0.365f, 1.47f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.639f, 1.64f)
                curveToRelative(0.444f, 0.226f, 0.924f, 0.32f, 1.47f, 0.365f)
                curveToRelative(0.532f, 0.043f, 1.187f, 0.043f, 2f, 0.043f)
                horizontalLineToRelative(9.75f)
                curveToRelative(0.813f, 0f, 1.468f, 0f, 2f, -0.043f)
                curveToRelative(0.546f, -0.045f, 1.026f, -0.14f, 1.47f, -0.366f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.64f, -1.639f)
                curveToRelative(0.226f, -0.444f, 0.32f, -0.924f, 0.364f, -1.47f)
                curveToRelative(0.044f, -0.531f, 0.044f, -1.187f, 0.044f, -2f)
                verticalLineTo(9.268f)
                curveToRelative(0f, -0.813f, 0f, -1.469f, -0.044f, -2f)
                curveToRelative(-0.044f, -0.546f, -0.139f, -1.026f, -0.365f, -1.47f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.639f, -1.64f)
                curveToRelative(-0.444f, -0.226f, -0.924f, -0.32f, -1.47f, -0.365f)
                curveToRelative(-0.532f, -0.043f, -1.187f, -0.043f, -2f, -0.043f)
                close()
            }
        }.build()

        return _Rectangle!!
    }

@Suppress("ObjectPropertyName")
private var _Rectangle: ImageVector? = null
