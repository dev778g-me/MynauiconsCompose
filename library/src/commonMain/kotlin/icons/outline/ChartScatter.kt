package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChartScatter: ImageVector
    get() {
        if (_ChartScatter != null) {
            return _ChartScatter!!
        }
        _ChartScatter = ImageVector.Builder(
            name = "Outline.ChartScatter",
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
                moveTo(21f, 21f)
                horizontalLineTo(9.4f)
                curveToRelative(-2.24f, 0f, -3.36f, 0f, -4.216f, -0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, -1.748f)
                curveTo(3f, 17.96f, 3f, 16.84f, 3f, 14.6f)
                verticalLineTo(3f)
                moveToRelative(5f, 6.5f)
                verticalLineTo(9f)
                moveToRelative(10f, 0.25f)
                verticalLineToRelative(-0.5f)
                moveToRelative(-5f, 3.5f)
                verticalLineToRelative(-0.5f)
                moveToRelative(0f, -6.25f)
                verticalLineTo(5f)
                moveTo(7f, 16.25f)
                verticalLineToRelative(-0.5f)
                moveToRelative(9f, 1.5f)
                verticalLineToRelative(-0.5f)
            }
        }.build()

        return _ChartScatter!!
    }

@Suppress("ObjectPropertyName")
private var _ChartScatter: ImageVector? = null
