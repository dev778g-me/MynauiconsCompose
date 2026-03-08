package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Subtract: ImageVector
    get() {
        if (_Subtract != null) {
            return _Subtract!!
        }
        _Subtract = ImageVector.Builder(
            name = "Filled.Subtract",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(1.8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                lineTo(3.75f, 3.75f)
                lineTo(4.8f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
                moveTo(8.4f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
                moveTo(13.8f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.05f)
                verticalLineToRelative(0.6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                lineTo(16.35f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.75f)
                close()
                moveTo(3.75f, 8.4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(1.8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
                moveTo(15.6f, 7.65f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(1.8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                lineTo(16.35f, 9.15f)
                curveToRelative(0.773f, 0f, 1.324f, 0.003f, 1.76f, 0.038f)
                curveToRelative(0.453f, 0.037f, 0.714f, 0.107f, 0.912f, 0.207f)
                curveToRelative(0.423f, 0.216f, 0.767f, 0.56f, 0.983f, 0.984f)
                curveToRelative(0.1f, 0.197f, 0.17f, 0.458f, 0.207f, 0.912f)
                curveToRelative(0.037f, 0.462f, 0.038f, 1.056f, 0.038f, 1.909f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.852f, 0f, 1.447f, -0.038f, 1.91f)
                curveToRelative(-0.038f, 0.453f, -0.107f, 0.714f, -0.207f, 0.912f)
                curveToRelative(-0.216f, 0.423f, -0.56f, 0.767f, -0.983f, 0.983f)
                curveToRelative(-0.198f, 0.1f, -0.459f, 0.17f, -0.913f, 0.207f)
                curveToRelative(-0.462f, 0.037f, -1.057f, 0.038f, -1.909f, 0.038f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.852f, 0f, -1.447f, 0f, -1.91f, -0.038f)
                curveToRelative(-0.453f, -0.038f, -0.714f, -0.107f, -0.911f, -0.207f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.984f, -0.983f)
                curveToRelative(-0.1f, -0.198f, -0.17f, -0.459f, -0.207f, -0.913f)
                curveToRelative(-0.035f, -0.435f, -0.038f, -0.986f, -0.038f, -1.759f)
                horizontalLineToRelative(1.05f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                lineTo(8.4f, 14.85f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(0.632f)
                curveToRelative(0f, 0.813f, 0f, 1.469f, 0.043f, 2f)
                curveToRelative(0.045f, 0.546f, 0.14f, 1.026f, 0.366f, 1.47f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.639f, 1.64f)
                curveToRelative(0.444f, 0.226f, 0.924f, 0.32f, 1.47f, 0.365f)
                curveToRelative(0.531f, 0.043f, 1.187f, 0.043f, 2f, 0.043f)
                horizontalLineToRelative(3.064f)
                curveToRelative(0.813f, 0f, 1.469f, 0f, 2f, -0.043f)
                curveToRelative(0.546f, -0.045f, 1.026f, -0.14f, 1.47f, -0.366f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.64f, -1.639f)
                curveToRelative(0.226f, -0.444f, 0.32f, -0.924f, 0.365f, -1.47f)
                curveToRelative(0.043f, -0.531f, 0.043f, -1.187f, 0.043f, -2f)
                verticalLineToRelative(-3.064f)
                curveToRelative(0f, -0.813f, 0f, -1.469f, -0.043f, -2f)
                curveToRelative(-0.045f, -0.546f, -0.14f, -1.026f, -0.366f, -1.47f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.639f, -1.64f)
                curveToRelative(-0.444f, -0.226f, -0.924f, -0.32f, -1.47f, -0.365f)
                curveToRelative(-0.531f, -0.043f, -1.187f, -0.043f, -2f, -0.043f)
                close()
                moveTo(3.75f, 13.8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(1.8f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(1.35f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-0.6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.35f, 13.8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(1.05f)
                horizontalLineTo(13.8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                close()
            }
        }.build()

        return _Subtract!!
    }

@Suppress("ObjectPropertyName")
private var _Subtract: ImageVector? = null
