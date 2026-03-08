package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BookImage: ImageVector
    get() {
        if (_BookImage != null) {
            return _BookImage!!
        }
        _BookImage = ImageVector.Builder(
            name = "Filled.BookImage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 6.75f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.5f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.4f, 17.91f)
                curveToRelative(0.278f, -0.433f, 0.35f, -0.966f, 0.35f, -1.51f)
                lineTo(19.75f, 4.6f)
                curveToRelative(0f, -0.616f, -0.086f, -1.28f, -0.547f, -1.757f)
                curveToRelative(-0.467f, -0.484f, -1.136f, -0.593f, -1.802f, -0.593f)
                lineTo(8.148f, 2.25f)
                curveToRelative(-0.524f, 0f, -0.963f, 0f, -1.323f, 0.03f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.946f, 0.21f)
                lineToRelative(-0.128f, 0.06f)
                curveToRelative(-0.82f, 0.417f, -1.205f, 1.089f, -1.371f, 1.78f)
                curveToRelative(-0.136f, 0.565f, -0.133f, 1.187f, -0.13f, 1.685f)
                lineTo(4.25f, 20.25f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
                horizontalLineToRelative(10.652f)
                curveToRelative(0.617f, 0f, 1.28f, -0.087f, 1.756f, -0.548f)
                curveToRelative(0.483f, -0.467f, 0.592f, -1.136f, 0.592f, -1.802f)
                verticalLineToRelative(-0.91f)
                arcToRelative(1.66f, 1.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.65f, -0.58f)
                moveTo(5.75f, 12.752f)
                curveToRelative(2.103f, -0.068f, 3.962f, 0.971f, 5.081f, 2.58f)
                arcToRelative(10.5f, 10.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.474f, 1.917f)
                lineTo(7.25f, 17.249f)
                curveToRelative(-0.547f, 0f, -1.058f, 0.149f, -1.5f, 0.404f)
                close()
                moveTo(11.875f, 17.249f)
                curveToRelative(0.605f, -3.407f, 3.085f, -6.09f, 6.375f, -7.14f)
                verticalLineToRelative(6.29f)
                curveToRelative(0f, 0.452f, -0.07f, 0.63f, -0.111f, 0.695f)
                curveToRelative(-0.011f, 0.017f, -0.035f, 0.055f, -0.137f, 0.089f)
                lineToRelative(-0.136f, 0.033f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.464f, 0.033f)
                close()
                moveTo(13.25f, 8f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.5f, 0f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 0f)
            }
        }.build()

        return _BookImage!!
    }

@Suppress("ObjectPropertyName")
private var _BookImage: ImageVector? = null
