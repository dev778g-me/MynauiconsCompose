package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LockOpenKeyhole: ImageVector
    get() {
        if (_LockOpenKeyhole != null) {
            return _LockOpenKeyhole!!
        }
        _LockOpenKeyhole = ImageVector.Builder(
            name = "Outline.LockOpenKeyhole",
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
                curveToRelative(2.094f, 0f, 3.313f, 1.288f, 3.78f, 3.114f)
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
                moveTo(16f, 14f)
                verticalLineToRelative(3f)
            }
        }.build()

        return _LockOpenKeyhole!!
    }

@Suppress("ObjectPropertyName")
private var _LockOpenKeyhole: ImageVector? = null
