package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MapPinMinusInside: ImageVector
    get() {
        if (_MapPinMinusInside != null) {
            return _MapPinMinusInside!!
        }
        _MapPinMinusInside = ImageVector.Builder(
            name = "Filled.MapPinMinusInside",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.167f)
                curveToRelative(2.363f, 0f, 4.623f, 0.965f, 6.286f, 2.676f)
                curveToRelative(3.06f, 3.147f, 3.04f, 6.919f, 1.63f, 10.288f)
                curveToRelative(-1.393f, 3.33f, -4.163f, 6.363f, -6.822f, 8.339f)
                arcToRelative(1.83f, 1.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.188f, 0f)
                curveToRelative(-2.66f, -1.976f, -5.43f, -5.01f, -6.822f, -8.34f)
                curveToRelative(-1.41f, -3.368f, -1.43f, -7.14f, 1.63f, -10.287f)
                arcTo(8.77f, 8.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1.167f)
                moveTo(15.25f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.75f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
            }
        }.build()

        return _MapPinMinusInside!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinMinusInside: ImageVector? = null
