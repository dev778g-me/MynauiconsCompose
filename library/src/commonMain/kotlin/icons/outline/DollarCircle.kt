package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.DollarCircle: ImageVector
    get() {
        if (_DollarCircle != null) {
            return _DollarCircle!!
        }
        _DollarCircle = ImageVector.Builder(
            name = "Outline.DollarCircle",
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
                moveTo(15.333f, 7.722f)
                horizontalLineTo(12f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-1.667f)
                curveTo(9.045f, 7.722f, 8f, 8.68f, 8f, 9.862f)
                curveTo(8f, 11.041f, 9.045f, 12f, 10.333f, 12f)
                horizontalLineTo(12f)
                moveToRelative(0f, -4.278f)
                verticalLineTo(6.5f)
                moveToRelative(0f, 1.222f)
                verticalLineTo(12f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(1.667f)
                curveToRelative(1.288f, 0f, 2.333f, 0.958f, 2.333f, 2.139f)
                reflectiveCurveToRelative(-1.045f, 2.139f, -2.333f, 2.139f)
                horizontalLineTo(12f)
                moveTo(12f, 12f)
                verticalLineToRelative(4.278f)
                moveToRelative(0f, 0f)
                horizontalLineTo(8f)
                moveToRelative(4f, 0f)
                verticalLineTo(17.5f)
            }
        }.build()

        return _DollarCircle!!
    }

@Suppress("ObjectPropertyName")
private var _DollarCircle: ImageVector? = null
