package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.GitWaves: ImageVector
    get() {
        if (_GitWaves != null) {
            return _GitWaves!!
        }
        _GitWaves = ImageVector.Builder(
            name = "Filled.GitWaves",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10.75f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.5f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.565f, 2.075f)
                curveToRelative(-0.394f, 0.189f, -0.755f, 0.497f, -1.26f, 0.928f)
                lineToRelative(-0.079f, 0.066f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.58f, 0.655f)
                lineToRelative(-0.102f, 0.008f)
                curveToRelative(-0.662f, 0.053f, -1.135f, 0.09f, -1.547f, 0.236f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.03f, 2.029f)
                curveToRelative(-0.145f, 0.412f, -0.182f, 0.885f, -0.235f, 1.547f)
                lineToRelative(-0.008f, 0.102f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.655f, 1.58f)
                lineToRelative(-0.066f, 0.078f)
                curveToRelative(-0.431f, 0.506f, -0.74f, 0.867f, -0.928f, 1.261f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.87f)
                curveToRelative(0.189f, 0.394f, 0.497f, 0.755f, 0.928f, 1.26f)
                lineToRelative(0.066f, 0.079f)
                curveToRelative(0.41f, 0.48f, 0.604f, 0.939f, 0.655f, 1.58f)
                lineToRelative(0.008f, 0.102f)
                curveToRelative(0.053f, 0.662f, 0.09f, 1.135f, 0.236f, 1.547f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.029f, 2.03f)
                curveToRelative(0.412f, 0.145f, 0.885f, 0.182f, 1.547f, 0.235f)
                lineToRelative(0.102f, 0.008f)
                curveToRelative(0.629f, 0.05f, 1.09f, 0.238f, 1.58f, 0.655f)
                lineToRelative(0.079f, 0.066f)
                curveToRelative(0.505f, 0.431f, 0.866f, 0.74f, 1.26f, 0.928f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.87f, 0f)
                curveToRelative(0.394f, -0.189f, 0.755f, -0.497f, 1.26f, -0.928f)
                lineToRelative(0.079f, -0.066f)
                curveToRelative(0.48f, -0.41f, 0.939f, -0.604f, 1.58f, -0.655f)
                lineToRelative(0.102f, -0.008f)
                curveToRelative(0.662f, -0.053f, 1.135f, -0.09f, 1.547f, -0.236f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.03f, -2.029f)
                curveToRelative(0.145f, -0.412f, 0.182f, -0.885f, 0.235f, -1.547f)
                lineToRelative(0.008f, -0.102f)
                curveToRelative(0.05f, -0.629f, 0.238f, -1.09f, 0.655f, -1.58f)
                lineToRelative(0.066f, -0.079f)
                curveToRelative(0.431f, -0.505f, 0.74f, -0.866f, 0.928f, -1.26f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.87f)
                curveToRelative(-0.189f, -0.394f, -0.497f, -0.755f, -0.928f, -1.26f)
                lineToRelative(-0.066f, -0.079f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.655f, -1.58f)
                lineToRelative(-0.008f, -0.102f)
                curveToRelative(-0.053f, -0.662f, -0.09f, -1.135f, -0.236f, -1.547f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.029f, -2.03f)
                curveToRelative(-0.412f, -0.145f, -0.885f, -0.182f, -1.547f, -0.235f)
                lineToRelative(-0.102f, -0.008f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.58f, -0.655f)
                lineToRelative(-0.079f, -0.066f)
                curveToRelative(-0.505f, -0.431f, -0.866f, -0.74f, -1.26f, -0.928f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.87f, 0f)
                moveTo(9.354f, 11.25f)
                arcToRelative(2.751f, 2.751f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.293f, 0f)
                horizontalLineTo(17f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-2.354f)
                arcToRelative(2.751f, 2.751f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.292f, 0f)
                horizontalLineTo(7f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                close()
            }
        }.build()

        return _GitWaves!!
    }

@Suppress("ObjectPropertyName")
private var _GitWaves: ImageVector? = null
