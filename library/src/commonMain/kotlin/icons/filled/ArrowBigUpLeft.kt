package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ArrowBigUpLeft: ImageVector
    get() {
        if (_ArrowBigUpLeft != null) {
            return _ArrowBigUpLeft!!
        }
        _ArrowBigUpLeft = ImageVector.Builder(
            name = "Filled.ArrowBigUpLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.634f, 3.25f)
                horizontalLineToRelative(9.797f)
                curveToRelative(0.607f, 0.015f, 1.017f, 0.458f, 1.198f, 0.813f)
                curveToRelative(0.175f, 0.34f, 0.331f, 1.007f, -0.167f, 1.505f)
                lineToRelative(-0.006f, 0.006f)
                lineToRelative(-2.594f, 2.534f)
                lineToRelative(6.51f, 6.51f)
                curveToRelative(0.473f, 0.474f, 0.529f, 1.274f, 0.017f, 1.786f)
                lineToRelative(-3.986f, 3.985f)
                curveToRelative(-0.511f, 0.512f, -1.311f, 0.456f, -1.785f, -0.018f)
                lineToRelative(-6.51f, -6.51f)
                lineToRelative(-2.54f, 2.601f)
                curveToRelative(-0.498f, 0.498f, -1.165f, 0.342f, -1.505f, 0.167f)
                curveToRelative(-0.355f, -0.181f, -0.798f, -0.591f, -0.813f, -1.198f)
                verticalLineTo(5.634f)
                curveToRelative(0f, -0.268f, 0f, -0.513f, 0.017f, -0.716f)
                curveToRelative(0.018f, -0.22f, 0.059f, -0.458f, 0.178f, -0.692f)
                curveToRelative(0.171f, -0.336f, 0.445f, -0.61f, 0.781f, -0.781f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.692f, -0.178f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.716f, -0.017f)
            }
        }.build()

        return _ArrowBigUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigUpLeft: ImageVector? = null
