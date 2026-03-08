package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.HeartDiamond: ImageVector
    get() {
        if (_HeartDiamond != null) {
            return _HeartDiamond!!
        }
        _HeartDiamond = ImageVector.Builder(
            name = "Filled.HeartDiamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.79f, 1.49f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.025f, 0.686f)
                lineTo(2.177f, 9.765f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.47f)
                lineToRelative(7.588f, 7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.47f, 0f)
                lineToRelative(7.588f, -7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.47f)
                lineToRelative(-7.588f, -7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.445f, -0.686f)
                moveToRelative(1.511f, 14.634f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.832f, 0f)
                lineToRelative(-0.005f, -0.003f)
                lineToRelative(-0.009f, -0.006f)
                lineToRelative(-0.032f, -0.022f)
                lineToRelative(-0.117f, -0.081f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.628f, -1.341f)
                curveToRelative(-0.444f, -0.427f, -0.91f, -0.938f, -1.27f, -1.492f)
                curveToRelative(-0.354f, -0.545f, -0.648f, -1.2f, -0.648f, -1.898f)
                arcToRelative(2.531f, 2.531f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.125f, -1.966f)
                arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.594f, -0.565f)
                curveToRelative(0.628f, 0f, 1.27f, 0.18f, 1.764f, 0.629f)
                curveToRelative(0.505f, 0.459f, 0.767f, 1.12f, 0.767f, 1.902f)
                curveToRelative(0f, 0.698f, -0.295f, 1.353f, -0.648f, 1.898f)
                curveToRelative(-0.36f, 0.554f, -0.826f, 1.065f, -1.27f, 1.491f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.745f, 1.423f)
                lineToRelative(-0.032f, 0.022f)
                lineToRelative(-0.01f, 0.006f)
                close()
            }
        }.build()

        return _HeartDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _HeartDiamond: ImageVector? = null
