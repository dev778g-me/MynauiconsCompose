package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.AArrowUp: ImageVector
    get() {
        if (_AArrowUp != null) {
            return _AArrowUp!!
        }
        _AArrowUp = ImageVector.Builder(
            name = "Filled.AArrowUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.702f, 0.487f)
                lineToRelative(3.75f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.404f, 0.526f)
                lineTo(8.98f, 14.417f)
                horizontalLineTo(5.02f)
                lineToRelative(-1.068f, 2.846f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.404f, -0.526f)
                lineToRelative(3.75f, -10f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 6.25f)
                moveToRelative(1.418f, 6.667f)
                lineTo(7f, 9.136f)
                lineToRelative(-1.418f, 3.78f)
                close()
                moveTo(16.72f, 6.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                lineToRelative(3.5f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.06f)
                horizontalLineTo(18f)
                verticalLineToRelative(5.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-5.47f)
                horizontalLineToRelative(-3.28f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
                close()
            }
        }.build()

        return _AArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _AArrowUp: ImageVector? = null
