package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Link: ImageVector
    get() {
        if (_Link != null) {
            return _Link!!
        }
        _Link = ImageVector.Builder(
            name = "Outline.Link",
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
                moveToRelative(15.988f, 13f)
                lineToRelative(3.902f, -3.902f)
                curveToRelative(1.437f, -1.437f, 1.485f, -3.718f, 0.107f, -5.095f)
                curveToRelative(-1.377f, -1.378f, -3.658f, -1.33f, -5.095f, 0.107f)
                lineTo(11f, 8.012f)
                moveToRelative(2f, 7.95f)
                lineToRelative(-3.892f, 3.88f)
                curveToRelative(-1.432f, 1.43f, -3.64f, 1.615f, -5.082f, 0.107f)
                curveToRelative(-1.442f, -1.507f, -1.326f, -3.639f, 0.107f, -5.068f)
                lineTo(8.025f, 11f)
                moveTo(9f, 15f)
                lineToRelative(6f, -6f)
            }
        }.build()

        return _Link!!
    }

@Suppress("ObjectPropertyName")
private var _Link: ImageVector? = null
