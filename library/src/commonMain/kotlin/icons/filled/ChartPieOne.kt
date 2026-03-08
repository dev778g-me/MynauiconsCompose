package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChartPieOne: ImageVector
    get() {
        if (_ChartPieOne != null) {
            return _ChartPieOne!!
        }
        _ChartPieOne = ImageVector.Builder(
            name = "Filled.ChartPieOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.75f, 3.784f)
                verticalLineToRelative(7.466f)
                horizontalLineToRelative(7.466f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.466f, -7.466f)
                moveToRelative(7.466f, 8.966f)
                horizontalLineTo(12.75f)
                verticalLineToRelative(7.466f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.466f, -7.466f)
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
            }
        }.build()

        return _ChartPieOne!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPieOne: ImageVector? = null
