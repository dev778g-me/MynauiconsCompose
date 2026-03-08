package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.DollarSquare: ImageVector
    get() {
        if (_DollarSquare != null) {
            return _DollarSquare!!
        }
        _DollarSquare = ImageVector.Builder(
            name = "Outline.DollarSquare",
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
                moveTo(3f, 9.4f)
                curveToRelative(0f, -2.24f, 0f, -3.36f, 0.436f, -4.216f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.748f, -1.748f)
                curveTo(6.04f, 3f, 7.16f, 3f, 9.4f, 3f)
                horizontalLineToRelative(5.2f)
                curveToRelative(2.24f, 0f, 3.36f, 0f, 4.216f, 0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.748f, 1.748f)
                curveTo(21f, 6.04f, 21f, 7.16f, 21f, 9.4f)
                verticalLineToRelative(5.2f)
                curveToRelative(0f, 2.24f, 0f, 3.36f, -0.436f, 4.216f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, 1.748f)
                curveTo(17.96f, 21f, 16.84f, 21f, 14.6f, 21f)
                horizontalLineTo(9.4f)
                curveToRelative(-2.24f, 0f, -3.36f, 0f, -4.216f, -0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, -1.748f)
                curveTo(3f, 17.96f, 3f, 16.84f, 3f, 14.6f)
                close()
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

        return _DollarSquare!!
    }

@Suppress("ObjectPropertyName")
private var _DollarSquare: ImageVector? = null
