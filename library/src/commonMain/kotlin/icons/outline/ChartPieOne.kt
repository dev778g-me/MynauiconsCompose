package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChartPieOne: ImageVector
    get() {
        if (_ChartPieOne != null) {
            return _ChartPieOne!!
        }
        _ChartPieOne = ImageVector.Builder(
            name = "Outline.ChartPieOne",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, 9f)
                moveToRelative(9f, -9f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -9f)
                moveToRelative(9f, 9f)
                horizontalLineToRelative(-9f)
                moveToRelative(0f, 9f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -18f)
                moveToRelative(0f, 18f)
                verticalLineToRelative(-9f)
                moveToRelative(0f, -9f)
                verticalLineToRelative(9f)
            }
        }.build()

        return _ChartPieOne!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPieOne: ImageVector? = null
