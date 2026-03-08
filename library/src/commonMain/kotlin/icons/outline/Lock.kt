package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Lock: ImageVector
    get() {
        if (_Lock != null) {
            return _Lock!!
        }
        _Lock = ImageVector.Builder(
            name = "Outline.Lock",
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
                moveTo(8f, 10f)
                verticalLineTo(8f)
                curveToRelative(0f, -2.761f, 1.239f, -5f, 4f, -5f)
                reflectiveCurveToRelative(4f, 2.239f, 4f, 5f)
                verticalLineToRelative(2f)
                moveTo(3.5f, 17.8f)
                verticalLineToRelative(-4.6f)
                curveToRelative(0f, -1.12f, 0f, -1.68f, 0.218f, -2.107f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.874f, -0.875f)
                curveToRelative(0.428f, -0.217f, 0.988f, -0.217f, 2.108f, -0.217f)
                horizontalLineToRelative(10.6f)
                curveToRelative(1.12f, 0f, 1.68f, 0f, 2.108f, 0.217f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.874f, 0.874f)
                curveToRelative(0.218f, 0.428f, 0.218f, 0.988f, 0.218f, 2.108f)
                verticalLineToRelative(4.6f)
                curveToRelative(0f, 1.12f, 0f, 1.68f, -0.218f, 2.108f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.874f, 0.874f)
                curveTo(18.98f, 21f, 18.42f, 21f, 17.3f, 21f)
                horizontalLineTo(6.7f)
                curveToRelative(-1.12f, 0f, -1.68f, 0f, -2.108f, -0.218f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.874f, -0.874f)
                curveTo(3.5f, 19.481f, 3.5f, 18.921f, 3.5f, 17.8f)
            }
        }.build()

        return _Lock!!
    }

@Suppress("ObjectPropertyName")
private var _Lock: ImageVector? = null
