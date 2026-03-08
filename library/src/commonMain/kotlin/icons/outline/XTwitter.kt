package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.XTwitter: ImageVector
    get() {
        if (_XTwitter != null) {
            return _XTwitter!!
        }
        _XTwitter = ImageVector.Builder(
            name = "Outline.XTwitter",
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
                moveToRelative(19f, 4f)
                lineToRelative(-5.93f, 6.93f)
                moveTo(5f, 20f)
                lineToRelative(5.93f, -6.93f)
                moveToRelative(0f, 0f)
                lineToRelative(5.795f, 6.587f)
                curveToRelative(0.19f, 0.216f, 0.483f, 0.343f, 0.794f, 0.343f)
                horizontalLineToRelative(1.474f)
                curveToRelative(0.836f, 0f, 1.307f, -0.85f, 0.793f, -1.435f)
                lineTo(13.07f, 10.93f)
                moveToRelative(-2.14f, 2.14f)
                lineTo(4.214f, 5.435f)
                curveTo(3.7f, 4.85f, 4.17f, 4f, 5.007f, 4f)
                horizontalLineToRelative(1.474f)
                curveToRelative(0.31f, 0f, 0.604f, 0.127f, 0.794f, 0.343f)
                lineToRelative(5.795f, 6.587f)
            }
        }.build()

        return _XTwitter!!
    }

@Suppress("ObjectPropertyName")
private var _XTwitter: ImageVector? = null
