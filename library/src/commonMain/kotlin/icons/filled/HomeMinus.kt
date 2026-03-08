package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.HomeMinus: ImageVector
    get() {
        if (_HomeMinus != null) {
            return _HomeMinus!!
        }
        _HomeMinus = ImageVector.Builder(
            name = "Filled.HomeMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.191f, 2.9f)
                arcToRelative(2.84f, 2.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.618f, 0f)
                lineToRelative(5.866f, 4.818f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.075f, 2.29f)
                verticalLineToRelative(8.802f)
                curveToRelative(0f, 1.605f, -1.273f, 2.94f, -2.883f, 2.94f)
                horizontalLineTo(6.133f)
                curveToRelative(-1.61f, 0f, -2.883f, -1.335f, -2.883f, -2.94f)
                verticalLineToRelative(-8.802f)
                curveToRelative(0f, -0.886f, 0.392f, -1.73f, 1.075f, -2.29f)
                close()
                moveTo(9.5f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
            }
        }.build()

        return _HomeMinus!!
    }

@Suppress("ObjectPropertyName")
private var _HomeMinus: ImageVector? = null
