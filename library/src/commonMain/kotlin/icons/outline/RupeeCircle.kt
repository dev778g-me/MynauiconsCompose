package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.RupeeCircle: ImageVector
    get() {
        if (_RupeeCircle != null) {
            return _RupeeCircle!!
        }
        _RupeeCircle = ImageVector.Builder(
            name = "Outline.RupeeCircle",
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
                moveTo(9f, 7.5f)
                horizontalLineToRelative(6f)
                moveToRelative(-6f, 2.778f)
                horizontalLineToRelative(6f)
                moveTo(13.25f, 17.5f)
                lineTo(9f, 13.056f)
                horizontalLineToRelative(1.5f)
                curveToRelative(3.334f, 0f, 3.334f, -5.556f, 0f, -5.556f)
            }
        }.build()

        return _RupeeCircle!!
    }

@Suppress("ObjectPropertyName")
private var _RupeeCircle: ImageVector? = null
