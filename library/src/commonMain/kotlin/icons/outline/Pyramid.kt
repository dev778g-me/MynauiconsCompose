package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Pyramid: ImageVector
    get() {
        if (_Pyramid != null) {
            return _Pyramid!!
        }
        _Pyramid = ImageVector.Builder(
            name = "Outline.Pyramid",
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
                moveToRelative(11.998f, 3f)
                lineToRelative(8.418f, 12.561f)
                curveToRelative(0.16f, 0.24f, 0.083f, 0.56f, -0.169f, 0.705f)
                lineTo(11.997f, 21f)
                moveToRelative(0f, -18f)
                verticalLineToRelative(0.002f)
                lineToRelative(-8.413f, 12.56f)
                arcToRelative(0.493f, 0.493f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.169f, 0.704f)
                lineTo(11.998f, 21f)
                moveToRelative(0f, -18f)
                verticalLineToRelative(18f)
            }
        }.build()

        return _Pyramid!!
    }

@Suppress("ObjectPropertyName")
private var _Pyramid: ImageVector? = null
