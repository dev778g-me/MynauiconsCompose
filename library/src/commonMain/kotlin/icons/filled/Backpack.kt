package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Backpack: ImageVector
    get() {
        if (_Backpack != null) {
            return _Backpack!!
        }
        _Backpack = ImageVector.Builder(
            name = "Filled.Backpack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.25f, 20.444f)
                curveToRelative(0f, 0.73f, -0.41f, 1.324f, -0.937f, 1.707f)
                curveToRelative(-0.53f, 0.384f, -1.223f, 0.599f, -1.956f, 0.599f)
                lineTo(6.643f, 22.75f)
                curveToRelative(-0.733f, 0f, -1.426f, -0.215f, -1.955f, -0.599f)
                curveToRelative(-0.529f, -0.383f, -0.938f, -0.977f, -0.938f, -1.707f)
                lineTo(3.75f, 9.777f)
                curveToRelative(0f, -2.605f, 1.872f, -4.797f, 4.345f, -5.145f)
                curveTo(8.416f, 2.728f, 10.022f, 1.25f, 12f, 1.25f)
                reflectiveCurveToRelative(3.583f, 1.478f, 3.904f, 3.382f)
                curveToRelative(2.474f, 0.348f, 4.346f, 2.54f, 4.346f, 5.145f)
                close()
                moveTo(15.964f, 21.25f)
                horizontalLineToRelative(1.393f)
                curveToRelative(0.451f, 0f, 0.828f, -0.134f, 1.075f, -0.312f)
                curveToRelative(0.247f, -0.18f, 0.318f, -0.364f, 0.318f, -0.494f)
                lineTo(18.75f, 9.777f)
                curveToRelative(0f, -2.066f, -1.609f, -3.694f, -3.536f, -3.694f)
                lineTo(8.786f, 6.083f)
                curveToRelative(-1.927f, 0f, -3.536f, 1.628f, -3.536f, 3.694f)
                verticalLineToRelative(10.667f)
                curveToRelative(0f, 0.13f, 0.071f, 0.314f, 0.318f, 0.494f)
                curveToRelative(0.247f, 0.178f, 0.624f, 0.312f, 1.075f, 0.312f)
                horizontalLineToRelative(1.393f)
                verticalLineToRelative(-3.694f)
                curveToRelative(0f, -1.616f, 1.27f, -2.973f, 2.893f, -2.973f)
                horizontalLineToRelative(2.142f)
                curveToRelative(1.623f, 0f, 2.893f, 1.357f, 2.893f, 2.973f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.607f, 12.75f)
                horizontalLineToRelative(-3.214f)
                curveToRelative(-1.328f, 0f, -2.357f, -1.108f, -2.357f, -2.417f)
                reflectiveCurveToRelative(1.03f, -2.416f, 2.357f, -2.416f)
                horizontalLineToRelative(3.214f)
                curveToRelative(1.328f, 0f, 2.357f, 1.108f, 2.357f, 2.416f)
                curveToRelative(0f, 1.309f, -1.03f, 2.417f, -2.357f, 2.417f)
            }
        }.build()

        return _Backpack!!
    }

@Suppress("ObjectPropertyName")
private var _Backpack: ImageVector? = null
