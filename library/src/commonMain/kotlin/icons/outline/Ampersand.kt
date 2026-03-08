package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Ampersand: ImageVector
    get() {
        if (_Ampersand != null) {
            return _Ampersand!!
        }
        _Ampersand = ImageVector.Builder(
            name = "Outline.Ampersand",
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
                moveTo(17.5f, 19.5f)
                curveTo(14.99f, 16.796f, 6.5f, 12f, 7.162f, 7.261f)
                curveToRelative(0f, -1.5f, 1.243f, -2.761f, 2.699f, -2.761f)
                reflectiveCurveToRelative(2.7f, 1.26f, 2.7f, 2.761f)
                curveToRelative(0f, 2.497f, -3.555f, 4.78f, -5.086f, 6.347f)
                curveToRelative(-1.3f, 1.33f, -1.3f, 3.551f, 0f, 4.881f)
                curveToRelative(1.297f, 1.327f, 3.488f, 1.314f, 4.773f, 0f)
                lineToRelative(5.252f, -5.552f)
            }
        }.build()

        return _Ampersand!!
    }

@Suppress("ObjectPropertyName")
private var _Ampersand: ImageVector? = null
