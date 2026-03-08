package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CloudMoon: ImageVector
    get() {
        if (_CloudMoon != null) {
            return _CloudMoon!!
        }
        _CloudMoon = ImageVector.Builder(
            name = "Outline.CloudMoon",
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
                moveTo(16.882f, 20.257f)
                curveToRelative(2.793f, -2.337f, -0.163f, -5.47f, -3.232f, -5.47f)
                curveToRelative(-2.162f, -8.209f, -14.847f, -1.419f, -9.226f, 4.769f)
                moveTo(11f, 8.089f)
                curveTo(11f, 5.69f, 12.57f, 3.268f, 15.506f, 3f)
                curveToRelative(-2.62f, 3.498f, 1.948f, 8.034f, 5.494f, 5.449f)
                curveToRelative(-0.15f, 1.601f, -1.083f, 2.952f, -2.369f, 3.756f)
            }
        }.build()

        return _CloudMoon!!
    }

@Suppress("ObjectPropertyName")
private var _CloudMoon: ImageVector? = null
