package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ArrowBigRight: ImageVector
    get() {
        if (_ArrowBigRight != null) {
            return _ArrowBigRight!!
        }
        _ArrowBigRight = ImageVector.Builder(
            name = "Filled.ArrowBigRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.486f, 3.6f)
                curveToRelative(-0.744f, -0.71f, -2.131f, -0.278f, -2.131f, 0.883f)
                verticalLineToRelative(3.569f)
                horizontalLineToRelative(-8.85f)
                curveToRelative(-0.659f, 0f, -1.255f, 0.518f, -1.255f, 1.232f)
                verticalLineToRelative(5.432f)
                curveToRelative(0f, 0.714f, 0.596f, 1.232f, 1.256f, 1.232f)
                horizontalLineToRelative(8.849f)
                verticalLineToRelative(3.569f)
                curveToRelative(0f, 1.16f, 1.387f, 1.592f, 2.13f, 0.884f)
                lineToRelative(0.036f, -0.037f)
                lineToRelative(6.87f, -7.502f)
                arcToRelative(1.216f, 1.216f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.724f)
                lineToRelative(-6.87f, -7.502f)
                close()
            }
        }.build()

        return _ArrowBigRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigRight: ImageVector? = null
