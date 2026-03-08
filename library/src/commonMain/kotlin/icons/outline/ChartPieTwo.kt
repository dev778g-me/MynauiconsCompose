package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChartPieTwo: ImageVector
    get() {
        if (_ChartPieTwo != null) {
            return _ChartPieTwo!!
        }
        _ChartPieTwo = ImageVector.Builder(
            name = "Outline.ChartPieTwo",
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
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.364f, 15.364f)
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.364f, 15.364f)
                moveTo(12f, 3f)
                verticalLineToRelative(9f)
                lineToRelative(6.364f, 6.364f)
            }
        }.build()

        return _ChartPieTwo!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPieTwo: ImageVector? = null
