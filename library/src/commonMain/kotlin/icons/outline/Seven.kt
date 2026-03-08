package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Seven: ImageVector
    get() {
        if (_Seven != null) {
            return _Seven!!
        }
        _Seven = ImageVector.Builder(
            name = "Outline.Seven",
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
                moveTo(10.5f, 17f)
                curveToRelative(0f, -3.75f, 5f, -10f, 5f, -10f)
                reflectiveCurveToRelative(-3.75f, 0.625f, -6.25f, 0f)
            }
        }.build()

        return _Seven!!
    }

@Suppress("ObjectPropertyName")
private var _Seven: ImageVector? = null
