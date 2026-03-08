package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Two: ImageVector
    get() {
        if (_Two != null) {
            return _Two!!
        }
        _Two = ImageVector.Builder(
            name = "Outline.Two",
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
                moveTo(8.75f, 9.92f)
                curveToRelative(0f, -3.894f, 5.77f, -3.894f, 5.77f, 0f)
                curveToRelative(0f, 2.94f, -3.77f, 5.476f, -5.77f, 7.08f)
                curveToRelative(0f, 0f, 3.75f, -0.625f, 6.25f, 0f)
            }
        }.build()

        return _Two!!
    }

@Suppress("ObjectPropertyName")
private var _Two: ImageVector? = null
