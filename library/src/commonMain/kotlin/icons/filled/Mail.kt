package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Mail: ImageVector
    get() {
        if (_Mail != null) {
            return _Mail!!
        }
        _Mail = ImageVector.Builder(
            name = "Filled.Mail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.125f, 3.75f)
                horizontalLineToRelative(9.75f)
                curveToRelative(0.813f, 0f, 1.468f, 0f, 2f, 0.043f)
                curveToRelative(0.546f, 0.045f, 1.026f, 0.14f, 1.47f, 0.366f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.64f, 1.639f)
                curveToRelative(0.226f, 0.444f, 0.32f, 0.924f, 0.365f, 1.47f)
                quadToRelative(0.01f, 0.12f, 0.016f, 0.247f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.014f, 0.336f)
                curveToRelative(0.013f, 0.41f, 0.013f, 0.879f, 0.013f, 1.417f)
                verticalLineToRelative(5.464f)
                curveToRelative(0f, 0.813f, 0f, 1.469f, -0.043f, 2f)
                curveToRelative(-0.045f, 0.546f, -0.14f, 1.026f, -0.366f, 1.47f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.639f, 1.64f)
                curveToRelative(-0.444f, 0.226f, -0.924f, 0.32f, -1.47f, 0.365f)
                curveToRelative(-0.532f, 0.043f, -1.187f, 0.043f, -2f, 0.043f)
                horizontalLineToRelative(-9.75f)
                curveToRelative(-0.813f, 0f, -1.468f, 0f, -2f, -0.043f)
                curveToRelative(-0.546f, -0.045f, -1.026f, -0.14f, -1.47f, -0.366f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.639f, -1.639f)
                curveToRelative(-0.226f, -0.444f, -0.32f, -0.924f, -0.365f, -1.47f)
                curveToRelative(-0.044f, -0.531f, -0.044f, -1.187f, -0.044f, -2f)
                verticalLineTo(9.268f)
                curveToRelative(0f, -0.538f, 0f, -1.007f, 0.013f, -1.417f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.014f, -0.336f)
                quadToRelative(0.007f, -0.128f, 0.017f, -0.246f)
                curveToRelative(0.044f, -0.547f, 0.139f, -1.027f, 0.365f, -1.471f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.639f, -1.64f)
                curveToRelative(0.444f, -0.226f, 0.924f, -0.32f, 1.47f, -0.365f)
                curveToRelative(0.532f, -0.043f, 1.187f, -0.043f, 2f, -0.043f)
                moveTo(20.85f, 7.341f)
                curveToRelative(-0.038f, -0.423f, -0.105f, -0.672f, -0.202f, -0.862f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.983f, -0.984f)
                curveToRelative(-0.198f, -0.1f, -0.459f, -0.17f, -0.913f, -0.207f)
                curveToRelative(-0.462f, -0.037f, -1.057f, -0.038f, -1.909f, -0.038f)
                horizontalLineTo(7.157f)
                curveToRelative(-0.852f, 0f, -1.446f, 0f, -1.91f, 0.038f)
                curveToRelative(-0.453f, 0.037f, -0.714f, 0.107f, -0.911f, 0.207f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.984f, 0.984f)
                curveToRelative(-0.096f, 0.19f, -0.164f, 0.439f, -0.202f, 0.862f)
                lineToRelative(6.604f, 4.403f)
                curveToRelative(1.01f, 0.674f, 1.363f, 0.895f, 1.722f, 0.981f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.048f, 0f)
                curveToRelative(0.36f, -0.086f, 0.711f, -0.307f, 1.723f, -0.981f)
                close()
            }
        }.build()

        return _Mail!!
    }

@Suppress("ObjectPropertyName")
private var _Mail: ImageVector? = null
