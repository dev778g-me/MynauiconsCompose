package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Flower: ImageVector
    get() {
        if (_Flower != null) {
            return _Flower!!
        }
        _Flower = ImageVector.Builder(
            name = "Filled.Flower",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10.75f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.5f)
                moveToRelative(3.496f, -4.89f)
                curveToRelative(-0.004f, 0.075f, -0.016f, 0.152f, -0.027f, 0.23f)
                quadToRelative(0.15f, -0.119f, 0.306f, -0.211f)
                lineToRelative(0.157f, -0.085f)
                curveToRelative(1.639f, -0.835f, 3.684f, -0.203f, 4.598f, 1.38f)
                lineToRelative(0.084f, 0.156f)
                curveToRelative(0.799f, 1.563f, 0.306f, 3.548f, -1.187f, 4.518f)
                lineToRelative(-0.152f, 0.093f)
                quadToRelative(-0.16f, 0.088f, -0.337f, 0.159f)
                quadToRelative(0.178f, 0.069f, 0.337f, 0.159f)
                lineToRelative(0.152f, 0.093f)
                curveToRelative(1.493f, 0.97f, 1.986f, 2.956f, 1.187f, 4.518f)
                lineToRelative(-0.084f, 0.155f)
                curveToRelative(-0.914f, 1.584f, -2.96f, 2.216f, -4.598f, 1.381f)
                lineToRelative(-0.158f, -0.086f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.305f, -0.212f)
                quadToRelative(0.029f, 0.19f, 0.031f, 0.372f)
                lineToRelative(-0.005f, 0.178f)
                curveTo(15.4f, 20.495f, 13.83f, 21.95f, 12f, 21.95f)
                reflectiveCurveToRelative(-3.399f, -1.455f, -3.495f, -3.292f)
                lineTo(8.5f, 18.48f)
                quadToRelative(0.001f, -0.182f, 0.03f, -0.372f)
                quadToRelative(-0.091f, 0.075f, -0.186f, 0.14f)
                lineToRelative(-0.118f, 0.072f)
                curveToRelative(-1.612f, 0.93f, -3.679f, 0.377f, -4.664f, -1.145f)
                lineToRelative(-0.092f, -0.15f)
                curveToRelative(-0.944f, -1.634f, -0.407f, -3.806f, 1.256f, -4.766f)
                lineToRelative(0.122f, -0.067f)
                quadToRelative(0.102f, -0.05f, 0.214f, -0.092f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.214f, -0.093f)
                lineToRelative(-0.122f, -0.066f)
                curveToRelative(-1.663f, -0.96f, -2.2f, -3.131f, -1.256f, -4.766f)
                lineToRelative(0.092f, -0.15f)
                curveToRelative(0.985f, -1.522f, 3.053f, -2.076f, 4.664f, -1.146f)
                lineToRelative(0.118f, 0.073f)
                quadToRelative(0.095f, 0.065f, 0.186f, 0.138f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.03f, -0.37f)
                curveToRelative(0f, -1.92f, 1.612f, -3.47f, 3.5f, -3.47f)
                lineToRelative(0.176f, 0.005f)
                curveToRelative(1.81f, 0.093f, 3.324f, 1.605f, 3.324f, 3.466f)
                close()
            }
        }.build()

        return _Flower!!
    }

@Suppress("ObjectPropertyName")
private var _Flower: ImageVector? = null
