package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Like: ImageVector
    get() {
        if (_Like != null) {
            return _Like!!
        }
        _Like = ImageVector.Builder(
            name = "Filled.Like",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.148f, 9.175f)
                curveToRelative(-0.55f, 0.294f, -0.898f, 0.865f, -0.898f, 1.493f)
                verticalLineToRelative(9.385f)
                curveToRelative(0f, 0.95f, 0.78f, 1.697f, 1.714f, 1.697f)
                horizontalLineToRelative(12.521f)
                curveToRelative(0.579f, 0f, 1.024f, -0.404f, 1.304f, -0.725f)
                curveToRelative(0.317f, -0.362f, 0.618f, -0.847f, 0.894f, -1.383f)
                curveToRelative(0.557f, -1.08f, 1.08f, -2.494f, 1.459f, -3.893f)
                curveToRelative(0.376f, -1.392f, 0.628f, -2.832f, 0.607f, -3.956f)
                curveToRelative(-0.01f, -0.552f, -0.087f, -1.11f, -0.312f, -1.556f)
                curveToRelative(-0.247f, -0.493f, -0.703f, -0.882f, -1.364f, -0.882f)
                horizontalLineToRelative(-5.25f)
                curveToRelative(0.216f, -0.96f, 0.51f, -2.497f, 0.404f, -3.868f)
                curveToRelative(-0.059f, -0.758f, -0.246f, -1.561f, -0.723f, -2.189f)
                curveToRelative(-0.509f, -0.668f, -1.277f, -1.048f, -2.282f, -1.048f)
                curveToRelative(-0.582f, 0f, -1.126f, 0.31f, -1.415f, 0.822f)
                moveToRelative(0f, 0f)
                lineToRelative(-1.28f, 2.266f)
                curveToRelative(-0.512f, 0.906f, -1.3f, 1.58f, -2.258f, 2.176f)
                curveToRelative(-0.638f, 0.397f, -1.294f, 0.727f, -1.973f, 1.07f)
                arcToRelative(50f, 50f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.148f, 0.591f)
            }
        }.build()

        return _Like!!
    }

@Suppress("ObjectPropertyName")
private var _Like: ImageVector? = null
