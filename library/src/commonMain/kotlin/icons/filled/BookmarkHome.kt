package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BookmarkHome: ImageVector
    get() {
        if (_BookmarkHome != null) {
            return _BookmarkHome!!
        }
        _BookmarkHome = ImageVector.Builder(
            name = "Filled.BookmarkHome",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 11.5f)
                verticalLineTo(9.522f)
                lineTo(12f, 8.428f)
                lineToRelative(1.5f, 1.094f)
                verticalLineTo(11.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, 0.25f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, -0.25f)
            }
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
                moveTo(12.442f, 6.894f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.884f, 0f)
                lineToRelative(-2.25f, 1.64f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 9.14f)
                verticalLineToRelative(2.36f)
                curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(2.5f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 11.5f)
                lineTo(15f, 9.14f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.308f, -0.606f)
                close()
            }
        }.build()

        return _BookmarkHome!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkHome: ImageVector? = null
