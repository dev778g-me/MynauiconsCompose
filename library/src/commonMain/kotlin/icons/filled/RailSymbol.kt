package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.RailSymbol: ImageVector
    get() {
        if (_RailSymbol != null) {
            return _RailSymbol!!
        }
        _RailSymbol = ImageVector.Builder(
            name = "Filled.RailSymbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.918f, 3.374f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.594f, -0.515f)
                lineToRelative(0.114f, 0.059f)
                lineToRelative(7.709f, 4.457f)
                horizontalLineTo(20f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2.5f)
                horizontalLineToRelative(-3.544f)
                lineToRelative(-5.037f, 4.25f)
                horizontalLineTo(20f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.5f)
                horizontalLineToRelative(-7.34f)
                lineToRelative(3.966f, 2.293f)
                lineToRelative(0.107f, 0.07f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.359f, 2.094f)
                lineToRelative(-7.709f, -4.457f)
                horizontalLineTo(4f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2.5f)
                horizontalLineToRelative(3.544f)
                lineToRelative(5.037f, -4.25f)
                horizontalLineTo(4f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2.5f)
                horizontalLineToRelative(7.34f)
                lineTo(7.374f, 5.082f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.456f, -1.708f)
            }
        }.build()

        return _RailSymbol!!
    }

@Suppress("ObjectPropertyName")
private var _RailSymbol: ImageVector? = null
