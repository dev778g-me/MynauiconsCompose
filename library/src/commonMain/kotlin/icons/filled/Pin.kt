package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Pin: ImageVector
    get() {
        if (_Pin != null) {
            return _Pin!!
        }
        _Pin = ImageVector.Builder(
            name = "Filled.Pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.102f, 2.664f)
                curveToRelative(0.628f, -0.416f, 1.692f, -0.713f, 2.495f, 0.09f)
                lineToRelative(4.647f, 4.648f)
                curveToRelative(0.806f, 0.804f, 0.508f, 1.868f, 0.091f, 2.495f)
                arcToRelative(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.863f, 0.85f)
                curveToRelative(-0.334f, 0.213f, -0.756f, 0.374f, -1.211f, 0.35f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.658f, -0.071f)
                lineToRelative(-0.068f, -0.01f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.707f, -0.073f)
                curveToRelative(-0.504f, -0.025f, -0.698f, 0.06f, -0.76f, 0.12f)
                lineToRelative(-2.49f, 2.491f)
                curveToRelative(-0.08f, 0.08f, -0.18f, 0.258f, -0.256f, 0.6f)
                curveToRelative(-0.073f, 0.33f, -0.105f, 0.736f, -0.113f, 1.186f)
                curveToRelative(-0.007f, 0.432f, 0.008f, 0.874f, 0.024f, 1.3f)
                lineToRelative(0.001f, 0.047f)
                curveToRelative(0.015f, 0.423f, 0.03f, 0.855f, 0.009f, 1.194f)
                curveToRelative(-0.065f, 1.031f, -0.868f, 1.79f, -1.658f, 2.141f)
                curveToRelative(-0.79f, 0.35f, -1.917f, 0.437f, -2.7f, -0.347f)
                lineToRelative(-2.25f, -2.25f)
                lineTo(3.53f, 21.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(4.104f, -4.105f)
                lineToRelative(-2.25f, -2.25f)
                curveToRelative(-0.783f, -0.784f, -0.697f, -1.91f, -0.346f, -2.7f)
                curveToRelative(0.35f, -0.79f, 1.11f, -1.593f, 2.14f, -1.658f)
                curveToRelative(0.34f, -0.021f, 0.772f, -0.006f, 1.195f, 0.009f)
                lineToRelative(0.047f, 0.001f)
                curveToRelative(0.426f, 0.015f, 0.868f, 0.031f, 1.3f, 0.024f)
                curveToRelative(0.45f, -0.008f, 0.856f, -0.04f, 1.186f, -0.113f)
                curveToRelative(0.342f, -0.076f, 0.52f, -0.177f, 0.6f, -0.257f)
                lineToRelative(2.49f, -2.49f)
                curveToRelative(0.061f, -0.061f, 0.146f, -0.256f, 0.12f, -0.76f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.073f, -0.707f)
                lineToRelative(-0.009f, -0.068f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.071f, -0.658f)
                curveToRelative(-0.025f, -0.455f, 0.136f, -0.877f, 0.348f, -1.211f)
                curveToRelative(0.216f, -0.34f, 0.515f, -0.64f, 0.851f, -0.863f)
            }
        }.build()

        return _Pin!!
    }

@Suppress("ObjectPropertyName")
private var _Pin: ImageVector? = null
