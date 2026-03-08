package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.UmbrellaOff: ImageVector
    get() {
        if (_UmbrellaOff != null) {
            return _UmbrellaOff!!
        }
        _UmbrellaOff = ImageVector.Builder(
            name = "Filled.UmbrellaOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.8f, 2.941f)
                arcTo(10.7f, 10.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2.25f)
                curveTo(6.063f, 2.25f, 1.25f, 7.063f, 1.25f, 13f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.238f, 0.57f)
                lineToRelative(0.389f, -0.323f)
                curveToRelative(0.872f, -0.696f, 1.511f, -1.01f, 2.064f, -1.08f)
                curveToRelative(0.518f, -0.065f, 1.076f, 0.073f, 1.83f, 0.56f)
                lineToRelative(0.336f, 0.231f)
                lineToRelative(0.065f, 0.041f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.876f, -1.208f)
                lineToRelative(-0.06f, -0.048f)
                lineToRelative(-0.401f, -0.275f)
                curveToRelative(-0.932f, -0.602f, -1.843f, -0.914f, -2.833f, -0.79f)
                curveToRelative(-0.632f, 0.08f, -1.243f, 0.332f, -1.863f, 0.717f)
                curveTo(3.65f, 7.053f, 7.439f, 3.75f, 12f, 3.75f)
                curveToRelative(1.152f, 0f, 2.254f, 0.21f, 3.27f, 0.595f)
                lineToRelative(0.43f, 0.175f)
                lineToRelative(0.072f, 0.027f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.597f, -1.368f)
                lineToRelative(-0.07f, -0.034f)
                close()
                moveTo(12.75f, 18.773f)
                curveToRelative(0f, 1.094f, -0.437f, 1.965f, -1.123f, 2.55f)
                curveToRelative(-0.67f, 0.572f, -1.538f, 0.84f, -2.377f, 0.84f)
                reflectiveCurveToRelative(-1.707f, -0.268f, -2.377f, -0.84f)
                curveToRelative(-0.578f, -0.492f, -0.977f, -1.187f, -1.09f, -2.047f)
                lineTo(3.53f, 21.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(18f, -18f)
                lineToRelative(0.056f, -0.052f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.056f, 1.056f)
                lineToRelative(-0.052f, 0.056f)
                lineToRelative(-1.901f, 1.9f)
                arcTo(10.72f, 10.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.75f, 13f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.238f, 0.57f)
                curveToRelative(-1.22f, -1.046f, -2.01f, -1.418f, -2.694f, -1.418f)
                curveToRelative(-0.598f, 0f, -1.278f, 0.285f, -2.256f, 1.056f)
                lineToRelative(-0.438f, 0.361f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.018f, -0.039f)
                curveToRelative(-0.756f, -0.756f, -1.471f, -1.215f, -2.14f, -1.436f)
                lineToRelative(-0.216f, 0.216f)
                close()
                moveTo(7.25f, 17.811f)
                verticalLineToRelative(0.962f)
                curveToRelative(0f, 0.664f, 0.251f, 1.114f, 0.596f, 1.409f)
                curveToRelative(0.36f, 0.307f, 0.868f, 0.48f, 1.404f, 0.48f)
                reflectiveCurveToRelative(1.043f, -0.173f, 1.404f, -0.48f)
                curveToRelative(0.345f, -0.294f, 0.596f, -0.745f, 0.596f, -1.41f)
                verticalLineToRelative(-4.961f)
                close()
            }
        }.build()

        return _UmbrellaOff!!
    }

@Suppress("ObjectPropertyName")
private var _UmbrellaOff: ImageVector? = null
