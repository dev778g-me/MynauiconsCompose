package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Paperclip: ImageVector
    get() {
        if (_Paperclip != null) {
            return _Paperclip!!
        }
        _Paperclip = ImageVector.Builder(
            name = "Filled.Paperclip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.523f, 5.38f)
                curveToRelative(-1.966f, -1.849f, -5.065f, -2.416f, -7.418f, -0.146f)
                lineToRelative(-5.74f, 5.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.04f, -1.08f)
                lineToRelative(5.738f, -5.53f)
                curveToRelative(3.076f, -2.966f, 7.1f, -2.112f, 9.487f, 0.133f)
                curveToRelative(1.2f, 1.127f, 2.047f, 2.65f, 2.181f, 4.309f)
                curveToRelative(0.137f, 1.682f, -0.468f, 3.425f, -2.03f, 4.932f)
                lineToRelative(-7.112f, 6.862f)
                curveToRelative(-2.203f, 2.125f, -5.083f, 1.5f, -6.77f, -0.088f)
                curveToRelative(-0.85f, -0.798f, -1.459f, -1.884f, -1.556f, -3.08f)
                curveToRelative(-0.098f, -1.218f, 0.343f, -2.47f, 1.451f, -3.54f)
                lineToRelative(7.01f, -6.763f)
                curveToRelative(1.33f, -1.283f, 3.065f, -0.886f, 4.053f, 0.043f)
                curveToRelative(0.5f, 0.47f, 0.87f, 1.12f, 0.93f, 1.851f)
                curveToRelative(0.06f, 0.755f, -0.217f, 1.517f, -0.872f, 2.148f)
                lineToRelative(-0.001f, 0.002f)
                lineToRelative(-5.823f, 5.579f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.038f, -1.084f)
                lineToRelative(5.821f, -5.577f)
                curveToRelative(0.355f, -0.342f, 0.44f, -0.671f, 0.417f, -0.946f)
                curveToRelative(-0.024f, -0.3f, -0.184f, -0.619f, -0.461f, -0.88f)
                curveToRelative(-0.567f, -0.533f, -1.376f, -0.643f, -1.985f, -0.056f)
                lineToRelative(-7.01f, 6.763f)
                curveToRelative(-0.808f, 0.78f, -1.056f, 1.6f, -0.997f, 2.34f)
                curveToRelative(0.062f, 0.761f, 0.46f, 1.517f, 1.088f, 2.108f)
                curveToRelative(1.266f, 1.19f, 3.22f, 1.529f, 4.701f, 0.1f)
                lineToRelative(7.112f, -6.862f)
                curveToRelative(1.263f, -1.218f, 1.675f, -2.529f, 1.577f, -3.731f)
                curveToRelative(-0.1f, -1.226f, -0.736f, -2.418f, -1.713f, -3.337f)
            }
        }.build()

        return _Paperclip!!
    }

@Suppress("ObjectPropertyName")
private var _Paperclip: ImageVector? = null
