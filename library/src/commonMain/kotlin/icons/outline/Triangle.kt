package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Triangle: ImageVector
    get() {
        if (_Triangle != null) {
            return _Triangle!!
        }
        _Triangle = ImageVector.Builder(
            name = "Outline.Triangle",
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
                moveTo(5.98f, 10.762f)
                curveTo(8.608f, 5.587f, 9.92f, 3f, 12f, 3f)
                reflectiveCurveToRelative(3.393f, 2.587f, 6.02f, 7.762f)
                lineToRelative(0.327f, 0.644f)
                curveToRelative(2.182f, 4.3f, 3.274f, 6.45f, 2.287f, 8.022f)
                curveTo(19.648f, 21f, 17.208f, 21f, 12.327f, 21f)
                horizontalLineToRelative(-0.654f)
                curveToRelative(-4.88f, 0f, -7.321f, 0f, -8.307f, -1.572f)
                reflectiveCurveToRelative(0.105f, -3.722f, 2.287f, -8.022f)
                close()
            }
        }.build()

        return _Triangle!!
    }

@Suppress("ObjectPropertyName")
private var _Triangle: ImageVector? = null
