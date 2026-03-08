package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.InboxArchive: ImageVector
    get() {
        if (_InboxArchive != null) {
            return _InboxArchive!!
        }
        _InboxArchive = ImageVector.Builder(
            name = "Filled.InboxArchive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.76f, 2.25f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.462f, 1.526f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.051f, 0.135f)
                lineToRelative(2.163f, 7.846f)
                arcToRelative(8.8f, 8.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.314f, 2.325f)
                lineTo(21.75f, 19f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21.75f)
                lineTo(5f, 21.75f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 19f)
                verticalLineToRelative(-4.918f)
                curveToRelative(0f, -0.785f, 0.106f, -1.567f, 0.314f, -2.325f)
                lineToRelative(2.163f, -7.846f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.051f, -0.135f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.24f, 2.25f)
                close()
                moveTo(17.07f, 13.75f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.04f, 0.557f)
                lineToRelative(-0.812f, 1.218f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.288f, 1.225f)
                horizontalLineToRelative(-1.86f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.288f, -1.225f)
                lineToRelative(-0.812f, -1.218f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.04f, -0.557f)
                lineTo(3.758f, 13.75f)
                quadToRelative(-0.008f, 0.165f, -0.008f, 0.332f)
                lineTo(3.75f, 19f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20.25f)
                horizontalLineToRelative(14f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.25f, 19f)
                verticalLineToRelative(-4.918f)
                quadToRelative(0f, -0.165f, -0.008f, -0.332f)
                close()
                moveTo(10.5f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
                moveTo(9f, 8.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
            }
        }.build()

        return _InboxArchive!!
    }

@Suppress("ObjectPropertyName")
private var _InboxArchive: ImageVector? = null
