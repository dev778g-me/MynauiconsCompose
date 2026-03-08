package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Bookmark: ImageVector
    get() {
        if (_Bookmark != null) {
            return _Bookmark!!
        }
        _Bookmark = ImageVector.Builder(
            name = "Filled.Bookmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.75f, 2.25f)
                curveToRelative(-0.979f, 0f, -1.5f, 0.926f, -1.5f, 1.692f)
                verticalLineToRelative(16.01f)
                curveToRelative(0f, 1.352f, 1.469f, 2.308f, 2.686f, 1.518f)
                lineToRelative(3.945f, -2.561f)
                arcToRelative(0.21f, 0.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.238f, 0f)
                lineToRelative(3.945f, 2.561f)
                curveToRelative(1.217f, 0.79f, 2.686f, -0.165f, 2.686f, -1.518f)
                verticalLineTo(3.942f)
                curveToRelative(0f, -0.766f, -0.521f, -1.692f, -1.5f, -1.692f)
                close()
            }
        }.build()

        return _Bookmark!!
    }

@Suppress("ObjectPropertyName")
private var _Bookmark: ImageVector? = null
