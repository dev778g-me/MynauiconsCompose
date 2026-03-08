package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Map: ImageVector
    get() {
        if (_Map != null) {
            return _Map!!
        }
        _Map = ImageVector.Builder(
            name = "Filled.Map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.25f, 16.952f)
                verticalLineTo(4.054f)
                curveToRelative(-0.533f, 0.26f, -1.056f, 0.67f, -1.65f, 1.162f)
                lineToRelative(-0.161f, 0.134f)
                curveToRelative(-0.746f, 0.62f, -1.624f, 1.352f, -2.689f, 1.702f)
                verticalLineToRelative(12.899f)
                curveToRelative(0.534f, -0.261f, 1.056f, -0.671f, 1.65f, -1.162f)
                lineToRelative(0.161f, -0.135f)
                curveToRelative(0.746f, -0.62f, 1.624f, -1.351f, 2.689f, -1.702f)
                moveToRelative(4.092f, -13.946f)
                curveToRelative(0.307f, 0.123f, 0.586f, 0.235f, 0.852f, 0.326f)
                lineToRelative(0.037f, 0.013f)
                curveToRelative(0.463f, 0.16f, 0.87f, 0.3f, 1.192f, 0.456f)
                curveToRelative(0.351f, 0.169f, 0.668f, 0.385f, 0.91f, 0.732f)
                curveToRelative(0.24f, 0.344f, 0.334f, 0.718f, 0.377f, 1.107f)
                curveToRelative(0.04f, 0.363f, 0.04f, 0.804f, 0.04f, 1.311f)
                verticalLineToRelative(8.504f)
                curveToRelative(0f, 0.726f, 0f, 1.334f, -0.054f, 1.813f)
                curveToRelative(-0.055f, 0.495f, -0.179f, 0.981f, -0.526f, 1.375f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.746f, 0.556f)
                curveToRelative(-0.535f, 0.247f, -1.081f, 0.253f, -1.574f, 0.168f)
                curveToRelative(-0.483f, -0.083f, -0.96f, -0.263f, -1.38f, -0.437f)
                quadToRelative(-0.21f, -0.087f, -0.402f, -0.169f)
                curveToRelative(-0.28f, -0.119f, -0.536f, -0.228f, -0.799f, -0.32f)
                curveToRelative(-0.374f, -0.133f, -0.667f, -0.194f, -0.902f, -0.186f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.435f, 0.06f)
                curveToRelative(-0.867f, 0.213f, -1.599f, 0.819f, -2.504f, 1.57f)
                lineToRelative(-0.072f, 0.059f)
                curveToRelative(-0.874f, 0.724f, -1.933f, 1.588f, -3.298f, 1.777f)
                curveToRelative(-0.428f, 0.06f, -0.975f, 0.022f, -1.527f, -0.062f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.805f, -0.42f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.742f, -0.707f)
                curveToRelative(-0.505f, -0.269f, -1.008f, -0.617f, -1.317f, -1.06f)
                curveToRelative(-0.24f, -0.345f, -0.334f, -0.719f, -0.377f, -1.108f)
                curveToRelative(-0.04f, -0.363f, -0.04f, -0.803f, -0.04f, -1.311f)
                verticalLineTo(8.549f)
                curveToRelative(0f, -0.726f, 0f, -1.334f, 0.054f, -1.813f)
                curveToRelative(0.055f, -0.495f, 0.179f, -0.981f, 0.526f, -1.375f)
                curveToRelative(0.208f, -0.235f, 0.461f, -0.425f, 0.746f, -0.556f)
                curveToRelative(0.535f, -0.247f, 1.081f, -0.253f, 1.574f, -0.168f)
                curveToRelative(0.483f, 0.084f, 0.96f, 0.263f, 1.38f, 0.437f)
                quadToRelative(0.21f, 0.087f, 0.402f, 0.169f)
                curveToRelative(0.28f, 0.12f, 0.536f, 0.228f, 0.799f, 0.32f)
                curveToRelative(0.375f, 0.133f, 0.667f, 0.195f, 0.902f, 0.186f)
                quadToRelative(0.22f, -0.008f, 0.435f, -0.06f)
                curveToRelative(0.867f, -0.213f, 1.599f, -0.819f, 2.504f, -1.57f)
                lineToRelative(0.072f, -0.059f)
                curveToRelative(0.874f, -0.723f, 1.933f, -1.587f, 3.298f, -1.777f)
                curveToRelative(0.818f, -0.113f, 1.627f, 0.082f, 2.326f, 0.317f)
                curveToRelative(0.354f, 0.12f, 0.702f, 0.258f, 1.022f, 0.386f)
                close()
            }
        }.build()

        return _Map!!
    }

@Suppress("ObjectPropertyName")
private var _Map: ImageVector? = null
