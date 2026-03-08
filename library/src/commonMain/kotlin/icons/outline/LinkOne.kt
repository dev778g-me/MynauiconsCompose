package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LinkOne: ImageVector
    get() {
        if (_LinkOne != null) {
            return _LinkOne!!
        }
        _LinkOne = ImageVector.Builder(
            name = "Outline.LinkOne",
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
                moveToRelative(10.936f, 8.324f)
                lineToRelative(4.38f, -4.385f)
                curveToRelative(1.276f, -1.276f, 3.372f, -1.248f, 4.683f, 0.063f)
                curveToRelative(1.31f, 1.312f, 1.338f, 3.41f, 0.062f, 4.686f)
                lineToRelative(-3.803f, 3.807f)
                moveToRelative(-8.516f, -0.99f)
                lineTo(3.94f, 15.312f)
                curveToRelative(-1.277f, 1.276f, -1.25f, 3.374f, 0.06f, 4.686f)
                reflectiveCurveToRelative(3.407f, 1.34f, 4.683f, 0.063f)
                lineToRelative(4.38f, -4.385f)
                moveToRelative(-2.065f, -2.666f)
                curveToRelative(-1.311f, -1.311f, -1.34f, -3.41f, -0.063f, -4.686f)
                moveToRelative(2.128f, 2.603f)
                curveToRelative(1.312f, 1.311f, 1.34f, 3.41f, 0.063f, 4.686f)
            }
        }.build()

        return _LinkOne!!
    }

@Suppress("ObjectPropertyName")
private var _LinkOne: ImageVector? = null
