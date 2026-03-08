package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Droplets: ImageVector
    get() {
        if (_Droplets != null) {
            return _Droplets!!
        }
        _Droplets = ImageVector.Builder(
            name = "Outline.Droplets",
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
                moveTo(11.995f, 3f)
                curveTo(10f, 8f, 2.661f, 10.606f, 5.073f, 16.397f)
                curveTo(6.225f, 19.163f, 9.008f, 21f, 12f, 21f)
                reflectiveCurveToRelative(5.775f, -1.837f, 6.927f, -4.603f)
                moveTo(14.997f, 5f)
                curveToRelative(-0.186f, 0.481f, -0.46f, 0.922f, -0.777f, 1.34f)
                curveToRelative(-1.515f, 1.992f, -4.037f, 3.443f, -2.96f, 6.103f)
                curveTo(11.882f, 13.979f, 13.384f, 15f, 15f, 15f)
                curveToRelative(1.615f, 0f, 3.118f, -1.02f, 3.74f, -2.557f)
                quadToRelative(0.101f, -0.25f, 0.162f, -0.488f)
                curveTo(19.639f, 9.07f, 16.023f, 7.633f, 14.997f, 5f)
            }
        }.build()

        return _Droplets!!
    }

@Suppress("ObjectPropertyName")
private var _Droplets: ImageVector? = null
