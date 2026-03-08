package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ActivitySquare: ImageVector
    get() {
        if (_ActivitySquare != null) {
            return _ActivitySquare!!
        }
        _ActivitySquare = ImageVector.Builder(
            name = "Outline.ActivitySquare",
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
                moveTo(17f, 12f)
                horizontalLineToRelative(-2f)
                lineToRelative(-2f, 5f)
                lineToRelative(-2f, -10f)
                lineToRelative(-2f, 5f)
                horizontalLineTo(7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12f)
                curveToRelative(0f, -4.243f, 0f, -6.364f, 1.318f, -7.682f)
                reflectiveCurveTo(7.758f, 3f, 12f, 3f)
                reflectiveCurveToRelative(6.364f, 0f, 7.682f, 1.318f)
                reflectiveCurveTo(21f, 7.758f, 21f, 12f)
                reflectiveCurveToRelative(0f, 6.364f, -1.318f, 7.682f)
                reflectiveCurveTo(16.242f, 21f, 12f, 21f)
                reflectiveCurveToRelative(-6.364f, 0f, -7.682f, -1.318f)
                reflectiveCurveTo(3f, 16.242f, 3f, 12f)
            }
        }.build()

        return _ActivitySquare!!
    }

@Suppress("ObjectPropertyName")
private var _ActivitySquare: ImageVector? = null
