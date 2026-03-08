package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Ban: ImageVector
    get() {
        if (_Ban != null) {
            return _Ban!!
        }
        _Ban = ImageVector.Builder(
            name = "Filled.Ban",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3.75f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.34f, 13.53f)
                lineTo(17.28f, 5.66f)
                arcTo(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3.75f)
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
            }
        }.build()

        return _Ban!!
    }

@Suppress("ObjectPropertyName")
private var _Ban: ImageVector? = null
