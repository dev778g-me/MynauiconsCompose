package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Paperclip: ImageVector
    get() {
        if (_Paperclip != null) {
            return _Paperclip!!
        }
        _Paperclip = ImageVector.Builder(
            name = "Outline.Paperclip",
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
                moveToRelative(3.845f, 10.224f)
                lineToRelative(5.739f, -5.53f)
                curveToRelative(5.429f, -5.237f, 14.246f, 2.843f, 8.596f, 8.294f)
                lineToRelative(-7.112f, 6.862f)
                curveToRelative(-3.684f, 3.554f, -9.667f, -1.929f, -5.833f, -5.628f)
                lineToRelative(7.01f, -6.763f)
                curveToRelative(1.939f, -1.87f, 5.087f, 1.015f, 3.07f, 2.962f)
                lineTo(9.492f, 16f)
            }
        }.build()

        return _Paperclip!!
    }

@Suppress("ObjectPropertyName")
private var _Paperclip: ImageVector? = null
