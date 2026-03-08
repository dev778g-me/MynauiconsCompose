package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MousePointer: ImageVector
    get() {
        if (_MousePointer != null) {
            return _MousePointer!!
        }
        _MousePointer = ImageVector.Builder(
            name = "Outline.MousePointer",
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
                moveToRelative(12.866f, 12.866f)
                lineToRelative(5.628f, -2.412f)
                curveToRelative(0.942f, -0.404f, 0.886f, -1.758f, -0.086f, -2.082f)
                lineTo(5.469f, 4.059f)
                curveToRelative(-0.871f, -0.29f, -1.7f, 0.539f, -1.41f, 1.41f)
                lineToRelative(4.313f, 12.939f)
                curveToRelative(0.324f, 0.972f, 1.678f, 1.028f, 2.082f, 0.086f)
                close()
                moveTo(12.866f, 12.866f)
                lineTo(20f, 20f)
            }
        }.build()

        return _MousePointer!!
    }

@Suppress("ObjectPropertyName")
private var _MousePointer: ImageVector? = null
