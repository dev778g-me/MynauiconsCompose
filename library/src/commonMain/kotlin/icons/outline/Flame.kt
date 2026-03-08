package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Flame: ImageVector
    get() {
        if (_Flame != null) {
            return _Flame!!
        }
        _Flame = ImageVector.Builder(
            name = "Outline.Flame",
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
                moveTo(18.567f, 15.969f)
                curveToRelative(-1.064f, 2.66f, -3.58f, 4.531f, -6.513f, 4.531f)
                curveTo(8.158f, 20.5f, 5f, 17.202f, 5f, 13.133f)
                curveTo(5f, 9.065f, 6.482f, 7.401f, 8.798f, 3.5f)
                curveTo(13.14f, 5.483f, 13f, 13f, 13f, 13f)
                reflectiveCurveToRelative(1.565f, -4.436f, 4.48f, -5.817f)
                curveToRelative(0.935f, 2.873f, 2.195f, 6.012f, 1.087f, 8.786f)
            }
        }.build()

        return _Flame!!
    }

@Suppress("ObjectPropertyName")
private var _Flame: ImageVector? = null
