package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Pin: ImageVector
    get() {
        if (_Pin != null) {
            return _Pin!!
        }
        _Pin = ImageVector.Builder(
            name = "Outline.Pin",
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
                lineToRelative(4.63f, -4.631f)
                moveToRelative(0.005f, -0.005f)
                lineToRelative(-2.78f, -2.78f)
                curveToRelative(-0.954f, -0.953f, 0.006f, -2.996f, 1.31f, -3.078f)
                curveToRelative(1.178f, -0.075f, 3.905f, 0.352f, 4.812f, -0.555f)
                lineToRelative(2.49f, -2.49f)
                curveToRelative(0.617f, -0.618f, 0.225f, -2f, 0.185f, -2.762f)
                curveToRelative(-0.058f, -1.016f, 1.558f, -2.271f, 2.415f, -1.414f)
                lineToRelative(4.647f, 4.648f)
                curveToRelative(0.86f, 0.858f, -0.4f, 2.469f, -1.413f, 2.415f)
                curveToRelative(-0.762f, -0.04f, -2.145f, -0.432f, -2.763f, 0.185f)
                lineToRelative(-2.49f, 2.49f)
                curveToRelative(-0.906f, 0.907f, -0.48f, 3.633f, -0.554f, 4.811f)
                curveToRelative(-0.082f, 1.305f, -2.125f, 2.265f, -3.08f, 1.31f)
                close()
            }
        }.build()

        return _Pin!!
    }

@Suppress("ObjectPropertyName")
private var _Pin: ImageVector? = null
