package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Heart: ImageVector
    get() {
        if (_Heart != null) {
            return _Heart!!
        }
        _Heart = ImageVector.Builder(
            name = "Filled.Heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.566f, 21.112f)
                lineTo(12f, 20.5f)
                close()
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.867f, 0f)
                lineTo(12f, 20.5f)
                lineToRelative(0.434f, 0.612f)
                lineToRelative(0.008f, -0.006f)
                lineToRelative(0.021f, -0.015f)
                lineToRelative(0.08f, -0.058f)
                quadToRelative(0.104f, -0.075f, 0.295f, -0.219f)
                arcToRelative(38.5f, 38.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.197f, -3.674f)
                curveToRelative(1.148f, -1.168f, 2.315f, -2.533f, 3.199f, -3.981f)
                curveToRelative(0.88f, -1.44f, 1.516f, -3.024f, 1.516f, -4.612f)
                curveToRelative(0f, -1.885f, -0.585f, -3.358f, -1.62f, -4.358f)
                curveToRelative(-1.03f, -0.994f, -2.42f, -1.439f, -3.88f, -1.439f)
                curveToRelative(-1.725f, 0f, -3.248f, 0.833f, -4.25f, 2.117f)
                curveTo(10.998f, 3.583f, 9.474f, 2.75f, 7.75f, 2.75f)
                curveToRelative(-3.08f, 0f, -5.5f, 2.639f, -5.5f, 5.797f)
                curveToRelative(0f, 1.588f, 0.637f, 3.171f, 1.516f, 4.612f)
                curveToRelative(0.884f, 1.448f, 2.051f, 2.813f, 3.199f, 3.982f)
                arcToRelative(38.5f, 38.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.492f, 3.892f)
                lineToRelative(0.08f, 0.058f)
                lineToRelative(0.021f, 0.015f)
                close()
            }
        }.build()

        return _Heart!!
    }

@Suppress("ObjectPropertyName")
private var _Heart: ImageVector? = null
