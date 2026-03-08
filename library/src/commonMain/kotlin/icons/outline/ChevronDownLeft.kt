package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChevronDownLeft: ImageVector
    get() {
        if (_ChevronDownLeft != null) {
            return _ChevronDownLeft!!
        }
        _ChevronDownLeft = ImageVector.Builder(
            name = "Outline.ChevronDownLeft",
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
                moveTo(7.879f, 7.636f)
                verticalLineToRelative(8.485f)
                horizontalLineToRelative(8.485f)
            }
        }.build()

        return _ChevronDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDownLeft: ImageVector? = null
