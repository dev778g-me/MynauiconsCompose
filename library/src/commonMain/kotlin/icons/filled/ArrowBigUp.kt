package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ArrowBigUp: ImageVector
    get() {
        if (_ArrowBigUp != null) {
            return _ArrowBigUp!!
        }
        _ArrowBigUp = ImageVector.Builder(
            name = "Filled.ArrowBigUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.138f, 2.608f)
                arcToRelative(1.216f, 1.216f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.724f, 0f)
                lineToRelative(7.502f, 6.87f)
                lineToRelative(0.037f, 0.036f)
                curveToRelative(0.708f, 0.744f, 0.277f, 2.131f, -0.884f, 2.131f)
                horizontalLineToRelative(-3.569f)
                verticalLineToRelative(8.85f)
                curveToRelative(0f, 0.659f, -0.518f, 1.255f, -1.232f, 1.255f)
                horizontalLineTo(9.284f)
                curveToRelative(-0.714f, 0f, -1.232f, -0.596f, -1.232f, -1.256f)
                verticalLineToRelative(-8.849f)
                horizontalLineTo(4.483f)
                curveToRelative(-1.161f, 0f, -1.592f, -1.387f, -0.884f, -2.13f)
                lineToRelative(0.037f, -0.036f)
                close()
            }
        }.build()

        return _ArrowBigUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigUp: ImageVector? = null
