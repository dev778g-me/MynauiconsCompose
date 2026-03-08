package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChartCandlestick: ImageVector
    get() {
        if (_ChartCandlestick != null) {
            return _ChartCandlestick!!
        }
        _ChartCandlestick = ImageVector.Builder(
            name = "Filled.ChartCandlestick",
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
                moveTo(11.75f, 13.5f)
                curveToRelative(0f, 0.763f, -0.527f, 1.255f, -1.021f, 1.52f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.979f, 0.332f)
                lineTo(9.75f, 17.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-2.118f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.97f, -0.3f)
                curveToRelative(-0.54f, -0.28f, -1.03f, -0.799f, -1.03f, -1.582f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.763f, 0.527f, -1.256f, 1.021f, -1.52f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.979f, -0.334f)
                lineTo(8.25f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(2.117f)
                curveToRelative(0.34f, 0.053f, 0.673f, 0.149f, 0.97f, 0.302f)
                curveToRelative(0.54f, 0.279f, 1.03f, 0.797f, 1.03f, 1.581f)
                close()
                moveTo(16.25f, 17.5f)
                verticalLineToRelative(-3.148f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.979f, -0.332f)
                curveToRelative(-0.494f, -0.264f, -1.021f, -0.757f, -1.021f, -1.52f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.855f, 0.644f, -1.352f, 1.146f, -1.592f)
                curveToRelative(0.27f, -0.128f, 0.565f, -0.219f, 0.854f, -0.274f)
                lineTo(16.25f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.496f, -0.077f)
                lineToRelative(0.004f, 0.077f)
                verticalLineToRelative(1.168f)
                curveToRelative(0.292f, 0.067f, 0.591f, 0.167f, 0.862f, 0.3f)
                curveToRelative(0.452f, 0.223f, 1.138f, 0.7f, 1.138f, 1.532f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.784f, -0.49f, 1.302f, -1.03f, 1.581f)
                curveToRelative(-0.296f, 0.153f, -0.63f, 0.248f, -0.97f, 0.3f)
                lineTo(17.75f, 17.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
            }
        }.build()

        return _ChartCandlestick!!
    }

@Suppress("ObjectPropertyName")
private var _ChartCandlestick: ImageVector? = null
