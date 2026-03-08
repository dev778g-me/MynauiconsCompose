package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CloudRain: ImageVector
    get() {
        if (_CloudRain != null) {
            return _CloudRain!!
        }
        _CloudRain = ImageVector.Builder(
            name = "Outline.CloudRain",
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
                moveTo(12.004f, 19f)
                lineTo(12f, 14f)
                moveToRelative(4.004f, 7f)
                lineTo(16f, 16f)
                moveToRelative(-7.996f, 1f)
                lineTo(8f, 12f)
                moveToRelative(11.825f, 5f)
                curveToRelative(4.495f, -3.16f, 0.475f, -7.73f, -3.706f, -7.73f)
                curveTo(13.296f, -1.732f, -3.265f, 7.368f, 4.074f, 15.662f)
            }
        }.build()

        return _CloudRain!!
    }

@Suppress("ObjectPropertyName")
private var _CloudRain: ImageVector? = null
