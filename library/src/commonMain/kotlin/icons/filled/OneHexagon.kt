package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.OneHexagon: ImageVector
    get() {
        if (_OneHexagon != null) {
            return _OneHexagon!!
        }
        _OneHexagon = ImageVector.Builder(
            name = "Filled.OneHexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.68f, 2.105f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.64f, 0f)
                lineToRelative(0.001f, 0.001f)
                lineToRelative(6.611f, 3.8f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.25f, 8.2f)
                verticalLineToRelative(7.603f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.318f, 2.291f)
                lineToRelative(-0.003f, 0.002f)
                lineToRelative(-6.608f, 3.799f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.639f, 0f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-6.608f, -3.8f)
                horizontalLineToRelative(-0.003f)
                arcTo(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.75f, 15.8f)
                verticalLineTo(8.198f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.318f, -2.291f)
                lineToRelative(0.003f, -0.002f)
                close()
                moveTo(13.5f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.191f, -0.607f)
                lineToRelative(-2.75f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.882f, 1.214f)
                lineToRelative(1.56f, -1.134f)
                verticalLineTo(16f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 0f)
                close()
            }
        }.build()

        return _OneHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _OneHexagon: ImageVector? = null
