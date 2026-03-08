package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FlagOne: ImageVector
    get() {
        if (_FlagOne != null) {
            return _FlagOne!!
        }
        _FlagOne = ImageVector.Builder(
            name = "Filled.FlagOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 3f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 3f)
                verticalLineToRelative(18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-6.438f)
                lineToRelative(13.241f, -3.883f)
                curveToRelative(1.679f, -0.492f, 1.679f, -2.866f, 0f, -3.358f)
                lineTo(5.5f, 3.438f)
                close()
            }
        }.build()

        return _FlagOne!!
    }

@Suppress("ObjectPropertyName")
private var _FlagOne: ImageVector? = null
