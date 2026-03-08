package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.KeyboardBrightnessLow: ImageVector
    get() {
        if (_KeyboardBrightnessLow != null) {
            return _KeyboardBrightnessLow!!
        }
        _KeyboardBrightnessLow = ImageVector.Builder(
            name = "Outline.KeyboardBrightnessLow",
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
                moveTo(8f, 17f)
                horizontalLineToRelative(8f)
                moveTo(3f, 17f)
                horizontalLineToRelative(1f)
                moveToRelative(8f, -8f)
                verticalLineToRelative(1f)
                moveToRelative(6f, 2.207f)
                lineToRelative(0.707f, -0.707f)
                moveToRelative(-13f, 0.707f)
                lineTo(5f, 11.5f)
                moveTo(20f, 17f)
                horizontalLineToRelative(1f)
            }
        }.build()

        return _KeyboardBrightnessLow!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardBrightnessLow: ImageVector? = null
