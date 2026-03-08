package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Navigation: ImageVector
    get() {
        if (_Navigation != null) {
            return _Navigation!!
        }
        _Navigation = ImageVector.Builder(
            name = "Filled.Navigation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.16f, 3.064f)
                arcToRelative(1.234f, 1.234f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.32f, 0f)
                lineTo(4.34f, 19.98f)
                arcToRelative(1.31f, 1.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.288f, 1.402f)
                curveToRelative(0.344f, 0.346f, 0.917f, 0.512f, 1.458f, 0.216f)
                lineTo(12f, 18.357f)
                lineToRelative(5.915f, 3.24f)
                curveToRelative(0.54f, 0.297f, 1.113f, 0.13f, 1.457f, -0.215f)
                curveToRelative(0.336f, -0.34f, 0.49f, -0.877f, 0.288f, -1.402f)
                close()
            }
        }.build()

        return _Navigation!!
    }

@Suppress("ObjectPropertyName")
private var _Navigation: ImageVector? = null
