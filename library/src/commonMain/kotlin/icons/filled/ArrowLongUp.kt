package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ArrowLongUp: ImageVector
    get() {
        if (_ArrowLongUp != null) {
            return _ArrowLongUp!!
        }
        _ArrowLongUp = ImageVector.Builder(
            name = "Filled.ArrowLongUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.53f, 6.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.06f)
                lineToRelative(-4f, -4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 0f)
                lineToRelative(-4f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.06f)
                horizontalLineToRelative(3.78f)
                verticalLineTo(22f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineTo(6.53f)
                close()
            }
        }.build()

        return _ArrowLongUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLongUp: ImageVector? = null
