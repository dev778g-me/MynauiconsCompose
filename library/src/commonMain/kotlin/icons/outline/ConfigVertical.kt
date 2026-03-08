package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ConfigVertical: ImageVector
    get() {
        if (_ConfigVertical != null) {
            return _ConfigVertical!!
        }
        _ConfigVertical = ImageVector.Builder(
            name = "Outline.ConfigVertical",
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
                moveTo(5f, 3f)
                verticalLineToRelative(3f)
                moveToRelative(-2f, 4.25f)
                horizontalLineToRelative(4f)
                moveTo(5f, 11f)
                verticalLineToRelative(10f)
                moveToRelative(7f, -4f)
                verticalLineToRelative(4f)
                moveToRelative(-2f, -7.75f)
                horizontalLineToRelative(4f)
                moveTo(12f, 3f)
                verticalLineToRelative(10f)
                moveToRelative(7f, -10f)
                verticalLineToRelative(3f)
                moveToRelative(-2f, 4.25f)
                horizontalLineToRelative(4f)
                moveTo(19f, 11f)
                verticalLineToRelative(10f)
            }
        }.build()

        return _ConfigVertical!!
    }

@Suppress("ObjectPropertyName")
private var _ConfigVertical: ImageVector? = null
