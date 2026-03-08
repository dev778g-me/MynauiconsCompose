package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Stop: ImageVector
    get() {
        if (_Stop != null) {
            return _Stop!!
        }
        _Stop = ImageVector.Builder(
            name = "Outline.Stop",
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
                moveTo(6f, 12.5f)
                curveToRelative(0f, -2.828f, 0f, -4.243f, 0.879f, -5.121f)
                curveTo(7.757f, 6.5f, 9.172f, 6.5f, 12f, 6.5f)
                reflectiveCurveToRelative(4.243f, 0f, 5.121f, 0.879f)
                curveTo(18f, 8.257f, 18f, 9.672f, 18f, 12.5f)
                reflectiveCurveToRelative(0f, 4.243f, -0.879f, 5.121f)
                curveToRelative(-0.878f, 0.879f, -2.293f, 0.879f, -5.121f, 0.879f)
                reflectiveCurveToRelative(-4.243f, 0f, -5.121f, -0.879f)
                curveTo(6f, 16.743f, 6f, 15.328f, 6f, 12.5f)
            }
        }.build()

        return _Stop!!
    }

@Suppress("ObjectPropertyName")
private var _Stop: ImageVector? = null
