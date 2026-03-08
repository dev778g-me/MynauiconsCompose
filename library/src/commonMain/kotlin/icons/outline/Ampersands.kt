package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Ampersands: ImageVector
    get() {
        if (_Ampersands != null) {
            return _Ampersands!!
        }
        _Ampersands = ImageVector.Builder(
            name = "Outline.Ampersands",
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
                moveTo(11f, 17.5f)
                curveTo(9.174f, 15.517f, 3f, 12f, 3.481f, 8.525f)
                curveToRelative(0f, -1.1f, 0.904f, -2.025f, 1.963f, -2.025f)
                reflectiveCurveToRelative(1.964f, 0.924f, 1.964f, 2.025f)
                curveToRelative(0f, 1.83f, -2.585f, 3.505f, -3.699f, 4.654f)
                curveToRelative(-0.945f, 0.975f, -0.945f, 2.605f, 0f, 3.58f)
                curveToRelative(0.944f, 0.973f, 2.537f, 0.963f, 3.471f, 0f)
                lineTo(11f, 12.687f)
                moveTo(21f, 17.5f)
                curveToRelative(-1.826f, -1.983f, -8f, -5.5f, -7.519f, -8.975f)
                curveToRelative(0f, -1.1f, 0.904f, -2.025f, 1.963f, -2.025f)
                reflectiveCurveToRelative(1.964f, 0.924f, 1.964f, 2.025f)
                curveToRelative(0f, 1.83f, -2.585f, 3.505f, -3.699f, 4.654f)
                curveToRelative(-0.945f, 0.975f, -0.945f, 2.605f, 0f, 3.58f)
                curveToRelative(0.944f, 0.973f, 2.537f, 0.963f, 3.471f, 0f)
                lineTo(21f, 12.687f)
            }
        }.build()

        return _Ampersands!!
    }

@Suppress("ObjectPropertyName")
private var _Ampersands: ImageVector? = null
