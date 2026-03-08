package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.GraduationCap: ImageVector
    get() {
        if (_GraduationCap != null) {
            return _GraduationCap!!
        }
        _GraduationCap = ImageVector.Builder(
            name = "Filled.GraduationCap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.75f, 8.5f)
                verticalLineToRelative(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-2.469f)
                lineToRelative(-0.023f, 0.011f)
                lineToRelative(-1.477f, 0.693f)
                verticalLineToRelative(4.89f)
                curveToRelative(0f, 1.909f, -1.527f, 3.193f, -3.05f, 3.953f)
                curveToRelative(-1.564f, 0.78f, -3.428f, 1.172f, -4.7f, 1.172f)
                reflectiveCurveToRelative(-3.136f, -0.392f, -4.7f, -1.172f)
                curveToRelative(-1.523f, -0.76f, -3.05f, -2.044f, -3.05f, -3.953f)
                verticalLineToRelative(-4.89f)
                lineToRelative(-1.477f, -0.692f)
                curveTo(1.721f, 10.549f, 1.25f, 9.478f, 1.25f, 8.5f)
                reflectiveCurveToRelative(0.47f, -2.05f, 1.523f, -2.542f)
                lineTo(9.464f, 2.82f)
                arcToRelative(5.92f, 5.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.072f, 0f)
                lineToRelative(6.69f, 3.137f)
                curveTo(22.28f, 6.45f, 22.75f, 7.522f, 22.75f, 8.5f)
                moveToRelative(-8.214f, 5.68f)
                arcToRelative(5.92f, 5.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.072f, 0f)
                lineTo(5.75f, 12.437f)
                verticalLineToRelative(4.187f)
                curveToRelative(0f, 1.01f, 0.82f, 1.913f, 2.22f, 2.61f)
                curveToRelative(1.36f, 0.679f, 2.996f, 1.015f, 4.03f, 1.015f)
                reflectiveCurveToRelative(2.67f, -0.336f, 4.03f, -1.014f)
                curveToRelative(1.4f, -0.698f, 2.22f, -1.601f, 2.22f, -2.61f)
                verticalLineToRelative(-4.188f)
                close()
            }
        }.build()

        return _GraduationCap!!
    }

@Suppress("ObjectPropertyName")
private var _GraduationCap: ImageVector? = null
