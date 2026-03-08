package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChevronDownLeft: ImageVector
    get() {
        if (_ChevronDownLeft != null) {
            return _ChevronDownLeft!!
        }
        _ChevronDownLeft = ImageVector.Builder(
            name = "Filled.ChevronDownLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.364f, 16.871f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                lineTo(7.879f, 6.886f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(8.485f)
                curveToRelative(0f, 0.415f, 0.335f, 0.75f, 0.75f, 0.75f)
                close()
            }
        }.build()

        return _ChevronDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDownLeft: ImageVector? = null
