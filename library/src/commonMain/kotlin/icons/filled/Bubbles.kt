package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Bubbles: ImageVector
    get() {
        if (_Bubbles != null) {
            return _Bubbles!!
        }
        _Bubbles = ImageVector.Builder(
            name = "Filled.Bubbles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.75f, 8f)
                arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.5f, 0f)
                arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 0f)
                moveToRelative(4.75f, 4.113f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -6.5f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.5f)
                moveToRelative(1.219f, 5.387f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8.5f, 0f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 0f)
            }
        }.build()

        return _Bubbles!!
    }

@Suppress("ObjectPropertyName")
private var _Bubbles: ImageVector? = null
