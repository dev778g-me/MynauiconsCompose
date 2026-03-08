package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MountainSnow: ImageVector
    get() {
        if (_MountainSnow != null) {
            return _MountainSnow!!
        }
        _MountainSnow = ImageVector.Builder(
            name = "Filled.MountainSnow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.38f, 4.49f)
                curveToRelative(0.957f, -1.728f, 3.475f, -1.644f, 4.294f, 0.215f)
                lineToRelative(2.653f, 6.025f)
                arcToRelative(2.392f, 2.392f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.588f, 0.94f)
                lineToRelative(2.596f, 5.542f)
                lineToRelative(0.065f, 0.151f)
                curveToRelative(0.616f, 1.571f, -0.483f, 3.387f, -2.242f, 3.387f)
                lineTo(4.666f, 20.75f)
                curveToRelative(-1.81f, 0f, -2.922f, -1.924f, -2.182f, -3.526f)
                lineToRelative(5.808f, -12.56f)
                close()
                moveTo(17.557f, 12.307f)
                curveToRelative(-0.291f, -0.621f, -1.06f, -0.712f, -1.482f, -0.236f)
                lineToRelative(-0.079f, 0.103f)
                lineToRelative(-2.307f, 3.417f)
                curveToRelative(1.42f, 0.38f, 2.529f, 0.275f, 3.336f, 0.034f)
                arcToRelative(4.7f, 4.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.461f, -0.724f)
                quadToRelative(0.12f, -0.09f, 0.208f, -0.166f)
                close()
                moveTo(11.3f, 5.31f)
                arcToRelative(0.888f, 0.888f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.576f, -0.145f)
                lineToRelative(-0.072f, 0.128f)
                lineToRelative(-3.955f, 8.55f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.747f, -0.147f)
                curveToRelative(1.257f, -0.198f, 2.969f, -0.223f, 4.44f, 0.66f)
                lineToRelative(0.521f, 0.3f)
                quadToRelative(0.45f, 0.243f, 0.873f, 0.429f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.105f, -0.24f)
                lineToRelative(1.886f, -2.796f)
                close()
            }
        }.build()

        return _MountainSnow!!
    }

@Suppress("ObjectPropertyName")
private var _MountainSnow: ImageVector? = null
