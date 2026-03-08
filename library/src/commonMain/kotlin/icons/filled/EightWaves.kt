package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.EightWaves: ImageVector
    get() {
        if (_EightWaves != null) {
            return _EightWaves!!
        }
        _EightWaves = ImageVector.Builder(
            name = "Filled.EightWaves",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.008f, 9.935f)
                curveToRelative(0f, -0.597f, 0.212f, -0.91f, 0.496f, -1.104f)
                curveToRelative(0.324f, -0.22f, 0.83f, -0.342f, 1.496f, -0.342f)
                reflectiveCurveToRelative(1.172f, 0.122f, 1.496f, 0.342f)
                curveToRelative(0.284f, 0.193f, 0.496f, 0.507f, 0.496f, 1.104f)
                curveToRelative(0f, 0.388f, -0.335f, 0.75f, -0.963f, 1.06f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.029f, 0.369f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.03f, -0.37f)
                curveToRelative(-0.627f, -0.31f, -0.962f, -0.67f, -0.962f, -1.06f)
                moveToRelative(1.763f, 2.764f)
                curveToRelative(0.091f, -0.027f, 0.17f, -0.047f, 0.229f, -0.062f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.03f, 0.37f)
                curveToRelative(0.627f, 0.31f, 0.962f, 0.67f, 0.962f, 1.06f)
                curveToRelative(0f, 0.596f, -0.212f, 0.91f, -0.496f, 1.103f)
                curveToRelative(-0.324f, 0.22f, -0.83f, 0.342f, -1.496f, 0.342f)
                reflectiveCurveToRelative(-1.172f, -0.122f, -1.496f, -0.342f)
                curveToRelative(-0.284f, -0.193f, -0.496f, -0.507f, -0.496f, -1.104f)
                curveToRelative(0f, -0.388f, 0.335f, -0.75f, 0.963f, -1.06f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, -0.307f)
            }
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
                moveTo(8.75f, 9.935f)
                curveToRelative(0f, 1.053f, 0.803f, 1.702f, 1.462f, 2.065f)
                curveToRelative(-0.66f, 0.363f, -1.462f, 1.012f, -1.462f, 2.065f)
                curveToRelative(0f, 0.952f, 0.374f, 1.671f, 1.04f, 2.123f)
                curveToRelative(0.624f, 0.426f, 1.428f, 0.562f, 2.21f, 0.562f)
                reflectiveCurveToRelative(1.586f, -0.136f, 2.21f, -0.562f)
                curveToRelative(0.666f, -0.452f, 1.04f, -1.17f, 1.04f, -2.123f)
                curveToRelative(0f, -1.053f, -0.803f, -1.702f, -1.462f, -2.065f)
                curveToRelative(0.66f, -0.363f, 1.462f, -1.012f, 1.462f, -2.065f)
                curveToRelative(0f, -0.952f, -0.374f, -1.671f, -1.04f, -2.123f)
                curveToRelative(-0.624f, -0.426f, -1.428f, -0.562f, -2.21f, -0.562f)
                reflectiveCurveToRelative(-1.586f, 0.136f, -2.21f, 0.562f)
                curveToRelative(-0.666f, 0.452f, -1.04f, 1.17f, -1.04f, 2.123f)
            }
        }.build()

        return _EightWaves!!
    }

@Suppress("ObjectPropertyName")
private var _EightWaves: ImageVector? = null
