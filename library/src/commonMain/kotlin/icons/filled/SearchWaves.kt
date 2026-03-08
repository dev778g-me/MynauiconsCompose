package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SearchWaves: ImageVector
    get() {
        if (_SearchWaves != null) {
            return _SearchWaves!!
        }
        _SearchWaves = ImageVector.Builder(
            name = "Filled.SearchWaves",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.75f, 11.429f)
                arcToRelative(2.679f, 2.679f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.357f, 0f)
                arcToRelative(2.679f, 2.679f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.357f, 0f)
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
                moveToRelative(0.864f, 5.175f)
                arcToRelative(4.179f, 4.179f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.38f, 7.614f)
                lineToRelative(1.66f, 1.665f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.062f, -1.059f)
                lineToRelative(-1.663f, -1.668f)
                arcToRelative(4.179f, 4.179f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.44f, -6.552f)
            }
        }.build()

        return _SearchWaves!!
    }

@Suppress("ObjectPropertyName")
private var _SearchWaves: ImageVector? = null
