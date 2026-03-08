package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Kanban: ImageVector
    get() {
        if (_Kanban != null) {
            return _Kanban!!
        }
        _Kanban = ImageVector.Builder(
            name = "Outline.Kanban",
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
                moveTo(6f, 5f)
                verticalLineToRelative(8f)
                moveToRelative(6f, -8f)
                verticalLineToRelative(13.5f)
                moveTo(18f, 5f)
                verticalLineToRelative(9f)
            }
        }.build()

        return _Kanban!!
    }

@Suppress("ObjectPropertyName")
private var _Kanban: ImageVector? = null
