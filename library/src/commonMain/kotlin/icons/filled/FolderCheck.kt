package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FolderCheck: ImageVector
    get() {
        if (_FolderCheck != null) {
            return _FolderCheck!!
        }
        _FolderCheck = ImageVector.Builder(
            name = "Filled.FolderCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 6f)
                verticalLineToRelative(12f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20.75f)
                horizontalLineToRelative(14f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.75f, 18f)
                verticalLineTo(9f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 6.25f)
                horizontalLineToRelative(-7.34f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.826f, -0.312f)
                lineTo(8.562f, 3.936f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.817f, -0.686f)
                horizontalLineTo(5f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 6f)
                moveToRelative(11.931f, 4.892f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.169f, 1.047f)
                lineToRelative(-2.1f, 2.907f)
                arcToRelative(0.974f, 0.974f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.522f, 0.072f)
                lineToRelative(-1.034f, -1.182f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.129f, -0.988f)
                lineToRelative(0.598f, 0.684f)
                lineToRelative(1.713f, -2.371f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.047f, -0.169f)
            }
        }.build()

        return _FolderCheck!!
    }

@Suppress("ObjectPropertyName")
private var _FolderCheck: ImageVector? = null
