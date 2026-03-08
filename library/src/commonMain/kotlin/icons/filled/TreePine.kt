package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.TreePine: ImageVector
    get() {
        if (_TreePine != null) {
            return _TreePine!!
        }
        _TreePine = ImageVector.Builder(
            name = "Filled.TreePine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.25f, 21f)
                verticalLineToRelative(-3.25f)
                horizontalLineTo(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.53f, -1.28f)
                lineToRelative(3.22f, -3.22f)
                horizontalLineTo(6.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.562f, -1.246f)
                lineToRelative(3.648f, -4.136f)
                lineToRelative(1.702f, -5.105f)
                lineToRelative(0.047f, -0.11f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.377f, 0.11f)
                lineToRelative(1.701f, 5.105f)
                lineToRelative(3.65f, 4.136f)
                lineToRelative(0.066f, 0.087f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.629f, 1.159f)
                horizontalLineToRelative(-1.19f)
                lineToRelative(3.22f, 3.22f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.53f, 1.28f)
                horizontalLineToRelative(-6.25f)
                verticalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
            }
        }.build()

        return _TreePine!!
    }

@Suppress("ObjectPropertyName")
private var _TreePine: ImageVector? = null
