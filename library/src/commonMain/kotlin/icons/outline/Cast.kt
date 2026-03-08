package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Cast: ImageVector
    get() {
        if (_Cast != null) {
            return _Cast!!
        }
        _Cast = ImageVector.Builder(
            name = "Outline.Cast",
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
                moveTo(3f, 8.028f)
                curveToRelative(0f, -0.956f, 0f, -1.434f, 0.108f, -1.826f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.094f, -2.094f)
                curveTo(5.594f, 4f, 6.072f, 4f, 7.028f, 4f)
                horizontalLineTo(16.2f)
                curveToRelative(1.68f, 0f, 2.52f, 0f, 3.162f, 0.327f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.311f, 1.311f)
                curveTo(21f, 6.28f, 21f, 7.12f, 21f, 8.8f)
                verticalLineToRelative(6.4f)
                curveToRelative(0f, 1.68f, 0f, 2.52f, -0.327f, 3.162f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.311f, 1.311f)
                curveTo(18.72f, 20f, 17.88f, 20f, 16.2f, 20f)
                horizontalLineToRelative(-2.053f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 20f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                moveToRelative(0f, 8.004f)
                lineToRelative(0.354f, -0.354f)
                moveTo(7f, 20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
            }
        }.build()

        return _Cast!!
    }

@Suppress("ObjectPropertyName")
private var _Cast: ImageVector? = null
