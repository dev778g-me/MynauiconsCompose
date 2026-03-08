package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Support: ImageVector
    get() {
        if (_Support != null) {
            return _Support!!
        }
        _Support = ImageVector.Builder(
            name = "Filled.Support",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.66f, 6.72f)
                arcTo(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.75f, 12f)
                curveToRelative(0f, 2.008f, 0.717f, 3.849f, 1.91f, 5.28f)
                lineToRelative(2.853f, -2.853f)
                arcToRelative(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.854f)
                close()
                moveTo(18.34f, 6.72f)
                lineTo(15.487f, 9.573f)
                arcToRelative(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.854f)
                lineToRelative(2.853f, 2.852f)
                arcTo(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.25f, 12f)
                arcToRelative(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.91f, -5.28f)
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                moveToRelative(11.695f, -1.944f)
                curveTo(12.889f, 9f, 11.11f, 9f, 10.055f, 10.056f)
                curveTo(9f, 11.11f, 9f, 12.889f, 10.056f, 13.945f)
                reflectiveCurveToRelative(2.834f, 1.055f, 3.89f, 0f)
                curveToRelative(1.055f, -1.056f, 1.055f, -2.834f, 0f, -3.89f)
            }
        }.build()

        return _Support!!
    }

@Suppress("ObjectPropertyName")
private var _Support: ImageVector? = null
