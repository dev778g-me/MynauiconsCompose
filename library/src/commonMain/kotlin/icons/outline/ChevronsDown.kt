package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChevronsDown: ImageVector
    get() {
        if (_ChevronsDown != null) {
            return _ChevronsDown!!
        }
        _ChevronsDown = ImageVector.Builder(
            name = "Outline.ChevronsDown",
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
                moveToRelative(6f, 6f)
                lineToRelative(6f, 6f)
                lineToRelative(6f, -6f)
                moveTo(6f, 12f)
                lineToRelative(6f, 6f)
                lineToRelative(6f, -6f)
            }
        }.build()

        return _ChevronsDown!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsDown: ImageVector? = null
