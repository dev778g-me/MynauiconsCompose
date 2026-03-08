package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.UserX: ImageVector
    get() {
        if (_UserX != null) {
            return _UserX!!
        }
        _UserX = ImageVector.Builder(
            name = "Filled.UserX",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.25f, 7.5f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.5f, 0f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.5f, 0f)
                moveToRelative(11.999f, 12.962f)
                curveToRelative(-0.262f, -5.148f, -4.307f, -7.712f, -8.249f, -7.712f)
                reflectiveCurveToRelative(-7.987f, 2.563f, -8.249f, 7.712f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 0.787f)
                curveToRelative(3.365f, 0.171f, 12.998f, 0.106f, 15.077f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.711f, -0.787f)
                moveTo(10.055f, 15.22f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.061f, 0f)
                lineToRelative(0.884f, 0.883f)
                lineToRelative(0.884f, -0.883f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 1.06f)
                lineToRelative(-0.883f, 0.884f)
                lineToRelative(0.883f, 0.884f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, 1.06f)
                lineTo(12f, 18.226f)
                lineToRelative(-0.884f, 0.884f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(0.883f, -0.885f)
                lineToRelative(-0.884f, -0.884f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
            }
        }.build()

        return _UserX!!
    }

@Suppress("ObjectPropertyName")
private var _UserX: ImageVector? = null
