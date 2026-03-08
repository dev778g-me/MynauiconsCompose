package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Egg: ImageVector
    get() {
        if (_Egg != null) {
            return _Egg!!
        }
        _Egg = ImageVector.Builder(
            name = "Filled.Egg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.25f)
                curveToRelative(-1.223f, 0f, -2.337f, 0.521f, -3.294f, 1.295f)
                curveToRelative(-0.955f, 0.773f, -1.79f, 1.827f, -2.477f, 2.98f)
                curveTo(4.864f, 8.817f, 4f, 11.65f, 4f, 13.8f)
                curveToRelative(0f, 4.395f, 3.587f, 7.95f, 8f, 7.95f)
                reflectiveCurveToRelative(8f, -3.555f, 8f, -7.95f)
                curveToRelative(0f, -2.151f, -0.864f, -4.983f, -2.23f, -7.275f)
                curveToRelative(-0.686f, -1.153f, -1.52f, -2.207f, -2.476f, -2.98f)
                curveTo(14.337f, 2.771f, 13.222f, 2.25f, 12f, 2.25f)
            }
        }.build()

        return _Egg!!
    }

@Suppress("ObjectPropertyName")
private var _Egg: ImageVector? = null
