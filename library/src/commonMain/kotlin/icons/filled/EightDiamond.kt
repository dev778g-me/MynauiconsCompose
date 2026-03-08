package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.EightDiamond: ImageVector
    get() {
        if (_EightDiamond != null) {
            return _EightDiamond!!
        }
        _EightDiamond = ImageVector.Builder(
            name = "Filled.EightDiamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.008f, 9.935f)
                curveToRelative(0f, -0.597f, 0.212f, -0.91f, 0.496f, -1.104f)
                curveToRelative(0.324f, -0.22f, 0.83f, -0.342f, 1.496f, -0.342f)
                reflectiveCurveToRelative(1.172f, 0.122f, 1.496f, 0.342f)
                curveToRelative(0.284f, 0.193f, 0.496f, 0.507f, 0.496f, 1.104f)
                curveToRelative(0f, 0.388f, -0.335f, 0.75f, -0.963f, 1.06f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.029f, 0.369f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.03f, -0.37f)
                curveToRelative(-0.627f, -0.31f, -0.962f, -0.67f, -0.962f, -1.06f)
                moveToRelative(1.763f, 2.764f)
                curveToRelative(0.091f, -0.027f, 0.17f, -0.047f, 0.229f, -0.062f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.03f, 0.37f)
                curveToRelative(0.627f, 0.31f, 0.962f, 0.67f, 0.962f, 1.06f)
                curveToRelative(0f, 0.596f, -0.212f, 0.91f, -0.496f, 1.103f)
                curveToRelative(-0.324f, 0.22f, -0.83f, 0.342f, -1.496f, 0.342f)
                reflectiveCurveToRelative(-1.172f, -0.122f, -1.496f, -0.342f)
                curveToRelative(-0.284f, -0.193f, -0.496f, -0.507f, -0.496f, -1.104f)
                curveToRelative(0f, -0.388f, 0.335f, -0.75f, 0.963f, -1.06f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, -0.307f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.79f, 1.49f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.445f, 0.687f)
                lineToRelative(7.588f, 7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.47f)
                lineToRelative(-7.588f, 7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.47f, 0f)
                lineToRelative(-7.588f, -7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.47f)
                lineToRelative(7.588f, -7.589f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.025f, -0.685f)
                moveTo(8.75f, 9.936f)
                curveToRelative(0f, 1.053f, 0.803f, 1.702f, 1.462f, 2.065f)
                curveToRelative(-0.66f, 0.363f, -1.462f, 1.012f, -1.462f, 2.065f)
                curveToRelative(0f, 0.952f, 0.374f, 1.671f, 1.04f, 2.123f)
                curveToRelative(0.624f, 0.426f, 1.428f, 0.562f, 2.21f, 0.562f)
                reflectiveCurveToRelative(1.586f, -0.136f, 2.21f, -0.562f)
                curveToRelative(0.666f, -0.452f, 1.04f, -1.17f, 1.04f, -2.123f)
                curveToRelative(0f, -1.053f, -0.803f, -1.702f, -1.462f, -2.065f)
                curveToRelative(0.66f, -0.363f, 1.462f, -1.012f, 1.462f, -2.065f)
                curveToRelative(0f, -0.952f, -0.374f, -1.671f, -1.04f, -2.123f)
                curveToRelative(-0.624f, -0.426f, -1.428f, -0.562f, -2.21f, -0.562f)
                reflectiveCurveToRelative(-1.586f, 0.136f, -2.21f, 0.562f)
                curveToRelative(-0.666f, 0.452f, -1.04f, 1.17f, -1.04f, 2.123f)
            }
        }.build()

        return _EightDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _EightDiamond: ImageVector? = null
