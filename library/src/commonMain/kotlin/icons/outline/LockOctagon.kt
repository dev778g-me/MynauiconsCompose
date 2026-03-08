package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LockOctagon: ImageVector
    get() {
        if (_LockOctagon != null) {
            return _LockOctagon!!
        }
        _LockOctagon = ImageVector.Builder(
            name = "Outline.LockOctagon",
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
                moveTo(14.004f, 10.947f)
                verticalLineTo(8.925f)
                curveToRelative(0f, -2.641f, -4.008f, -2.491f, -4.008f, 0f)
                verticalLineToRelative(2.021f)
                moveToRelative(-0.994f, 0f)
                horizontalLineToRelative(5.996f)
                curveToRelative(0.553f, 0f, 1.002f, 0.453f, 1.002f, 1.011f)
                verticalLineToRelative(3.032f)
                curveToRelative(0f, 0.558f, -0.449f, 1.011f, -1.002f, 1.011f)
                horizontalLineTo(9.002f)
                arcTo(1.006f, 1.006f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 14.99f)
                verticalLineToRelative(-3.033f)
                curveToRelative(0f, -0.558f, 0.449f, -1.01f, 1.002f, -1.01f)
            }
        }.build()

        return _LockOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _LockOctagon: ImageVector? = null
