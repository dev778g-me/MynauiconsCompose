package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Rhombus: ImageVector
    get() {
        if (_Rhombus != null) {
            return _Rhombus!!
        }
        _Rhombus = ImageVector.Builder(
            name = "Outline.Rhombus",
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
                moveToRelative(5.219f, 11.34f)
                lineToRelative(5.96f, -7.925f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.642f, 0f)
                lineToRelative(5.96f, 7.925f)
                curveToRelative(0.292f, 0.388f, 0.292f, 0.932f, 0f, 1.32f)
                lineToRelative(-5.96f, 7.925f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.642f, 0f)
                lineTo(5.22f, 12.66f)
                arcToRelative(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.32f)
            }
        }.build()

        return _Rhombus!!
    }

@Suppress("ObjectPropertyName")
private var _Rhombus: ImageVector? = null
