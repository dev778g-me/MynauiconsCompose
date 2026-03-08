package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SearchDiamond: ImageVector
    get() {
        if (_SearchDiamond != null) {
            return _SearchDiamond!!
        }
        _SearchDiamond = ImageVector.Builder(
            name = "Filled.SearchDiamond",
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
                moveTo(10.79f, 1.49f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.445f, 0.687f)
                lineToRelative(7.588f, 7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.47f)
                lineToRelative(-7.588f, 7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.47f, 0f)
                lineToRelative(-7.588f, -7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.47f)
                lineToRelative(7.588f, -7.589f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.025f, -0.685f)
                moveToRelative(0.639f, 5.76f)
                arcToRelative(4.179f, 4.179f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.38f, 7.614f)
                lineToRelative(1.66f, 1.665f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.062f, -1.059f)
                lineToRelative(-1.663f, -1.668f)
                arcToRelative(4.179f, 4.179f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.44f, -6.552f)
            }
        }.build()

        return _SearchDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _SearchDiamond: ImageVector? = null
