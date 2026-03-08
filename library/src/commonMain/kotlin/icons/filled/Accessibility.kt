package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Accessibility: ImageVector
    get() {
        if (_Accessibility != null) {
            return _Accessibility!!
        }
        _Accessibility = ImageVector.Builder(
            name = "Filled.Accessibility",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                moveToRelative(10.5f, -4.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
                moveTo(8.143f, 8.764f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.286f, 1.472f)
                lineToRelative(3.393f, 0.66f)
                verticalLineToRelative(1.567f)
                lineToRelative(-1.544f, 3.752f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.388f, 0.57f)
                lineTo(12f, 14.582f)
                lineToRelative(0.906f, 2.203f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.387f, -0.57f)
                lineToRelative(-1.543f, -3.752f)
                verticalLineToRelative(-1.567f)
                lineToRelative(3.393f, -0.66f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.286f, -1.472f)
                lineTo(12f, 9.514f)
                close()
            }
        }.build()

        return _Accessibility!!
    }

@Suppress("ObjectPropertyName")
private var _Accessibility: ImageVector? = null
