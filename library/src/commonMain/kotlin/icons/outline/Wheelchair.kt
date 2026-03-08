package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Wheelchair: ImageVector
    get() {
        if (_Wheelchair != null) {
            return _Wheelchair!!
        }
        _Wheelchair = ImageVector.Builder(
            name = "Outline.Wheelchair",
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
                moveTo(14.449f, 16.4f)
                arcTo(4.802f, 4.802f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 15.2f)
                arcToRelative(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.8f, -4.365f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(9.8f, 7.2f)
                lineToRelative(0.695f, 6.258f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.051f, 0.888f)
                lineToRelative(5.044f, -0.288f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.056f, 0.953f)
                lineToRelative(0.11f, 2.434f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 0.955f)
                horizontalLineTo(19f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.2f, 5.6f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3.2f, 0f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.2f, 0f)
                moveToRelative(1.55f, 4.8f)
                horizontalLineToRelative(3f)
            }
        }.build()

        return _Wheelchair!!
    }

@Suppress("ObjectPropertyName")
private var _Wheelchair: ImageVector? = null
