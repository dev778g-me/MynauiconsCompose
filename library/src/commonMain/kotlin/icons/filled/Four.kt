package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Four: ImageVector
    get() {
        if (_Four != null) {
            return _Four!!
        }
        _Four = ImageVector.Builder(
            name = "Filled.Four",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.117f, 6.277f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.522f, 0.924f)
                curveToRelative(-0.555f, 1.997f, -1.653f, 3.8f, -2.59f, 5.085f)
                curveToRelative(-0.225f, 0.309f, -0.443f, 0.59f, -0.644f, 0.839f)
                horizontalLineToRelative(2.283f)
                verticalLineTo(12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(1.125f)
                horizontalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-0.812f)
                verticalLineTo(17f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-2.375f)
                horizontalLineTo(8.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.53f, -1.28f)
                lineToRelative(0.005f, -0.006f)
                lineToRelative(0.023f, -0.023f)
                lineToRelative(0.093f, -0.097f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.496f, -1.817f)
                curveToRelative(0.886f, -1.215f, 1.87f, -2.85f, 2.357f, -4.603f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.923f, -0.522f)
            }
        }.build()

        return _Four!!
    }

@Suppress("ObjectPropertyName")
private var _Four: ImageVector? = null
