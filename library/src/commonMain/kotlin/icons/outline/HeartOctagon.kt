package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.HeartOctagon: ImageVector
    get() {
        if (_HeartOctagon != null) {
            return _HeartOctagon!!
        }
        _HeartOctagon = ImageVector.Builder(
            name = "Outline.HeartOctagon",
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
                moveTo(10.291f, 9.5f)
                arcToRelative(1.78f, 1.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.781f, 1.781f)
                curveToRelative(0f, 1.969f, 3.375f, 4.219f, 3.375f, 4.219f)
                reflectiveCurveToRelative(3.375f, -2.25f, 3.375f, -4.219f)
                curveToRelative(0f, -1.219f, -0.797f, -1.781f, -1.781f, -1.781f)
                curveToRelative(-0.698f, 0f, -1.302f, 0.4f, -1.594f, 0.985f)
                arcToRelative(1.78f, 1.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.594f, -0.985f)
            }
        }.build()

        return _HeartOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _HeartOctagon: ImageVector? = null
