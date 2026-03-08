package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.YenOctagon: ImageVector
    get() {
        if (_YenOctagon != null) {
            return _YenOctagon!!
        }
        _YenOctagon = ImageVector.Builder(
            name = "Outline.YenOctagon",
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
                lineTo(8.937f, 21f)
                curveToRelative(-0.5f, 0f, -0.788f, -0.125f, -1.132f, -0.469f)
                lineTo(3.47f, 16.195f)
                curveToRelative(-0.355f, -0.355f, -0.47f, -0.646f, -0.47f, -1.132f)
                lineTo(3f, 8.937f)
                curveToRelative(0f, -0.5f, 0.125f, -0.788f, 0.469f, -1.132f)
                close()
                moveTo(15.182f, 12.5f)
                lineTo(12f, 12.5f)
                moveToRelative(0f, 0f)
                lineTo(8.818f, 12.5f)
                moveToRelative(3.182f, 0f)
                lineToRelative(-3.5f, -5f)
                moveToRelative(3.5f, 5f)
                lineToRelative(3.5f, -5f)
                moveToRelative(-3.5f, 5f)
                lineTo(12f, 15f)
                moveToRelative(3.182f, 0f)
                lineTo(12f, 15f)
                moveToRelative(0f, 0f)
                lineTo(8.818f, 15f)
                moveTo(12f, 15f)
                verticalLineToRelative(2.5f)
            }
        }.build()

        return _YenOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _YenOctagon: ImageVector? = null
