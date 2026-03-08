package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.PlayWaves: ImageVector
    get() {
        if (_PlayWaves != null) {
            return _PlayWaves!!
        }
        _PlayWaves = ImageVector.Builder(
            name = "Filled.PlayWaves",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.565f, 2.075f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.87f, 0f)
                curveToRelative(0.394f, 0.189f, 0.755f, 0.497f, 1.26f, 0.928f)
                lineToRelative(0.079f, 0.066f)
                curveToRelative(0.48f, 0.41f, 0.939f, 0.604f, 1.58f, 0.655f)
                lineToRelative(0.102f, 0.008f)
                curveToRelative(0.662f, 0.053f, 1.135f, 0.09f, 1.547f, 0.236f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.03f, 2.029f)
                curveToRelative(0.145f, 0.412f, 0.182f, 0.885f, 0.235f, 1.547f)
                lineToRelative(0.008f, 0.102f)
                curveToRelative(0.051f, 0.641f, 0.246f, 1.1f, 0.655f, 1.58f)
                lineToRelative(0.066f, 0.078f)
                curveToRelative(0.431f, 0.506f, 0.74f, 0.867f, 0.928f, 1.261f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.87f)
                curveToRelative(-0.189f, 0.394f, -0.497f, 0.755f, -0.928f, 1.26f)
                lineToRelative(-0.066f, 0.079f)
                curveToRelative(-0.418f, 0.49f, -0.605f, 0.951f, -0.655f, 1.58f)
                lineToRelative(-0.008f, 0.102f)
                curveToRelative(-0.053f, 0.662f, -0.09f, 1.135f, -0.236f, 1.547f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.029f, 2.03f)
                curveToRelative(-0.412f, 0.145f, -0.885f, 0.182f, -1.547f, 0.235f)
                lineToRelative(-0.102f, 0.008f)
                curveToRelative(-0.641f, 0.051f, -1.1f, 0.246f, -1.58f, 0.655f)
                lineToRelative(-0.079f, 0.066f)
                curveToRelative(-0.505f, 0.431f, -0.866f, 0.74f, -1.26f, 0.928f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.87f, 0f)
                curveToRelative(-0.394f, -0.189f, -0.755f, -0.497f, -1.26f, -0.928f)
                lineToRelative(-0.079f, -0.066f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.58f, -0.655f)
                lineToRelative(-0.102f, -0.008f)
                curveToRelative(-0.662f, -0.053f, -1.135f, -0.09f, -1.547f, -0.236f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.03f, -2.029f)
                curveToRelative(-0.145f, -0.412f, -0.182f, -0.885f, -0.235f, -1.547f)
                lineToRelative(-0.008f, -0.102f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.655f, -1.58f)
                lineToRelative(-0.066f, -0.079f)
                curveToRelative(-0.431f, -0.505f, -0.74f, -0.866f, -0.928f, -1.26f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.87f)
                curveToRelative(0.189f, -0.394f, 0.497f, -0.755f, 0.928f, -1.26f)
                lineToRelative(0.066f, -0.079f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.655f, -1.58f)
                lineToRelative(0.008f, -0.102f)
                curveToRelative(0.053f, -0.662f, 0.09f, -1.135f, 0.236f, -1.547f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.029f, -2.03f)
                curveToRelative(0.412f, -0.145f, 0.885f, -0.182f, 1.547f, -0.235f)
                lineToRelative(0.102f, -0.008f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.58f, -0.655f)
                lineToRelative(0.078f, -0.066f)
                curveToRelative(0.506f, -0.431f, 0.867f, -0.74f, 1.261f, -0.928f)
                moveToRelative(1.99f, 7.234f)
                curveToRelative(-0.292f, -0.178f, -0.6f, -0.366f, -0.88f, -0.466f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.586f, -0.09f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.632f, 0.24f)
                curveToRelative(-0.368f, 0.278f, -0.504f, 0.672f, -0.569f, 1.01f)
                curveToRelative(-0.061f, 0.314f, -0.084f, 0.711f, -0.109f, 1.144f)
                lineToRelative(-0.003f, 0.046f)
                curveToRelative(-0.015f, 0.276f, -0.026f, 0.553f, -0.026f, 0.807f)
                reflectiveCurveToRelative(0.01f, 0.531f, 0.026f, 0.807f)
                lineToRelative(0.003f, 0.046f)
                curveToRelative(0.025f, 0.433f, 0.048f, 0.83f, 0.109f, 1.145f)
                curveToRelative(0.065f, 0.337f, 0.2f, 0.731f, 0.57f, 1.008f)
                curveToRelative(0.18f, 0.136f, 0.392f, 0.223f, 0.63f, 0.24f)
                curveToRelative(0.225f, 0.017f, 0.426f, -0.031f, 0.588f, -0.09f)
                curveToRelative(0.278f, -0.1f, 0.587f, -0.287f, 0.879f, -0.465f)
                lineToRelative(0.048f, -0.03f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.113f, -0.789f)
                lineToRelative(0.04f, -0.033f)
                curveToRelative(0.301f, -0.245f, 0.599f, -0.488f, 0.811f, -0.735f)
                curveToRelative(0.254f, -0.295f, 0.433f, -0.648f, 0.433f, -1.104f)
                reflectiveCurveToRelative(-0.18f, -0.809f, -0.433f, -1.104f)
                curveToRelative(-0.212f, -0.247f, -0.51f, -0.49f, -0.81f, -0.735f)
                lineToRelative(-0.04f, -0.033f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.582f, -0.445f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.532f, -0.345f)
                close()
            }
        }.build()

        return _PlayWaves!!
    }

@Suppress("ObjectPropertyName")
private var _PlayWaves: ImageVector? = null
