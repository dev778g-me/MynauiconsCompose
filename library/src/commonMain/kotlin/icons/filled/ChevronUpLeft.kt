package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChevronUpLeft: ImageVector
    get() {
        if (_ChevronUpLeft != null) {
            return _ChevronUpLeft!!
        }
        _ChevronUpLeft = ImageVector.Builder(
            name = "Filled.ChevronUpLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.879f, 7.129f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(8.485f)
                curveToRelative(0f, 0.414f, 0.335f, 0.75f, 0.75f, 0.75f)
                lineToRelative(9.235f, -9.235f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.75f)
                close()
            }
        }.build()

        return _ChevronUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUpLeft: ImageVector? = null
