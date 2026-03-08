package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ThreeWaves: ImageVector
    get() {
        if (_ThreeWaves != null) {
            return _ThreeWaves!!
        }
        _ThreeWaves = ImageVector.Builder(
            name = "Filled.ThreeWaves",
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
                moveToRelative(4.685f, 7.92f)
                curveToRelative(0f, -0.936f, -0.453f, -1.652f, -1.097f, -2.108f)
                curveToRelative(-0.622f, -0.441f, -1.408f, -0.637f, -2.153f, -0.637f)
                reflectiveCurveToRelative(-1.531f, 0.196f, -2.153f, 0.637f)
                curveToRelative(-0.643f, 0.456f, -1.097f, 1.172f, -1.097f, 2.107f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -0.394f, 0.172f, -0.675f, 0.465f, -0.884f)
                curveToRelative(0.316f, -0.224f, 0.78f, -0.36f, 1.285f, -0.36f)
                reflectiveCurveToRelative(0.969f, 0.136f, 1.285f, 0.36f)
                curveToRelative(0.292f, 0.207f, 0.463f, 0.486f, 0.465f, 0.877f)
                lineToRelative(-0.002f, 0.027f)
                curveToRelative(-0.003f, 0.03f, -0.008f, 0.08f, -0.021f, 0.141f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.176f, 0.445f)
                curveToRelative(-0.166f, 0.267f, -0.542f, 0.65f, -1.551f, 0.65f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                curveToRelative(1.01f, 0f, 1.385f, 0.383f, 1.551f, 0.65f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.199f, 0.613f)
                curveToRelative(-0.002f, 0.39f, -0.173f, 0.67f, -0.465f, 0.877f)
                curveToRelative(-0.316f, 0.224f, -0.78f, 0.36f, -1.285f, 0.36f)
                reflectiveCurveToRelative(-0.969f, -0.136f, -1.285f, -0.36f)
                curveToRelative(-0.293f, -0.209f, -0.465f, -0.49f, -0.465f, -0.884f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.5f, 0f)
                curveToRelative(0f, 0.935f, 0.454f, 1.65f, 1.097f, 2.107f)
                curveToRelative(0.622f, 0.441f, 1.408f, 0.637f, 2.153f, 0.637f)
                reflectiveCurveToRelative(1.531f, -0.196f, 2.153f, -0.637f)
                curveToRelative(0.643f, -0.456f, 1.097f, -1.172f, 1.097f, -2.107f)
                verticalLineToRelative(-0.002f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.426f, -1.398f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.517f, -0.606f)
                curveToRelative(0.211f, -0.184f, 0.382f, -0.39f, 0.517f, -0.606f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.426f, -1.398f)
                close()
            }
        }.build()

        return _ThreeWaves!!
    }

@Suppress("ObjectPropertyName")
private var _ThreeWaves: ImageVector? = null
