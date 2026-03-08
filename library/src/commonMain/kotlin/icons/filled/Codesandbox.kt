package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Codesandbox: ImageVector
    get() {
        if (_Codesandbox != null) {
            return _Codesandbox!!
        }
        _Codesandbox = ImageVector.Builder(
            name = "Filled.Codesandbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.25f, 5.25f)
                horizontalLineToRelative(13.5f)
                verticalLineToRelative(13.5f)
                lineTo(5.25f, 18.75f)
                close()
                moveTo(6.75f, 6.75f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(10.5f)
                lineTo(17.25f, 6.75f)
                close()
            }
        }.build()

        return _Codesandbox!!
    }

@Suppress("ObjectPropertyName")
private var _Codesandbox: ImageVector? = null
