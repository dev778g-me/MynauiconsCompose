package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Telegram: ImageVector
    get() {
        if (_Telegram != null) {
            return _Telegram!!
        }
        _Telegram = ImageVector.Builder(
            name = "Outline.Telegram",
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
                moveTo(20f, 5f)
                lineTo(4.672f, 11.373f)
                curveToRelative(-0.395f, 0.164f, -0.592f, 0.247f, -0.643f, 0.354f)
                arcToRelative(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.016f, 0.29f)
                curveToRelative(0.063f, 0.1f, 0.268f, 0.16f, 0.68f, 0.281f)
                lineTo(10.5f, 14f)
                moveTo(20f, 5f)
                lineToRelative(-2.065f, 13.049f)
                curveToRelative(-0.04f, 0.254f, -0.06f, 0.381f, -0.127f, 0.45f)
                arcToRelative(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.223f, 0.097f)
                curveToRelative(-0.097f, 0f, -0.205f, -0.072f, -0.421f, -0.216f)
                lineToRelative(-2.93f, -1.956f)
                moveTo(20f, 5f)
                lineToRelative(-9.5f, 9f)
                moveToRelative(0f, 0f)
                lineToRelative(0.156f, 4.3f)
                curveToRelative(0f, 0.334f, 0f, 0.501f, 0.069f, 0.585f)
                curveToRelative(0.06f, 0.074f, 0.15f, 0.116f, 0.246f, 0.115f)
                curveToRelative(0.11f, -0.001f, 0.24f, -0.108f, 0.5f, -0.32f)
                lineToRelative(2.764f, -2.256f)
                moveTo(10.5f, 14f)
                lineToRelative(3.735f, 2.424f)
            }
        }.build()

        return _Telegram!!
    }

@Suppress("ObjectPropertyName")
private var _Telegram: ImageVector? = null
