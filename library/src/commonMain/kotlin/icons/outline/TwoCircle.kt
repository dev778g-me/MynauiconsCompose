package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TwoCircle: ImageVector
    get() {
        if (_TwoCircle != null) {
            return _TwoCircle!!
        }
        _TwoCircle = ImageVector.Builder(
            name = "Outline.TwoCircle",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 10.337f)
                curveToRelative(0f, -3.116f, 4.615f, -3.116f, 4.615f, 0f)
                curveToRelative(0f, 2.352f, -3.015f, 4.38f, -4.615f, 5.663f)
                curveToRelative(0f, 0f, 3f, -0.5f, 5f, 0f)
            }
        }.build()

        return _TwoCircle!!
    }

@Suppress("ObjectPropertyName")
private var _TwoCircle: ImageVector? = null
