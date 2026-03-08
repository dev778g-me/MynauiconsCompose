package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ArrowsUpFromLine: ImageVector
    get() {
        if (_ArrowsUpFromLine != null) {
            return _ArrowsUpFromLine!!
        }
        _ArrowsUpFromLine = ImageVector.Builder(
            name = "Outline.ArrowsUpFromLine",
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
                moveToRelative(4f, 7f)
                lineToRelative(3f, -4f)
                moveToRelative(0f, 0f)
                lineToRelative(3f, 4f)
                moveTo(7f, 3f)
                verticalLineToRelative(14f)
                moveToRelative(7f, -10f)
                lineToRelative(3f, -4f)
                moveToRelative(0f, 0f)
                lineToRelative(3f, 4f)
                moveToRelative(-3f, -4f)
                verticalLineToRelative(14f)
                moveTo(4f, 21f)
                horizontalLineToRelative(16f)
            }
        }.build()

        return _ArrowsUpFromLine!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsUpFromLine: ImageVector? = null
