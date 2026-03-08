package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Ribbon: ImageVector
    get() {
        if (_Ribbon != null) {
            return _Ribbon!!
        }
        _Ribbon = ImageVector.Builder(
            name = "Outline.Ribbon",
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
                moveTo(18f, 9f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 9f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(8f, 13.472f)
                lineToRelative(-1f, 6.44f)
                curveToRelative(0f, 0.81f, 1.782f, 1.336f, 2.447f, 0.974f)
                lineToRelative(2.106f, -1.147f)
                arcToRelative(0.93f, 0.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.894f, 0f)
                lineToRelative(2.106f, 1.147f)
                curveToRelative(0.665f, 0.362f, 2.447f, -0.165f, 2.447f, -0.975f)
                lineToRelative(-1f, -6.439f)
            }
        }.build()

        return _Ribbon!!
    }

@Suppress("ObjectPropertyName")
private var _Ribbon: ImageVector? = null
