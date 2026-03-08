package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FatCornerDownRight: ImageVector
    get() {
        if (_FatCornerDownRight != null) {
            return _FatCornerDownRight!!
        }
        _FatCornerDownRight = ImageVector.Builder(
            name = "Filled.FatCornerDownRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.309f, 3.504f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.997f, 4f)
                verticalLineToRelative(4.382f)
                curveToRelative(-1.255f, 0.138f, -2.576f, 0.057f, -3.969f, -0.252f)
                curveToRelative(-1.434f, -0.318f, -3.25f, -1.722f, -5.438f, -4.515f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.336f, 0.535f)
                curveToRelative(0.32f, 3.311f, 1.536f, 6.112f, 3.661f, 8.365f)
                curveToRelative(1.963f, 2.08f, 4.334f, 3.228f, 7.082f, 3.422f)
                verticalLineTo(20f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.299f, 0.511f)
                lineToRelative(7.253f, -7.786f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.013f, -1.008f)
                close()
            }
        }.build()

        return _FatCornerDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _FatCornerDownRight: ImageVector? = null
