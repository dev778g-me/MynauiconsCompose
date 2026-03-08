package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ArrowBigLeft: ImageVector
    get() {
        if (_ArrowBigLeft != null) {
            return _ArrowBigLeft!!
        }
        _ArrowBigLeft = ImageVector.Builder(
            name = "Filled.ArrowBigLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.645f, 4.483f)
                curveToRelative(0f, -1.16f, -1.387f, -1.592f, -2.13f, -0.884f)
                lineToRelative(-0.036f, 0.037f)
                lineToRelative(-6.87f, 7.502f)
                arcToRelative(1.216f, 1.216f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.724f)
                lineToRelative(6.87f, 7.502f)
                lineToRelative(0.035f, 0.037f)
                curveToRelative(0.744f, 0.708f, 2.131f, 0.277f, 2.131f, -0.884f)
                verticalLineToRelative(-3.569f)
                horizontalLineToRelative(8.85f)
                curveToRelative(0.659f, 0f, 1.255f, -0.518f, 1.255f, -1.232f)
                verticalLineTo(9.284f)
                curveToRelative(0f, -0.714f, -0.596f, -1.232f, -1.256f, -1.232f)
                horizontalLineToRelative(-8.849f)
                close()
            }
        }.build()

        return _ArrowBigLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigLeft: ImageVector? = null
