package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Speaker: ImageVector
    get() {
        if (_Speaker != null) {
            return _Speaker!!
        }
        _Speaker = ImageVector.Builder(
            name = "Filled.Speaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.409f, 12.409f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3.182f, 3.183f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.182f, -3.183f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.899f, 2.425f)
                curveToRelative(1.049f, -0.175f, 2.382f, -0.175f, 4.034f, -0.175f)
                horizontalLineToRelative(0.134f)
                curveToRelative(1.652f, 0f, 2.985f, 0f, 4.034f, 0.175f)
                curveToRelative(1.104f, 0.184f, 1.99f, 0.577f, 2.671f, 1.423f)
                curveToRelative(0.663f, 0.822f, 0.952f, 1.85f, 1.09f, 3.134f)
                curveTo(20f, 8.247f, 20f, 9.872f, 20f, 11.953f)
                verticalLineToRelative(0.094f)
                curveToRelative(0f, 2.082f, 0f, 3.706f, -0.137f, 4.971f)
                curveToRelative(-0.14f, 1.284f, -0.428f, 2.312f, -1.09f, 3.134f)
                curveToRelative(-0.682f, 0.846f, -1.568f, 1.239f, -2.672f, 1.423f)
                curveToRelative(-1.049f, 0.175f, -2.382f, 0.175f, -4.034f, 0.175f)
                horizontalLineToRelative(-0.134f)
                curveToRelative(-1.652f, 0f, -2.985f, 0f, -4.034f, -0.175f)
                curveToRelative(-1.104f, -0.184f, -1.99f, -0.576f, -2.671f, -1.422f)
                curveToRelative(-0.663f, -0.823f, -0.952f, -1.851f, -1.09f, -3.134f)
                curveTo(4f, 15.753f, 4f, 14.128f, 4f, 12.046f)
                verticalLineToRelative(-0.094f)
                curveToRelative(0f, -2.081f, 0f, -3.706f, 0.137f, -4.971f)
                curveToRelative(0.14f, -1.284f, 0.428f, -2.312f, 1.09f, -3.134f)
                curveToRelative(0.682f, -0.846f, 1.568f, -1.239f, 2.672f, -1.423f)
                moveTo(11.5f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
                moveTo(12f, 10.25f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 7.5f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -7.5f)
            }
        }.build()

        return _Speaker!!
    }

@Suppress("ObjectPropertyName")
private var _Speaker: ImageVector? = null
