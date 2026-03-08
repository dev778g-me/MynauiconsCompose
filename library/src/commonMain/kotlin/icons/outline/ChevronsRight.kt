package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChevronsRight: ImageVector
    get() {
        if (_ChevronsRight != null) {
            return _ChevronsRight!!
        }
        _ChevronsRight = ImageVector.Builder(
            name = "Outline.ChevronsRight",
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
                moveToRelative(12f, 18f)
                lineToRelative(6f, -6f)
                lineToRelative(-6f, -6f)
                moveTo(6f, 18f)
                lineToRelative(6f, -6f)
                lineToRelative(-6f, -6f)
            }
        }.build()

        return _ChevronsRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsRight: ImageVector? = null
