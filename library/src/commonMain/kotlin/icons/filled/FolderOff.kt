package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FolderOff: ImageVector
    get() {
        if (_FolderOff != null) {
            return _FolderOff!!
        }
        _FolderOff = ImageVector.Builder(
            name = "Filled.FolderOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3.25f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 6f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.744f, 0.295f, 1.419f, 0.775f, 1.914f)
                lineToRelative(-0.555f, 0.556f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(0.85f, -0.85f)
                quadToRelative(0.3f, 0.07f, 0.62f, 0.07f)
                horizontalLineToRelative(14f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.75f, 18f)
                verticalLineTo(9f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 6.25f)
                horizontalLineToRelative(-0.19f)
                lineToRelative(2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, -1.06f)
                lineToRelative(-3.78f, 3.78f)
                horizontalLineToRelative(-5.03f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.826f, -0.312f)
                lineTo(8.562f, 3.936f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.817f, -0.686f)
                close()
            }
        }.build()

        return _FolderOff!!
    }

@Suppress("ObjectPropertyName")
private var _FolderOff: ImageVector? = null
