package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BookmarkX: ImageVector
    get() {
        if (_BookmarkX != null) {
            return _BookmarkX!!
        }
        _BookmarkX = ImageVector.Builder(
            name = "Filled.BookmarkX",
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
                moveTo(10.53f, 6.97f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.06f, 1.06f)
                lineToRelative(1.47f, 1.47f)
                lineToRelative(-1.47f, 1.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineTo(12f, 10.56f)
                lineToRelative(1.47f, 1.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, -1.06f)
                lineTo(13.06f, 9.5f)
                lineToRelative(1.47f, -1.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, -1.06f)
                lineTo(12f, 8.44f)
                close()
            }
        }.build()

        return _BookmarkX!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkX: ImageVector? = null
