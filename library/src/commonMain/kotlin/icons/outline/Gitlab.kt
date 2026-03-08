package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Gitlab: ImageVector
    get() {
        if (_Gitlab != null) {
            return _Gitlab!!
        }
        _Gitlab = ImageVector.Builder(
            name = "Outline.Gitlab",
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
                moveTo(11.981f, 21f)
                lineTo(21f, 13.708f)
                lineTo(18.498f, 3f)
                lineToRelative(-3.015f, 6.497f)
                horizontalLineTo(8.997f)
                lineTo(5.507f, 3f)
                lineTo(3f, 13.708f)
                close()
            }
        }.build()

        return _Gitlab!!
    }

@Suppress("ObjectPropertyName")
private var _Gitlab: ImageVector? = null
