package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Zero: ImageVector
    get() {
        if (_Zero != null) {
            return _Zero!!
        }
        _Zero = ImageVector.Builder(
            name = "Filled.Zero",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.875f, 7.75f)
                arcTo(2.375f, 2.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 10.125f)
                verticalLineToRelative(3.75f)
                arcToRelative(2.375f, 2.375f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.75f, 0f)
                verticalLineToRelative(-3.75f)
                arcToRelative(2.375f, 2.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.375f, -2.375f)
                moveTo(8f, 10.125f)
                arcToRelative(3.875f, 3.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.75f, 0f)
                verticalLineToRelative(3.75f)
                arcToRelative(3.875f, 3.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.75f, 0f)
                close()
            }
        }.build()

        return _Zero!!
    }

@Suppress("ObjectPropertyName")
private var _Zero: ImageVector? = null
