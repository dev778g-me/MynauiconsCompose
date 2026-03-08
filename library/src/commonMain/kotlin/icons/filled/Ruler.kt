package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Ruler: ImageVector
    get() {
        if (_Ruler != null) {
            return _Ruler!!
        }
        _Ruler = ImageVector.Builder(
            name = "Filled.Ruler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.908f, 2.392f)
                curveToRelative(0.583f, -0.19f, 1.21f, -0.19f, 1.793f, 0f)
                curveToRelative(0.377f, 0.123f, 0.693f, 0.338f, 1.003f, 0.6f)
                curveToRelative(0.297f, 0.253f, 0.635f, 0.59f, 1.042f, 0.998f)
                lineToRelative(1.259f, 1.259f)
                curveToRelative(0.41f, 0.409f, 0.748f, 0.748f, 1.002f, 1.047f)
                curveToRelative(0.263f, 0.31f, 0.478f, 0.626f, 0.601f, 1.004f)
                curveToRelative(0.19f, 0.583f, 0.19f, 1.21f, 0f, 1.792f)
                curveToRelative(-0.123f, 0.378f, -0.338f, 0.693f, -0.6f, 1.003f)
                curveToRelative(-0.254f, 0.3f, -0.593f, 0.638f, -1.002f, 1.047f)
                lineToRelative(-8.864f, 8.864f)
                curveToRelative(-0.409f, 0.409f, -0.748f, 0.748f, -1.046f, 1.001f)
                curveToRelative(-0.31f, 0.263f, -0.626f, 0.478f, -1.004f, 0.6f)
                curveToRelative(-0.582f, 0.19f, -1.21f, 0.19f, -1.792f, 0.001f)
                curveToRelative(-0.378f, -0.123f, -0.694f, -0.338f, -1.004f, -0.6f)
                curveToRelative(-0.299f, -0.255f, -0.638f, -0.594f, -1.047f, -1.003f)
                lineToRelative(-1.26f, -1.259f)
                curveToRelative(-0.406f, -0.407f, -0.744f, -0.744f, -0.997f, -1.042f)
                curveToRelative(-0.262f, -0.31f, -0.477f, -0.626f, -0.6f, -1.003f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.793f)
                curveToRelative(0.123f, -0.377f, 0.338f, -0.694f, 0.6f, -1.003f)
                curveToRelative(0.254f, -0.3f, 0.593f, -0.638f, 1.002f, -1.047f)
                lineToRelative(8.864f, -8.864f)
                curveToRelative(0.409f, -0.409f, 0.748f, -0.748f, 1.047f, -1.001f)
                curveToRelative(0.31f, -0.263f, 0.626f, -0.478f, 1.003f, -0.601f)
                moveTo(6.974f, 12f)
                lineToRelative(-1.061f, 1.06f)
                lineToRelative(1.753f, 1.753f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, -1.06f)
                close()
                moveTo(11.77f, 10.709f)
                lineTo(10.017f, 8.956f)
                lineTo(8.957f, 10.017f)
                lineTo(10.709f, 11.77f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, -1.061f)
                moveToRelative(1.29f, -4.796f)
                lineTo(12f, 6.973f)
                lineToRelative(1.752f, 1.753f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, -1.06f)
                close()
            }
        }.build()

        return _Ruler!!
    }

@Suppress("ObjectPropertyName")
private var _Ruler: ImageVector? = null
