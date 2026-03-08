package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Snow: ImageVector
    get() {
        if (_Snow != null) {
            return _Snow!!
        }
        _Snow = ImageVector.Builder(
            name = "Outline.Snow",
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
                moveTo(12f, 19f)
                verticalLineTo(5f)
                moveTo(9.953f, 3f)
                lineTo(12f, 5f)
                lineToRelative(2.047f, -2f)
                moveTo(9.953f, 21f)
                lineTo(12f, 19f)
                lineToRelative(2.047f, 2f)
                moveToRelative(-8.251f, -5.5f)
                lineToRelative(12.408f, -7f)
                moveToRelative(0.749f, -2.732f)
                lineTo(18.204f, 8.5f)
                lineTo(21f, 9.232f)
                moveTo(3f, 14.768f)
                lineToRelative(2.796f, 0.732f)
                lineToRelative(-0.75f, 2.732f)
                moveTo(21f, 14.768f)
                lineToRelative(-2.796f, 0.732f)
                lineToRelative(0.75f, 2.732f)
                moveTo(5.047f, 5.768f)
                lineTo(5.796f, 8.5f)
                lineTo(3f, 9.232f)
                moveTo(5.796f, 8.5f)
                lineToRelative(12.408f, 7f)
            }
        }.build()

        return _Snow!!
    }

@Suppress("ObjectPropertyName")
private var _Snow: ImageVector? = null
