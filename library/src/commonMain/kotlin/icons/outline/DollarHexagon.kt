package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.DollarHexagon: ImageVector
    get() {
        if (_DollarHexagon != null) {
            return _DollarHexagon!!
        }
        _DollarHexagon = ImageVector.Builder(
            name = "Outline.DollarHexagon",
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
                moveTo(20.5f, 15.8f)
                verticalLineTo(8.2f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.944f, -1.645f)
                lineToRelative(-6.612f, -3.8f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.888f, 0f)
                lineToRelative(-6.612f, 3.8f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 8.2f)
                verticalLineToRelative(7.602f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.944f, 1.644f)
                lineToRelative(6.612f, 3.8f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.888f, 0f)
                lineToRelative(6.612f, -3.8f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 15.8f)
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

        return _DollarHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _DollarHexagon: ImageVector? = null
