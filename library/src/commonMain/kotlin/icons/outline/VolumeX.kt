package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.VolumeX: ImageVector
    get() {
        if (_VolumeX != null) {
            return _VolumeX!!
        }
        _VolumeX = ImageVector.Builder(
            name = "Outline.VolumeX",
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
                moveTo(13f, 3f)
                verticalLineToRelative(18f)
                curveToRelative(-3.5f, 0f, -6.1f, -4.58f, -6.1f, -4.58f)
                reflectiveCurveToRelative(-3.9f, 0.586f, -3.9f, -1f)
                verticalLineTo(8.505f)
                curveToRelative(0f, -1.586f, 3.9f, -1f, 3.9f, -1f)
                reflectiveCurveTo(9.5f, 3f, 13f, 3f)
                moveToRelative(4f, 7f)
                lineToRelative(4f, 4f)
                moveToRelative(0f, -4f)
                lineToRelative(-4f, 4f)
            }
        }.build()

        return _VolumeX!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeX: ImageVector? = null
