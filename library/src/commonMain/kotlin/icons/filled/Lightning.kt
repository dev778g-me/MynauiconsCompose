package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Lightning: ImageVector
    get() {
        if (_Lightning != null) {
            return _Lightning!!
        }
        _Lightning = ImageVector.Builder(
            name = "Filled.Lightning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.425f, 2.25f)
                curveToRelative(0.841f, 0f, 1.404f, 0.798f, 1.212f, 1.563f)
                lineToRelative(-0.049f, 0.153f)
                lineTo(14.49f, 9.35f)
                horizontalLineTo(17f)
                curveToRelative(0.985f, 0f, 1.532f, 1.054f, 1.1f, 1.854f)
                lineToRelative(-0.1f, 0.156f)
                lineToRelative(-7.47f, 10.047f)
                curveToRelative(-0.54f, 0.725f, -1.621f, 0.224f, -1.527f, -0.605f)
                lineToRelative(0.785f, -6.91f)
                horizontalLineTo(7f)
                curveToRelative(-0.907f, 0f, -1.487f, -0.924f, -1.155f, -1.735f)
                lineToRelative(0.005f, -0.011f)
                lineToRelative(3.906f, -9.128f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.151f, -0.768f)
                close()
            }
        }.build()

        return _Lightning!!
    }

@Suppress("ObjectPropertyName")
private var _Lightning: ImageVector? = null
