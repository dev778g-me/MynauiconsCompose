package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LayersTwo: ImageVector
    get() {
        if (_LayersTwo != null) {
            return _LayersTwo!!
        }
        _LayersTwo = ImageVector.Builder(
            name = "Outline.LayersTwo",
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
                moveToRelative(21f, 14f)
                lineToRelative(-9f, 4f)
                lineToRelative(-9f, -4f)
                moveToRelative(18f, -4f)
                lineToRelative(-9f, 4f)
                lineToRelative(-9f, -4f)
                lineToRelative(9f, -4f)
                close()
            }
        }.build()

        return _LayersTwo!!
    }

@Suppress("ObjectPropertyName")
private var _LayersTwo: ImageVector? = null
