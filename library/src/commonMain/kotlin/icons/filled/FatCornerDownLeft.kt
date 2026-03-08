package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FatCornerDownLeft: ImageVector
    get() {
        if (_FatCornerDownLeft != null) {
            return _FatCornerDownLeft!!
        }
        _FatCornerDownLeft = ImageVector.Builder(
            name = "Filled.FatCornerDownLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.003f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.312f, -0.496f)
                lineToRelative(-7.253f, 8.214f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.013f, 1.007f)
                lineToRelative(7.253f, 7.786f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.3f, -0.511f)
                verticalLineToRelative(-4.063f)
                curveToRelative(2.747f, -0.194f, 5.118f, -1.342f, 7.08f, -3.422f)
                curveToRelative(2.126f, -2.253f, 3.341f, -5.054f, 3.663f, -8.365f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.337f, -0.535f)
                curveToRelative(-2.188f, 2.793f, -4.004f, 4.197f, -5.438f, 4.515f)
                curveToRelative(-1.393f, 0.309f, -2.714f, 0.39f, -3.969f, 0.252f)
                close()
            }
        }.build()

        return _FatCornerDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _FatCornerDownLeft: ImageVector? = null
