package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LightningOff: ImageVector
    get() {
        if (_LightningOff != null) {
            return _LightningOff!!
        }
        _LightningOff = ImageVector.Builder(
            name = "Filled.LightningOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.637f, 3.813f)
                curveToRelative(0.192f, -0.765f, -0.371f, -1.563f, -1.212f, -1.563f)
                horizontalLineToRelative(-4.518f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.151f, 0.768f)
                lineTo(5.85f, 12.146f)
                lineToRelative(-0.005f, 0.011f)
                curveToRelative(-0.311f, 0.76f, 0.18f, 1.62f, 0.989f, 1.725f)
                lineToRelative(0.166f, 0.01f)
                lineToRelative(0.076f, -0.003f)
                arcToRelative(0.747f, 0.747f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.263f, -1.412f)
                lineToRelative(3.736f, -8.727f)
                horizontalLineToRelative(3.987f)
                lineToRelative(-0.224f, 0.574f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.398f, 0.545f)
                lineToRelative(0.352f, -0.903f)
                close()
                moveTo(20.526f, 2.418f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.056f, 1.056f)
                lineToRelative(-0.052f, 0.056f)
                lineToRelative(-5.82f, 5.82f)
                lineTo(17f, 9.35f)
                curveToRelative(0.985f, 0f, 1.532f, 1.054f, 1.1f, 1.854f)
                lineToRelative(-0.1f, 0.156f)
                lineToRelative(-7.47f, 10.047f)
                curveToRelative(-0.54f, 0.725f, -1.621f, 0.224f, -1.527f, -0.605f)
                lineToRelative(0.607f, -5.353f)
                lineToRelative(-6.08f, 6.081f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(18f, -18f)
                close()
            }
        }.build()

        return _LightningOff!!
    }

@Suppress("ObjectPropertyName")
private var _LightningOff: ImageVector? = null
