package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ArrowUpDown: ImageVector
    get() {
        if (_ArrowUpDown != null) {
            return _ArrowUpDown!!
        }
        _ArrowUpDown = ImageVector.Builder(
            name = "Outline.ArrowUpDown",
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
                moveTo(7.5f, 17.5f)
                verticalLineToRelative(-11f)
                moveToRelative(0f, 0f)
                lineTo(11f, 10f)
                moveTo(7.5f, 6.5f)
                lineTo(4f, 10f)
                moveToRelative(12.5f, -3.5f)
                verticalLineToRelative(11f)
                moveToRelative(0f, 0f)
                lineTo(20f, 14f)
                moveToRelative(-3.5f, 3.5f)
                lineTo(13f, 14f)
            }
        }.build()

        return _ArrowUpDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpDown: ImageVector? = null
