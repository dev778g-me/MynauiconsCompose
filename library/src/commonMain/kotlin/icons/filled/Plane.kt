package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Plane: ImageVector
    get() {
        if (_Plane != null) {
            return _Plane!!
        }
        _Plane = ImageVector.Builder(
            name = "Filled.Plane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.935f, 3.065f)
                arcToRelative(2.783f, 2.783f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.935f, 0f)
                lineToRelative(-3.112f, 3.112f)
                lineToRelative(-8.75f, -1.758f)
                curveToRelative(-0.554f, -0.111f, -1.076f, 0.083f, -1.462f, 0.333f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.979f, 1.027f)
                curveToRelative(-0.23f, 0.393f, -0.406f, 0.905f, -0.321f, 1.431f)
                curveToRelative(0.093f, 0.586f, 0.484f, 1.044f, 1.091f, 1.28f)
                lineToRelative(5.834f, 2.274f)
                lineTo(6.866f, 13.2f)
                curveToRelative(-0.83f, -0.067f, -1.541f, -0.103f, -2.199f, 0.059f)
                curveToRelative(-0.797f, 0.196f, -1.442f, 0.655f, -2.197f, 1.41f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.144f, 1.174f)
                lineTo(6.08f, 17.92f)
                lineToRelative(2.08f, 3.465f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.173f, 0.144f)
                curveToRelative(0.755f, -0.755f, 1.214f, -1.4f, 1.41f, -2.197f)
                curveToRelative(0.162f, -0.658f, 0.126f, -1.368f, 0.059f, -2.199f)
                lineToRelative(2.435f, -2.435f)
                lineToRelative(2.274f, 5.835f)
                curveToRelative(0.236f, 0.607f, 0.695f, 0.998f, 1.28f, 1.09f)
                curveToRelative(0.527f, 0.085f, 1.038f, -0.09f, 1.432f, -0.321f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.026f, -0.979f)
                curveToRelative(0.25f, -0.386f, 0.444f, -0.908f, 0.333f, -1.461f)
                lineToRelative(-1.758f, -8.75f)
                lineTo(20.935f, 7f)
                arcToRelative(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.935f)
            }
        }.build()

        return _Plane!!
    }

@Suppress("ObjectPropertyName")
private var _Plane: ImageVector? = null
