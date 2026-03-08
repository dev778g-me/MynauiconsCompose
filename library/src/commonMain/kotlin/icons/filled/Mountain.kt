package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Mountain: ImageVector
    get() {
        if (_Mountain != null) {
            return _Mountain!!
        }
        _Mountain = ImageVector.Builder(
            name = "Filled.Mountain",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.674f, 4.705f)
                lineToRelative(2.654f, 6.025f)
                arcToRelative(2.39f, 2.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.587f, 0.94f)
                lineToRelative(2.596f, 5.542f)
                curveToRelative(0.75f, 1.603f, -0.36f, 3.538f, -2.177f, 3.538f)
                horizontalLineTo(4.665f)
                curveToRelative(-1.81f, 0f, -2.922f, -1.924f, -2.181f, -3.527f)
                lineToRelative(5.808f, -12.56f)
                curveToRelative(0.88f, -1.905f, 3.537f, -1.877f, 4.382f, 0.042f)
            }
        }.build()

        return _Mountain!!
    }

@Suppress("ObjectPropertyName")
private var _Mountain: ImageVector? = null
