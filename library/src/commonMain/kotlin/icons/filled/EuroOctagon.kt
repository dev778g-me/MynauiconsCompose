package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.EuroOctagon: ImageVector
    get() {
        if (_EuroOctagon != null) {
            return _EuroOctagon!!
        }
        _EuroOctagon = ImageVector.Builder(
            name = "Filled.EuroOctagon",
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
                moveTo(8.86f, 8.77f)
                curveToRelative(-0.59f, 0.708f, -0.937f, 1.583f, -1.06f, 2.48f)
                horizontalLineTo(7f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(0.812f)
                curveToRelative(0.339f, 2.069f, 2.044f, 4f, 4.438f, 4f)
                curveToRelative(1.305f, 0f, 2.448f, -0.287f, 3.27f, -1.075f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.04f, -1.083f)
                curveToRelative(-0.427f, 0.41f, -1.117f, 0.658f, -2.23f, 0.658f)
                curveToRelative(-1.432f, 0f, -2.593f, -1.134f, -2.913f, -2.5f)
                horizontalLineTo(12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineTo(9.321f)
                curveToRelative(0.11f, -0.573f, 0.345f, -1.102f, 0.693f, -1.52f)
                curveToRelative(0.481f, -0.578f, 1.207f, -0.98f, 2.236f, -0.98f)
                curveToRelative(1.113f, 0f, 1.803f, 0.248f, 2.23f, 0.658f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.04f, -1.083f)
                curveToRelative(-0.822f, -0.788f, -1.965f, -1.075f, -3.27f, -1.075f)
                curveToRelative(-1.471f, 0f, -2.62f, 0.598f, -3.389f, 1.52f)
            }
        }.build()

        return _EuroOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _EuroOctagon: ImageVector? = null
