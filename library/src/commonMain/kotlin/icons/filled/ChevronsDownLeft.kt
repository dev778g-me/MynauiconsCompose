package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChevronsDownLeft: ImageVector
    get() {
        if (_ChevronsDownLeft != null) {
            return _ChevronsDownLeft!!
        }
        _ChevronsDownLeft = ImageVector.Builder(
            name = "Filled.ChevronsDownLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.745f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                lineToRelative(-3.253f, -3.254f)
                horizontalLineToRelative(6.507f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.751f, -0.751f)
                lineTo(10.255f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(6.508f)
                lineTo(6.25f, 8.504f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.751f, 0.751f)
                verticalLineToRelative(8.494f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, 0.751f)
                close()
            }
        }.build()

        return _ChevronsDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsDownLeft: ImageVector? = null
