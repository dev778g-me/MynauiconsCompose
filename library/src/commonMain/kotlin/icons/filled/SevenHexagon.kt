package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SevenHexagon: ImageVector
    get() {
        if (_SevenHexagon != null) {
            return _SevenHexagon!!
        }
        _SevenHexagon = ImageVector.Builder(
            name = "Filled.SevenHexagon",
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
                moveTo(9.932f, 7.272f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.364f, 1.456f)
                curveToRelative(1.116f, 0.279f, 2.46f, 0.272f, 3.479f, 0.208f)
                lineToRelative(0.084f, -0.005f)
                curveToRelative(-0.311f, 0.445f, -0.665f, 0.975f, -1.02f, 1.55f)
                curveToRelative(-0.511f, 0.832f, -1.032f, 1.774f, -1.427f, 2.712f)
                curveToRelative(-0.39f, 0.926f, -0.684f, 1.91f, -0.684f, 2.807f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -0.603f, 0.206f, -1.37f, 0.566f, -2.225f)
                curveToRelative(0.355f, -0.843f, 0.834f, -1.713f, 1.323f, -2.507f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.906f, -2.748f)
                lineToRelative(0.031f, -0.04f)
                lineToRelative(0.008f, -0.01f)
                lineToRelative(0.002f, -0.002f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.71f, -1.208f)
                lineToRelative(-0.005f, 0.001f)
                lineToRelative(-0.022f, 0.004f)
                lineToRelative(-0.091f, 0.014f)
                quadToRelative(-0.123f, 0.018f, -0.351f, 0.047f)
                curveToRelative(-0.3f, 0.038f, -0.723f, 0.083f, -1.204f, 0.113f)
                curveToRelative(-0.981f, 0.061f, -2.137f, 0.054f, -3.021f, -0.167f)
            }
        }.build()

        return _SevenHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _SevenHexagon: ImageVector? = null
