package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MaximizeOne: ImageVector
    get() {
        if (_MaximizeOne != null) {
            return _MaximizeOne!!
        }
        _MaximizeOne = ImageVector.Builder(
            name = "Outline.MaximizeOne",
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
                moveTo(14f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                moveTo(10f, 20f)
                horizontalLineTo(4f)
                verticalLineToRelative(-6f)
                moveTo(20f, 4f)
                lineToRelative(-6f, 6f)
                moveTo(4f, 20f)
                lineToRelative(6f, -6f)
            }
        }.build()

        return _MaximizeOne!!
    }

@Suppress("ObjectPropertyName")
private var _MaximizeOne: ImageVector? = null
