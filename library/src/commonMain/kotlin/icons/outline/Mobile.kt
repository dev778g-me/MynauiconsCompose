package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Mobile: ImageVector
    get() {
        if (_Mobile != null) {
            return _Mobile!!
        }
        _Mobile = ImageVector.Builder(
            name = "Outline.Mobile",
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
                moveTo(16.286f, 3f)
                horizontalLineTo(7.714f)
                curveTo(6.768f, 3f, 6f, 3.806f, 6f, 4.8f)
                verticalLineToRelative(14.4f)
                curveToRelative(0f, 0.994f, 0.768f, 1.8f, 1.714f, 1.8f)
                horizontalLineToRelative(8.572f)
                curveToRelative(0.947f, 0f, 1.714f, -0.806f, 1.714f, -1.8f)
                verticalLineTo(4.8f)
                curveToRelative(0f, -0.994f, -0.767f, -1.8f, -1.714f, -1.8f)
                moveTo(10.5f, 6f)
                horizontalLineToRelative(3f)
            }
        }.build()

        return _Mobile!!
    }

@Suppress("ObjectPropertyName")
private var _Mobile: ImageVector? = null
