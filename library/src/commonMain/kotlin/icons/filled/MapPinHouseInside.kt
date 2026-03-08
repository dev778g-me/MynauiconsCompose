package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MapPinHouseInside: ImageVector
    get() {
        if (_MapPinHouseInside != null) {
            return _MapPinHouseInside!!
        }
        _MapPinHouseInside = ImageVector.Builder(
            name = "Filled.MapPinHouseInside",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.417f, 9.063f)
                verticalLineTo(11f)
                arcToRelative(0.167f, 0.167f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.167f, 0.167f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.167f, 0.167f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.167f, -0.167f)
                verticalLineTo(9.063f)
                lineTo(12f, 8.031f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.286f, 3.843f)
                arcTo(8.77f, 8.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1.167f)
                arcToRelative(8.77f, 8.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.286f, 2.676f)
                curveToRelative(-3.06f, 3.147f, -3.04f, 6.919f, -1.63f, 10.288f)
                curveToRelative(1.393f, 3.33f, 4.163f, 6.363f, 6.822f, 8.339f)
                arcToRelative(1.83f, 1.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.188f, 0f)
                curveToRelative(2.66f, -1.976f, 5.43f, -5.01f, 6.822f, -8.34f)
                curveToRelative(1.41f, -3.368f, 1.43f, -7.14f, -1.63f, -10.287f)
                moveToRelative(-5.036f, 8.99f)
                horizontalLineToRelative(-2.5f)
                arcTo(1.833f, 1.833f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.917f, 11f)
                verticalLineTo(8.64f)
                curveToRelative(0f, -0.266f, 0.127f, -0.516f, 0.342f, -0.673f)
                lineToRelative(2.25f, -1.64f)
                arcToRelative(0.83f, 0.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.982f, 0f)
                lineToRelative(2.25f, 1.64f)
                arcToRelative(0.83f, 0.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.342f, 0.674f)
                verticalLineTo(11f)
                curveToRelative(0f, 1.012f, -0.82f, 1.833f, -1.833f, 1.833f)
            }
        }.build()

        return _MapPinHouseInside!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinHouseInside: ImageVector? = null
