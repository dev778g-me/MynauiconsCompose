package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChartCandlestick: ImageVector
    get() {
        if (_ChartCandlestick != null) {
            return _ChartCandlestick!!
        }
        _ChartCandlestick = ImageVector.Builder(
            name = "Outline.ChartCandlestick",
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
                moveTo(9f, 5.5f)
                verticalLineToRelative(2.818f)
                moveToRelative(0f, 6.364f)
                verticalLineTo(17.5f)
                moveToRelative(2f, -8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.475f, -4f, 1.677f, -4f, 0f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.475f, 4f, -1.677f, 4f, 0f)
                moveToRelative(6f, -6f)
                verticalLineToRelative(1.818f)
                moveToRelative(0f, 8.364f)
                verticalLineTo(17.5f)
                moveToRelative(0f, -12.182f)
                curveToRelative(-0.75f, -0.025f, -2f, 0.343f, -2f, 1.182f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.475f, 4f, 1.677f, 4f, 0f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.738f, -1.25f, -1.157f, -2f, -1.182f)
            }
        }.build()

        return _ChartCandlestick!!
    }

@Suppress("ObjectPropertyName")
private var _ChartCandlestick: ImageVector? = null
