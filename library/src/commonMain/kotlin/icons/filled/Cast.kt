package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Cast: ImageVector
    get() {
        if (_Cast != null) {
            return _Cast!!
        }
        _Cast = ImageVector.Builder(
            name = "Filled.Cast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.91f, 3.25f)
                horizontalLineToRelative(9.322f)
                curveToRelative(0.813f, 0f, 1.469f, 0f, 2f, 0.043f)
                curveToRelative(0.546f, 0.045f, 1.026f, 0.14f, 1.47f, 0.366f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.64f, 1.639f)
                curveToRelative(0.226f, 0.444f, 0.32f, 0.924f, 0.365f, 1.47f)
                curveToRelative(0.043f, 0.531f, 0.043f, 1.187f, 0.043f, 2f)
                verticalLineToRelative(6.464f)
                curveToRelative(0f, 0.813f, 0f, 1.469f, -0.043f, 2f)
                curveToRelative(-0.045f, 0.546f, -0.14f, 1.026f, -0.366f, 1.47f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.639f, 1.64f)
                curveToRelative(-0.444f, 0.226f, -0.924f, 0.32f, -1.47f, 0.365f)
                curveToRelative(-0.531f, 0.043f, -1.187f, 0.043f, -2f, 0.043f)
                horizontalLineToRelative(-2.085f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineTo(16.2f)
                curveToRelative(0.852f, 0f, 1.447f, 0f, 1.91f, -0.038f)
                curveToRelative(0.453f, -0.038f, 0.714f, -0.107f, 0.912f, -0.207f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.983f, -0.983f)
                curveToRelative(0.1f, -0.198f, 0.17f, -0.459f, 0.207f, -0.913f)
                curveToRelative(0.038f, -0.462f, 0.038f, -1.057f, 0.038f, -1.909f)
                verticalLineTo(8.8f)
                curveToRelative(0f, -0.852f, 0f, -1.447f, -0.038f, -1.91f)
                curveToRelative(-0.037f, -0.453f, -0.107f, -0.714f, -0.207f, -0.911f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.983f, -0.984f)
                curveToRelative(-0.198f, -0.1f, -0.459f, -0.17f, -0.913f, -0.207f)
                curveToRelative(-0.462f, -0.037f, -1.057f, -0.038f, -1.909f, -0.038f)
                horizontalLineTo(7.028f)
                curveToRelative(-1.006f, 0f, -1.357f, 0.007f, -1.626f, 0.081f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.57f, 1.57f)
                curveToRelative(-0.075f, 0.27f, -0.082f, 0.621f, -0.082f, 1.627f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(7.91f)
                curveToRelative(0f, -0.84f, 0f, -1.415f, 0.135f, -1.906f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.618f, -2.618f)
                curveToRelative(0.491f, -0.136f, 1.065f, -0.135f, 1.906f, -0.135f)
                moveTo(2.25f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                arcTo(8.75f, 8.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.75f, 20f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, 0.75f)
                lineToRelative(-8f, 0.003f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                close()
            }
        }.build()

        return _Cast!!
    }

@Suppress("ObjectPropertyName")
private var _Cast: ImageVector? = null
