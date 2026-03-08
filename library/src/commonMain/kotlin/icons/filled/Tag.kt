package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Tag: ImageVector
    get() {
        if (_Tag != null) {
            return _Tag!!
        }
        _Tag = ImageVector.Builder(
            name = "Filled.Tag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.472f, 4.75f)
                curveToRelative(-0.597f, 0f, -1.293f, 0.166f, -1.862f, 0.519f)
                curveToRelative(-0.58f, 0.358f, -1.11f, 0.974f, -1.11f, 1.856f)
                verticalLineToRelative(9.75f)
                curveToRelative(0f, 0.882f, 0.53f, 1.497f, 1.11f, 1.856f)
                curveToRelative(0.57f, 0.353f, 1.265f, 0.519f, 1.862f, 0.519f)
                horizontalLineTo(14.77f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.92f, -0.781f)
                lineToRelative(5.35f, -5.216f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.506f)
                lineToRelative(-5.35f, -5.216f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.92f, -0.781f)
                close()
            }
        }.build()

        return _Tag!!
    }

@Suppress("ObjectPropertyName")
private var _Tag: ImageVector? = null
