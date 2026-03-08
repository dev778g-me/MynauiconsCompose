package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Threads: ImageVector
    get() {
        if (_Threads != null) {
            return _Threads!!
        }
        _Threads = ImageVector.Builder(
            name = "Outline.Threads",
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
                moveTo(9.77f, 8.515f)
                curveToRelative(2.23f, -1.812f, 5.444f, -0.845f, 5.823f, 2.135f)
                curveToRelative(0.403f, 3.163f, -0.4f, 5.67f, -3.52f, 5.67f)
                curveToRelative(-2.895f, 0f, -2.806f, -2.52f, -2.806f, -2.52f)
                curveToRelative(0f, -2.7f, 4.589f, -3.06f, 7.262f, -1.71f)
                curveToRelative(4.9f, 3.15f, 1.336f, 8.91f, -4.01f, 8.91f)
                curveTo(8.09f, 21f, 4.5f, 18.75f, 4.5f, 12f)
                reflectiveCurveToRelative(3.59f, -9f, 8.02f, -9f)
                curveToRelative(3.125f, 0f, 5.944f, 1.626f, 6.98f, 4.879f)
            }
        }.build()

        return _Threads!!
    }

@Suppress("ObjectPropertyName")
private var _Threads: ImageVector? = null
