package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChevronsDownRight: ImageVector
    get() {
        if (_ChevronsDownRight != null) {
            return _ChevronsDownRight!!
        }
        _ChevronsDownRight = ImageVector.Builder(
            name = "Filled.ChevronsDownRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.255f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                lineToRelative(3.253f, -3.254f)
                horizontalLineTo(5.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.751f, -0.751f)
                lineTo(13.745f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(6.508f)
                lineToRelative(3.254f, -3.254f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.751f, 0.751f)
                verticalLineToRelative(8.494f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, 0.751f)
                close()
            }
        }.build()

        return _ChevronsDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsDownRight: ImageVector? = null
