package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Refresh: ImageVector
    get() {
        if (_Refresh != null) {
            return _Refresh!!
        }
        _Refresh = ImageVector.Builder(
            name = "Filled.Refresh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.074f, 12.154f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.672f, 0.82f)
                curveToRelative(-0.49f, 4.93f, -4.658f, 8.776f, -9.724f, 8.776f)
                curveToRelative(-2.724f, 0f, -5.364f, -0.933f, -7.238f, -2.68f)
                lineTo(3f, 20.85f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                verticalLineToRelative(-3.96f)
                curveToRelative(0f, -0.714f, 0.58f, -1.29f, 1.291f, -1.29f)
                horizontalLineToRelative(3.97f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                lineToRelative(-2.413f, 2.407f)
                curveToRelative(1.558f, 1.433f, 3.78f, 2.243f, 6.174f, 2.243f)
                curveToRelative(4.29f, 0f, 7.817f, -3.258f, 8.232f, -7.424f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.82f, -0.672f)
                moveToRelative(-18.82f, -1.128f)
                curveToRelative(0.49f, -4.93f, 4.658f, -8.776f, 9.724f, -8.776f)
                curveToRelative(2.724f, 0f, 5.364f, 0.933f, 7.238f, 2.68f)
                lineTo(21f, 3.15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(3.96f)
                curveToRelative(0f, 0.714f, -0.58f, 1.29f, -1.291f, 1.29f)
                horizontalLineToRelative(-3.97f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                lineToRelative(2.413f, -2.408f)
                curveToRelative(-1.558f, -1.432f, -3.78f, -2.242f, -6.174f, -2.242f)
                curveToRelative(-4.29f, 0f, -7.817f, 3.258f, -8.232f, 7.424f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.492f, -0.148f)
            }
        }.build()

        return _Refresh!!
    }

@Suppress("ObjectPropertyName")
private var _Refresh: ImageVector? = null
