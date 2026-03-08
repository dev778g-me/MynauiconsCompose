package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Sunset: ImageVector
    get() {
        if (_Sunset != null) {
            return _Sunset!!
        }
        _Sunset = ImageVector.Builder(
            name = "Outline.Sunset",
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
                moveTo(15.5f, 17.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -7f, 0f)
                moveTo(11.9f, 3f)
                verticalLineToRelative(7f)
                moveToRelative(-6.002f, 1.398f)
                lineToRelative(1.278f, 1.278f)
                moveTo(3f, 17.4f)
                horizontalLineToRelative(1.8f)
                moveToRelative(14.2f, 0f)
                horizontalLineToRelative(1.8f)
                moveToRelative(-4.176f, -4.724f)
                lineToRelative(1.278f, -1.278f)
                moveTo(21f, 21f)
                horizontalLineTo(3f)
                moveTo(8.3f, 7f)
                lineToRelative(3.6f, 3.6f)
                lineTo(15.5f, 7f)
            }
        }.build()

        return _Sunset!!
    }

@Suppress("ObjectPropertyName")
private var _Sunset: ImageVector? = null
