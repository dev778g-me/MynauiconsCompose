package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Eclipse: ImageVector
    get() {
        if (_Eclipse != null) {
            return _Eclipse!!
        }
        _Eclipse = ImageVector.Builder(
            name = "Outline.Eclipse",
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
                moveTo(10.183f, 3.183f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.817f, 1.817f)
                moveTo(10.183f, 3.183f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.633f, 10.633f)
                moveTo(10.184f, 3.184f)
                curveToRelative(-1.268f, 6.188f, 4.533f, 11.884f, 10.634f, 10.634f)
            }
        }.build()

        return _Eclipse!!
    }

@Suppress("ObjectPropertyName")
private var _Eclipse: ImageVector? = null
