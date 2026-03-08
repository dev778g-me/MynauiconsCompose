package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CartCheck: ImageVector
    get() {
        if (_CartCheck != null) {
            return _CartCheck!!
        }
        _CartCheck = ImageVector.Builder(
            name = "Filled.CartCheck",
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
                moveTo(15.091f, 8.94f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.216f, -0.878f)
                lineToRelative(-1.713f, 2.371f)
                lineToRelative(-0.599f, -0.684f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.128f, 0.988f)
                lineToRelative(1.034f, 1.181f)
                arcToRelative(0.974f, 0.974f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.522f, -0.07f)
                close()
                moveTo(8.5f, 17.25f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.5f)
                moveToRelative(8f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.5f)
            }
        }.build()

        return _CartCheck!!
    }

@Suppress("ObjectPropertyName")
private var _CartCheck: ImageVector? = null
