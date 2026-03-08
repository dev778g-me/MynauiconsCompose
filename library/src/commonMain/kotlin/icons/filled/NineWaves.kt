package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.NineWaves: ImageVector
    get() {
        if (_NineWaves != null) {
            return _NineWaves!!
        }
        _NineWaves = ImageVector.Builder(
            name = "Filled.NineWaves",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.25f, 10.5f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3.5f, 0f)
                curveToRelative(0f, 0.458f, -0.171f, 0.729f, -0.422f, 0.91f)
                curveToRelative(-0.283f, 0.205f, -0.735f, 0.34f, -1.328f, 0.34f)
                reflectiveCurveToRelative(-1.045f, -0.135f, -1.328f, -0.34f)
                curveToRelative(-0.251f, -0.181f, -0.422f, -0.452f, -0.422f, -0.91f)
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
                moveTo(13.75f, 13f)
                verticalLineToRelative(-0.105f)
                curveToRelative(-0.533f, 0.252f, -1.144f, 0.355f, -1.75f, 0.355f)
                curveToRelative(-0.788f, 0f, -1.586f, -0.175f, -2.207f, -0.625f)
                curveToRelative(-0.654f, -0.473f, -1.043f, -1.202f, -1.043f, -2.125f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 0f)
                verticalLineTo(13f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.75f, 3.75f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.75f, 13f)
            }
        }.build()

        return _NineWaves!!
    }

@Suppress("ObjectPropertyName")
private var _NineWaves: ImageVector? = null
