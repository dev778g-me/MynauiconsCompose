package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SearchSnooze: ImageVector
    get() {
        if (_SearchSnooze != null) {
            return _SearchSnooze!!
        }
        _SearchSnooze = ImageVector.Builder(
            name = "Filled.SearchSnooze",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.25f, 11.5f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.578f, 5.294f)
                lineToRelative(2.675f, 2.676f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, 1.06f)
                lineToRelative(-2.678f, -2.678f)
                arcTo(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.25f, 11.5f)
                moveToRelative(7f, -2.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.147f)
                lineToRelative(-1.783f, 2.852f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.636f, 1.148f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-1.147f)
                lineToRelative(1.783f, -2.852f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.636f, -1.148f)
                close()
            }
        }.build()

        return _SearchSnooze!!
    }

@Suppress("ObjectPropertyName")
private var _SearchSnooze: ImageVector? = null
