package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Zap: ImageVector
    get() {
        if (_Zap != null) {
            return _Zap!!
        }
        _Zap = ImageVector.Builder(
            name = "Outline.Zap",
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
                moveTo(12.748f, 3.572f)
                curveToRelative(0.059f, -0.503f, -0.532f, -0.777f, -0.835f, -0.388f)
                lineTo(4.111f, 13.197f)
                curveToRelative(-0.258f, 0.33f, -0.038f, 0.832f, 0.364f, 0.832f)
                horizontalLineToRelative(6.988f)
                curveToRelative(0.285f, 0f, 0.506f, 0.267f, 0.47f, 0.57f)
                lineToRelative(-0.68f, 5.83f)
                curveToRelative(-0.06f, 0.502f, 0.53f, 0.776f, 0.834f, 0.387f)
                lineToRelative(7.802f, -10.013f)
                curveToRelative(0.258f, -0.33f, 0.038f, -0.832f, -0.364f, -0.832f)
                horizontalLineToRelative(-6.988f)
                curveToRelative(-0.285f, 0f, -0.506f, -0.267f, -0.47f, -0.57f)
                close()
            }
        }.build()

        return _Zap!!
    }

@Suppress("ObjectPropertyName")
private var _Zap: ImageVector? = null
