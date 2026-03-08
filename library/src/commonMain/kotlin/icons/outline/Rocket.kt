package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Rocket: ImageVector
    get() {
        if (_Rocket != null) {
            return _Rocket!!
        }
        _Rocket = ImageVector.Builder(
            name = "Outline.Rocket",
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
                moveToRelative(7.75f, 13.85f)
                lineToRelative(2.4f, 2.4f)
                moveToRelative(-2.4f, -2.4f)
                reflectiveCurveToRelative(1.417f, -3.542f, 3.434f, -6f)
                moveToRelative(-3.434f, 6f)
                curveToRelative(-5.219f, -1.305f, -0.53f, -6f, 3.434f, -6f)
                moveToRelative(-1.034f, 8.4f)
                reflectiveCurveToRelative(3.542f, -1.417f, 6f, -3.434f)
                moveToRelative(-6f, 3.434f)
                curveToRelative(1.305f, 5.218f, 6f, 0.53f, 6f, -3.434f)
                moveTo(11.184f, 7.85f)
                curveToRelative(2.04f, -2.486f, 5.403f, -3.6f, 8.566f, -3.6f)
                curveToRelative(0f, 3.163f, -1.114f, 6.525f, -3.6f, 8.566f)
                moveToRelative(-1.7f, -3.359f)
                lineToRelative(0.707f, -0.707f)
                moveToRelative(-9.638f, 7.826f)
                curveToRelative(-0.952f, 0.801f, -1.269f, 3.179f, -1.269f, 3.179f)
                reflectiveCurveToRelative(2.372f, -0.318f, 3.171f, -1.272f)
                curveToRelative(0.45f, -0.534f, 0.444f, -1.354f, -0.057f, -1.85f)
                arcToRelative(1.394f, 1.394f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.845f, -0.057f)
            }
        }.build()

        return _Rocket!!
    }

@Suppress("ObjectPropertyName")
private var _Rocket: ImageVector? = null
