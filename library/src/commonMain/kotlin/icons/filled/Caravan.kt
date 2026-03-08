package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Caravan: ImageVector
    get() {
        if (_Caravan != null) {
            return _Caravan!!
        }
        _Caravan = ImageVector.Builder(
            name = "Filled.Caravan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 16.75f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.5f)
                moveToRelative(2.18f, -8.5f)
                horizontalLineToRelative(3.848f)
                verticalLineToRelative(-3.5f)
                horizontalLineTo(13.18f)
                close()
                moveTo(22.75f, 15f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 18.75f)
                horizontalLineToRelative(-5.356f)
                arcToRelative(2.749f, 2.749f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.288f, 0f)
                horizontalLineTo(3f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.25f, 17f)
                verticalLineToRelative(-1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-5.853f)
                curveToRelative(0f, -4.53f, 3.067f, -8.147f, 7.68f, -8.147f)
                horizontalLineTo(19f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.75f, 7f)
                close()
            }
        }.build()

        return _Caravan!!
    }

@Suppress("ObjectPropertyName")
private var _Caravan: ImageVector? = null
