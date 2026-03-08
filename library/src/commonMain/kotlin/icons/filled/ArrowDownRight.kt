package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ArrowDownRight: ImageVector
    get() {
        if (_ArrowDownRight != null) {
            return _ArrowDownRight!!
        }
        _ArrowDownRight = ImageVector.Builder(
            name = "Filled.ArrowDownRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 18.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                lineToRelative(4.345f, -4.345f)
                lineTo(5.97f, 7.03f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, -1.06f)
                lineToRelative(6.125f, 6.125f)
                lineTo(17.5f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, 0.75f)
                close()
            }
        }.build()

        return _ArrowDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownRight: ImageVector? = null
