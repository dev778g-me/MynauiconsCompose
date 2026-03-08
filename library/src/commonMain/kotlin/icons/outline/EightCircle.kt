package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.EightCircle: ImageVector
    get() {
        if (_EightCircle != null) {
            return _EightCircle!!
        }
        _EightCircle = ImageVector.Builder(
            name = "Outline.EightCircle",
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
                moveTo(12f, 12f)
                reflectiveCurveToRelative(2.5f, 0.5f, 2.5f, 2f)
                reflectiveCurveToRelative(-1.12f, 2f, -2.5f, 2f)
                reflectiveCurveToRelative(-2.5f, -0.5f, -2.5f, -2f)
                reflectiveCurveToRelative(2.5f, -2f, 2.5f, -2f)
                moveToRelative(0f, 0f)
                reflectiveCurveToRelative(2.5f, -0.5f, 2.5f, -2f)
                reflectiveCurveToRelative(-1.12f, -2f, -2.5f, -2f)
                reflectiveCurveToRelative(-2.5f, 0.5f, -2.5f, 2f)
                reflectiveCurveToRelative(2.5f, 2f, 2.5f, 2f)
            }
        }.build()

        return _EightCircle!!
    }

@Suppress("ObjectPropertyName")
private var _EightCircle: ImageVector? = null
