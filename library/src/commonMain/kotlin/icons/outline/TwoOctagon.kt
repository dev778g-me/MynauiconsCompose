package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TwoOctagon: ImageVector
    get() {
        if (_TwoOctagon != null) {
            return _TwoOctagon!!
        }
        _TwoOctagon = ImageVector.Builder(
            name = "Outline.TwoOctagon",
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
                moveTo(9.5f, 10.337f)
                curveToRelative(0f, -3.116f, 4.615f, -3.116f, 4.615f, 0f)
                curveToRelative(0f, 2.352f, -3.015f, 4.38f, -4.615f, 5.663f)
                curveToRelative(0f, 0f, 3f, -0.5f, 5f, 0f)
            }
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
        }.build()

        return _TwoOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _TwoOctagon: ImageVector? = null
