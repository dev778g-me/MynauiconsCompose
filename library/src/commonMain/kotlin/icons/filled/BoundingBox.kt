package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BoundingBox: ImageVector
    get() {
        if (_BoundingBox != null) {
            return _BoundingBox!!
        }
        _BoundingBox = ImageVector.Builder(
            name = "Filled.BoundingBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 2.25f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 5.396f)
                verticalLineToRelative(8.708f)
                arcToRelative(2.751f, 2.751f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3.396f, 3.396f)
                horizontalLineToRelative(8.708f)
                arcToRelative(2.751f, 2.751f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3.396f, -3.396f)
                verticalLineTo(7.646f)
                arcToRelative(2.751f, 2.751f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.396f, -3.396f)
                horizontalLineTo(7.646f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 2.25f)
                moveToRelative(0.75f, 14.104f)
                verticalLineTo(7.646f)
                arcTo(2.76f, 2.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.646f, 5.75f)
                horizontalLineToRelative(8.708f)
                curveToRelative(0.259f, 0.916f, 0.98f, 1.637f, 1.896f, 1.896f)
                verticalLineToRelative(8.708f)
                arcToRelative(2.76f, 2.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.896f, 1.896f)
                horizontalLineTo(7.646f)
                arcToRelative(2.76f, 2.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.896f, -1.896f)
            }
        }.build()

        return _BoundingBox!!
    }

@Suppress("ObjectPropertyName")
private var _BoundingBox: ImageVector? = null
