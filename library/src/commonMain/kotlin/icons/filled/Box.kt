package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Box: ImageVector
    get() {
        if (_Box != null) {
            return _Box!!
        }
        _Box = ImageVector.Builder(
            name = "Filled.Box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.669f, 2.282f)
                curveToRelative(0.218f, -0.043f, 0.443f, -0.043f, 0.662f, 0f)
                curveToRelative(0.251f, 0.048f, 0.479f, 0.167f, 0.691f, 0.277f)
                lineToRelative(0.053f, 0.028f)
                lineToRelative(8.27f, 4.28f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.405f, 0.666f)
                verticalLineToRelative(7.898f)
                curveToRelative(0f, 0.283f, 0.002f, 0.583f, -0.093f, 0.862f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.395f, 0.652f)
                curveToRelative(-0.205f, 0.214f, -0.473f, 0.351f, -0.723f, 0.48f)
                lineToRelative(-0.063f, 0.033f)
                lineToRelative(-8.131f, 4.208f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.69f, 0f)
                lineToRelative(-8.131f, -4.208f)
                lineToRelative(-0.063f, -0.033f)
                curveToRelative(-0.25f, -0.129f, -0.518f, -0.266f, -0.723f, -0.48f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.395f, -0.652f)
                curveToRelative(-0.095f, -0.28f, -0.094f, -0.58f, -0.093f, -0.863f)
                lineTo(2.25f, 7.533f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.405f, -0.666f)
                lineToRelative(8.269f, -4.28f)
                lineToRelative(0.053f, -0.027f)
                curveToRelative(0.213f, -0.111f, 0.44f, -0.23f, 0.692f, -0.278f)
                moveToRelative(0.226f, 1.496f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.282f, 0.141f)
                lineTo(4.668f, 7.514f)
                lineTo(12f, 11.102f)
                lineToRelative(7.332f, -3.588f)
                lineToRelative(-6.946f, -3.595f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.282f, -0.141f)
                lineToRelative(-0.058f, -0.024f)
                moveToRelative(-0.796f, 16.013f)
                verticalLineToRelative(-7.362f)
                lineToRelative(-7.5f, -3.67f)
                verticalLineToRelative(6.624f)
                curveToRelative(0f, 0.187f, 0f, 0.294f, 0.005f, 0.375f)
                lineToRelative(0.009f, 0.078f)
                arcToRelative(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.057f, 0.095f)
                curveToRelative(0.005f, 0.004f, 0.021f, 0.017f, 0.064f, 0.042f)
                curveToRelative(0.068f, 0.042f, 0.163f, 0.09f, 0.328f, 0.176f)
                close()
                moveTo(11.895f, 3.777f)
                lineTo(11.955f, 3.754f)
                close()
            }
        }.build()

        return _Box!!
    }

@Suppress("ObjectPropertyName")
private var _Box: ImageVector? = null
