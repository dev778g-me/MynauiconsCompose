package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Infinity: ImageVector
    get() {
        if (_Infinity != null) {
            return _Infinity!!
        }
        _Infinity = ImageVector.Builder(
            name = "Filled.Infinity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 8.75f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.5f)
                curveToRelative(0.935f, 0f, 1.71f, -0.435f, 2.469f, -1.196f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.063f, 1.058f)
                curveToRelative(-0.92f, 0.923f, -2.054f, 1.638f, -3.532f, 1.638f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -9.5f)
                curveToRelative(1.376f, 0f, 2.457f, 0.621f, 3.342f, 1.454f)
                curveToRelative(0.856f, 0.805f, 1.581f, 1.86f, 2.25f, 2.834f)
                lineToRelative(0.026f, 0.037f)
                curveToRelative(0.699f, 1.017f, 1.34f, 1.944f, 2.068f, 2.629f)
                curveToRelative(0.709f, 0.667f, 1.44f, 1.046f, 2.314f, 1.046f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6.5f)
                curveToRelative(-0.935f, 0f, -1.71f, 0.435f, -2.469f, 1.196f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.062f, -1.058f)
                curveTo(14.387f, 7.965f, 15.522f, 7.25f, 17f, 7.25f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 9.5f)
                curveToRelative(-1.376f, 0f, -2.457f, -0.621f, -3.342f, -1.454f)
                curveToRelative(-0.856f, -0.805f, -1.581f, -1.86f, -2.25f, -2.834f)
                lineToRelative(-0.026f, -0.037f)
                curveToRelative(-0.699f, -1.017f, -1.34f, -1.944f, -2.068f, -2.629f)
                curveTo(8.605f, 9.13f, 7.874f, 8.75f, 7f, 8.75f)
            }
        }.build()

        return _Infinity!!
    }

@Suppress("ObjectPropertyName")
private var _Infinity: ImageVector? = null
