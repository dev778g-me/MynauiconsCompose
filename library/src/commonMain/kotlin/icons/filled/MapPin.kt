package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MapPin: ImageVector
    get() {
        if (_MapPin != null) {
            return _MapPin!!
        }
        _MapPin = ImageVector.Builder(
            name = "Filled.MapPin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8.75f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.5f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.227f, 3.9f)
                arcTo(8.68f, 8.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1.25f)
                curveToRelative(-2.34f, 0f, -4.579f, 0.956f, -6.227f, 2.65f)
                curveToRelative(-3.03f, 3.117f, -3.012f, 6.85f, -1.612f, 10.199f)
                curveToRelative(1.386f, 3.312f, 4.143f, 6.335f, 6.794f, 8.304f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.09f, 0f)
                curveToRelative(2.65f, -1.969f, 5.408f, -4.992f, 6.794f, -8.304f)
                curveToRelative(1.4f, -3.348f, 1.418f, -7.082f, -1.612f, -10.199f)
                moveTo(12f, 12.75f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -5.5f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5.5f)
            }
        }.build()

        return _MapPin!!
    }

@Suppress("ObjectPropertyName")
private var _MapPin: ImageVector? = null
