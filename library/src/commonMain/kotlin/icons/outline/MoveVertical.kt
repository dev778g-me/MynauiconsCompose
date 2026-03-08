package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MoveVertical: ImageVector
    get() {
        if (_MoveVertical != null) {
            return _MoveVertical!!
        }
        _MoveVertical = ImageVector.Builder(
            name = "Outline.MoveVertical",
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
                moveToRelative(8f, 18f)
                lineToRelative(4f, 4f)
                moveToRelative(0f, 0f)
                lineToRelative(4f, -4f)
                moveToRelative(-4f, 4f)
                verticalLineTo(2f)
                moveTo(8f, 6f)
                lineToRelative(4f, -4f)
                moveToRelative(0f, 0f)
                lineToRelative(4f, 4f)
            }
        }.build()

        return _MoveVertical!!
    }

@Suppress("ObjectPropertyName")
private var _MoveVertical: ImageVector? = null
