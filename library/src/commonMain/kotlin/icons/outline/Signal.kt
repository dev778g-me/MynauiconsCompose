package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Signal: ImageVector
    get() {
        if (_Signal != null) {
            return _Signal!!
        }
        _Signal = ImageVector.Builder(
            name = "Outline.Signal",
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
                moveTo(20.5f, 10f)
                verticalLineToRelative(4f)
                moveToRelative(-4f, -8f)
                verticalLineToRelative(12f)
                moveTo(12f, 3f)
                verticalLineToRelative(18f)
                moveTo(7.5f, 6f)
                verticalLineToRelative(12f)
                moveToRelative(-4f, -8f)
                verticalLineToRelative(4f)
            }
        }.build()

        return _Signal!!
    }

@Suppress("ObjectPropertyName")
private var _Signal: ImageVector? = null
