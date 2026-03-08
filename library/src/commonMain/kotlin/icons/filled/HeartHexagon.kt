package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.HeartHexagon: ImageVector
    get() {
        if (_HeartHexagon != null) {
            return _HeartHexagon!!
        }
        _HeartHexagon = ImageVector.Builder(
            name = "Filled.HeartHexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.68f, 2.105f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.64f, 0f)
                lineToRelative(0.001f, 0.001f)
                lineToRelative(6.611f, 3.8f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.25f, 8.2f)
                verticalLineToRelative(7.603f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.318f, 2.291f)
                lineToRelative(-0.003f, 0.002f)
                lineToRelative(-6.608f, 3.799f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.639f, 0f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-6.608f, -3.8f)
                horizontalLineToRelative(-0.003f)
                arcTo(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.75f, 15.8f)
                lineTo(2.75f, 8.198f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.318f, -2.291f)
                lineToRelative(0.003f, -0.002f)
                close()
                moveTo(12.301f, 16.124f)
                lineTo(12.306f, 16.121f)
                lineTo(12.315f, 16.115f)
                lineTo(12.347f, 16.093f)
                lineTo(12.464f, 16.012f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.628f, -1.341f)
                curveToRelative(0.444f, -0.427f, 0.91f, -0.938f, 1.27f, -1.492f)
                curveToRelative(0.354f, -0.545f, 0.648f, -1.2f, 0.648f, -1.898f)
                curveToRelative(0f, -0.782f, -0.262f, -1.443f, -0.767f, -1.902f)
                curveToRelative(-0.494f, -0.449f, -1.136f, -0.629f, -1.764f, -0.629f)
                arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.594f, 0.565f)
                arcTo(2.531f, 2.531f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.76f, 11.28f)
                curveToRelative(0f, 0.698f, 0.294f, 1.353f, 0.648f, 1.898f)
                curveToRelative(0.36f, 0.554f, 0.826f, 1.065f, 1.27f, 1.491f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.745f, 1.423f)
                lineToRelative(0.032f, 0.022f)
                lineToRelative(0.01f, 0.006f)
                lineToRelative(0.004f, 0.003f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.832f, 0f)
            }
        }.build()

        return _HeartHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _HeartHexagon: ImageVector? = null
