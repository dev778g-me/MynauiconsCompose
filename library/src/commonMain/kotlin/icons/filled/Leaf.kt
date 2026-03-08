package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Leaf: ImageVector
    get() {
        if (_Leaf != null) {
            return _Leaf!!
        }
        _Leaf = ImageVector.Builder(
            name = "Filled.Leaf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.037f, 17.903f)
                curveToRelative(0.126f, 0.238f, 0.514f, 0.783f, 1.06f, 1.06f)
                lineTo(4.53f, 20.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.097f, 18.964f)
                curveToRelative(1.828f, 0.997f, 3.611f, 1.435f, 5.275f, 1.326f)
                curveToRelative(1.826f, -0.12f, 3.447f, -0.897f, 4.758f, -2.208f)
                curveToRelative(2.599f, -2.599f, 3.943f, -7.24f, 3.555f, -13.067f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.699f, -0.699f)
                curveTo(13.16f, 3.928f, 8.517f, 5.272f, 5.92f, 7.87f)
                curveToRelative(-1.31f, 1.311f, -2.088f, 2.933f, -2.208f, 4.76f)
                curveToRelative(-0.11f, 1.662f, 0.329f, 3.446f, 1.326f, 5.273f)
                lineTo(9.57f, 13.37f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, 1.06f)
                close()
            }
        }.build()

        return _Leaf!!
    }

@Suppress("ObjectPropertyName")
private var _Leaf: ImageVector? = null
