package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CloudDownload: ImageVector
    get() {
        if (_CloudDownload != null) {
            return _CloudDownload!!
        }
        _CloudDownload = ImageVector.Builder(
            name = "Outline.CloudDownload",
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
                moveToRelative(11.966f, 11.136f)
                lineToRelative(-0.004f, 8f)
                moveTo(19.825f, 17f)
                curveToRelative(4.495f, -3.16f, 0.475f, -7.73f, -3.706f, -7.73f)
                curveTo(13.296f, -1.732f, -3.265f, 7.368f, 4.074f, 15.662f)
                moveToRelative(11.07f, 1.156f)
                lineTo(11.962f, 20f)
                lineTo(8.78f, 16.818f)
            }
        }.build()

        return _CloudDownload!!
    }

@Suppress("ObjectPropertyName")
private var _CloudDownload: ImageVector? = null
