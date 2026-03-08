package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChartBarStacked: ImageVector
    get() {
        if (_ChartBarStacked != null) {
            return _ChartBarStacked!!
        }
        _ChartBarStacked = ImageVector.Builder(
            name = "Outline.ChartBarStacked",
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
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.25f, 6f)
                horizontalLineToRelative(2.25f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 7.5f)
                verticalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 1.5f)
                horizontalLineToRelative(-2.25f)
                moveToRelative(0f, -4f)
                verticalLineToRelative(4f)
                moveToRelative(0f, -4f)
                horizontalLineTo(8.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 7.5f)
                verticalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 10f)
                horizontalLineToRelative(6.75f)
                moveTo(11f, 13f)
                horizontalLineTo(8.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 14.5f)
                verticalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 17f)
                horizontalLineTo(11f)
                moveToRelative(0f, -4f)
                horizontalLineToRelative(2.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 1.5f)
                verticalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 1.5f)
                horizontalLineTo(11f)
                moveToRelative(0f, -4f)
                verticalLineToRelative(4f)
            }
        }.build()

        return _ChartBarStacked!!
    }

@Suppress("ObjectPropertyName")
private var _ChartBarStacked: ImageVector? = null
