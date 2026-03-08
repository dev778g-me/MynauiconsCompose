package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SearchHexagon: ImageVector
    get() {
        if (_SearchHexagon != null) {
            return _SearchHexagon!!
        }
        _SearchHexagon = ImageVector.Builder(
            name = "Filled.SearchHexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.75f, 11.429f)
                arcToRelative(2.679f, 2.679f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.357f, 0f)
                arcToRelative(2.679f, 2.679f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.357f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.68f, 2.105f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.64f, 0f)
                lineToRelative(0.001f, 0.001f)
                lineToRelative(6.611f, 3.8f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.25f, 8.2f)
                verticalLineToRelative(7.603f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.318f, 2.291f)
                lineToRelative(-0.003f, 0.002f)
                lineToRelative(-6.608f, 3.799f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.639f, 0f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-6.608f, -3.8f)
                horizontalLineToRelative(-0.003f)
                arcTo(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.75f, 15.8f)
                lineTo(2.75f, 8.198f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.318f, -2.291f)
                lineToRelative(0.003f, -0.002f)
                close()
                moveTo(11.429f, 7.25f)
                arcToRelative(4.179f, 4.179f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.38f, 7.614f)
                lineToRelative(1.66f, 1.665f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.062f, -1.059f)
                lineToRelative(-1.663f, -1.668f)
                arcToRelative(4.179f, 4.179f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.44f, -6.552f)
            }
        }.build()

        return _SearchHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _SearchHexagon: ImageVector? = null
