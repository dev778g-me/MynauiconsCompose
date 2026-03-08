package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.NavigationOne: ImageVector
    get() {
        if (_NavigationOne != null) {
            return _NavigationOne!!
        }
        _NavigationOne = ImageVector.Builder(
            name = "Outline.NavigationOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.414f, 12.086f)
                arcToRelative(0.546f, 0.546f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.101f, -1.024f)
                lineToRelative(16.905f, -8.007f)
                arcToRelative(0.546f, 0.546f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.727f, 0.727f)
                lineToRelative(-8.007f, 16.905f)
                arcToRelative(0.546f, 0.546f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.024f, -0.1f)
                lineToRelative(-1.62f, -6.483f)
                arcToRelative(0.55f, 0.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.398f, -0.397f)
                close()
            }
        }.build()

        return _NavigationOne!!
    }

@Suppress("ObjectPropertyName")
private var _NavigationOne: ImageVector? = null
