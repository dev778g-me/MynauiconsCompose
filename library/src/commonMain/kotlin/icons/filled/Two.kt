package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Two: ImageVector
    get() {
        if (_Two != null) {
            return _Two!!
        }
        _Two = ImageVector.Builder(
            name = "Filled.Two",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.153f, 8.288f)
                curveToRelative(-0.374f, 0.336f, -0.653f, 0.86f, -0.653f, 1.633f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                curveToRelative(0f, -1.174f, 0.442f, -2.111f, 1.15f, -2.748f)
                curveToRelative(0.694f, -0.626f, 1.601f, -0.923f, 2.485f, -0.923f)
                reflectiveCurveToRelative(1.79f, 0.297f, 2.485f, 0.923f)
                curveToRelative(0.707f, 0.637f, 1.15f, 1.574f, 1.15f, 2.748f)
                curveToRelative(0f, 1.783f, -1.132f, 3.338f, -2.353f, 4.569f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.684f, 1.508f)
                curveToRelative(1.215f, -0.059f, 2.703f, -0.037f, 3.949f, 0.274f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.364f, 1.456f)
                curveToRelative(-1.134f, -0.284f, -2.602f, -0.29f, -3.834f, -0.214f)
                arcToRelative(25f, 25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.074f, 0.22f)
                lineToRelative(-0.029f, 0.004f)
                lineToRelative(-0.007f, 0.002f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.593f, -1.325f)
                curveToRelative(0.25f, -0.201f, 0.521f, -0.411f, 0.803f, -0.63f)
                curveToRelative(0.89f, -0.69f, 1.893f, -1.47f, 2.768f, -2.352f)
                curveToRelative(1.164f, -1.173f, 1.917f, -2.356f, 1.917f, -3.512f)
                curveToRelative(0f, -0.774f, -0.279f, -1.297f, -0.653f, -1.633f)
                curveToRelative(-0.387f, -0.349f, -0.922f, -0.538f, -1.481f, -0.538f)
                curveToRelative(-0.56f, 0f, -1.095f, 0.19f, -1.482f, 0.538f)
            }
        }.build()

        return _Two!!
    }

@Suppress("ObjectPropertyName")
private var _Two: ImageVector? = null
