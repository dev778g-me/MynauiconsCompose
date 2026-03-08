package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MousePointer: ImageVector
    get() {
        if (_MousePointer != null) {
            return _MousePointer!!
        }
        _MousePointer = ImageVector.Builder(
            name = "Filled.MousePointer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.348f, 5.706f)
                curveToRelative(-0.486f, -1.457f, 0.9f, -2.844f, 2.358f, -2.358f)
                lineTo(18.645f, 7.66f)
                curveToRelative(1.627f, 0.543f, 1.72f, 2.808f, 0.145f, 3.483f)
                lineToRelative(-4.61f, 1.976f)
                lineToRelative(6.35f, 6.35f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, 1.061f)
                lineToRelative(-6.35f, -6.35f)
                lineToRelative(-1.977f, 4.61f)
                curveToRelative(-0.675f, 1.576f, -2.94f, 1.481f, -3.482f, -0.145f)
                close()
            }
        }.build()

        return _MousePointer!!
    }

@Suppress("ObjectPropertyName")
private var _MousePointer: ImageVector? = null
