package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChevronsUpDown: ImageVector
    get() {
        if (_ChevronsUpDown != null) {
            return _ChevronsUpDown!!
        }
        _ChevronsUpDown = ImageVector.Builder(
            name = "Outline.ChevronsUpDown",
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
                moveToRelative(8f, 16f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
                moveTo(8f, 8f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
            }
        }.build()

        return _ChevronsUpDown!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsUpDown: ImageVector? = null
