package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SearchOff: ImageVector
    get() {
        if (_SearchOff != null) {
            return _SearchOff!!
        }
        _SearchOff = ImageVector.Builder(
            name = "Filled.SearchOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.53f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.06f)
                lineToRelative(-3.257f, 3.258f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.75f, 11.5f)
                arcToRelative(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.922f, 5.294f)
                lineToRelative(2.675f, 2.676f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, 1.06f)
                lineToRelative(-2.678f, -2.678f)
                arcTo(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 19.75f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.712f, -1.477f)
                lineTo(3.53f, 21.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(3.166f, -3.167f)
                arcTo(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.303f, 5.636f)
                lineTo(20.47f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
            }
        }.build()

        return _SearchOff!!
    }

@Suppress("ObjectPropertyName")
private var _SearchOff: ImageVector? = null
