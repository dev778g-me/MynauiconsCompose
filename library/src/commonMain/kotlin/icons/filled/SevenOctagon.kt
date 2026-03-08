package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SevenOctagon: ImageVector
    get() {
        if (_SevenOctagon != null) {
            return _SevenOctagon!!
        }
        _SevenOctagon = ImageVector.Builder(
            name = "Filled.SevenOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveToRelative(1.895f, 4.864f)
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

        return _SevenOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _SevenOctagon: ImageVector? = null
