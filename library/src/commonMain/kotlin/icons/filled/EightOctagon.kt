package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.EightOctagon: ImageVector
    get() {
        if (_EightOctagon != null) {
            return _EightOctagon!!
        }
        _EightOctagon = ImageVector.Builder(
            name = "Filled.EightOctagon",
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
                moveTo(8.037f, 2.408f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, -0.158f)
                horizontalLineToRelative(6.126f)
                curveToRelative(0.302f, 0f, 0.602f, 0.036f, 0.9f, 0.158f)
                reflectiveCurveToRelative(0.54f, 0.31f, 0.762f, 0.53f)
                lineToRelative(4.337f, 4.337f)
                curveToRelative(0.22f, 0.221f, 0.408f, 0.463f, 0.53f, 0.762f)
                curveToRelative(0.123f, 0.298f, 0.158f, 0.598f, 0.158f, 0.9f)
                verticalLineToRelative(6.126f)
                curveToRelative(0f, 0.313f, -0.039f, 0.616f, -0.163f, 0.914f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.525f, 0.748f)
                lineToRelative(-4.337f, 4.337f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.762f, 0.53f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, 0.158f)
                horizontalLineTo(8.937f)
                curveToRelative(-0.313f, 0f, -0.616f, -0.039f, -0.914f, -0.163f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.748f, -0.525f)
                lineToRelative(-4.337f, -4.337f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.53f, -0.762f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.158f, -0.9f)
                verticalLineTo(8.937f)
                curveToRelative(0f, -0.313f, 0.039f, -0.616f, 0.163f, -0.914f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.525f, -0.748f)
                lineToRelative(4.337f, -4.337f)
                curveToRelative(0.221f, -0.22f, 0.463f, -0.408f, 0.762f, -0.53f)
                moveToRelative(0.713f, 7.527f)
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

        return _EightOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _EightOctagon: ImageVector? = null
