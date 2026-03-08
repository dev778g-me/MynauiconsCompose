package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MapPinXInside: ImageVector
    get() {
        if (_MapPinXInside != null) {
            return _MapPinXInside!!
        }
        _MapPinXInside = ImageVector.Builder(
            name = "Filled.MapPinXInside",
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
                moveTo(14.59f, 7.41f)
                arcToRelative(0.83f, 0.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.178f)
                lineTo(13.178f, 10f)
                lineToRelative(1.41f, 1.411f)
                lineToRelative(0.059f, 0.063f)
                arcToRelative(0.833f, 0.833f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.173f, 1.172f)
                lineToRelative(-0.063f, -0.057f)
                lineToRelative(-1.41f, -1.411f)
                lineToRelative(-1.412f, 1.41f)
                arcToRelative(0.832f, 0.832f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.178f, -1.177f)
                lineTo(10.822f, 10f)
                lineToRelative(-1.41f, -1.411f)
                lineToRelative(-0.058f, -0.063f)
                arcToRelative(0.833f, 0.833f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.172f, -1.172f)
                lineToRelative(0.063f, 0.057f)
                lineTo(12f, 8.822f)
                lineToRelative(1.411f, -1.41f)
                arcToRelative(0.83f, 0.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.178f, 0f)
            }
        }.build()

        return _MapPinXInside!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinXInside: ImageVector? = null
