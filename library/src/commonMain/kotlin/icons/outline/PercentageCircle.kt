package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.PercentageCircle: ImageVector
    get() {
        if (_PercentageCircle != null) {
            return _PercentageCircle!!
        }
        _PercentageCircle = ImageVector.Builder(
            name = "Outline.PercentageCircle",
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
                moveTo(9.854f, 9.854f)
                lineTo(9.5f, 9.5f)
                moveToRelative(5.004f, 5.004f)
                lineToRelative(-0.354f, -0.354f)
                moveToRelative(-4.65f, 0.35f)
                lineToRelative(5f, -5f)
            }
        }.build()

        return _PercentageCircle!!
    }

@Suppress("ObjectPropertyName")
private var _PercentageCircle: ImageVector? = null
