package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CodeOctagon: ImageVector
    get() {
        if (_CodeOctagon != null) {
            return _CodeOctagon!!
        }
        _CodeOctagon = ImageVector.Builder(
            name = "Outline.CodeOctagon",
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
                moveToRelative(14.908f, 9.7f)
                lineToRelative(0.132f, 0.131f)
                curveToRelative(1.022f, 1.023f, 1.534f, 1.534f, 1.534f, 2.169f)
                reflectiveCurveToRelative(-0.512f, 1.147f, -1.534f, 2.17f)
                lineToRelative(-0.132f, 0.13f)
                moveTo(13.072f, 8f)
                lineToRelative(-2.143f, 8f)
                moveTo(9.092f, 9.7f)
                lineToRelative(-0.132f, 0.131f)
                curveTo(7.938f, 10.854f, 7.427f, 11.365f, 7.427f, 12f)
                reflectiveCurveToRelative(0.51f, 1.147f, 1.533f, 2.17f)
                lineToRelative(0.132f, 0.13f)
            }
        }.build()

        return _CodeOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _CodeOctagon: ImageVector? = null
