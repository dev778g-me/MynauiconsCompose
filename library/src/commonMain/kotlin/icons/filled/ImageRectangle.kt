package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ImageRectangle: ImageVector
    get() {
        if (_ImageRectangle != null) {
            return _ImageRectangle!!
        }
        _ImageRectangle = ImageVector.Builder(
            name = "Filled.ImageRectangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.75f, 9f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.125f, 3.75f)
                horizontalLineToRelative(9.75f)
                curveToRelative(0.813f, 0f, 1.468f, 0f, 2f, 0.043f)
                curveToRelative(0.546f, 0.045f, 1.026f, 0.14f, 1.47f, 0.366f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.64f, 1.639f)
                curveToRelative(0.226f, 0.444f, 0.32f, 0.924f, 0.364f, 1.47f)
                curveToRelative(0.044f, 0.531f, 0.044f, 1.187f, 0.044f, 2f)
                verticalLineToRelative(5.464f)
                curveToRelative(0f, 0.813f, 0f, 1.469f, -0.044f, 2f)
                curveToRelative(-0.044f, 0.546f, -0.139f, 1.026f, -0.365f, 1.47f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.639f, 1.64f)
                curveToRelative(-0.444f, 0.226f, -0.924f, 0.32f, -1.47f, 0.365f)
                curveToRelative(-0.532f, 0.043f, -1.187f, 0.043f, -2f, 0.043f)
                horizontalLineToRelative(-9.75f)
                curveToRelative(-0.813f, 0f, -1.468f, 0f, -2f, -0.043f)
                curveToRelative(-0.546f, -0.045f, -1.026f, -0.14f, -1.47f, -0.366f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.64f, -1.639f)
                curveToRelative(-0.225f, -0.444f, -0.32f, -0.924f, -0.364f, -1.47f)
                curveToRelative(-0.044f, -0.531f, -0.044f, -1.187f, -0.044f, -2f)
                verticalLineTo(9.268f)
                curveToRelative(0f, -0.813f, 0f, -1.469f, 0.044f, -2f)
                curveToRelative(0.044f, -0.546f, 0.139f, -1.026f, 0.365f, -1.47f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.639f, -1.64f)
                curveToRelative(0.444f, -0.226f, 0.924f, -0.32f, 1.47f, -0.365f)
                curveToRelative(0.532f, -0.043f, 1.187f, -0.043f, 2f, -0.043f)
                moveToRelative(3.603f, 15f)
                horizontalLineToRelative(6.115f)
                curveToRelative(0.852f, 0f, 1.447f, 0f, 1.91f, -0.038f)
                curveToRelative(0.453f, -0.038f, 0.714f, -0.107f, 0.911f, -0.207f)
                curveToRelative(0.424f, -0.216f, 0.768f, -0.56f, 0.984f, -0.983f)
                curveToRelative(0.1f, -0.198f, 0.17f, -0.459f, 0.207f, -0.913f)
                curveToRelative(0.037f, -0.462f, 0.038f, -1.057f, 0.038f, -1.909f)
                verticalLineTo(9.74f)
                lineToRelative(-0.068f, -0.007f)
                curveToRelative(-3.09f, -0.424f, -5.68f, 0.51f, -7.458f, 2.264f)
                curveToRelative(-1.194f, 1.178f, -2.043f, 2.749f, -2.42f, 4.577f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.03f, 0.143f)
                quadToRelative(-0.186f, 0.974f, -0.189f, 2.033f)
                moveToRelative(-1.324f, -2.09f)
                curveToRelative(-0.601f, -0.845f, -1.523f, -1.616f, -2.602f, -2.153f)
                curveToRelative(-1.177f, -0.586f, -2.486f, -0.865f, -3.695f, -0.7f)
                verticalLineToRelative(0.893f)
                curveToRelative(0f, 0.853f, 0f, 1.447f, 0.039f, 1.91f)
                curveToRelative(0.037f, 0.453f, 0.106f, 0.714f, 0.206f, 0.912f)
                curveToRelative(0.216f, 0.423f, 0.56f, 0.767f, 0.984f, 0.983f)
                curveToRelative(0.197f, 0.1f, 0.458f, 0.17f, 0.912f, 0.207f)
                curveToRelative(0.462f, 0.037f, 1.057f, 0.038f, 1.91f, 0.038f)
                horizontalLineToRelative(2.07f)
                quadToRelative(0.001f, -1.078f, 0.176f, -2.09f)
                moveTo(5.25f, 9f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.5f, 0f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, 0f)
                moveToRelative(1.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 0f)
            }
        }.build()

        return _ImageRectangle!!
    }

@Suppress("ObjectPropertyName")
private var _ImageRectangle: ImageVector? = null
