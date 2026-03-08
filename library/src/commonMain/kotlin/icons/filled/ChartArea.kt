package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChartArea: ImageVector
    get() {
        if (_ChartArea != null) {
            return _ChartArea!!
        }
        _ChartArea = ImageVector.Builder(
            name = "Filled.ChartArea",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 14.6f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(11.6f)
                lineToRelative(0.007f, 1.467f)
                curveToRelative(0.006f, 0.418f, 0.019f, 0.77f, 0.044f, 1.078f)
                curveToRelative(0.05f, 0.606f, 0.142f, 0.954f, 0.276f, 1.217f)
                lineToRelative(0.115f, 0.206f)
                curveToRelative(0.289f, 0.47f, 0.702f, 0.853f, 1.196f, 1.105f)
                lineToRelative(0.103f, 0.049f)
                curveToRelative(0.251f, 0.108f, 0.584f, 0.184f, 1.113f, 0.227f)
                curveTo(7.471f, 20f, 8.264f, 20f, 9.4f, 20f)
                horizontalLineTo(21f)
                lineToRelative(0.102f, 0.005f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.99f)
                lineTo(21f, 22f)
                horizontalLineTo(9.4f)
                curveToRelative(-1.103f, 0f, -1.991f, 0.001f, -2.709f, -0.058f)
                curveToRelative(-0.637f, -0.052f, -1.208f, -0.154f, -1.737f, -0.381f)
                lineToRelative(-0.224f, -0.106f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.092f, -2.01f)
                lineToRelative(-0.093f, -0.175f)
                curveToRelative(-0.302f, -0.593f, -0.428f, -1.233f, -0.487f, -1.961f)
                curveToRelative(-0.03f, -0.359f, -0.044f, -0.76f, -0.051f, -1.21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.25f, 7.68f)
                curveToRelative(0f, -1.62f, 2.011f, -2.37f, 3.072f, -1.146f)
                lineToRelative(4.134f, 4.77f)
                lineToRelative(0.035f, 0.034f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.305f, 0.003f)
                lineToRelative(2.272f, -1.704f)
                lineToRelative(0.17f, -0.114f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.463f, 0.768f)
                lineToRelative(2.136f, 4.538f)
                lineToRelative(0.074f, 0.172f)
                curveToRelative(0.7f, 1.781f, -0.61f, 3.749f, -2.562f, 3.749f)
                horizontalLineTo(8f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.25f, 16f)
                close()
            }
        }.build()

        return _ChartArea!!
    }

@Suppress("ObjectPropertyName")
private var _ChartArea: ImageVector? = null
