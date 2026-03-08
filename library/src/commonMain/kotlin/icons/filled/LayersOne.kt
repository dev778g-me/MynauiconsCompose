package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LayersOne: ImageVector
    get() {
        if (_LayersOne != null) {
            return _LayersOne!!
        }
        _LayersOne = ImageVector.Builder(
            name = "Filled.LayersOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.305f, 7.315f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.61f, 0f)
                lineToRelative(-9f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.37f)
                lineToRelative(9f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.61f, 0f)
                lineToRelative(9f, -4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.37f)
                close()
            }
        }.build()

        return _LayersOne!!
    }

@Suppress("ObjectPropertyName")
private var _LayersOne: ImageVector? = null
