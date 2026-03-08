package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CornerRightUp: ImageVector
    get() {
        if (_CornerRightUp != null) {
            return _CornerRightUp!!
        }
        _CornerRightUp = ImageVector.Builder(
            name = "Filled.CornerRightUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.517f, 9.237f)
                curveToRelative(0.3f, 0.285f, 0.312f, 0.76f, 0.027f, 1.06f)
                horizontalLineToRelative(-4.821f)
                verticalLineTo(15f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.75f, 4.75f)
                horizontalLineTo(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(4.973f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.25f, -3.25f)
                verticalLineToRelative(-4.703f)
                horizontalLineTo(8.402f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.027f, -1.06f)
                lineToRelative(5.027f, -4.78f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.034f, 0f)
                close()
            }
        }.build()

        return _CornerRightUp!!
    }

@Suppress("ObjectPropertyName")
private var _CornerRightUp: ImageVector? = null
