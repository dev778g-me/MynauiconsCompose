package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LayersTwo: ImageVector
    get() {
        if (_LayersTwo != null) {
            return _LayersTwo!!
        }
        _LayersTwo = ImageVector.Builder(
            name = "Filled.LayersTwo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.305f, 5.315f)
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
                moveTo(3.305f, 13.315f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.61f, 1.37f)
                lineToRelative(9f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.61f, 0f)
                lineToRelative(9f, -4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.61f, -1.37f)
                lineTo(12f, 17.179f)
                close()
            }
        }.build()

        return _LayersTwo!!
    }

@Suppress("ObjectPropertyName")
private var _LayersTwo: ImageVector? = null
