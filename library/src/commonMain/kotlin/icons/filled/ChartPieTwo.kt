package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChartPieTwo: ImageVector
    get() {
        if (_ChartPieTwo != null) {
            return _ChartPieTwo!!
        }
        _ChartPieTwo = ImageVector.Builder(
            name = "Filled.ChartPieTwo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.75f, 3.784f)
                verticalLineToRelative(7.905f)
                lineToRelative(5.59f, 5.59f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.59f, -13.496f)
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                arcToRelative(9.72f, 9.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.856f, 6.894f)
                arcTo(9.72f, 9.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21.75f)
                arcTo(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 12f)
            }
        }.build()

        return _ChartPieTwo!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPieTwo: ImageVector? = null
