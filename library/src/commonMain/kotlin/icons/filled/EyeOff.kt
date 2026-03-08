package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.EyeOff: ImageVector
    get() {
        if (_EyeOff != null) {
            return _EyeOff!!
        }
        _EyeOff = ImageVector.Builder(
            name = "Filled.EyeOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.53f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 0f)
                lineToRelative(-3.227f, 3.227f)
                curveTo(15.762f, 4.847f, 14.007f, 4.25f, 12f, 4.25f)
                curveToRelative(-5.082f, 0f, -8.542f, 3.824f, -10.057f, 5.903f)
                lineToRelative(-0.023f, 0.031f)
                curveToRelative(-0.258f, 0.355f, -0.468f, 0.643f, -0.598f, 1.142f)
                arcTo(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.25f, 12f)
                curveToRelative(0f, 0.21f, 0.017f, 0.462f, 0.072f, 0.674f)
                curveToRelative(0.13f, 0.5f, 0.34f, 0.787f, 0.598f, 1.142f)
                lineToRelative(0.023f, 0.031f)
                curveToRelative(0.734f, 1.007f, 1.924f, 2.423f, 3.533f, 3.616f)
                lineTo(2.47f, 20.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(3.227f, -3.227f)
                curveToRelative(1.481f, 0.85f, 3.236f, 1.447f, 5.243f, 1.447f)
                curveToRelative(5.082f, 0f, 8.542f, -3.824f, 10.057f, -5.903f)
                lineToRelative(0.023f, -0.031f)
                curveToRelative(0.258f, -0.355f, 0.468f, -0.643f, 0.598f, -1.142f)
                arcTo(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.75f, 12f)
                curveToRelative(0f, -0.21f, -0.017f, -0.462f, -0.072f, -0.674f)
                curveToRelative(-0.13f, -0.5f, -0.34f, -0.787f, -0.598f, -1.142f)
                lineToRelative(-0.023f, -0.031f)
                curveToRelative(-0.734f, -1.007f, -1.924f, -2.423f, -3.533f, -3.616f)
                lineTo(21.53f, 3.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.06f)
                moveToRelative(-8.19f, 7.128f)
                lineToRelative(-3.742f, 3.743f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.742f, -3.742f)
                moveTo(14.75f, 12f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.09f, 2.402f)
                lineToRelative(3.742f, -3.743f)
                curveToRelative(0.222f, 0.397f, 0.348f, 0.854f, 0.348f, 1.341f)
            }
        }.build()

        return _EyeOff!!
    }

@Suppress("ObjectPropertyName")
private var _EyeOff: ImageVector? = null
