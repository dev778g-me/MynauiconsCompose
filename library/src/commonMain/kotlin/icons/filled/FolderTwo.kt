package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FolderTwo: ImageVector
    get() {
        if (_FolderTwo != null) {
            return _FolderTwo!!
        }
        _FolderTwo = ImageVector.Builder(
            name = "Filled.FolderTwo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3.25f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 6f)
                verticalLineToRelative(12f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20.75f)
                horizontalLineToRelative(14f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.75f, 18f)
                lineTo(21.75f, 9f)
                curveToRelative(0f, -1.283f, -0.88f, -2.361f, -2.068f, -2.665f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.183f, -2.586f)
                lineTo(8.325f, 3.749f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.58f, -0.499f)
                close()
                moveTo(16.5f, 5.25f)
                curveToRelative(0.698f, 0f, 1.3f, 0.408f, 1.582f, 1f)
                horizontalLineToRelative(-6.42f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.827f, -0.312f)
                lineToRelative(-0.782f, -0.689f)
                close()
            }
        }.build()

        return _FolderTwo!!
    }

@Suppress("ObjectPropertyName")
private var _FolderTwo: ImageVector? = null
