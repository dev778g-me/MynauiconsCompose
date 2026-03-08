package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChevronDownRight: ImageVector
    get() {
        if (_ChevronDownRight != null) {
            return _ChevronDownRight!!
        }
        _ChevronDownRight = ImageVector.Builder(
            name = "Filled.ChevronDownRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.871f, 7.636f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.75f)
                lineToRelative(-9.235f, 9.235f)
                curveToRelative(0f, 0.415f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(8.485f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                close()
            }
        }.build()

        return _ChevronDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDownRight: ImageVector? = null
