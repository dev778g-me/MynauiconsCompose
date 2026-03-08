package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChartNetwork: ImageVector
    get() {
        if (_ChartNetwork != null) {
            return _ChartNetwork!!
        }
        _ChartNetwork = ImageVector.Builder(
            name = "Outline.ChartNetwork",
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
                moveToRelative(14f, 3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.5f, 10.677f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2.646f)
                moveToRelative(0f, -2.646f)
                curveToRelative(0.311f, 0.353f, 0.5f, 0.816f, 0.5f, 1.323f)
                reflectiveCurveToRelative(-0.189f, 0.97f, -0.5f, 1.323f)
                moveToRelative(0f, -2.646f)
                lineToRelative(2f, -3.177f)
                moveToRelative(-2f, 5.823f)
                lineTo(15f, 15f)
                moveToRelative(4f, 1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
            }
        }.build()

        return _ChartNetwork!!
    }

@Suppress("ObjectPropertyName")
private var _ChartNetwork: ImageVector? = null
