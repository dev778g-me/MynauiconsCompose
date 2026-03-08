package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ArrowBigUpRight: ImageVector
    get() {
        if (_ArrowBigUpRight != null) {
            return _ArrowBigUpRight!!
        }
        _ArrowBigUpRight = ImageVector.Builder(
            name = "Filled.ArrowBigUpRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.083f, 3.267f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.691f, 0.178f)
                curveToRelative(0.336f, 0.171f, 0.61f, 0.445f, 0.781f, 0.781f)
                curveToRelative(0.12f, 0.234f, 0.16f, 0.472f, 0.178f, 0.692f)
                curveToRelative(0.017f, 0.203f, 0.017f, 0.448f, 0.017f, 0.716f)
                verticalLineToRelative(9.797f)
                curveToRelative(-0.015f, 0.607f, -0.458f, 1.017f, -0.812f, 1.198f)
                curveToRelative(-0.341f, 0.175f, -1.008f, 0.33f, -1.506f, -0.167f)
                lineToRelative(-0.006f, -0.006f)
                lineToRelative(-2.534f, -2.594f)
                lineToRelative(-6.51f, 6.51f)
                curveToRelative(-0.473f, 0.473f, -1.273f, 0.529f, -1.785f, 0.017f)
                lineTo(3.61f, 16.404f)
                curveToRelative(-0.511f, -0.512f, -0.456f, -1.312f, 0.018f, -1.786f)
                lineToRelative(6.51f, -6.51f)
                lineToRelative(-2.601f, -2.54f)
                curveToRelative(-0.498f, -0.498f, -0.342f, -1.165f, -0.167f, -1.505f)
                curveToRelative(0.181f, -0.355f, 0.591f, -0.798f, 1.198f, -0.813f)
                horizontalLineToRelative(9.798f)
                curveToRelative(0.267f, 0f, 0.512f, 0f, 0.715f, 0.017f)
            }
        }.build()

        return _ArrowBigUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigUpRight: ImageVector? = null
