package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Headphones: ImageVector
    get() {
        if (_Headphones != null) {
            return _Headphones!!
        }
        _Headphones = ImageVector.Builder(
            name = "Filled.Headphones",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.25f)
                arcTo(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 12f)
                verticalLineToRelative(5f)
                quadToRelative(0f, 0.04f, 0.004f, 0.08f)
                verticalLineToRelative(0.05f)
                curveToRelative(-0.003f, 1.278f, 0.602f, 2.682f, 1.963f, 3.25f)
                lineToRelative(0.071f, 0.03f)
                curveToRelative(0.11f, 0.044f, 0.22f, 0.12f, 0.362f, 0.25f)
                curveToRelative(0.07f, 0.064f, 0.138f, 0.132f, 0.22f, 0.213f)
                lineToRelative(0.008f, 0.008f)
                curveToRelative(0.08f, 0.08f, 0.175f, 0.175f, 0.277f, 0.265f)
                curveToRelative(0.204f, 0.183f, 0.474f, 0.388f, 0.83f, 0.506f)
                curveToRelative(0.37f, 0.122f, 0.77f, 0.131f, 1.208f, 0.022f)
                curveToRelative(0.723f, -0.18f, 1.266f, -0.752f, 1.469f, -1.454f)
                curveToRelative(0.089f, -0.309f, 0.089f, -0.668f, 0.088f, -1.084f)
                verticalLineToRelative(-4.094f)
                curveToRelative(0f, -0.285f, 0f, -0.528f, -0.01f, -0.728f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.107f, -0.627f)
                curveToRelative(-0.23f, -0.683f, -0.786f, -1.223f, -1.504f, -1.377f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.264f, 0.065f)
                curveToRelative(-0.37f, 0.133f, -0.652f, 0.354f, -0.87f, 0.558f)
                curveToRelative(-0.12f, 0.11f, -0.269f, 0.267f, -0.391f, 0.396f)
                lineToRelative(-0.164f, 0.17f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.427f, 0.338f)
                quadToRelative(-0.136f, 0.07f, -0.263f, 0.152f)
                verticalLineTo(12f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16.5f, 0f)
                verticalLineToRelative(1.864f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.538f, -0.274f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.362f, -0.25f)
                curveToRelative(-0.07f, -0.064f, -0.138f, -0.132f, -0.22f, -0.213f)
                lineToRelative(-0.008f, -0.008f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.277f, -0.265f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.83f, -0.506f)
                quadToRelative(-0.553f, -0.184f, -1.208f, -0.022f)
                curveToRelative(-0.723f, 0.18f, -1.266f, 0.752f, -1.469f, 1.454f)
                curveToRelative(-0.089f, 0.309f, -0.088f, 0.668f, -0.088f, 1.085f)
                verticalLineToRelative(4.093f)
                curveToRelative(0f, 0.285f, 0f, 0.528f, 0.01f, 0.728f)
                curveToRelative(0.012f, 0.208f, 0.037f, 0.418f, 0.107f, 0.627f)
                curveToRelative(0.23f, 0.683f, 0.786f, 1.223f, 1.504f, 1.377f)
                curveToRelative(0.463f, 0.1f, 0.883f, 0.073f, 1.264f, -0.065f)
                curveToRelative(0.37f, -0.133f, 0.652f, -0.354f, 0.87f, -0.558f)
                curveToRelative(0.12f, -0.11f, 0.269f, -0.267f, 0.391f, -0.395f)
                curveToRelative(0.065f, -0.069f, 0.123f, -0.13f, 0.164f, -0.17f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.427f, -0.34f)
                curveToRelative(1.11f, -0.573f, 1.755f, -1.724f, 1.758f, -2.936f)
                verticalLineToRelative(-0.143f)
                lineTo(21.75f, 17f)
                verticalLineToRelative(-5f)
                arcTo(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2.25f)
            }
        }.build()

        return _Headphones!!
    }

@Suppress("ObjectPropertyName")
private var _Headphones: ImageVector? = null
