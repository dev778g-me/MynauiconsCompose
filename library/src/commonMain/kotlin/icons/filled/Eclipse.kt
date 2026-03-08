package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Eclipse: ImageVector
    get() {
        if (_Eclipse != null) {
            return _Eclipse!!
        }
        _Eclipse = ImageVector.Builder(
            name = "Filled.Eclipse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.833f, 3.832f)
                curveToRelative(-0.737f, 5.292f, 4.105f, 10.058f, 9.335f, 9.335f)
                quadToRelative(0.081f, -0.57f, 0.082f, -1.167f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.417f, -8.168f)
                moveToRelative(-0.8f, -1.383f)
                arcTo(9.8f, 9.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.25f)
                arcTo(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.75f, 12f)
                quadToRelative(-0.001f, 1.011f, -0.199f, 1.967f)
                curveToRelative(-0.91f, 4.442f, -4.84f, 7.783f, -9.551f, 7.783f)
                arcTo(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 12f)
                curveToRelative(0f, -4.711f, 3.341f, -8.64f, 7.783f, -9.551f)
            }
        }.build()

        return _Eclipse!!
    }

@Suppress("ObjectPropertyName")
private var _Eclipse: ImageVector? = null
