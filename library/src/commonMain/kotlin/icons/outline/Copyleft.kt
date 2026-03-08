package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Copyleft: ImageVector
    get() {
        if (_Copyleft != null) {
            return _Copyleft!!
        }
        _Copyleft = ImageVector.Builder(
            name = "Outline.Copyleft",
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
                moveTo(9.75f, 9f)
                curveToRelative(0.48f, -0.6f, 1.07f, -1f, 2f, -1f)
                curveToRelative(4.172f, 0f, 4.172f, 8f, 0f, 8f)
                curveToRelative(-0.93f, 0f, -1.52f, -0.4f, -2f, -1f)
            }
        }.build()

        return _Copyleft!!
    }

@Suppress("ObjectPropertyName")
private var _Copyleft: ImageVector? = null
