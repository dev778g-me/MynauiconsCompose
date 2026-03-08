package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Seven: ImageVector
    get() {
        if (_Seven != null) {
            return _Seven!!
        }
        _Seven = ImageVector.Builder(
            name = "Filled.Seven",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.522f, 6.818f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.91f, -0.546f)
                curveToRelative(1.134f, 0.284f, 2.602f, 0.29f, 3.834f, 0.214f)
                arcToRelative(25f, 25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.074f, -0.22f)
                lineToRelative(0.029f, -0.005f)
                horizontalLineToRelative(0.007f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.71f, 1.207f)
                lineToRelative(-0.003f, 0.004f)
                lineToRelative(-0.01f, 0.012f)
                lineToRelative(-0.04f, 0.05f)
                lineToRelative(-0.153f, 0.198f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.242f, 3.254f)
                curveToRelative(-0.613f, 0.998f, -1.217f, 2.095f, -1.666f, 3.16f)
                curveToRelative(-0.453f, 1.078f, -0.722f, 2.064f, -0.722f, 2.854f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                curveToRelative(0f, -1.085f, 0.356f, -2.287f, 0.84f, -3.436f)
                curveToRelative(0.489f, -1.16f, 1.135f, -2.329f, 1.771f, -3.363f)
                curveToRelative(0.53f, -0.862f, 1.06f, -1.64f, 1.497f, -2.254f)
                quadToRelative(-0.24f, 0.02f, -0.499f, 0.036f)
                curveToRelative(-1.268f, 0.08f, -2.925f, 0.086f, -4.291f, -0.255f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.546f, -0.91f)
            }
        }.build()

        return _Seven!!
    }

@Suppress("ObjectPropertyName")
private var _Seven: ImageVector? = null
