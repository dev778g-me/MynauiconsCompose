package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Flag: ImageVector
    get() {
        if (_Flag != null) {
            return _Flag!!
        }
        _Flag = ImageVector.Builder(
            name = "Filled.Flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.538f, 3.723f)
                curveToRelative(-1.3f, 1.016f, -2.469f, 1.246f, -3.594f, 1.124f)
                curveToRelative(-1.18f, -0.127f, -2.342f, -0.64f, -3.638f, -1.218f)
                lineToRelative(-0.053f, -0.024f)
                curveToRelative(-1.235f, -0.552f, -2.6f, -1.162f, -4.036f, -1.317f)
                curveToRelative(-1.511f, -0.163f, -3.07f, 0.176f, -4.679f, 1.434f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.288f, 0.591f)
                verticalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-4.936f)
                curveToRelative(1.186f, -0.835f, 2.264f, -1.023f, 3.306f, -0.91f)
                curveToRelative(1.18f, 0.126f, 2.342f, 0.639f, 3.638f, 1.218f)
                lineToRelative(0.053f, 0.023f)
                curveToRelative(1.235f, 0.553f, 2.6f, 1.162f, 4.036f, 1.317f)
                curveToRelative(1.511f, 0.163f, 3.07f, -0.176f, 4.679f, -1.434f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.288f, -0.591f)
                verticalLineTo(4.313f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.212f, -0.59f)
            }
        }.build()

        return _Flag!!
    }

@Suppress("ObjectPropertyName")
private var _Flag: ImageVector? = null
