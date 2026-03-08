package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.DollarOctagon: ImageVector
    get() {
        if (_DollarOctagon != null) {
            return _DollarOctagon!!
        }
        _DollarOctagon = ImageVector.Builder(
            name = "Outline.DollarOctagon",
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
                moveTo(7.805f, 3.469f)
                curveTo(8.16f, 3.115f, 8.451f, 3f, 8.937f, 3f)
                horizontalLineToRelative(6.126f)
                curveToRelative(0.486f, 0f, 0.778f, 0.115f, 1.132f, 0.469f)
                lineToRelative(4.336f, 4.336f)
                curveToRelative(0.354f, 0.354f, 0.469f, 0.646f, 0.469f, 1.132f)
                verticalLineToRelative(6.126f)
                curveToRelative(0f, 0.5f, -0.125f, 0.788f, -0.469f, 1.132f)
                lineToRelative(-4.336f, 4.336f)
                curveToRelative(-0.354f, 0.354f, -0.646f, 0.469f, -1.132f, 0.469f)
                horizontalLineTo(8.937f)
                curveToRelative(-0.5f, 0f, -0.788f, -0.125f, -1.132f, -0.469f)
                lineTo(3.47f, 16.195f)
                curveToRelative(-0.355f, -0.355f, -0.47f, -0.646f, -0.47f, -1.132f)
                verticalLineTo(8.937f)
                curveToRelative(0f, -0.5f, 0.125f, -0.788f, 0.469f, -1.132f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.333f, 7.722f)
                horizontalLineTo(12f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-1.667f)
                curveTo(9.045f, 7.722f, 8f, 8.68f, 8f, 9.862f)
                curveTo(8f, 11.041f, 9.045f, 12f, 10.333f, 12f)
                horizontalLineTo(12f)
                moveToRelative(0f, -4.278f)
                verticalLineTo(6.5f)
                moveToRelative(0f, 1.222f)
                verticalLineTo(12f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(1.667f)
                curveToRelative(1.288f, 0f, 2.333f, 0.958f, 2.333f, 2.139f)
                reflectiveCurveToRelative(-1.045f, 2.139f, -2.333f, 2.139f)
                horizontalLineTo(12f)
                moveTo(12f, 12f)
                verticalLineToRelative(4.278f)
                moveToRelative(0f, 0f)
                horizontalLineTo(8f)
                moveToRelative(4f, 0f)
                verticalLineTo(17.5f)
            }
        }.build()

        return _DollarOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _DollarOctagon: ImageVector? = null
