package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MinimizeOne: ImageVector
    get() {
        if (_MinimizeOne != null) {
            return _MinimizeOne!!
        }
        _MinimizeOne = ImageVector.Builder(
            name = "Outline.MinimizeOne",
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
                moveTo(20f, 10f)
                horizontalLineToRelative(-6f)
                verticalLineTo(4f)
                moveTo(4f, 14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                moveTo(20f, 4f)
                lineToRelative(-6f, 6f)
                moveToRelative(-4f, 4f)
                lineToRelative(-6f, 6f)
            }
        }.build()

        return _MinimizeOne!!
    }

@Suppress("ObjectPropertyName")
private var _MinimizeOne: ImageVector? = null
