package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Send: ImageVector
    get() {
        if (_Send != null) {
            return _Send!!
        }
        _Send = ImageVector.Builder(
            name = "Outline.Send",
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
                moveToRelative(14f, 10f)
                lineToRelative(-3f, 3f)
                moveToRelative(9.288f, -9.969f)
                arcToRelative(0.535f, 0.535f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.68f, 0.681f)
                lineToRelative(-5.924f, 16.93f)
                arcToRelative(0.535f, 0.535f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.994f, 0.04f)
                lineToRelative(-3.219f, -7.242f)
                arcToRelative(0.54f, 0.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.271f, -0.271f)
                lineToRelative(-7.242f, -3.22f)
                arcToRelative(0.535f, 0.535f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.04f, -0.993f)
                close()
            }
        }.build()

        return _Send!!
    }

@Suppress("ObjectPropertyName")
private var _Send: ImageVector? = null
