package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Spotify: ImageVector
    get() {
        if (_Spotify != null) {
            return _Spotify!!
        }
        _Spotify = ImageVector.Builder(
            name = "Outline.Spotify",
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
                moveTo(8.72f, 15.384f)
                curveToRelative(2.018f, -0.8f, 4.239f, -0.5f, 6.055f, 0.7f)
                moveToRelative(-6.963f, -3.7f)
                curveToRelative(2.725f, -1f, 5.752f, -0.7f, 8.073f, 1f)
                moveTo(6.5f, 9.284f)
                curveToRelative(3.633f, -1.4f, 7.77f, -0.9f, 11f, 1.3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
            }
        }.build()

        return _Spotify!!
    }

@Suppress("ObjectPropertyName")
private var _Spotify: ImageVector? = null
