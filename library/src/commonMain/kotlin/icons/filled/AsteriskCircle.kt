package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.AsteriskCircle: ImageVector
    get() {
        if (_AsteriskCircle != null) {
            return _AsteriskCircle!!
        }
        _AsteriskCircle = ImageVector.Builder(
            name = "Filled.AsteriskCircle",
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
                moveTo(12f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(2.194f)
                lineToRelative(1.872f, -1.092f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.756f, 1.296f)
                lineTo(13.488f, 12f)
                lineToRelative(1.89f, 1.102f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.756f, 1.296f)
                lineToRelative(-1.872f, -1.092f)
                verticalLineTo(15.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-2.194f)
                lineToRelative(-1.872f, 1.092f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.756f, -1.296f)
                lineTo(10.512f, 12f)
                lineToRelative(-1.89f, -1.102f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.756f, -1.296f)
                lineToRelative(1.872f, 1.092f)
                verticalLineTo(8.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
            }
        }.build()

        return _AsteriskCircle!!
    }

@Suppress("ObjectPropertyName")
private var _AsteriskCircle: ImageVector? = null
