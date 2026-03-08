package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Droplets: ImageVector
    get() {
        if (_Droplets != null) {
            return _Droplets!!
        }
        _Droplets = ImageVector.Builder(
            name = "Filled.Droplets",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.274f, 2.304f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.975f, 0.418f)
                curveToRelative(-0.45f, 1.129f, -1.216f, 2.152f, -2.125f, 3.166f)
                curveToRelative(-0.454f, 0.505f, -0.932f, 0.998f, -1.419f, 1.499f)
                lineToRelative(-0.014f, 0.014f)
                curveToRelative(-0.478f, 0.492f, -0.965f, 0.993f, -1.42f, 1.502f)
                curveToRelative(-0.911f, 1.023f, -1.746f, 2.14f, -2.175f, 3.423f)
                curveToRelative(-0.44f, 1.314f, -0.435f, 2.75f, 0.235f, 4.36f)
                lineToRelative(0.124f, 0.283f)
                curveTo(5.841f, 19.858f, 8.812f, 21.75f, 12f, 21.75f)
                lineToRelative(0.308f, -0.006f)
                curveToRelative(3.173f, -0.121f, 6.082f, -2.106f, 7.311f, -5.058f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.384f, -0.577f)
                curveToRelative(-1.002f, 2.406f, -3.388f, 4.036f, -5.983f, 4.136f)
                lineTo(12f, 20.25f)
                curveToRelative(-2.608f, 0f, -5.044f, -1.556f, -6.134f, -3.91f)
                lineToRelative(-0.1f, -0.23f)
                curveToRelative(-0.536f, -1.286f, -0.52f, -2.349f, -0.199f, -3.308f)
                curveToRelative(0.332f, -0.99f, 1.004f, -1.923f, 1.875f, -2.9f)
                arcToRelative(47f, 47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.388f, -1.47f)
                arcToRelative(53f, 53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.461f, -1.543f)
                curveToRelative(0.952f, -1.062f, 1.853f, -2.24f, 2.4f, -3.61f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.418f, -0.975f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.996f, 4.25f)
                curveToRelative(0.31f, 0f, 0.588f, 0.19f, 0.7f, 0.478f)
                lineToRelative(0.086f, 0.203f)
                curveToRelative(0.217f, 0.469f, 0.539f, 0.916f, 0.931f, 1.373f)
                curveToRelative(0.223f, 0.26f, 0.462f, 0.515f, 0.71f, 0.778f)
                lineToRelative(0.103f, 0.109f)
                curveToRelative(0.213f, 0.225f, 0.433f, 0.458f, 0.643f, 0.692f)
                curveToRelative(0.9f, 1.005f, 1.808f, 2.25f, 1.531f, 3.918f)
                lineToRelative(-0.072f, 0.34f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.085f, 0.29f)
                lineToRelative(-0.107f, 0.294f)
                curveToRelative(-0.688f, 1.7f, -2.29f, 2.871f, -4.076f, 3.011f)
                lineToRelative(-0.36f, 0.014f)
                curveToRelative(-1.807f, 0f, -3.48f, -1.065f, -4.286f, -2.692f)
                lineToRelative(-0.15f, -0.333f)
                curveToRelative(-0.32f, -0.79f, -0.384f, -1.53f, -0.245f, -2.225f)
                curveToRelative(0.138f, -0.684f, 0.463f, -1.277f, 0.842f, -1.8f)
                curveToRelative(0.376f, -0.518f, 0.834f, -1.003f, 1.261f, -1.455f)
                lineToRelative(0.021f, -0.022f)
                curveToRelative(0.432f, -0.457f, 0.836f, -0.885f, 1.18f, -1.337f)
                lineToRelative(0.206f, -0.286f)
                arcToRelative(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.469f, -0.871f)
                lineToRelative(0.05f, -0.104f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.648f, -0.375f)
            }
        }.build()

        return _Droplets!!
    }

@Suppress("ObjectPropertyName")
private var _Droplets: ImageVector? = null
