package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Bath: ImageVector
    get() {
        if (_Bath != null) {
            return _Bath!!
        }
        _Bath = ImageVector.Builder(
            name = "Filled.Bath",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 6.036f)
                curveToRelative(0f, -1.247f, 0.4f, -2.234f, 1.089f, -2.898f)
                curveToRelative(0.683f, -0.659f, 1.584f, -0.933f, 2.455f, -0.882f)
                curveToRelative(1.551f, 0.09f, 3.073f, 1.212f, 3.394f, 3.107f)
                horizontalLineToRelative(0.37f)
                lineToRelative(0.078f, 0.004f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.492f)
                lineToRelative(-0.077f, 0.004f)
                horizontalLineTo(7.44f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(0.211f)
                arcToRelative(2.145f, 2.145f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.945f, -1.61f)
                curveToRelative(-0.504f, -0.03f, -0.98f, 0.13f, -1.327f, 0.465f)
                curveToRelative(-0.342f, 0.33f, -0.63f, 0.898f, -0.63f, 1.818f)
                verticalLineToRelative(5.236f)
                horizontalLineTo(21f)
                lineToRelative(0.077f, 0.003f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.493f)
                lineTo(21f, 12.77f)
                horizontalLineToRelative(-0.31f)
                curveToRelative(-0.005f, 1.062f, -0.045f, 2.27f, -0.356f, 3.347f)
                curveToRelative(-0.347f, 1.2f, -1.043f, 2.288f, -2.365f, 2.905f)
                lineToRelative(0.568f, 1.745f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.427f, 0.464f)
                lineToRelative(-0.57f, -1.752f)
                curveToRelative(-3.024f, 0.707f, -7.167f, 0.673f, -10.138f, -0.005f)
                lineToRelative(-0.57f, 1.757f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.427f, -0.464f)
                lineToRelative(0.567f, -1.745f)
                curveToRelative(-1.322f, -0.618f, -2.018f, -1.705f, -2.365f, -2.905f)
                curveToRelative(-0.361f, -1.253f, -0.36f, -2.683f, -0.357f, -3.853f)
                close()
            }
        }.build()

        return _Bath!!
    }

@Suppress("ObjectPropertyName")
private var _Bath: ImageVector? = null
