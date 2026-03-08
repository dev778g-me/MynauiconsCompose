package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LinkTwo: ImageVector
    get() {
        if (_LinkTwo != null) {
            return _LinkTwo!!
        }
        _LinkTwo = ImageVector.Builder(
            name = "Outline.LinkTwo",
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
                moveTo(14f, 15.5f)
                horizontalLineToRelative(3.4f)
                curveToRelative(1.988f, 0f, 3.6f, -1.567f, 3.6f, -3.5f)
                reflectiveCurveToRelative(-1.612f, -3.5f, -3.6f, -3.5f)
                horizontalLineTo(14f)
                moveToRelative(-4f, 7f)
                lineToRelative(-3.397f, -0.007f)
                curveToRelative(-1.987f, -0.003f, -3.647f, -1.426f, -3.602f, -3.502f)
                reflectiveCurveTo(4.607f, 8.497f, 6.594f, 8.5f)
                lineToRelative(3.397f, 0.007f)
                moveTo(7.757f, 12f)
                horizontalLineToRelative(8.486f)
            }
        }.build()

        return _LinkTwo!!
    }

@Suppress("ObjectPropertyName")
private var _LinkTwo: ImageVector? = null
