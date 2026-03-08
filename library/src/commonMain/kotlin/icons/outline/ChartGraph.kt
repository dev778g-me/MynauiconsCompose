package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChartGraph: ImageVector
    get() {
        if (_ChartGraph != null) {
            return _ChartGraph!!
        }
        _ChartGraph = ImageVector.Builder(
            name = "Outline.ChartGraph",
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
                moveToRelative(3f, 15.5f)
                lineToRelative(3.857f, -3.213f)
                curveToRelative(1.634f, -1.362f, 2.708f, -1.222f, 4.119f, 0.189f)
                lineToRelative(0.006f, 0.006f)
                curveToRelative(1.538f, 1.538f, 2.64f, 1.474f, 4.172f, 0.133f)
                lineTo(21f, 7.5f)
            }
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
            }
        }.build()

        return _ChartGraph!!
    }

@Suppress("ObjectPropertyName")
private var _ChartGraph: ImageVector? = null
