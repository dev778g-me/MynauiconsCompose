package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Baseball: ImageVector
    get() {
        if (_Baseball != null) {
            return _Baseball!!
        }
        _Baseball = ImageVector.Builder(
            name = "Filled.Baseball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.871f, 10.582f)
                quadToRelative(-0.12f, 0.691f, -0.121f, 1.418f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.413f, 7.75f)
                curveToRelative(1.383f, -4.247f, -0.923f, -8.242f, -5.292f, -9.168f)
                moveToRelative(10.966f, -6.331f)
                curveToRelative(-1.383f, 4.246f, 0.923f, 8.241f, 5.292f, 9.167f)
                quadToRelative(0.12f, -0.691f, 0.121f, -1.418f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.413f, -7.75f)
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
            }
        }.build()

        return _Baseball!!
    }

@Suppress("ObjectPropertyName")
private var _Baseball: ImageVector? = null
