package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Cog: ImageVector
    get() {
        if (_Cog != null) {
            return _Cog!!
        }
        _Cog = ImageVector.Builder(
            name = "Filled.Cog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.391f, 3.646f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.714f, -1.396f)
                horizontalLineToRelative(1.79f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.714f, 1.396f)
                arcToRelative(8.7f, 8.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.453f, 0.602f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.2f, 0.225f)
                lineToRelative(1.265f, 1.266f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.225f, 2.199f)
                quadToRelative(0.365f, 0.693f, 0.602f, 1.453f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.396f, 1.714f)
                verticalLineToRelative(1.79f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.396f, 1.714f)
                quadToRelative(-0.237f, 0.76f, -0.602f, 1.453f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.225f, 2.2f)
                lineToRelative(-1.266f, 1.265f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.199f, 0.225f)
                arcToRelative(8.7f, 8.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.453f, 0.602f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.714f, 1.396f)
                horizontalLineToRelative(-1.79f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.714f, -1.396f)
                arcToRelative(8.7f, 8.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.453f, -0.602f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.2f, -0.225f)
                lineToRelative(-1.265f, -1.266f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.225f, -2.199f)
                arcToRelative(8.7f, 8.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.602f, -1.453f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.396f, -1.714f)
                verticalLineToRelative(-1.79f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.396f, -1.714f)
                arcToRelative(8.7f, 8.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.602f, -1.453f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.225f, -2.2f)
                lineToRelative(1.266f, -1.265f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.199f, -0.225f)
                arcToRelative(8.7f, 8.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.453f, -0.602f)
                moveTo(8.75f, 12f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.5f, 0f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.5f, 0f)
            }
        }.build()

        return _Cog!!
    }

@Suppress("ObjectPropertyName")
private var _Cog: ImageVector? = null
