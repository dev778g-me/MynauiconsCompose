package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Sparkles: ImageVector
    get() {
        if (_Sparkles != null) {
            return _Sparkles!!
        }
        _Sparkles = ImageVector.Builder(
            name = "Outline.Sparkles",
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
                moveTo(14.77f, 21f)
                curveToRelative(1.123f, -4.649f, 2.486f, -6.099f, 6.23f, -7.364f)
                curveToRelative(-3.934f, -1.328f, -5.16f, -2.94f, -6.23f, -7.363f)
                curveToRelative(-1.124f, 4.649f, -2.488f, 6.098f, -6.232f, 7.363f)
                curveToRelative(3.93f, 1.327f, 5.163f, 2.95f, 6.231f, 7.364f)
                moveToRelative(-8.308f, -9.818f)
                curveToRelative(0.512f, -2.42f, 1.502f, -3.512f, 3.461f, -4.091f)
                curveTo(7.963f, 6.512f, 6.973f, 5.42f, 6.462f, 3f)
                curveTo(5.972f, 5.315f, 5.047f, 6.485f, 3f, 7.09f)
                curveToRelative(1.959f, 0.58f, 2.95f, 1.672f, 3.462f, 4.092f)
            }
        }.build()

        return _Sparkles!!
    }

@Suppress("ObjectPropertyName")
private var _Sparkles: ImageVector? = null
