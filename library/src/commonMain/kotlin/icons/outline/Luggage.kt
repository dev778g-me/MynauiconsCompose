package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Luggage: ImageVector
    get() {
        if (_Luggage != null) {
            return _Luggage!!
        }
        _Luggage = ImageVector.Builder(
            name = "Outline.Luggage",
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
                moveTo(15f, 5.999f)
                curveToRelative(0f, -0.888f, 0.451f, -2.995f, -1f, -2.999f)
                horizontalLineToRelative(-4f)
                curveTo(8.54f, 3f, 9f, 5.112f, 9f, 6f)
                moveToRelative(-0.282f, 12f)
                horizontalLineToRelative(6.564f)
                curveToRelative(3.298f, 0f, 3.889f, -1.207f, 4.061f, -2.677f)
                lineToRelative(0.615f, -6f)
                curveTo(20.18f, 7.493f, 19.606f, 6f, 16.102f, 6f)
                horizontalLineTo(7.898f)
                curveTo(4.394f, 6f, 3.82f, 7.492f, 4.042f, 9.323f)
                lineToRelative(0.615f, 6f)
                curveTo(4.829f, 16.793f, 5.42f, 18f, 8.718f, 18f)
                moveTo(17f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                moveToRelative(-7f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            }
        }.build()

        return _Luggage!!
    }

@Suppress("ObjectPropertyName")
private var _Luggage: ImageVector? = null
