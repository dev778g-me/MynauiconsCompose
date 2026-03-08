package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChartSpline: ImageVector
    get() {
        if (_ChartSpline != null) {
            return _ChartSpline!!
        }
        _ChartSpline = ImageVector.Builder(
            name = "Outline.ChartSpline",
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
                moveTo(21f, 21f)
                horizontalLineTo(9.4f)
                curveToRelative(-2.24f, 0f, -3.36f, 0f, -4.216f, -0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, -1.748f)
                curveTo(3f, 17.96f, 3f, 16.84f, 3f, 14.6f)
                verticalLineTo(3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 17f)
                curveToRelative(-3.355f, -1.678f, -3.924f, -6.346f, -5.089f, -9.58f)
                curveToRelative(-0.476f, -1.322f, -2.346f, -1.322f, -2.822f, 0f)
                curveTo(9.924f, 10.654f, 9.355f, 15.322f, 6f, 17f)
            }
        }.build()

        return _ChartSpline!!
    }

@Suppress("ObjectPropertyName")
private var _ChartSpline: ImageVector? = null
