package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MicrophoneOff: ImageVector
    get() {
        if (_MicrophoneOff != null) {
            return _MicrophoneOff!!
        }
        _MicrophoneOff = ImageVector.Builder(
            name = "Filled.MicrophoneOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.25f)
                curveToRelative(-2.51f, 0f, -4.75f, 1.767f, -4.75f, 4.179f)
                verticalLineToRelative(5.142f)
                curveToRelative(0f, 1.13f, 0.49f, 2.117f, 1.27f, 2.848f)
                lineToRelative(-0.97f, 0.97f)
                arcTo(6.23f, 6.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.75f, 11f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                curveToRelative(0f, 2.125f, 0.855f, 4.05f, 2.24f, 5.45f)
                lineToRelative(-4.02f, 4.02f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(4.117f, -4.117f)
                arcToRelative(7.7f, 7.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.603f, 1.301f)
                verticalLineToRelative(1.536f)
                horizontalLineTo(8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(-1.536f)
                arcToRelative(7.75f, 7.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, -7.714f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                arcToRelative(6.25f, 6.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.518f, 5.329f)
                lineToRelative(1.06f, -1.06f)
                arcTo(5.3f, 5.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15.75f)
                curveToRelative(2.51f, 0f, 4.75f, -1.767f, 4.75f, -4.179f)
                verticalLineToRelative(-3.26f)
                lineToRelative(4.78f, -4.78f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, -1.061f)
                lineToRelative(-3.727f, 3.726f)
                curveTo(16.605f, 3.904f, 14.429f, 2.25f, 12f, 2.25f)
            }
        }.build()

        return _MicrophoneOff!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneOff: ImageVector? = null
