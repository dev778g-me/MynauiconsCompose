package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TelephoneOff: ImageVector
    get() {
        if (_TelephoneOff != null) {
            return _TelephoneOff!!
        }
        _TelephoneOff = ImageVector.Builder(
            name = "Outline.TelephoneOff",
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
                moveTo(10.684f, 13.316f)
                lineTo(21f, 3f)
                moveTo(10.684f, 13.316f)
                curveToRelative(1.53f, 1.556f, 3.701f, 2.484f, 4.916f, 1.205f)
                curveToRelative(1.334f, -1.404f, 3.075f, 0.038f, 4.342f, 0.767f)
                curveToRelative(2.536f, 1.46f, -0.004f, 5.451f, -2.214f, 5.67f)
                curveToRelative(-3.657f, 0.36f, -7.376f, -1.606f, -10.163f, -4.523f)
                moveToRelative(3.119f, -3.119f)
                lineToRelative(-3.119f, 3.119f)
                moveTo(3f, 21f)
                lineToRelative(4.565f, -4.565f)
                moveTo(5.5f, 13.845f)
                curveToRelative(-1.447f, -2.193f, -2.374f, -4.634f, -2.497f, -6.93f)
                curveToRelative(-0.115f, -2.139f, 3.666f, -5.501f, 5.389f, -3.066f)
                curveToRelative(0.918f, 1.298f, 2.576f, 3.064f, 1.108f, 4.609f)
                curveToRelative(-0.493f, 0.519f, -0.628f, 1.186f, -0.51f, 1.897f)
            }
        }.build()

        return _TelephoneOff!!
    }

@Suppress("ObjectPropertyName")
private var _TelephoneOff: ImageVector? = null
