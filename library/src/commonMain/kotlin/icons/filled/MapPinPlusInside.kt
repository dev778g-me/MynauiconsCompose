package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MapPinPlusInside: ImageVector
    get() {
        if (_MapPinPlusInside != null) {
            return _MapPinPlusInside!!
        }
        _MapPinPlusInside = ImageVector.Builder(
            name = "Filled.MapPinPlusInside",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.286f, 3.843f)
                arcTo(8.77f, 8.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1.167f)
                arcToRelative(8.77f, 8.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.286f, 2.676f)
                curveToRelative(-3.06f, 3.147f, -3.04f, 6.919f, -1.63f, 10.288f)
                curveToRelative(1.393f, 3.33f, 4.163f, 6.363f, 6.822f, 8.339f)
                arcToRelative(1.83f, 1.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.188f, 0f)
                curveToRelative(2.66f, -1.976f, 5.43f, -5.01f, 6.822f, -8.34f)
                curveToRelative(1.41f, -3.368f, 1.43f, -7.14f, -1.63f, -10.287f)
                moveToRelative(-7.119f, 6.99f)
                horizontalLineTo(9.5f)
                arcToRelative(0.833f, 0.833f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -1.666f)
                horizontalLineToRelative(1.667f)
                verticalLineTo(7.5f)
                arcToRelative(0.833f, 0.833f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.666f, 0f)
                verticalLineToRelative(1.667f)
                horizontalLineTo(14.5f)
                lineToRelative(0.085f, 0.004f)
                arcToRelative(0.833f, 0.833f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.085f, 1.662f)
                horizontalLineToRelative(-1.667f)
                verticalLineTo(12.5f)
                arcToRelative(0.833f, 0.833f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.666f, 0f)
                close()
            }
        }.build()

        return _MapPinPlusInside!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinPlusInside: ImageVector? = null
