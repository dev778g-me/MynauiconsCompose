package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.HeartDot: ImageVector
    get() {
        if (_HeartDot != null) {
            return _HeartDot!!
        }
        _HeartDot = ImageVector.Builder(
            name = "Filled.HeartDot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.75f, 12f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.434f, 21.112f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.868f, 0f)
                lineToRelative(-0.008f, -0.006f)
                lineToRelative(-0.021f, -0.015f)
                lineToRelative(-0.08f, -0.058f)
                quadToRelative(-0.104f, -0.075f, -0.295f, -0.219f)
                arcToRelative(38.5f, 38.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.197f, -3.674f)
                curveToRelative(-1.148f, -1.168f, -2.315f, -2.533f, -3.199f, -3.981f)
                curveToRelative(-0.88f, -1.44f, -1.516f, -3.024f, -1.516f, -4.612f)
                curveToRelative(0f, -3.158f, 2.42f, -5.797f, 5.5f, -5.797f)
                curveToRelative(1.724f, 0f, 3.248f, 0.833f, 4.25f, 2.117f)
                curveToRelative(1.002f, -1.284f, 2.525f, -2.117f, 4.25f, -2.117f)
                curveToRelative(1.46f, 0f, 2.85f, 0.445f, 3.88f, 1.439f)
                curveToRelative(1.035f, 1f, 1.62f, 2.473f, 1.62f, 4.358f)
                curveToRelative(0f, 1.588f, -0.637f, 3.171f, -1.516f, 4.612f)
                curveToRelative(-0.884f, 1.448f, -2.051f, 2.813f, -3.199f, 3.982f)
                arcToRelative(38.5f, 38.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.492f, 3.892f)
                lineToRelative(-0.047f, 0.034f)
                lineToRelative(-0.033f, 0.024f)
                lineToRelative(-0.021f, 0.015f)
                close()
                moveTo(12f, 9.25f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.5f)
            }
        }.build()

        return _HeartDot!!
    }

@Suppress("ObjectPropertyName")
private var _HeartDot: ImageVector? = null
