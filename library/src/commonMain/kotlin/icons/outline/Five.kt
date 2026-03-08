package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Five: ImageVector
    get() {
        if (_Five != null) {
            return _Five!!
        }
        _Five = ImageVector.Builder(
            name = "Outline.Five",
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
                moveTo(14.375f, 7f)
                curveToRelative(-2.5f, 0.625f, -5.625f, 0f, -5.625f, 0f)
                verticalLineToRelative(3.566f)
                horizontalLineToRelative(3.473f)
                curveToRelative(1.534f, 0f, 2.777f, 1.064f, 2.777f, 2.377f)
                verticalLineToRelative(1.399f)
                curveToRelative(0f, 3.522f, -6.25f, 3.566f, -6.25f, 0f)
            }
        }.build()

        return _Five!!
    }

@Suppress("ObjectPropertyName")
private var _Five: ImageVector? = null
