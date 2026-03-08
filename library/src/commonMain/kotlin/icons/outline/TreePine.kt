package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TreePine: ImageVector
    get() {
        if (_TreePine != null) {
            return _TreePine!!
        }
        _TreePine = ImageVector.Builder(
            name = "Outline.TreePine",
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
                moveTo(12f, 17f)
                horizontalLineToRelative(7f)
                lineToRelative(-4.5f, -4.5f)
                horizontalLineToRelative(3f)
                lineToRelative(-3.75f, -4.25f)
                lineTo(12f, 3f)
                lineToRelative(-1.75f, 5.25f)
                lineTo(6.5f, 12.5f)
                horizontalLineToRelative(3f)
                lineTo(5f, 17f)
                close()
                moveTo(12f, 17f)
                verticalLineToRelative(4f)
            }
        }.build()

        return _TreePine!!
    }

@Suppress("ObjectPropertyName")
private var _TreePine: ImageVector? = null
