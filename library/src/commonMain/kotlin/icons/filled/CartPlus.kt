package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CartPlus: ImageVector
    get() {
        if (_CartPlus != null) {
            return _CartPlus!!
        }
        _CartPlus = ImageVector.Builder(
            name = "Filled.CartPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.72f, 2.787f)
                lineToRelative(0.55f, 1.863f)
                horizontalLineToRelative(14.654f)
                curveToRelative(1.84f, 0f, 3.245f, 1.717f, 2.715f, 3.51f)
                lineToRelative(-1.655f, 5.6f)
                curveToRelative(-0.352f, 1.193f, -1.471f, 1.99f, -2.715f, 1.99f)
                horizontalLineTo(8.113f)
                curveToRelative(-1.244f, 0f, -2.362f, -0.797f, -2.715f, -1.99f)
                lineTo(2.281f, 3.212f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.438f, -0.425f)
                moveTo(13.25f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(1.25f)
                horizontalLineTo(10.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.25f)
                verticalLineTo(12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-1.25f)
                close()
                moveTo(8.5f, 17.25f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.5f)
                moveToRelative(8f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.5f)
            }
        }.build()

        return _CartPlus!!
    }

@Suppress("ObjectPropertyName")
private var _CartPlus: ImageVector? = null
