package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Framer: ImageVector
    get() {
        if (_Framer != null) {
            return _Framer!!
        }
        _Framer = ImageVector.Builder(
            name = "Outline.Framer",
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
                moveTo(12f, 15.6f)
                verticalLineTo(21f)
                lineToRelative(-6.5f, -5.4f)
                close()
                moveTo(5.5f, 3f)
                lineToRelative(13f, 12.6f)
                horizontalLineToRelative(-13f)
                verticalLineTo(9.3f)
                horizontalLineToRelative(13f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _Framer!!
    }

@Suppress("ObjectPropertyName")
private var _Framer: ImageVector? = null
