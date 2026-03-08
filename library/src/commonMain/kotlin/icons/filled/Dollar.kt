package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Dollar: ImageVector
    get() {
        if (_Dollar != null) {
            return _Dollar!!
        }
        _Dollar = ImageVector.Builder(
            name = "Filled.Dollar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(1.25f)
                lineTo(17f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-4.25f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(1.75f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 8.5f)
                horizontalLineToRelative(-1.75f)
                lineTo(12.75f, 21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-1.25f)
                lineTo(6f, 19.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(5.25f)
                verticalLineToRelative(-5.5f)
                lineTo(9.5f, 12.75f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8.5f)
                horizontalLineToRelative(1.75f)
                lineTo(11.25f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(-0.75f, 3.5f)
                lineTo(9.5f, 5.75f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.5f)
                horizontalLineToRelative(1.75f)
                close()
                moveTo(12.75f, 12.75f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(1.75f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -5.5f)
                close()
            }
        }.build()

        return _Dollar!!
    }

@Suppress("ObjectPropertyName")
private var _Dollar: ImageVector? = null
