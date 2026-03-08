package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Airpods: ImageVector
    get() {
        if (_Airpods != null) {
            return _Airpods!!
        }
        _Airpods = ImageVector.Builder(
            name = "Filled.Airpods",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 3.75f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, 8.493f)
                verticalLineTo(18f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 0f)
                verticalLineTo(8f)
                arcTo(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 3.75f)
                moveToRelative(11f, 0f)
                arcTo(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.25f, 8f)
                verticalLineToRelative(10f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 0f)
                verticalLineToRelative(-5.757f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, -8.493f)
            }
        }.build()

        return _Airpods!!
    }

@Suppress("ObjectPropertyName")
private var _Airpods: ImageVector? = null
