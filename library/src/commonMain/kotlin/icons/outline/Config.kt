package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Config: ImageVector
    get() {
        if (_Config != null) {
            return _Config!!
        }
        _Config = ImageVector.Builder(
            name = "Outline.Config",
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
                moveTo(21f, 5f)
                horizontalLineToRelative(-3f)
                moveToRelative(-4.25f, -2f)
                verticalLineToRelative(4f)
                moveTo(13f, 5f)
                horizontalLineTo(3f)
                moveToRelative(4f, 7f)
                horizontalLineTo(3f)
                moveToRelative(7.75f, -2f)
                verticalLineToRelative(4f)
                moveTo(21f, 12f)
                horizontalLineTo(11f)
                moveToRelative(10f, 7f)
                horizontalLineToRelative(-3f)
                moveToRelative(-4.25f, -2f)
                verticalLineToRelative(4f)
                moveTo(13f, 19f)
                horizontalLineTo(3f)
            }
        }.build()

        return _Config!!
    }

@Suppress("ObjectPropertyName")
private var _Config: ImageVector? = null
