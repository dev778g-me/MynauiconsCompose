package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Film: ImageVector
    get() {
        if (_Film != null) {
            return _Film!!
        }
        _Film = ImageVector.Builder(
            name = "Outline.Film",
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
                moveTo(7.4f, 3.468f)
                verticalLineToRelative(17.064f)
                moveToRelative(9f, -17.064f)
                verticalLineToRelative(17.064f)
                moveTo(7.401f, 7.473f)
                horizontalLineTo(3.486f)
                moveTo(7.401f, 12f)
                horizontalLineTo(3.027f)
                moveToRelative(4.374f, 4.473f)
                horizontalLineTo(3.432f)
                moveToRelative(17.469f, -9f)
                horizontalLineToRelative(-3.915f)
                moveTo(20.901f, 12f)
                horizontalLineToRelative(-4.374f)
                moveToRelative(-0.054f, 0f)
                horizontalLineToRelative(-9.9f)
                moveToRelative(14.328f, 4.473f)
                horizontalLineToRelative(-3.969f)
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

        return _Film!!
    }

@Suppress("ObjectPropertyName")
private var _Film: ImageVector? = null
