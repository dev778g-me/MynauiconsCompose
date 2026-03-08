package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChartSpline: ImageVector
    get() {
        if (_ChartSpline != null) {
            return _ChartSpline!!
        }
        _ChartSpline = ImageVector.Builder(
            name = "Filled.ChartSpline",
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
                moveTo(10.229f, 6.882f)
                curveToRelative(0.904f, -2.003f, 3.855f, -1.936f, 4.624f, 0.2f)
                lineToRelative(0.22f, 0.648f)
                curveToRelative(0.215f, 0.662f, 0.414f, 1.358f, 0.612f, 2.034f)
                curveToRelative(0.27f, 0.918f, 0.544f, 1.817f, 0.879f, 2.66f)
                curveToRelative(0.632f, 1.595f, 1.428f, 2.842f, 2.636f, 3.547f)
                lineToRelative(0.247f, 0.134f)
                lineToRelative(0.09f, 0.051f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.89f, 1.78f)
                lineToRelative(-0.094f, -0.042f)
                lineToRelative(-0.367f, -0.198f)
                curveToRelative(-1.777f, -1.039f, -2.789f, -2.788f, -3.482f, -4.533f)
                curveToRelative(-0.372f, -0.938f, -0.668f, -1.917f, -0.937f, -2.836f)
                curveToRelative(-0.206f, -0.702f, -0.395f, -1.361f, -0.593f, -1.973f)
                lineToRelative(-0.203f, -0.594f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.906f, -0.079f)
                lineToRelative(-0.036f, 0.079f)
                curveToRelative(-0.278f, 0.772f, -0.521f, 1.631f, -0.796f, 2.567f)
                curveToRelative(-0.27f, 0.92f, -0.565f, 1.898f, -0.937f, 2.836f)
                curveToRelative(-0.693f, 1.745f, -1.705f, 3.494f, -3.483f, 4.533f)
                lineToRelative(-0.366f, 0.198f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.894f, -1.789f)
                lineToRelative(0.247f, -0.134f)
                curveToRelative(1.208f, -0.705f, 2.004f, -1.953f, 2.637f, -3.546f)
                curveToRelative(0.334f, -0.844f, 0.608f, -1.743f, 0.877f, -2.66f)
                curveToRelative(0.265f, -0.902f, 0.53f, -1.839f, 0.834f, -2.683f)
                close()
            }
        }.build()

        return _ChartSpline!!
    }

@Suppress("ObjectPropertyName")
private var _ChartSpline: ImageVector? = null
