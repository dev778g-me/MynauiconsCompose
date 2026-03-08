package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.HeartOff: ImageVector
    get() {
        if (_HeartOff != null) {
            return _HeartOff!!
        }
        _HeartOff = ImageVector.Builder(
            name = "Filled.HeartOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.434f, 21.112f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.868f, 0f)
                lineToRelative(-0.008f, -0.006f)
                lineToRelative(-0.021f, -0.015f)
                lineToRelative(-0.08f, -0.058f)
                quadToRelative(-0.104f, -0.075f, -0.295f, -0.219f)
                arcToRelative(39f, 39f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.72f, -3.197f)
                lineTo(3.531f, 21.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(3.925f, -3.925f)
                curveToRelative(-0.956f, -1.027f, -1.891f, -2.178f, -2.629f, -3.386f)
                curveToRelative(-0.88f, -1.44f, -1.516f, -3.024f, -1.516f, -4.612f)
                curveToRelative(0f, -3.158f, 2.42f, -5.797f, 5.5f, -5.797f)
                curveToRelative(1.724f, 0f, 3.248f, 0.833f, 4.25f, 2.117f)
                curveToRelative(1.002f, -1.284f, 2.525f, -2.117f, 4.25f, -2.117f)
                curveToRelative(1.12f, 0f, 2.2f, 0.262f, 3.106f, 0.833f)
                lineTo(20.47f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, 1.06f)
                lineToRelative(-1.043f, 1.044f)
                curveToRelative(0.812f, 0.979f, 1.263f, 2.317f, 1.263f, 3.973f)
                curveToRelative(0f, 1.588f, -0.637f, 3.171f, -1.516f, 4.612f)
                curveToRelative(-0.884f, 1.448f, -2.051f, 2.813f, -3.199f, 3.982f)
                arcToRelative(38.5f, 38.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.492f, 3.892f)
                lineToRelative(-0.08f, 0.058f)
                lineToRelative(-0.021f, 0.015f)
                close()
            }
        }.build()

        return _HeartOff!!
    }

@Suppress("ObjectPropertyName")
private var _HeartOff: ImageVector? = null
