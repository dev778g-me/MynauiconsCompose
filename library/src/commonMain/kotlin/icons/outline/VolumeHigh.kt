package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.VolumeHigh: ImageVector
    get() {
        if (_VolumeHigh != null) {
            return _VolumeHigh!!
        }
        _VolumeHigh = ImageVector.Builder(
            name = "Outline.VolumeHigh",
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
                moveToRelative(5.1f, 16f)
                curveToRelative(3.866f, -3.866f, 3.866f, -10.134f, 0f, -14f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 16f)
                arcToRelative(5.657f, 5.657f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -8f)
            }
        }.build()

        return _VolumeHigh!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeHigh: ImageVector? = null
