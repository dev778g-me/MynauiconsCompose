package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.RectangleVertical: ImageVector
    get() {
        if (_RectangleVertical != null) {
            return _RectangleVertical!!
        }
        _RectangleVertical = ImageVector.Builder(
            name = "Filled.RectangleVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.267f, 1.25f)
                curveToRelative(-0.812f, 0f, -1.469f, 0f, -2f, 0.045f)
                curveToRelative(-0.55f, 0.047f, -1.033f, 0.145f, -1.48f, 0.381f)
                arcToRelative(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.633f, 1.692f)
                curveToRelative(-0.223f, 0.454f, -0.316f, 0.944f, -0.36f, 1.507f)
                curveToRelative(-0.044f, 0.549f, -0.044f, 1.227f, -0.044f, 2.072f)
                verticalLineToRelative(10.106f)
                curveToRelative(0f, 0.845f, 0f, 1.523f, 0.043f, 2.072f)
                curveToRelative(0.045f, 0.563f, 0.138f, 1.053f, 0.36f, 1.507f)
                arcToRelative(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.635f, 1.692f)
                curveToRelative(0.446f, 0.236f, 0.93f, 0.334f, 1.478f, 0.38f)
                curveToRelative(0.532f, 0.046f, 1.189f, 0.046f, 2f, 0.046f)
                horizontalLineToRelative(5.467f)
                curveToRelative(0.812f, 0f, 1.469f, 0f, 2f, -0.045f)
                curveToRelative(0.55f, -0.047f, 1.033f, -0.145f, 1.48f, -0.381f)
                arcToRelative(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.633f, -1.692f)
                curveToRelative(0.223f, -0.454f, 0.316f, -0.944f, 0.36f, -1.508f)
                curveToRelative(0.044f, -0.548f, 0.044f, -1.226f, 0.044f, -2.07f)
                verticalLineTo(6.946f)
                curveToRelative(0f, -0.845f, 0f, -1.523f, -0.043f, -2.072f)
                curveToRelative(-0.044f, -0.563f, -0.138f, -1.053f, -0.36f, -1.507f)
                arcToRelative(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.635f, -1.692f)
                curveToRelative(-0.446f, -0.236f, -0.93f, -0.334f, -1.478f, -0.38f)
                curveToRelative(-0.532f, -0.046f, -1.189f, -0.046f, -2f, -0.046f)
                close()
            }
        }.build()

        return _RectangleVertical!!
    }

@Suppress("ObjectPropertyName")
private var _RectangleVertical: ImageVector? = null
