package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Atom: ImageVector
    get() {
        if (_Atom != null) {
            return _Atom!!
        }
        _Atom = ImageVector.Builder(
            name = "Outline.Atom",
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
                moveTo(15.407f, 8.593f)
                curveToRelative(4.6f, 4.6f, 6.802f, 9.853f, 4.92f, 11.735f)
                curveToRelative(-1.88f, 1.881f, -7.135f, -0.322f, -11.734f, -4.921f)
                reflectiveCurveTo(1.791f, 5.554f, 3.673f, 3.672f)
                curveToRelative(1.88f, -1.881f, 7.134f, 0.322f, 11.734f, 4.921f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.594f, 8.593f)
                curveToRelative(-4.6f, 4.6f, -6.803f, 9.853f, -4.921f, 11.735f)
                reflectiveCurveToRelative(7.135f, -0.322f, 11.734f, -4.921f)
                reflectiveCurveToRelative(6.803f, -9.853f, 4.921f, -11.735f)
                reflectiveCurveToRelative(-7.135f, 0.322f, -11.734f, 4.921f)
                moveTo(11.75f, 12f)
                horizontalLineToRelative(0.5f)
            }
        }.build()

        return _Atom!!
    }

@Suppress("ObjectPropertyName")
private var _Atom: ImageVector? = null
