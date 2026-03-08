package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChartColumnStacked: ImageVector
    get() {
        if (_ChartColumnStacked != null) {
            return _ChartColumnStacked!!
        }
        _ChartColumnStacked = ImageVector.Builder(
            name = "Filled.ChartColumnStacked",
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
                moveTo(10.746f, 6.923f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.669f, -0.67f)
                lineTo(10f, 6.25f)
                lineTo(9f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2.5f)
                lineTo(10.75f, 7f)
                close()
                moveTo(12.25f, 16f)
                lineToRelative(-0.012f, 0.23f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.008f, 2.008f)
                lineToRelative(-0.23f, 0.012f)
                lineTo(9f, 18.25f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.238f, -2.02f)
                lineTo(6.75f, 16f)
                lineTo(6.75f, 7f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 4.75f)
                horizontalLineToRelative(1f)
                lineToRelative(0.23f, 0.012f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.25f, 7f)
                close()
                moveTo(17.746f, 10.923f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.669f, -0.67f)
                lineTo(17f, 10.25f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(2.5f)
                lineTo(17.75f, 11f)
                close()
                moveTo(19.25f, 16f)
                lineToRelative(-0.012f, 0.23f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.008f, 2.008f)
                lineToRelative(-0.23f, 0.012f)
                horizontalLineToRelative(-1f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.238f, -2.02f)
                lineTo(13.75f, 16f)
                verticalLineToRelative(-5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 8.75f)
                horizontalLineToRelative(1f)
                lineToRelative(0.23f, 0.012f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.25f, 11f)
                close()
            }
        }.build()

        return _ChartColumnStacked!!
    }

@Suppress("ObjectPropertyName")
private var _ChartColumnStacked: ImageVector? = null
