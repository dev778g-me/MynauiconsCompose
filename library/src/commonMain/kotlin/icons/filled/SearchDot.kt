package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SearchDot: ImageVector
    get() {
        if (_SearchDot != null) {
            return _SearchDot!!
        }
        _SearchDot = ImageVector.Builder(
            name = "Filled.SearchDot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.25f, 11.5f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.25f, 11.5f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.515f, 6.352f)
                lineToRelative(2.678f, 2.678f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, -1.06f)
                lineToRelative(-2.675f, -2.676f)
                arcTo(8.25f, 8.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3.25f, 11.5f)
                moveToRelative(8.25f, -2.75f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -5.5f)
            }
        }.build()

        return _SearchDot!!
    }

@Suppress("ObjectPropertyName")
private var _SearchDot: ImageVector? = null
