package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.RupeeHexagon: ImageVector
    get() {
        if (_RupeeHexagon != null) {
            return _RupeeHexagon!!
        }
        _RupeeHexagon = ImageVector.Builder(
            name = "Filled.RupeeHexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.68f, 2.105f)
                lineToRelative(-6.61f, 3.8f)
                lineToRelative(-0.002f, 0.002f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.75f, 8.198f)
                verticalLineToRelative(7.603f)
                arcToRelative(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.318f, 2.292f)
                lineToRelative(0.003f, 0.002f)
                lineToRelative(6.608f, 3.799f)
                horizontalLineToRelative(0.002f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.639f, 0f)
                horizontalLineToRelative(0.001f)
                lineToRelative(6.608f, -3.8f)
                horizontalLineToRelative(0.003f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.25f, 15.8f)
                verticalLineTo(8.2f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.318f, -2.292f)
                lineToRelative(-6.61f, -3.8f)
                lineToRelative(-0.002f, -0.002f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.64f, 0f)
                moveTo(8.25f, 7.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 6.75f)
                horizontalLineToRelative(6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-1.794f)
                curveToRelative(0.238f, 0.393f, 0.395f, 0.83f, 0.476f, 1.278f)
                horizontalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-1.318f)
                arcToRelative(3.65f, 3.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.721f, 1.628f)
                arcToRelative(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.214f, 1.141f)
                lineToRelative(3.045f, 3.185f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.084f, 1.036f)
                lineToRelative(-4.25f, -4.444f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12.306f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.6f, 0f, 1.012f, -0.24f, 1.29f, -0.587f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.352f, -0.691f)
                horizontalLineTo(9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(3.142f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.352f, -0.691f)
                curveToRelative(-0.278f, -0.347f, -0.69f, -0.587f, -1.29f, -0.587f)
                horizontalLineTo(9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
            }
        }.build()

        return _RupeeHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _RupeeHexagon: ImageVector? = null
