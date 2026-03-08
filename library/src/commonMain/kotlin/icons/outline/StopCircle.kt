package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.StopCircle: ImageVector
    get() {
        if (_StopCircle != null) {
            return _StopCircle!!
        }
        _StopCircle = ImageVector.Builder(
            name = "Outline.StopCircle",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
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

        return _StopCircle!!
    }

@Suppress("ObjectPropertyName")
private var _StopCircle: ImageVector? = null
