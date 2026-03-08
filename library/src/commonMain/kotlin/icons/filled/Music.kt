package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Music: ImageVector
    get() {
        if (_Music != null) {
            return _Music!!
        }
        _Music = ImageVector.Builder(
            name = "Filled.Music",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.978f, 4.251f)
                curveToRelative(0.141f, -0.013f, 0.272f, 0.1f, 0.272f, 0.255f)
                verticalLineToRelative(9.07f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.062f, -0.665f)
                curveToRelative(-1.977f, 0f, -3.563f, 1.621f, -3.563f, 3.6f)
                reflectiveCurveToRelative(1.586f, 3.6f, 3.563f, 3.6f)
                curveToRelative(1.976f, 0f, 3.562f, -1.622f, 3.562f, -3.6f)
                verticalLineTo(4.506f)
                curveToRelative(0f, -1.029f, -0.88f, -1.843f, -1.91f, -1.749f)
                lineToRelative(-10.375f, 0.956f)
                arcToRelative(1.753f, 1.753f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.59f, 1.748f)
                verticalLineToRelative(9.254f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.062f, -0.664f)
                curveToRelative(-1.977f, 0f, -3.563f, 1.621f, -3.563f, 3.6f)
                curveToRelative(0f, 1.978f, 1.586f, 3.599f, 3.563f, 3.599f)
                curveToRelative(1.976f, 0f, 3.562f, -1.62f, 3.562f, -3.6f)
                verticalLineTo(5.462f)
                curveToRelative(0f, -0.135f, 0.102f, -0.243f, 0.228f, -0.254f)
                close()
            }
        }.build()

        return _Music!!
    }

@Suppress("ObjectPropertyName")
private var _Music: ImageVector? = null
