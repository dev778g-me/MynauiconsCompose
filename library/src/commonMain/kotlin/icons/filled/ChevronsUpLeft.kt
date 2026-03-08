package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChevronsUpLeft: ImageVector
    get() {
        if (_ChevronsUpLeft != null) {
            return _ChevronsUpLeft!!
        }
        _ChevronsUpLeft = ImageVector.Builder(
            name = "Filled.ChevronsUpLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.745f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                lineToRelative(-3.253f, 3.254f)
                horizontalLineToRelative(6.507f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.751f, 0.751f)
                lineTo(10.255f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                verticalLineToRelative(-6.508f)
                lineTo(6.25f, 15.496f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.751f, -0.751f)
                verticalLineTo(6.251f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.751f)
                close()
            }
        }.build()

        return _ChevronsUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsUpLeft: ImageVector? = null
