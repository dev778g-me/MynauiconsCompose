package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.GraduationCap: ImageVector
    get() {
        if (_GraduationCap != null) {
            return _GraduationCap!!
        }
        _GraduationCap = ImageVector.Builder(
            name = "Outline.GraduationCap",
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
                moveTo(14.217f, 3.5f)
                arcToRelative(5.17f, 5.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.434f, 0f)
                lineTo(3.092f, 6.637f)
                curveToRelative(-1.456f, 0.682f, -1.456f, 3.044f, 0f, 3.726f)
                lineToRelative(6.69f, 3.137f)
                arcToRelative(5.17f, 5.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.435f, 0f)
                lineToRelative(6.691f, -3.137f)
                curveToRelative(1.456f, -0.682f, 1.456f, -3.044f, 0f, -3.726f)
                close()
                moveTo(22f, 8.5f)
                verticalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 11.5f)
                verticalLineToRelative(5.125f)
                curveTo(5f, 19.543f, 9.694f, 21f, 12f, 21f)
                reflectiveCurveToRelative(7f, -1.457f, 7f, -4.375f)
                verticalLineTo(11.5f)
            }
        }.build()

        return _GraduationCap!!
    }

@Suppress("ObjectPropertyName")
private var _GraduationCap: ImageVector? = null
