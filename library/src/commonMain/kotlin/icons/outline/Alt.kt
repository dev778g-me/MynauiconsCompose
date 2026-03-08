package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Alt: ImageVector
    get() {
        if (_Alt != null) {
            return _Alt!!
        }
        _Alt = ImageVector.Builder(
            name = "Outline.Alt",
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
                moveTo(3f, 5.25f)
                horizontalLineToRelative(5.625f)
                lineToRelative(6.75f, 13.5f)
                horizontalLineTo(21f)
                moveToRelative(-6.75f, -13.5f)
                horizontalLineTo(21f)
            }
        }.build()

        return _Alt!!
    }

@Suppress("ObjectPropertyName")
private var _Alt: ImageVector? = null
