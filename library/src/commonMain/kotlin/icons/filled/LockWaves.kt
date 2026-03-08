package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LockWaves: ImageVector
    get() {
        if (_LockWaves != null) {
            return _LockWaves!!
        }
        _LockWaves = ImageVector.Builder(
            name = "Filled.LockWaves",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.746f, 8.925f)
                verticalLineToRelative(1.271f)
                horizontalLineToRelative(2.508f)
                verticalLineToRelative(-1.27f)
                curveToRelative(0f, -0.454f, -0.163f, -0.725f, -0.36f, -0.893f)
                curveToRelative(-0.216f, -0.182f, -0.53f, -0.29f, -0.88f, -0.283f)
                curveToRelative(-0.717f, 0.014f, -1.268f, 0.451f, -1.268f, 1.175f)
                moveTo(8.75f, 11.957f)
                curveToRelative(0f, -0.15f, 0.119f, -0.26f, 0.252f, -0.26f)
                horizontalLineToRelative(5.996f)
                curveToRelative(0.133f, 0f, 0.252f, 0.11f, 0.252f, 0.26f)
                verticalLineToRelative(3.032f)
                curveToRelative(0f, 0.15f, -0.119f, 0.261f, -0.252f, 0.261f)
                horizontalLineTo(9.002f)
                arcToRelative(0.257f, 0.257f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.252f, -0.26f)
                close()
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
                moveToRelative(4.19f, 6.85f)
                curveToRelative(0f, -0.868f, -0.339f, -1.568f, -0.892f, -2.037f)
                curveToRelative(-0.537f, -0.454f, -1.224f, -0.65f, -1.877f, -0.637f)
                curveToRelative(-1.287f, 0.024f, -2.74f, 0.906f, -2.74f, 2.674f)
                verticalLineToRelative(1.271f)
                horizontalLineToRelative(-0.244f)
                curveToRelative(-0.974f, 0f, -1.752f, 0.795f, -1.752f, 1.761f)
                verticalLineToRelative(3.032f)
                curveToRelative(0f, 0.967f, 0.778f, 1.761f, 1.752f, 1.761f)
                horizontalLineToRelative(5.996f)
                curveToRelative(0.974f, 0f, 1.752f, -0.794f, 1.752f, -1.76f)
                verticalLineToRelative(-3.033f)
                curveToRelative(0f, -0.966f, -0.778f, -1.76f, -1.752f, -1.76f)
                horizontalLineToRelative(-0.244f)
                close()
            }
        }.build()

        return _LockWaves!!
    }

@Suppress("ObjectPropertyName")
private var _LockWaves: ImageVector? = null
