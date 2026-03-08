package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.UserCircle: ImageVector
    get() {
        if (_UserCircle != null) {
            return _UserCircle!!
        }
        _UserCircle = ImageVector.Builder(
            name = "Filled.UserCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.5f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.5f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.25f)
                arcTo(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 12f)
                arcToRelative(9.74f, 9.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 7.875f)
                lineToRelative(0.001f, -0.413f)
                curveTo(6.434f, 15.883f, 9.272f, 14.11f, 12f, 14.11f)
                reflectiveCurveToRelative(5.566f, 1.773f, 5.749f, 5.352f)
                lineToRelative(0.001f, 0.413f)
                arcToRelative(9.74f, 9.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -7.875f)
                arcTo(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2.25f)
                moveToRelative(-3.25f, 7f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.5f, 0f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.259f, 20.773f)
                curveToRelative(-0.004f, -0.78f, -0.007f, -1.209f, -0.008f, -1.235f)
                curveToRelative(-0.134f, -2.608f, -2.137f, -3.928f, -4.251f, -3.928f)
                reflectiveCurveToRelative(-4.117f, 1.32f, -4.251f, 3.928f)
                curveToRelative(-0.001f, 0.026f, -0.004f, 0.454f, -0.008f, 1.235f)
                arcTo(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21.75f)
                arcToRelative(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.259f, -0.977f)
            }
        }.build()

        return _UserCircle!!
    }

@Suppress("ObjectPropertyName")
private var _UserCircle: ImageVector? = null
