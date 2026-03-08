package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.RefreshAlt: ImageVector
    get() {
        if (_RefreshAlt != null) {
            return _RefreshAlt!!
        }
        _RefreshAlt = ImageVector.Builder(
            name = "Filled.RefreshAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.926f, 12.154f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.672f, 0.82f)
                curveToRelative(0.49f, 4.93f, 4.658f, 8.776f, 9.724f, 8.776f)
                curveToRelative(2.724f, 0f, 5.364f, -0.933f, 7.238f, -2.68f)
                lineTo(21f, 20.85f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                verticalLineToRelative(-3.96f)
                curveToRelative(0f, -0.714f, -0.58f, -1.29f, -1.291f, -1.29f)
                horizontalLineToRelative(-3.97f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                lineToRelative(2.413f, 2.407f)
                curveToRelative(-1.558f, 1.433f, -3.78f, 2.243f, -6.174f, 2.243f)
                curveToRelative(-4.29f, 0f, -7.817f, -3.258f, -8.232f, -7.424f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.82f, -0.672f)
                moveToRelative(18.82f, -1.128f)
                curveToRelative(-0.49f, -4.93f, -4.657f, -8.776f, -9.724f, -8.776f)
                curveToRelative(-2.724f, 0f, -5.364f, 0.933f, -7.238f, 2.68f)
                lineTo(3f, 3.15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(3.96f)
                curveToRelative(0f, 0.714f, 0.58f, 1.29f, 1.291f, 1.29f)
                horizontalLineToRelative(3.97f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                lineTo(5.848f, 5.992f)
                curveTo(7.406f, 4.56f, 9.628f, 3.75f, 12.022f, 3.75f)
                curveToRelative(4.29f, 0f, 7.817f, 3.258f, 8.232f, 7.424f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.492f, -0.148f)
            }
        }.build()

        return _RefreshAlt!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshAlt: ImageVector? = null
