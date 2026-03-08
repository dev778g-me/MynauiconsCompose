package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.VolumeOff: ImageVector
    get() {
        if (_VolumeOff != null) {
            return _VolumeOff!!
        }
        _VolumeOff = ImageVector.Builder(
            name = "Outline.VolumeOff",
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
                moveTo(18.1f, 19f)
                curveToRelative(3.715f, -3.715f, 3.86f, -9.648f, 0.436f, -13.536f)
                moveTo(16f, 16f)
                arcToRelative(5.657f, 5.657f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -8f)
                moveTo(3f, 21f)
                lineToRelative(4.16f, -4.16f)
                moveTo(21f, 3f)
                lineToRelative(-2.464f, 2.464f)
                moveToRelative(0f, 0f)
                lineTo(13f, 11f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(10f)
                curveToRelative(-2.846f, 0f, -5.098f, -3.029f, -5.84f, -4.16f)
                moveTo(13f, 11f)
                lineToRelative(-5.84f, 5.84f)
                moveTo(13f, 7f)
                verticalLineTo(3f)
                curveTo(9.5f, 3f, 6.9f, 7.505f, 6.9f, 7.505f)
                reflectiveCurveTo(3f, 6.92f, 3f, 8.505f)
                verticalLineToRelative(6.914f)
                curveToRelative(0f, 0.39f, 0.236f, 0.65f, 0.59f, 0.818f)
            }
        }.build()

        return _VolumeOff!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeOff: ImageVector? = null
