package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LayersThree: ImageVector
    get() {
        if (_LayersThree != null) {
            return _LayersThree!!
        }
        _LayersThree = ImageVector.Builder(
            name = "Outline.LayersThree",
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
                moveToRelative(21f, 12f)
                lineToRelative(-9f, 4f)
                lineToRelative(-9f, -4f)
                moveToRelative(18f, 4f)
                lineToRelative(-9f, 4f)
                lineToRelative(-9f, -4f)
                moveToRelative(18f, -8f)
                lineToRelative(-9f, 4f)
                lineToRelative(-9f, -4f)
                lineToRelative(9f, -4f)
                close()
            }
        }.build()

        return _LayersThree!!
    }

@Suppress("ObjectPropertyName")
private var _LayersThree: ImageVector? = null
