package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChartBubble: ImageVector
    get() {
        if (_ChartBubble != null) {
            return _ChartBubble!!
        }
        _ChartBubble = ImageVector.Builder(
            name = "Filled.ChartBubble",
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
                moveTo(13.75f, 7.5f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8.5f, 0f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 0f)
                moveToRelative(4.75f, 5.25f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -6.5f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.5f)
                moveToRelative(-1.75f, 2.75f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6.5f, 0f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 0f)
            }
        }.build()

        return _ChartBubble!!
    }

@Suppress("ObjectPropertyName")
private var _ChartBubble: ImageVector? = null
