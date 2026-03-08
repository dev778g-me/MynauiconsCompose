package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FatCornerUpLeft: ImageVector
    get() {
        if (_FatCornerUpLeft != null) {
            return _FatCornerUpLeft!!
        }
        _FatCornerUpLeft = ImageVector.Builder(
            name = "Filled.FatCornerUpLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.003f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.299f, -0.511f)
                lineToRelative(-7.253f, 7.786f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.013f, 1.008f)
                lineToRelative(7.253f, 8.213f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.003f, 20f)
                verticalLineToRelative(-4.382f)
                curveToRelative(1.255f, -0.138f, 2.576f, -0.057f, 3.969f, 0.252f)
                curveToRelative(1.434f, 0.319f, 3.25f, 1.722f, 5.438f, 4.515f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.337f, -0.535f)
                curveToRelative(-0.322f, -3.311f, -1.537f, -6.113f, -3.662f, -8.365f)
                curveToRelative(-1.963f, -2.08f, -4.334f, -3.228f, -7.082f, -3.421f)
                close()
            }
        }.build()

        return _FatCornerUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _FatCornerUpLeft: ImageVector? = null
