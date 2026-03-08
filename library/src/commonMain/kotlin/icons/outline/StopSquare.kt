package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.StopSquare: ImageVector
    get() {
        if (_StopSquare != null) {
            return _StopSquare!!
        }
        _StopSquare = ImageVector.Builder(
            name = "Outline.StopSquare",
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
                moveTo(3f, 9.4f)
                curveToRelative(0f, -2.24f, 0f, -3.36f, 0.436f, -4.216f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.748f, -1.748f)
                curveTo(6.04f, 3f, 7.16f, 3f, 9.4f, 3f)
                horizontalLineToRelative(5.2f)
                curveToRelative(2.24f, 0f, 3.36f, 0f, 4.216f, 0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.748f, 1.748f)
                curveTo(21f, 6.04f, 21f, 7.16f, 21f, 9.4f)
                verticalLineToRelative(5.2f)
                curveToRelative(0f, 2.24f, 0f, 3.36f, -0.436f, 4.216f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, 1.748f)
                curveTo(17.96f, 21f, 16.84f, 21f, 14.6f, 21f)
                horizontalLineTo(9.4f)
                curveToRelative(-2.24f, 0f, -3.36f, 0f, -4.216f, -0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, -1.748f)
                curveTo(3f, 17.96f, 3f, 16.84f, 3f, 14.6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 12f)
                curveToRelative(0f, -1.178f, 0f, -1.768f, 0.366f, -2.134f)
                reflectiveCurveTo(10.822f, 9.5f, 12f, 9.5f)
                reflectiveCurveToRelative(1.768f, 0f, 2.134f, 0.366f)
                reflectiveCurveToRelative(0.366f, 0.956f, 0.366f, 2.134f)
                reflectiveCurveToRelative(0f, 1.768f, -0.366f, 2.134f)
                reflectiveCurveToRelative(-0.956f, 0.366f, -2.134f, 0.366f)
                reflectiveCurveToRelative(-1.768f, 0f, -2.134f, -0.366f)
                reflectiveCurveTo(9.5f, 13.178f, 9.5f, 12f)
            }
        }.build()

        return _StopSquare!!
    }

@Suppress("ObjectPropertyName")
private var _StopSquare: ImageVector? = null
