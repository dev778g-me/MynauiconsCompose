package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.EditOne: ImageVector
    get() {
        if (_EditOne != null) {
            return _EditOne!!
        }
        _EditOne = ImageVector.Builder(
            name = "Outline.EditOne",
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
                moveTo(9.533f, 11.15f)
                arcTo(1.82f, 1.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12.438f)
                verticalLineTo(15f)
                horizontalLineToRelative(2.578f)
                curveToRelative(0.483f, 0f, 0.947f, -0.192f, 1.289f, -0.534f)
                lineToRelative(7.6f, -7.604f)
                arcToRelative(1.82f, 1.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.577f)
                lineToRelative(-0.751f, -0.751f)
                arcToRelative(1.82f, 1.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.578f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 12f)
                curveToRelative(0f, 4.243f, 0f, 6.364f, -1.318f, 7.682f)
                reflectiveCurveTo(16.242f, 21f, 12f, 21f)
                reflectiveCurveToRelative(-6.364f, 0f, -7.682f, -1.318f)
                reflectiveCurveTo(3f, 16.242f, 3f, 12f)
                reflectiveCurveToRelative(0f, -6.364f, 1.318f, -7.682f)
                reflectiveCurveTo(7.758f, 3f, 12f, 3f)
            }
        }.build()

        return _EditOne!!
    }

@Suppress("ObjectPropertyName")
private var _EditOne: ImageVector? = null
