package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Sprout: ImageVector
    get() {
        if (_Sprout != null) {
            return _Sprout!!
        }
        _Sprout = ImageVector.Builder(
            name = "Filled.Sprout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.51f, 4.272f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.647f, 0.008f)
                curveToRelative(0.704f, 0.055f, 1.558f, 0.204f, 2.125f, 0.66f)
                curveToRelative(0.777f, 0.586f, 1.172f, 1.487f, 1.254f, 2.374f)
                arcToRelative(3.87f, 3.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.38f, 2.07f)
                curveToRelative(0.36f, 0.47f, 0.667f, 1.046f, 0.926f, 1.63f)
                curveToRelative(0.354f, 0.798f, 0.651f, 1.687f, 0.892f, 2.511f)
                curveToRelative(0.097f, -0.29f, 0.208f, -0.582f, 0.332f, -0.864f)
                curveToRelative(0.186f, -0.424f, 0.414f, -0.848f, 0.693f, -1.223f)
                curveToRelative(-0.63f, -1.322f, -0.155f, -2.918f, 1.02f, -3.767f)
                curveToRelative(0.503f, -0.386f, 1.221f, -0.516f, 1.804f, -0.567f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.825f, 0.004f)
                lineToRelative(0.183f, 0.024f)
                curveToRelative(0.835f, 0.153f, 1.387f, 0.915f, 1.337f, 1.743f)
                lineToRelative(-0.02f, 0.178f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.424f, 1.793f)
                curveToRelative(-0.19f, 0.57f, -0.49f, 1.256f, -0.99f, 1.655f)
                curveToRelative(-1.077f, 0.914f, -2.626f, 0.854f, -3.72f, 0.11f)
                quadToRelative(-0.175f, 0.29f, -0.335f, 0.654f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.551f, 1.65f)
                arcToRelative(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.252f, 1.18f)
                curveToRelative(2.416f, 0.07f, 4.748f, 0.88f, 6.9f, 1.779f)
                lineToRelative(1.024f, 0.439f)
                lineToRelative(0.068f, 0.034f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.595f, 1.368f)
                lineToRelative(-0.073f, -0.027f)
                lineToRelative(-1.015f, -0.435f)
                curveToRelative(-2.203f, -0.92f, -4.41f, -1.665f, -6.632f, -1.666f)
                lineToRelative(-0.514f, 0.014f)
                horizontalLineToRelative(-0.078f)
                curveToRelative(-2.738f, -0.144f, -5.452f, 0.907f, -8.161f, 2.087f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.6f, -1.375f)
                curveToRelative(2.415f, -1.052f, 5.092f, -2.126f, 7.88f, -2.216f)
                arcToRelative(34f, 34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.532f, -2.109f)
                arcToRelative(19f, 19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.837f, -2.365f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.555f, -1.053f)
                curveToRelative(-1.228f, 0.88f, -2.9f, 0.682f, -4.047f, -0.333f)
                curveToRelative(-0.547f, -0.455f, -0.88f, -1.236f, -1.093f, -1.901f)
                arcTo(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.62f, 6.72f)
                lineToRelative(-0.08f, -0.473f)
                curveToRelative(-0.15f, -0.95f, 0.506f, -1.862f, 1.498f, -1.942f)
                close()
            }
        }.build()

        return _Sprout!!
    }

@Suppress("ObjectPropertyName")
private var _Sprout: ImageVector? = null
