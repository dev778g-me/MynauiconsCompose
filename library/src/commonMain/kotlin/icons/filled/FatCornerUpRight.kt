package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FatCornerUpRight: ImageVector
    get() {
        if (_FatCornerUpRight != null) {
            return _FatCornerUpRight!!
        }
        _FatCornerUpRight = ImageVector.Builder(
            name = "Filled.FatCornerUpRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.296f, 3.489f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.3f, 0.511f)
                verticalLineToRelative(4.064f)
                curveToRelative(-2.747f, 0.193f, -5.118f, 1.341f, -7.08f, 3.421f)
                curveToRelative(-2.126f, 2.253f, -3.341f, 5.054f, -3.662f, 8.366f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.336f, 0.534f)
                curveToRelative(2.188f, -2.793f, 4.004f, -4.196f, 5.438f, -4.515f)
                curveToRelative(1.393f, -0.309f, 2.714f, -0.39f, 3.969f, -0.252f)
                verticalLineTo(20f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.312f, 0.496f)
                lineToRelative(7.253f, -8.213f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.013f, -1.008f)
                close()
            }
        }.build()

        return _FatCornerUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _FatCornerUpRight: ImageVector? = null
