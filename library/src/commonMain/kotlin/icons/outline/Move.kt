package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Move: ImageVector
    get() {
        if (_Move != null) {
            return _Move!!
        }
        _Move = ImageVector.Builder(
            name = "Outline.Move",
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
                moveTo(5.7f, 9.3f)
                lineTo(3f, 12f)
                moveToRelative(0f, 0f)
                lineToRelative(2.7f, 2.7f)
                moveTo(3f, 12f)
                horizontalLineToRelative(18f)
                moveTo(9.3f, 5.7f)
                lineTo(12f, 3f)
                moveToRelative(0f, 0f)
                lineToRelative(2.7f, 2.7f)
                moveTo(12f, 3f)
                verticalLineToRelative(18f)
                moveToRelative(2.7f, -2.7f)
                lineTo(12f, 21f)
                moveToRelative(0f, 0f)
                lineToRelative(-2.7f, -2.7f)
                moveToRelative(9f, -9f)
                lineTo(21f, 12f)
                moveToRelative(0f, 0f)
                lineToRelative(-2.7f, 2.7f)
            }
        }.build()

        return _Move!!
    }

@Suppress("ObjectPropertyName")
private var _Move: ImageVector? = null
