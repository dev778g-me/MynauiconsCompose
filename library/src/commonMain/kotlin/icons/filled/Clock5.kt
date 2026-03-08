package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Clock5: ImageVector
    get() {
        if (_Clock5 != null) {
            return _Clock5!!
        }
        _Clock5 = ImageVector.Builder(
            name = "Filled.Clock5",
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
                moveToRelative(10.5f, -6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.14f, 0.04f, 0.278f, 0.114f, 0.398f)
                lineToRelative(2.5f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.272f, -0.796f)
                lineToRelative(-2.386f, -3.817f)
                close()
            }
        }.build()

        return _Clock5!!
    }

@Suppress("ObjectPropertyName")
private var _Clock5: ImageVector? = null
