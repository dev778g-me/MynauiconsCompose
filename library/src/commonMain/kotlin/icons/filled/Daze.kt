package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Daze: ImageVector
    get() {
        if (_Daze != null) {
            return _Daze!!
        }
        _Daze = ImageVector.Builder(
            name = "Filled.Daze",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, 5.385f, 4.365f, 9.75f, 9.75f, 9.75f)
                reflectiveCurveToRelative(9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                reflectiveCurveTo(2.25f, 6.615f, 2.25f, 12f)
                moveTo(7.4f, 8.55f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.05f, -0.15f)
                lineToRelative(2f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.2f)
                lineToRelative(-2f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.9f, -1.2f)
                lineToRelative(1.2f, -0.9f)
                lineToRelative(-1.2f, -0.9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.15f, -1.05f)
                moveToRelative(9.05f, 1.05f)
                lineToRelative(-1.2f, 0.9f)
                lineToRelative(1.2f, 0.9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.9f, 1.2f)
                lineToRelative(-2f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.2f)
                lineToRelative(2f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.9f, 1.2f)
                moveToRelative(-7.567f, 5.05f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, 0f)
                lineToRelative(0.884f, 0.662f)
                lineToRelative(0.883f, -0.662f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, 0f)
                lineToRelative(0.883f, 0.662f)
                lineToRelative(0.884f, -0.662f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, 0f)
                lineToRelative(1.333f, 1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.9f, 1.2f)
                lineToRelative(-0.883f, -0.663f)
                lineToRelative(-0.884f, 0.663f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, 0f)
                lineTo(12f, 16.187f)
                lineToRelative(-0.883f, 0.663f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, 0f)
                lineToRelative(-0.884f, -0.663f)
                lineToRelative(-0.883f, 0.663f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.9f, -1.2f)
                close()
            }
        }.build()

        return _Daze!!
    }

@Suppress("ObjectPropertyName")
private var _Daze: ImageVector? = null
