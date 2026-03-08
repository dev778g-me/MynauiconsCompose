package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Three: ImageVector
    get() {
        if (_Three != null) {
            return _Three!!
        }
        _Three = ImageVector.Builder(
            name = "Outline.Three",
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
                moveTo(8.75f, 9.493f)
                curveToRelative(0f, -3.324f, 6.25f, -3.324f, 6.25f, 0f)
                curveToRelative(0f, 0f, 0f, 2.507f, -3.125f, 2.507f)
                curveTo(15f, 12f, 15f, 14.507f, 15f, 14.507f)
                curveToRelative(0f, 3.324f, -6.25f, 3.324f, -6.25f, 0f)
            }
        }.build()

        return _Three!!
    }

@Suppress("ObjectPropertyName")
private var _Three: ImageVector? = null
