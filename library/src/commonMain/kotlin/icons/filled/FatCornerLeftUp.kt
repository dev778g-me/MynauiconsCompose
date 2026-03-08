package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FatCornerLeftUp: ImageVector
    get() {
        if (_FatCornerLeftUp != null) {
            return _FatCornerLeftUp!!
        }
        _FatCornerLeftUp = ImageVector.Builder(
            name = "Filled.FatCornerLeftUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.283f, 2.438f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.008f, 0.013f)
                lineTo(3.489f, 9.704f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.511f, 1.3f)
                horizontalLineToRelative(4.064f)
                curveToRelative(0.193f, 2.747f, 1.341f, 5.118f, 3.421f, 7.08f)
                curveToRelative(2.253f, 2.126f, 5.054f, 3.341f, 8.366f, 3.663f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.534f, -1.337f)
                curveToRelative(-2.793f, -2.188f, -4.196f, -4.004f, -4.515f, -5.438f)
                curveToRelative(-0.309f, -1.393f, -0.39f, -2.714f, -0.252f, -3.969f)
                horizontalLineTo(20f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.497f, -1.312f)
                close()
            }
        }.build()

        return _FatCornerLeftUp!!
    }

@Suppress("ObjectPropertyName")
private var _FatCornerLeftUp: ImageVector? = null
