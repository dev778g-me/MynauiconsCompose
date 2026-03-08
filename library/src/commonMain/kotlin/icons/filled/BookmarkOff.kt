package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BookmarkOff: ImageVector
    get() {
        if (_BookmarkOff != null) {
            return _BookmarkOff!!
        }
        _BookmarkOff = ImageVector.Builder(
            name = "Filled.BookmarkOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.53f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.06f)
                lineToRelative(-2.78f, 2.78f)
                verticalLineToRelative(13.642f)
                curveToRelative(0f, 1.352f, -1.469f, 2.308f, -2.686f, 1.518f)
                lineToRelative(-3.944f, -2.56f)
                arcToRelative(0.21f, 0.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.238f, 0f)
                lineToRelative(-3.946f, 2.56f)
                curveToRelative(-1.217f, 0.79f, -2.686f, -0.165f, -2.686f, -1.518f)
                verticalLineToRelative(-0.141f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -1.061f)
                lineToRelative(2.78f, -2.78f)
                verticalLineTo(3.941f)
                curveToRelative(0f, -0.766f, 0.521f, -1.692f, 1.5f, -1.692f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.979f, 0f, 1.5f, 0.926f, 1.5f, 1.692f)
                verticalLineToRelative(0.247f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
            }
        }.build()

        return _BookmarkOff!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkOff: ImageVector? = null
