package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Frame: ImageVector
    get() {
        if (_Frame != null) {
            return _Frame!!
        }
        _Frame = ImageVector.Builder(
            name = "Outline.Frame",
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
                moveTo(21f, 6.6f)
                horizontalLineTo(3f)
                moveToRelative(18f, 10.8f)
                horizontalLineTo(3f)
                moveTo(6.6f, 3f)
                verticalLineToRelative(18f)
                moveTo(17.4f, 3f)
                verticalLineToRelative(18f)
            }
        }.build()

        return _Frame!!
    }

@Suppress("ObjectPropertyName")
private var _Frame: ImageVector? = null
