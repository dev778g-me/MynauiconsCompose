package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChevronsLeft: ImageVector
    get() {
        if (_ChevronsLeft != null) {
            return _ChevronsLeft!!
        }
        _ChevronsLeft = ImageVector.Builder(
            name = "Outline.ChevronsLeft",
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
                moveToRelative(12f, 6f)
                lineToRelative(-6f, 6f)
                lineToRelative(6f, 6f)
                moveToRelative(6f, -12f)
                lineToRelative(-6f, 6f)
                lineToRelative(6f, 6f)
            }
        }.build()

        return _ChevronsLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsLeft: ImageVector? = null
