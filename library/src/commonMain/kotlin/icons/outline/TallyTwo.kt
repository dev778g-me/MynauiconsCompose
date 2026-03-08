package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TallyTwo: ImageVector
    get() {
        if (_TallyTwo != null) {
            return _TallyTwo!!
        }
        _TallyTwo = ImageVector.Builder(
            name = "Outline.TallyTwo",
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
                moveTo(4f, 4f)
                verticalLineToRelative(16f)
                moveTo(9.333f, 4f)
                verticalLineToRelative(16f)
            }
        }.build()

        return _TallyTwo!!
    }

@Suppress("ObjectPropertyName")
private var _TallyTwo: ImageVector? = null
