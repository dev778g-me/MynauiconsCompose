package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.UserDiamond: ImageVector
    get() {
        if (_UserDiamond != null) {
            return _UserDiamond!!
        }
        _UserDiamond = ImageVector.Builder(
            name = "Filled.UserDiamond",
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
                moveTo(12f, 1.25f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.235f, 0.926f)
                lineTo(2.177f, 9.765f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.47f)
                lineToRelative(4.206f, 4.207f)
                curveTo(7.001f, 15.546f, 9.545f, 14.11f, 12f, 14.11f)
                reflectiveCurveToRelative(4.999f, 1.436f, 5.617f, 4.332f)
                lineToRelative(4.206f, -4.207f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.47f)
                lineToRelative(-7.588f, -7.588f)
                arcTo(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1.25f)
                moveToRelative(-3.25f, 8f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.5f, 0f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.253f, 19.805f)
                lineToRelative(-0.002f, -0.267f)
                curveTo(16.117f, 16.93f, 14.114f, 15.61f, 12f, 15.61f)
                reflectiveCurveToRelative(-4.117f, 1.32f, -4.251f, 3.928f)
                lineToRelative(-0.002f, 0.267f)
                lineToRelative(2.018f, 2.018f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.47f, 0f)
                close()
            }
        }.build()

        return _UserDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _UserDiamond: ImageVector? = null
