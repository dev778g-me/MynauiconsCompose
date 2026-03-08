package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Union: ImageVector
    get() {
        if (_Union != null) {
            return _Union!!
        }
        _Union = ImageVector.Builder(
            name = "Outline.Union",
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
                moveTo(21f, 16.2f)
                verticalLineToRelative(-2.1f)
                curveToRelative(0f, -1.68f, 0f, -2.52f, -0.327f, -3.162f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.311f, -1.311f)
                curveTo(18.72f, 9.3f, 17.88f, 9.3f, 16.2f, 9.3f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(7.8f)
                curveToRelative(0f, -1.68f, 0f, -2.52f, -0.327f, -3.162f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.311f, -1.311f)
                curveTo(12.42f, 3f, 11.58f, 3f, 9.9f, 3f)
                horizontalLineTo(7.8f)
                curveToRelative(-1.68f, 0f, -2.52f, 0f, -3.162f, 0.327f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.311f, 1.311f)
                curveTo(3f, 5.28f, 3f, 6.12f, 3f, 7.8f)
                verticalLineToRelative(2.1f)
                curveToRelative(0f, 1.68f, 0f, 2.52f, 0.327f, 3.162f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.311f, 1.311f)
                curveToRelative(0.642f, 0.327f, 1.482f, 0.327f, 3.162f, 0.327f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.68f, 0f, 2.52f, 0.327f, 3.162f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.311f, 1.311f)
                curveTo(11.58f, 21f, 12.42f, 21f, 14.1f, 21f)
                horizontalLineToRelative(2.1f)
                curveToRelative(1.68f, 0f, 2.52f, 0f, 3.162f, -0.327f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.311f, -1.311f)
                curveTo(21f, 18.72f, 21f, 17.88f, 21f, 16.2f)
            }
        }.build()

        return _Union!!
    }

@Suppress("ObjectPropertyName")
private var _Union: ImageVector? = null
