package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BookmarkCheck: ImageVector
    get() {
        if (_BookmarkCheck != null) {
            return _BookmarkCheck!!
        }
        _BookmarkCheck = ImageVector.Builder(
            name = "Filled.BookmarkCheck",
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
                moveTo(14.953f, 7.939f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.216f, -0.878f)
                lineToRelative(-2.467f, 3.416f)
                lineToRelative(-1.006f, -1.148f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.128f, 0.987f)
                lineToRelative(1.378f, 1.576f)
                arcToRelative(1.05f, 1.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.64f, -0.077f)
                close()
            }
        }.build()

        return _BookmarkCheck!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkCheck: ImageVector? = null
