package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Component: ImageVector
    get() {
        if (_Component != null) {
            return _Component!!
        }
        _Component = ImageVector.Builder(
            name = "Outline.Component",
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
                moveTo(8.85f, 6.15f)
                lineTo(12f, 3f)
                lineToRelative(3.15f, 3.15f)
                lineTo(12f, 9.3f)
                close()
                moveTo(14.7f, 12.45f)
                lineTo(17.85f, 9.3f)
                lineTo(21f, 12.45f)
                lineToRelative(-3.15f, 3.15f)
                close()
                moveTo(8.85f, 17.85f)
                lineTo(12f, 14.7f)
                lineToRelative(3.15f, 3.15f)
                lineTo(12f, 21f)
                close()
                moveTo(3f, 12f)
                lineToRelative(3.15f, -3.15f)
                lineTo(9.3f, 12f)
                lineToRelative(-3.15f, 3.15f)
                close()
            }
        }.build()

        return _Component!!
    }

@Suppress("ObjectPropertyName")
private var _Component: ImageVector? = null
