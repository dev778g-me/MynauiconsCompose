package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.DotsVertical: ImageVector
    get() {
        if (_DotsVertical != null) {
            return _DotsVertical!!
        }
        _DotsVertical = ImageVector.Builder(
            name = "Outline.DotsVertical",
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
                moveTo(12.25f, 12f)
                horizontalLineToRelative(-0.5f)
                moveToRelative(0.5f, -4f)
                horizontalLineToRelative(-0.5f)
                moveToRelative(0.5f, 8f)
                horizontalLineToRelative(-0.5f)
            }
        }.build()

        return _DotsVertical!!
    }

@Suppress("ObjectPropertyName")
private var _DotsVertical: ImageVector? = null
