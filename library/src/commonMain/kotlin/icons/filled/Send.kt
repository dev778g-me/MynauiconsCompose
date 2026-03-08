package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Send: ImageVector
    get() {
        if (_Send != null) {
            return _Send!!
        }
        _Send = ImageVector.Builder(
            name = "Filled.Send",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.04f, 2.323f)
                curveToRelative(1.016f, -0.355f, 1.992f, 0.621f, 1.637f, 1.637f)
                lineToRelative(-5.925f, 16.93f)
                curveToRelative(-0.385f, 1.098f, -1.915f, 1.16f, -2.387f, 0.097f)
                lineToRelative(-2.859f, -6.432f)
                lineToRelative(4.024f, -4.025f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, -1.06f)
                lineToRelative(-4.025f, 4.024f)
                lineToRelative(-6.432f, -2.859f)
                curveToRelative(-1.063f, -0.473f, -1f, -2.002f, 0.097f, -2.387f)
                close()
            }
        }.build()

        return _Send!!
    }

@Suppress("ObjectPropertyName")
private var _Send: ImageVector? = null
