package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.UserWaves: ImageVector
    get() {
        if (_UserWaves != null) {
            return _UserWaves!!
        }
        _UserWaves = ImageVector.Builder(
            name = "Filled.UserWaves",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.5f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.5f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.435f, 2.075f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.87f, 0f)
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
                quadToRelative(0.122f, 0.042f, 0.253f, 0.074f)
                lineToRelative(0.001f, -0.645f)
                curveTo(6.434f, 15.883f, 9.272f, 14.11f, 12f, 14.11f)
                reflectiveCurveToRelative(5.566f, 1.773f, 5.749f, 5.352f)
                verticalLineToRelative(0.645f)
                quadToRelative(0.132f, -0.032f, 0.254f, -0.075f)
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
                moveTo(8.75f, 9.25f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.5f, 0f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.256f, 20.285f)
                lineToRelative(-0.005f, -0.747f)
                curveTo(16.117f, 16.93f, 14.114f, 15.61f, 12f, 15.61f)
                reflectiveCurveToRelative(-4.117f, 1.32f, -4.251f, 3.928f)
                curveToRelative(-0.001f, 0.02f, -0.003f, 0.276f, -0.005f, 0.747f)
                curveToRelative(0.58f, 0.061f, 1.019f, 0.25f, 1.482f, 0.646f)
                lineToRelative(0.078f, 0.066f)
                curveToRelative(0.506f, 0.431f, 0.867f, 0.74f, 1.261f, 0.928f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.87f, 0f)
                curveToRelative(0.394f, -0.189f, 0.755f, -0.497f, 1.26f, -0.928f)
                lineToRelative(0.079f, -0.066f)
                curveToRelative(0.455f, -0.388f, 0.891f, -0.583f, 1.482f, -0.646f)
            }
        }.build()

        return _UserWaves!!
    }

@Suppress("ObjectPropertyName")
private var _UserWaves: ImageVector? = null
