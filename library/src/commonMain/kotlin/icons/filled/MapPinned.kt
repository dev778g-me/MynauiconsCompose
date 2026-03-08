package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MapPinned: ImageVector
    get() {
        if (_MapPinned != null) {
            return _MapPinned!!
        }
        _MapPinned = ImageVector.Builder(
            name = "Filled.MapPinned",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.127f, 16.255f)
                arcToRelative(0.834f, 0.834f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.118f, 0.372f)
                lineToRelative(2f, 4f)
                arcToRelative(0.835f, 0.835f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.745f, 1.206f)
                horizontalLineToRelative(-15f)
                arcToRelative(0.833f, 0.833f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.745f, -1.206f)
                lineToRelative(2f, -4f)
                arcToRelative(0.834f, 0.834f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.49f, 0.746f)
                lineTo(5.85f, 20.167f)
                horizontalLineToRelative(12.3f)
                lineToRelative(-1.396f, -2.794f)
                lineToRelative(-0.034f, -0.078f)
                arcToRelative(0.833f, 0.833f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.406f, -1.04f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.167f)
                curveToRelative(1.848f, 0f, 3.602f, 0.806f, 4.883f, 2.21f)
                curveToRelative(2.348f, 2.577f, 2.32f, 5.652f, 1.253f, 8.375f)
                curveToRelative(-1.056f, 2.693f, -3.154f, 5.144f, -5.17f, 6.742f)
                arcToRelative(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.932f, 0f)
                curveToRelative(-2.016f, -1.598f, -4.113f, -4.049f, -5.17f, -6.742f)
                curveTo(4.796f, 9.029f, 4.77f, 5.954f, 7.117f, 3.378f)
                curveTo(8.397f, 1.973f, 10.152f, 1.167f, 12f, 1.167f)
                moveToRelative(0f, 10.666f)
                arcToRelative(2.833f, 2.833f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -5.666f)
                arcToRelative(2.833f, 2.833f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.666f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.167f, 9f)
                arcToRelative(1.167f, 1.167f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.335f, 0f)
                arcToRelative(1.167f, 1.167f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.335f, 0f)
            }
        }.build()

        return _MapPinned!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinned: ImageVector? = null
