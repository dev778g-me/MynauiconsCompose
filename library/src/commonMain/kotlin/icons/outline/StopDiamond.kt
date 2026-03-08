package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.StopDiamond: ImageVector
    get() {
        if (_StopDiamond != null) {
            return _StopDiamond!!
        }
        _StopDiamond = ImageVector.Builder(
            name = "Outline.StopDiamond",
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
                moveTo(2.707f, 10.295f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.41f)
                lineToRelative(7.588f, 7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.41f, 0f)
                lineToRelative(7.588f, -7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.41f)
                lineToRelative(-7.588f, -7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.41f, 0f)
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

        return _StopDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _StopDiamond: ImageVector? = null
