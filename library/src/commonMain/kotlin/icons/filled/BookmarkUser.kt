package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BookmarkUser: ImageVector
    get() {
        if (_BookmarkUser != null) {
            return _BookmarkUser!!
        }
        _BookmarkUser = ImageVector.Builder(
            name = "Filled.BookmarkUser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.75f, 9f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 0f)
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
                moveTo(12f, 6.25f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.01f, 4.627f)
                quadToRelative(-0.286f, 0.164f, -0.54f, 0.382f)
                curveToRelative(-0.734f, 0.629f, -1.2f, 1.563f, -1.2f, 2.741f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -0.752f, 0.284f, -1.266f, 0.676f, -1.603f)
                curveToRelative(0.408f, -0.35f, 0.977f, -0.543f, 1.574f, -0.543f)
                reflectiveCurveToRelative(1.166f, 0.193f, 1.574f, 0.543f)
                curveToRelative(0.392f, 0.337f, 0.676f, 0.85f, 0.676f, 1.603f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -1.178f, -0.466f, -2.112f, -1.2f, -2.741f)
                arcToRelative(3.6f, 3.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.54f, -0.382f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6.25f)
            }
        }.build()

        return _BookmarkUser!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkUser: ImageVector? = null
