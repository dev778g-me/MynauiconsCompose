package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Rhombus: ImageVector
    get() {
        if (_Rhombus != null) {
            return _Rhombus!!
        }
        _Rhombus = ImageVector.Builder(
            name = "Filled.Rhombus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.42f, 2.964f)
                arcToRelative(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.84f, 0f)
                lineTo(4.62f, 10.89f)
                arcToRelative(1.85f, 1.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.222f)
                lineToRelative(5.96f, 7.925f)
                arcToRelative(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.84f, 0f)
                lineToRelative(5.96f, -7.925f)
                arcToRelative(1.85f, 1.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.222f)
                close()
            }
        }.build()

        return _Rhombus!!
    }

@Suppress("ObjectPropertyName")
private var _Rhombus: ImageVector? = null
