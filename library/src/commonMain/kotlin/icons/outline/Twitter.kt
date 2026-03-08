package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Twitter: ImageVector
    get() {
        if (_Twitter != null) {
            return _Twitter!!
        }
        _Twitter = ImageVector.Builder(
            name = "Outline.Twitter",
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
                moveTo(21f, 4.85f)
                curveToRelative(-0.9f, 0.443f, -1.782f, 0.623f, -2.7f, 0.896f)
                curveToRelative(-1.009f, -1.145f, -2.505f, -1.208f, -3.942f, -0.667f)
                curveTo(12.427f, 5.806f, 12f, 7.529f, 12f, 9.364f)
                curveToRelative(-2.92f, 0.075f, -5.521f, -1.262f, -7.2f, -3.618f)
                curveToRelative(0f, 0f, -3.764f, 6.723f, 3.6f, 9.95f)
                curveToRelative(-1.685f, 1.127f, -3.365f, 1.888f, -5.4f, 1.808f)
                curveToRelative(2.977f, 1.631f, 6.222f, 2.192f, 9.03f, 1.372f)
                curveToRelative(4.63f, -1.351f, 7.36f, -5.722f, 7.334f, -10.397f)
                curveToRelative(0f, -0.225f, 1.359f, -2.506f, 1.636f, -3.629f)
            }
        }.build()

        return _Twitter!!
    }

@Suppress("ObjectPropertyName")
private var _Twitter: ImageVector? = null
