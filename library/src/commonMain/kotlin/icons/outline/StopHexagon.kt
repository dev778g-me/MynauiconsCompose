package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.StopHexagon: ImageVector
    get() {
        if (_StopHexagon != null) {
            return _StopHexagon!!
        }
        _StopHexagon = ImageVector.Builder(
            name = "Outline.StopHexagon",
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
                moveTo(20.5f, 15.8f)
                verticalLineTo(8.2f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.944f, -1.645f)
                lineToRelative(-6.612f, -3.8f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.888f, 0f)
                lineToRelative(-6.612f, 3.8f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 8.2f)
                verticalLineToRelative(7.602f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.944f, 1.644f)
                lineToRelative(6.612f, 3.8f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.888f, 0f)
                lineToRelative(6.612f, -3.8f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 15.8f)
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

        return _StopHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _StopHexagon: ImageVector? = null
