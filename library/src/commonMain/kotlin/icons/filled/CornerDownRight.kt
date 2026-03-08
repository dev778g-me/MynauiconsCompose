package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CornerDownRight: ImageVector
    get() {
        if (_CornerDownRight != null) {
            return _CornerDownRight!!
        }
        _CornerDownRight = ImageVector.Builder(
            name = "Filled.CornerDownRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.763f, 19.517f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, 0.027f)
                verticalLineToRelative(-4.821f)
                horizontalLineTo(9f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.75f, -4.75f)
                verticalLineTo(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(4.973f)
                arcTo(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 13.223f)
                horizontalLineToRelative(4.703f)
                verticalLineTo(8.402f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0.027f)
                lineToRelative(4.78f, 5.027f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.034f)
                close()
            }
        }.build()

        return _CornerDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _CornerDownRight: ImageVector? = null
