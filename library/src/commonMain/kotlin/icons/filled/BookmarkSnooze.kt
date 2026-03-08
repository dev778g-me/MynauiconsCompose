package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BookmarkSnooze: ImageVector
    get() {
        if (_BookmarkSnooze != null) {
            return _BookmarkSnooze!!
        }
        _BookmarkSnooze = ImageVector.Builder(
            name = "Filled.BookmarkSnooze",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.25f, 3.942f)
                curveToRelative(0f, -0.766f, 0.521f, -1.692f, 1.5f, -1.692f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.979f, 0f, 1.5f, 0.926f, 1.5f, 1.692f)
                verticalLineToRelative(16.01f)
                curveToRelative(0f, 1.352f, -1.469f, 2.308f, -2.686f, 1.518f)
                lineToRelative(-3.944f, -2.56f)
                arcToRelative(0.21f, 0.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.238f, 0f)
                lineToRelative(-3.946f, 2.56f)
                curveToRelative(-1.217f, 0.79f, -2.686f, -0.165f, -2.686f, -1.518f)
                close()
                moveTo(10.75f, 7.25f)
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

        return _BookmarkSnooze!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkSnooze: ImageVector? = null
