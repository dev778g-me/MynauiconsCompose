package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FatCornerRightUp: ImageVector
    get() {
        if (_FatCornerRightUp != null) {
            return _FatCornerRightUp!!
        }
        _FatCornerRightUp = ImageVector.Builder(
            name = "Filled.FatCornerRightUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.725f, 2.451f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.007f, -0.013f)
                lineTo(3.504f, 9.69f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 11.003f)
                horizontalLineToRelative(4.382f)
                curveToRelative(0.138f, 1.255f, 0.057f, 2.576f, -0.252f, 3.969f)
                curveToRelative(-0.318f, 1.434f, -1.722f, 3.25f, -4.515f, 5.438f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.535f, 1.337f)
                curveToRelative(3.311f, -0.322f, 6.112f, -1.537f, 8.365f, -3.662f)
                curveToRelative(2.08f, -1.963f, 3.228f, -4.334f, 3.422f, -7.082f)
                horizontalLineTo(20f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.511f, -1.299f)
                close()
            }
        }.build()

        return _FatCornerRightUp!!
    }

@Suppress("ObjectPropertyName")
private var _FatCornerRightUp: ImageVector? = null
