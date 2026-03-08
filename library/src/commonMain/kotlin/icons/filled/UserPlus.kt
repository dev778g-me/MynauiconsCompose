package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.UserPlus: ImageVector
    get() {
        if (_UserPlus != null) {
            return _UserPlus!!
        }
        _UserPlus = ImageVector.Builder(
            name = "Filled.UserPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.25f, 7.5f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.5f, 0f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.5f, 0f)
                moveToRelative(11.999f, 12.962f)
                curveToRelative(-0.262f, -5.148f, -4.307f, -7.712f, -8.249f, -7.712f)
                reflectiveCurveToRelative(-7.987f, 2.563f, -8.249f, 7.712f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 0.787f)
                curveToRelative(3.365f, 0.171f, 12.998f, 0.106f, 15.077f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.711f, -0.787f)
                moveTo(12f, 14.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(1.25f)
                horizontalLineTo(14f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-1.25f)
                horizontalLineTo(10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.25f)
                verticalLineTo(15.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
            }
        }.build()

        return _UserPlus!!
    }

@Suppress("ObjectPropertyName")
private var _UserPlus: ImageVector? = null
