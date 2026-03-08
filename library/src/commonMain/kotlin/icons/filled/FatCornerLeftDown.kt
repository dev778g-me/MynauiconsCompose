package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FatCornerLeftDown: ImageVector
    get() {
        if (_FatCornerLeftDown != null) {
            return _FatCornerLeftDown!!
        }
        _FatCornerLeftDown = ImageVector.Builder(
            name = "Filled.FatCornerLeftDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.62f, 2.721f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.235f, 0.87f)
                curveToRelative(-2.793f, 2.187f, -4.196f, 4.003f, -4.515f, 5.437f)
                curveToRelative(-0.309f, 1.393f, -0.39f, 2.714f, -0.252f, 3.969f)
                horizontalLineTo(20f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.497f, 1.312f)
                lineToRelative(-8.214f, 7.253f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.008f, -0.013f)
                lineToRelative(-7.786f, -7.253f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.511f, -1.3f)
                horizontalLineToRelative(4.064f)
                curveToRelative(0.193f, -2.747f, 1.341f, -5.118f, 3.421f, -7.08f)
                curveToRelative(2.253f, -2.126f, 5.054f, -3.341f, 8.366f, -3.663f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.768f, 0.468f)
            }
        }.build()

        return _FatCornerLeftDown!!
    }

@Suppress("ObjectPropertyName")
private var _FatCornerLeftDown: ImageVector? = null
