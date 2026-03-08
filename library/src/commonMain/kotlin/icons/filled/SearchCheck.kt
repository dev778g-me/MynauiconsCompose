package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SearchCheck: ImageVector
    get() {
        if (_SearchCheck != null) {
            return _SearchCheck!!
        }
        _SearchCheck = ImageVector.Builder(
            name = "Filled.SearchCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.25f, 11.5f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.578f, 5.294f)
                lineToRelative(2.675f, 2.676f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, 1.06f)
                lineToRelative(-2.678f, -2.678f)
                arcTo(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.25f, 11.5f)
                moveToRelative(10.607f, -1.06f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.214f, -0.88f)
                lineToRelative(-1.724f, 2.376f)
                lineToRelative(-0.606f, -0.69f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.126f, 0.991f)
                lineToRelative(1.039f, 1.182f)
                arcToRelative(0.976f, 0.976f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.522f, -0.071f)
                close()
            }
        }.build()

        return _SearchCheck!!
    }

@Suppress("ObjectPropertyName")
private var _SearchCheck: ImageVector? = null
