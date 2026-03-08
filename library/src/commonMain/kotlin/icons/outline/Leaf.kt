package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Leaf: ImageVector
    get() {
        if (_Leaf != null) {
            return _Leaf!!
        }
        _Leaf = ImageVector.Builder(
            name = "Outline.Leaf",
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
                moveTo(5.973f, 18.028f)
                curveToRelative(7.625f, 4.576f, 13.726f, -1.525f, 12.963f, -12.964f)
                curveTo(7.498f, 4.302f, 1.398f, 10.403f, 5.973f, 18.028f)
                moveToRelative(0f, 0f)
                lineTo(4f, 20f)
                moveToRelative(1.973f, -1.972f)
                lineTo(10.1f, 13.9f)
            }
        }.build()

        return _Leaf!!
    }

@Suppress("ObjectPropertyName")
private var _Leaf: ImageVector? = null
