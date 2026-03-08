package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ZapOff: ImageVector
    get() {
        if (_ZapOff != null) {
            return _ZapOff!!
        }
        _ZapOff = ImageVector.Builder(
            name = "Outline.ZapOff",
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
                moveToRelative(3f, 21f)
                lineToRelative(6.971f, -6.971f)
                moveTo(21f, 3f)
                lineToRelative(-6.971f, 6.971f)
                moveToRelative(-4.058f, 4.058f)
                horizontalLineToRelative(1.492f)
                curveToRelative(0.285f, 0f, 0.506f, 0.267f, 0.47f, 0.57f)
                lineToRelative(-0.68f, 5.83f)
                curveToRelative(-0.06f, 0.502f, 0.53f, 0.776f, 0.834f, 0.387f)
                lineToRelative(7.802f, -10.013f)
                curveToRelative(0.258f, -0.33f, 0.038f, -0.832f, -0.364f, -0.832f)
                horizontalLineToRelative(-5.496f)
                moveToRelative(-4.058f, 4.058f)
                lineToRelative(4.058f, -4.058f)
                moveTo(5.5f, 14.029f)
                horizontalLineTo(4.475f)
                curveToRelative(-0.402f, 0f, -0.622f, -0.502f, -0.364f, -0.832f)
                lineToRelative(7.802f, -10.013f)
                curveToRelative(0.303f, -0.389f, 0.894f, -0.115f, 0.835f, 0.388f)
                lineToRelative(-0.46f, 3.928f)
            }
        }.build()

        return _ZapOff!!
    }

@Suppress("ObjectPropertyName")
private var _ZapOff: ImageVector? = null
