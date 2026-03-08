package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FourWaves: ImageVector
    get() {
        if (_FourWaves != null) {
            return _FourWaves!!
        }
        _FourWaves = ImageVector.Builder(
            name = "Filled.FourWaves",
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
                moveToRelative(2.741f, 6.126f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.445f, -0.402f)
                curveToRelative(-0.383f, 1.378f, -1.16f, 2.67f, -1.863f, 3.634f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.185f, 1.44f)
                lineToRelative(-0.072f, 0.075f)
                lineToRelative(-0.018f, 0.018f)
                lineToRelative(-0.004f, 0.004f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.531f, 1.28f)
                horizontalLineToRelative(3f)
                verticalLineTo(16f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineTo(12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-1.366f)
                quadToRelative(0.159f, -0.203f, 0.326f, -0.433f)
                curveToRelative(0.755f, -1.035f, 1.645f, -2.494f, 2.096f, -4.116f)
            }
        }.build()

        return _FourWaves!!
    }

@Suppress("ObjectPropertyName")
private var _FourWaves: ImageVector? = null
