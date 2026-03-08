package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Twitch: ImageVector
    get() {
        if (_Twitch != null) {
            return _Twitch!!
        }
        _Twitch = ImageVector.Builder(
            name = "Outline.Twitch",
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
                moveTo(15.556f, 11.1f)
                lineTo(15.556f, 7.5f)
                moveTo(20f, 3f)
                lineTo(4f, 3f)
                verticalLineToRelative(14.4f)
                horizontalLineToRelative(4.444f)
                lineTo(8.444f, 21f)
                lineTo(12f, 17.4f)
                horizontalLineToRelative(4.444f)
                lineTo(20f, 13.8f)
                close()
                moveTo(11.111f, 11.1f)
                lineTo(11.111f, 7.5f)
                close()
            }
        }.build()

        return _Twitch!!
    }

@Suppress("ObjectPropertyName")
private var _Twitch: ImageVector? = null
