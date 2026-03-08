package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChartNetwork: ImageVector
    get() {
        if (_ChartNetwork != null) {
            return _ChartNetwork!!
        }
        _ChartNetwork = ImageVector.Builder(
            name = "Filled.ChartNetwork",
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
                curveToRelative(0f, 1.136f, 0f, 1.929f, 0.05f, 2.545f)
                curveToRelative(0.05f, 0.606f, 0.143f, 0.954f, 0.277f, 1.217f)
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
                curveTo(1.999f, 16.59f, 2f, 15.703f, 2f, 14.599f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.75f, 6f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.97f, 2.463f)
                lineToRelative(-1.382f, 2.195f)
                arcTo(2.74f, 2.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.562f, 13f)
                lineToRelative(2.405f, 1.153f)
                arcTo(2.74f, 2.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 13.25f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.702f, 2.245f)
                lineToRelative(-2.671f, -1.28f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.322f, -4.636f)
                lineToRelative(1.35f, -2.144f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17.75f, 6f)
            }
        }.build()

        return _ChartNetwork!!
    }

@Suppress("ObjectPropertyName")
private var _ChartNetwork: ImageVector? = null
