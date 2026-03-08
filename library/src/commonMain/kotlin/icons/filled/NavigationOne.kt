package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.NavigationOne: ImageVector
    get() {
        if (_NavigationOne != null) {
            return _NavigationOne!!
        }
        _NavigationOne = ImageVector.Builder(
            name = "Filled.NavigationOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.623f, 4.103f)
                curveToRelative(0.521f, -1.1f, -0.626f, -2.248f, -1.726f, -1.726f)
                lineTo(2.99f, 10.385f)
                curveToRelative(-1.1f, 0.52f, -0.94f, 2.133f, 0.24f, 2.429f)
                lineToRelative(6.364f, 1.59f)
                lineToRelative(1.591f, 6.364f)
                curveToRelative(0.295f, 1.18f, 1.908f, 1.34f, 2.43f, 0.24f)
                close()
            }
        }.build()

        return _NavigationOne!!
    }

@Suppress("ObjectPropertyName")
private var _NavigationOne: ImageVector? = null
