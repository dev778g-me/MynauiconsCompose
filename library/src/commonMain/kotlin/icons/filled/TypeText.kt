package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.TypeText: ImageVector
    get() {
        if (_TypeText != null) {
            return _TypeText!!
        }
        _TypeText = ImageVector.Builder(
            name = "Filled.TypeText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.578f, 12.574f)
                curveToRelative(0.688f, -0.436f, 1.992f, -0.883f, 3.068f, -0.83f)
                curveToRelative(0.527f, 0.027f, 0.913f, 0.168f, 1.161f, 0.396f)
                curveToRelative(0.231f, 0.21f, 0.443f, 0.587f, 0.443f, 1.311f)
                verticalLineToRelative(0.42f)
                quadToRelative(-0.327f, 0.064f, -0.762f, 0.139f)
                lineToRelative(-0.28f, 0.049f)
                curveToRelative(-0.673f, 0.118f, -1.46f, 0.267f, -2.207f, 0.504f)
                curveToRelative(-0.74f, 0.234f, -1.504f, 0.575f, -2.092f, 1.114f)
                arcToRelative(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.012f, 2.308f)
                curveToRelative(0f, 0.98f, 0.404f, 1.744f, 1.125f, 2.189f)
                curveToRelative(0.674f, 0.416f, 1.516f, 0.488f, 2.307f, 0.38f)
                curveToRelative(0.973f, -0.132f, 2.033f, -0.559f, 2.921f, -1.214f)
                lineTo(20.25f, 20f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-6.548f)
                curveToRelative(0f, -1.039f, -0.318f, -1.86f, -0.93f, -2.42f)
                curveToRelative(-0.596f, -0.544f, -1.368f, -0.749f, -2.099f, -0.785f)
                curveToRelative(-1.438f, -0.072f, -3.046f, 0.489f, -3.946f, 1.06f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.803f, 1.267f)
                moveToRelative(4.672f, 2.824f)
                verticalLineToRelative(1.854f)
                curveToRelative(-0.694f, 0.957f, -1.984f, 1.661f, -3.123f, 1.816f)
                curveToRelative(-0.598f, 0.081f, -1.047f, -0.004f, -1.317f, -0.17f)
                curveToRelative(-0.222f, -0.138f, -0.413f, -0.383f, -0.413f, -0.913f)
                curveToRelative(0f, -0.527f, 0.196f, -0.9f, 0.527f, -1.203f)
                curveToRelative(0.355f, -0.326f, 0.881f, -0.584f, 1.53f, -0.79f)
                curveToRelative(0.644f, -0.203f, 1.345f, -0.338f, 2.013f, -0.456f)
                lineToRelative(0.266f, -0.046f)
                quadToRelative(0.262f, -0.044f, 0.517f, -0.092f)
                moveTo(8.483f, 3.786f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.437f, 0f)
                lineToRelative(-4.765f, 16f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.438f, 0.428f)
                lineToRelative(1.338f, -4.494f)
                horizontalLineToRelative(5.415f)
                lineToRelative(1.339f, 4.494f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.437f, -0.428f)
                close()
                moveTo(7.765f, 6.628f)
                lineTo(10.025f, 14.22f)
                horizontalLineToRelative(-4.52f)
                close()
            }
        }.build()

        return _TypeText!!
    }

@Suppress("ObjectPropertyName")
private var _TypeText: ImageVector? = null
