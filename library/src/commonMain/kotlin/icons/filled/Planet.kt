package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Planet: ImageVector
    get() {
        if (_Planet != null) {
            return _Planet!!
        }
        _Planet = ImageVector.Builder(
            name = "Filled.Planet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.08f, 12.215f)
                curveToRelative(-0.112f, 3.638f, -3.052f, 6.535f, -6.642f, 6.535f)
                arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.948f, -0.699f)
                curveToRelative(1.495f, -0.501f, 3.116f, -1.24f, 4.738f, -2.19f)
                curveToRelative(1.913f, -1.12f, 3.58f, -2.389f, 4.852f, -3.646f)
                moveToRelative(-11.548f, 6.37f)
                arcToRelative(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.906f, 1.665f)
                curveToRelative(4.509f, 0f, 8.146f, -3.704f, 8.146f, -8.25f)
                quadToRelative(0f, -0.697f, -0.111f, -1.363f)
                curveToRelative(0.506f, -0.676f, 0.89f, -1.353f, 1.1f, -2.001f)
                curveToRelative(0.236f, -0.734f, 0.272f, -1.518f, -0.115f, -2.197f)
                curveToRelative(-0.394f, -0.692f, -1.1f, -1.056f, -1.864f, -1.213f)
                curveToRelative(-0.722f, -0.149f, -1.576f, -0.132f, -2.494f, 0.008f)
                arcToRelative(8.03f, 8.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.662f, -1.484f)
                curveTo(7.93f, 3.75f, 4.293f, 7.454f, 4.293f, 12f)
                quadToRelative(0f, 0.181f, 0.008f, 0.363f)
                curveToRelative(-0.773f, 0.851f, -1.371f, 1.707f, -1.716f, 2.516f)
                curveToRelative(-0.368f, 0.862f, -0.502f, 1.808f, -0.043f, 2.615f)
                curveToRelative(0.448f, 0.786f, 1.293f, 1.148f, 2.186f, 1.267f)
                curveToRelative(0.81f, 0.108f, 1.77f, 0.037f, 2.804f, -0.175f)
                moveToRelative(-1.354f, -1.307f)
                arcToRelative(8.3f, 8.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.554f, -2.942f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.66f, 1.132f)
                curveToRelative(-0.285f, 0.67f, -0.242f, 1.067f, -0.118f, 1.284f)
                curveToRelative(0.118f, 0.207f, 0.413f, 0.433f, 1.081f, 0.522f)
                curveToRelative(0.352f, 0.047f, 0.772f, 0.05f, 1.25f, 0.004f)
                moveTo(18.616f, 6.623f)
                quadToRelative(0.378f, 0.01f, 0.676f, 0.072f)
                curveToRelative(0.52f, 0.107f, 0.758f, 0.303f, 0.862f, 0.486f)
                curveToRelative(0.105f, 0.183f, 0.153f, 0.49f, -0.01f, 0.994f)
                quadToRelative(-0.08f, 0.255f, -0.229f, 0.548f)
                arcToRelative(8.3f, 8.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.299f, -2.1f)
            }
        }.build()

        return _Planet!!
    }

@Suppress("ObjectPropertyName")
private var _Planet: ImageVector? = null
