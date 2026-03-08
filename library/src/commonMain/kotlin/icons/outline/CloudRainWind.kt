package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CloudRainWind: ImageVector
    get() {
        if (_CloudRainWind != null) {
            return _CloudRainWind!!
        }
        _CloudRainWind = ImageVector.Builder(
            name = "Outline.CloudRainWind",
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
                moveTo(19.825f, 17f)
                curveToRelative(4.495f, -3.16f, 0.475f, -7.73f, -3.706f, -7.73f)
                curveTo(13.296f, -1.732f, -3.265f, 7.368f, 4.074f, 15.662f)
                moveToRelative(8.45f, 3.283f)
                lineToRelative(-1.044f, -4.89f)
                moveToRelative(5.044f, 6.89f)
                lineToRelative(-1.044f, -4.89f)
                moveToRelative(-6.956f, 0.89f)
                lineToRelative(-1.044f, -4.89f)
            }
        }.build()

        return _CloudRainWind!!
    }

@Suppress("ObjectPropertyName")
private var _CloudRainWind: ImageVector? = null
