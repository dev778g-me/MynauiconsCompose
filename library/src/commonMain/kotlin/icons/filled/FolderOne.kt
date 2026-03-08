package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FolderOne: ImageVector
    get() {
        if (_FolderOne != null) {
            return _FolderOne!!
        }
        _FolderOne = ImageVector.Builder(
            name = "Filled.FolderOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 4.75f)
                horizontalLineToRelative(1.745f)
                curveToRelative(0.304f, 0f, 0.598f, 0.11f, 0.826f, 0.312f)
                lineTo(8.92f, 6.25f)
                horizontalLineTo(3.75f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                moveToRelative(6.661f, 1.5f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.826f, -0.312f)
                lineTo(8.562f, 3.936f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.817f, -0.686f)
                horizontalLineTo(5f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 6f)
                verticalLineToRelative(12f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20.75f)
                horizontalLineToRelative(14f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.75f, 18f)
                verticalLineTo(9f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 6.25f)
                close()
            }
        }.build()

        return _FolderOne!!
    }

@Suppress("ObjectPropertyName")
private var _FolderOne: ImageVector? = null
