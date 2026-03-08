package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MicrophoneOff: ImageVector
    get() {
        if (_MicrophoneOff != null) {
            return _MicrophoneOff!!
        }
        _MicrophoneOff = ImageVector.Builder(
            name = "Outline.MicrophoneOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18f)
                verticalLineToRelative(3f)
                moveToRelative(-4f, 0f)
                horizontalLineToRelative(8f)
                moveToRelative(-8f, -9.429f)
                verticalLineTo(6.43f)
                curveTo(8f, 4.535f, 9.79f, 3f, 12f, 3f)
                curveToRelative(1.309f, 0f, 2.47f, 0.539f, 3.2f, 1.371f)
                moveTo(5f, 11f)
                curveToRelative(0f, 1.046f, 0.23f, 2.039f, 0.641f, 2.93f)
                moveTo(19f, 11f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.425f, 5.425f)
                moveTo(3f, 21f)
                lineToRelative(4.575f, -4.575f)
                moveTo(21f, 3f)
                lineToRelative(-5f, 5f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(3.571f)
                curveTo(16f, 13.465f, 14.21f, 15f, 12f, 15f)
                arcToRelative(4.44f, 4.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.348f, -0.652f)
                moveTo(16f, 8f)
                lineToRelative(-6.348f, 6.348f)
                moveToRelative(0f, 0f)
                lineToRelative(-2.077f, 2.077f)
            }
        }.build()

        return _MicrophoneOff!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneOff: ImageVector? = null
