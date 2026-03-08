package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.AsteriskDiamond: ImageVector
    get() {
        if (_AsteriskDiamond != null) {
            return _AsteriskDiamond!!
        }
        _AsteriskDiamond = ImageVector.Builder(
            name = "Filled.AsteriskDiamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.79f, 1.49f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.025f, 0.686f)
                lineTo(2.177f, 9.765f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.47f)
                lineToRelative(7.588f, 7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.47f, 0f)
                lineToRelative(7.588f, -7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.47f)
                lineToRelative(-7.588f, -7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.445f, -0.686f)
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

        return _AsteriskDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _AsteriskDiamond: ImageVector? = null
