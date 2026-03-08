package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LayersThree: ImageVector
    get() {
        if (_LayersThree != null) {
            return _LayersThree!!
        }
        _LayersThree = ImageVector.Builder(
            name = "Filled.LayersThree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.305f, 3.315f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.61f, 0f)
                lineToRelative(-9f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.37f)
                lineToRelative(9f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.61f, 0f)
                lineToRelative(9f, -4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.37f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.305f, 11.315f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.61f, 1.37f)
                lineToRelative(9f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.61f, 0f)
                lineToRelative(9f, -4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.61f, -1.37f)
                lineTo(12f, 15.179f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.305f, 15.315f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.61f, 1.37f)
                lineToRelative(9f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.61f, 0f)
                lineToRelative(9f, -4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.61f, -1.37f)
                lineTo(12f, 19.179f)
                close()
            }
        }.build()

        return _LayersThree!!
    }

@Suppress("ObjectPropertyName")
private var _LayersThree: ImageVector? = null
