package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.KeyboardBrightnessHigh: ImageVector
    get() {
        if (_KeyboardBrightnessHigh != null) {
            return _KeyboardBrightnessHigh!!
        }
        _KeyboardBrightnessHigh = ImageVector.Builder(
            name = "Outline.KeyboardBrightnessHigh",
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
                moveTo(10f, 17f)
                horizontalLineToRelative(4f)
                moveTo(3f, 17f)
                horizontalLineToRelative(3f)
                moveToRelative(6f, -9f)
                verticalLineToRelative(3f)
                moveToRelative(6f, 6f)
                horizontalLineToRelative(3f)
                moveToRelative(-4.879f, -4.28f)
                lineTo(18.58f, 11f)
                moveTo(7.457f, 12.72f)
                lineTo(5f, 11f)
            }
        }.build()

        return _KeyboardBrightnessHigh!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardBrightnessHigh: ImageVector? = null
