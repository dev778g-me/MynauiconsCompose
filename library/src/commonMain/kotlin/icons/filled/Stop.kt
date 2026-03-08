package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Stop: ImageVector
    get() {
        if (_Stop != null) {
            return _Stop!!
        }
        _Stop = ImageVector.Builder(
            name = "Filled.Stop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.945f, 5.75f)
                curveToRelative(-1.367f, 0f, -2.47f, 0f, -3.337f, 0.117f)
                curveToRelative(-0.9f, 0.12f, -1.658f, 0.38f, -2.26f, 0.981f)
                curveToRelative(-0.602f, 0.602f, -0.86f, 1.36f, -0.981f, 2.26f)
                curveToRelative(-0.117f, 0.867f, -0.117f, 1.97f, -0.117f, 3.337f)
                verticalLineToRelative(0.11f)
                curveToRelative(0f, 1.367f, 0f, 2.47f, 0.117f, 3.337f)
                curveToRelative(0.12f, 0.9f, 0.38f, 1.658f, 0.981f, 2.26f)
                curveToRelative(0.602f, 0.602f, 1.36f, 0.86f, 2.26f, 0.982f)
                curveToRelative(0.867f, 0.116f, 1.97f, 0.116f, 3.337f, 0.116f)
                horizontalLineToRelative(0.11f)
                curveToRelative(1.367f, 0f, 2.47f, 0f, 3.337f, -0.116f)
                curveToRelative(0.9f, -0.122f, 1.658f, -0.38f, 2.26f, -0.982f)
                reflectiveCurveToRelative(0.86f, -1.36f, 0.982f, -2.26f)
                curveToRelative(0.116f, -0.867f, 0.116f, -1.97f, 0.116f, -3.337f)
                verticalLineToRelative(-0.11f)
                curveToRelative(0f, -1.367f, 0f, -2.47f, -0.116f, -3.337f)
                curveToRelative(-0.122f, -0.9f, -0.38f, -1.658f, -0.982f, -2.26f)
                reflectiveCurveToRelative(-1.36f, -0.86f, -2.26f, -0.981f)
                curveToRelative(-0.867f, -0.117f, -1.97f, -0.117f, -3.337f, -0.117f)
                close()
            }
        }.build()

        return _Stop!!
    }

@Suppress("ObjectPropertyName")
private var _Stop: ImageVector? = null
