package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SearchCircle: ImageVector
    get() {
        if (_SearchCircle != null) {
            return _SearchCircle!!
        }
        _SearchCircle = ImageVector.Builder(
            name = "Filled.SearchCircle",
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
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                moveToRelative(9.179f, -4.75f)
                arcToRelative(4.179f, 4.179f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.38f, 7.614f)
                lineToRelative(1.66f, 1.665f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.062f, -1.059f)
                lineToRelative(-1.663f, -1.668f)
                arcToRelative(4.179f, 4.179f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.44f, -6.552f)
            }
        }.build()

        return _SearchCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SearchCircle: ImageVector? = null
