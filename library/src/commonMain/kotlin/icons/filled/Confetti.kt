package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Confetti: ImageVector
    get() {
        if (_Confetti != null) {
            return _Confetti!!
        }
        _Confetti = ImageVector.Builder(
            name = "Filled.Confetti",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.273f, 2.448f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0.044f)
                curveToRelative(0.606f, 0.658f, 0.907f, 1.44f, 0.793f, 2.305f)
                curveToRelative(-0.108f, 0.826f, -0.58f, 1.618f, -1.274f, 2.372f)
                lineToRelative(-2.406f, 2.615f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.104f, -1.016f)
                lineToRelative(2.406f, -2.615f)
                curveToRelative(0.59f, -0.64f, 0.84f, -1.157f, 0.891f, -1.551f)
                curveToRelative(0.047f, -0.354f, -0.053f, -0.706f, -0.41f, -1.094f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.044f, -1.06f)
                moveTo(8f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-0.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 4f)
                moveToRelative(12f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(0f, 9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(13f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(-2f, 5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(0.594f, -8.009f)
                curveToRelative(-0.51f, 0f, -1.126f, 0.274f, -1.855f, 1.066f)
                lineToRelative(-2.406f, 2.614f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.104f, -1.015f)
                lineToRelative(2.407f, -2.615f)
                curveToRelative(0.876f, -0.952f, 1.863f, -1.55f, 2.958f, -1.55f)
                reflectiveCurveToRelative(2.082f, 0.598f, 2.958f, 1.55f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.104f, 1.016f)
                curveToRelative(-0.728f, -0.792f, -1.345f, -1.066f, -1.854f, -1.066f)
                moveTo(4.901f, 8.98f)
                arcToRelative(1.258f, 1.258f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.114f, -0.477f)
                lineToRelative(7.741f, 7.53f)
                lineToRelative(0.036f, 0.037f)
                curveToRelative(0.6f, 0.67f, 0.325f, 1.735f, -0.526f, 2.03f)
                lineTo(3.92f, 21.68f)
                curveToRelative(-0.97f, 0.336f, -1.904f, -0.567f, -1.62f, -1.54f)
                lineToRelative(2.585f, -11.1f)
                quadToRelative(0.006f, -0.03f, 0.016f, -0.06f)
            }
        }.build()

        return _Confetti!!
    }

@Suppress("ObjectPropertyName")
private var _Confetti: ImageVector? = null
