package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.TwoOctagon: ImageVector
    get() {
        if (_TwoOctagon != null) {
            return _TwoOctagon!!
        }
        _TwoOctagon = ImageVector.Builder(
            name = "Filled.TwoOctagon",
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
                moveToRelative(2.213f, 7.929f)
                curveToRelative(0f, -0.579f, 0.207f, -0.956f, 0.473f, -1.195f)
                curveToRelative(0.279f, -0.251f, 0.67f, -0.392f, 1.085f, -0.392f)
                reflectiveCurveToRelative(0.806f, 0.14f, 1.085f, 0.392f)
                curveToRelative(0.265f, 0.239f, 0.472f, 0.616f, 0.472f, 1.195f)
                curveToRelative(0f, 0.862f, -0.564f, 1.771f, -1.49f, 2.704f)
                curveToRelative(-0.692f, 0.698f, -1.484f, 1.313f, -2.195f, 1.864f)
                quadToRelative(-0.34f, 0.264f, -0.65f, 0.51f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.47f, 1.335f)
                horizontalLineToRelative(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-2.84f)
                curveToRelative(0.433f, -0.357f, 0.876f, -0.745f, 1.28f, -1.153f)
                curveToRelative(0.982f, -0.99f, 1.925f, -2.271f, 1.925f, -3.76f)
                curveToRelative(0f, -0.98f, -0.37f, -1.77f, -0.969f, -2.31f)
                curveToRelative(-0.587f, -0.528f, -1.349f, -0.777f, -2.088f, -0.777f)
                reflectiveCurveToRelative(-1.502f, 0.249f, -2.089f, 0.777f)
                curveToRelative(-0.6f, 0.54f, -0.969f, 1.33f, -0.969f, 2.31f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
            }
        }.build()

        return _TwoOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _TwoOctagon: ImageVector? = null
