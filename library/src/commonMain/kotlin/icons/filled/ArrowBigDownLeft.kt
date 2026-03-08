package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ArrowBigDownLeft: ImageVector
    get() {
        if (_ArrowBigDownLeft != null) {
            return _ArrowBigDownLeft!!
        }
        _ArrowBigDownLeft = ImageVector.Builder(
            name = "Filled.ArrowBigDownLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.618f, 3.629f)
                curveToRelative(0.474f, -0.474f, 1.274f, -0.53f, 1.785f, -0.018f)
                lineToRelative(3.986f, 3.986f)
                curveToRelative(0.512f, 0.511f, 0.456f, 1.311f, -0.018f, 1.785f)
                lineToRelative(-6.51f, 6.51f)
                lineToRelative(2.601f, 2.54f)
                curveToRelative(0.498f, 0.498f, 0.342f, 1.165f, 0.167f, 1.505f)
                curveToRelative(-0.181f, 0.355f, -0.591f, 0.798f, -1.198f, 0.813f)
                horizontalLineTo(5.633f)
                curveToRelative(-0.267f, 0f, -0.511f, 0f, -0.715f, -0.017f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.692f, -0.178f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.781f, -0.781f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.178f, -0.692f)
                curveToRelative(-0.017f, -0.204f, -0.017f, -0.448f, -0.017f, -0.716f)
                verticalLineTo(8.57f)
                curveToRelative(0.015f, -0.607f, 0.458f, -1.017f, 0.813f, -1.198f)
                curveToRelative(0.34f, -0.175f, 1.007f, -0.33f, 1.505f, 0.167f)
                lineToRelative(0.006f, 0.006f)
                lineToRelative(2.534f, 2.594f)
                close()
            }
        }.build()

        return _ArrowBigDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigDownLeft: ImageVector? = null
