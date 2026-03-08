package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChartBarOne: ImageVector
    get() {
        if (_ChartBarOne != null) {
            return _ChartBarOne!!
        }
        _ChartBarOne = ImageVector.Builder(
            name = "Filled.ChartBarOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 2.25f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.25f, 5f)
                verticalLineToRelative(7.536f)
                horizontalLineTo(5f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.75f, 2.75f)
                verticalLineTo(19f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21.75f)
                horizontalLineToRelative(14f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.75f, 19f)
                verticalLineToRelative(-7.571f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 8.679f)
                horizontalLineToRelative(-3.25f)
                verticalLineTo(5f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 2.25f)
                close()
            }
        }.build()

        return _ChartBarOne!!
    }

@Suppress("ObjectPropertyName")
private var _ChartBarOne: ImageVector? = null
