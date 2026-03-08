package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Password: ImageVector
    get() {
        if (_Password != null) {
            return _Password!!
        }
        _Password = ImageVector.Builder(
            name = "Outline.Password",
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
                moveToRelative(13.5f, 9f)
                lineToRelative(-3f, 6f)
                moveToRelative(0f, -6f)
                lineToRelative(3f, 6f)
                moveToRelative(-3.75f, -3f)
                horizontalLineToRelative(4.5f)
                moveToRelative(-7.5f, -3f)
                lineToRelative(-3f, 6f)
                moveToRelative(0f, -6f)
                lineToRelative(3f, 6f)
                moveTo(3f, 12f)
                horizontalLineToRelative(4.5f)
                moveToRelative(12.75f, -3f)
                lineToRelative(-3f, 6f)
                moveToRelative(0f, -6f)
                lineToRelative(3f, 6f)
                moveToRelative(-3.75f, -3f)
                horizontalLineTo(21f)
            }
        }.build()

        return _Password!!
    }

@Suppress("ObjectPropertyName")
private var _Password: ImageVector? = null
