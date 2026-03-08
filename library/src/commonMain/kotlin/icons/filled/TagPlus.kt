package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.TagPlus: ImageVector
    get() {
        if (_TagPlus != null) {
            return _TagPlus!!
        }
        _TagPlus = ImageVector.Builder(
            name = "Filled.TagPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.61f, 5.269f)
                arcToRelative(3.65f, 3.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.862f, -0.519f)
                horizontalLineTo(14.77f)
                curveToRelative(0.717f, 0f, 1.406f, 0.28f, 1.92f, 0.781f)
                lineToRelative(5.35f, 5.216f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.506f)
                lineToRelative(-5.35f, 5.216f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.92f, 0.781f)
                horizontalLineTo(4.472f)
                arcToRelative(3.65f, 3.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.862f, -0.519f)
                curveToRelative(-0.58f, -0.359f, -1.11f, -0.974f, -1.11f, -1.856f)
                verticalLineToRelative(-9.75f)
                curveToRelative(0f, -0.882f, 0.53f, -1.498f, 1.11f, -1.856f)
                moveTo(9.25f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(1.75f)
                horizontalLineTo(6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-1.75f)
                horizontalLineTo(11f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineTo(9.25f)
                close()
            }
        }.build()

        return _TagPlus!!
    }

@Suppress("ObjectPropertyName")
private var _TagPlus: ImageVector? = null
