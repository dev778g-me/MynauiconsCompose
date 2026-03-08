package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.BrightnessHigh: ImageVector
    get() {
        if (_BrightnessHigh != null) {
            return _BrightnessHigh!!
        }
        _BrightnessHigh = ImageVector.Builder(
            name = "Outline.BrightnessHigh",
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
                moveTo(3f, 12f)
                horizontalLineToRelative(3f)
                moveTo(5f, 5f)
                lineToRelative(2.121f, 2.121f)
                moveTo(19f, 5f)
                lineToRelative(-2.121f, 2.121f)
                moveTo(5f, 19f)
                lineToRelative(2.121f, -2.121f)
                moveTo(19f, 19f)
                lineToRelative(-2.121f, -2.121f)
                moveTo(12f, 3f)
                verticalLineToRelative(3f)
                moveToRelative(0f, 15f)
                verticalLineToRelative(-3f)
                moveToRelative(6f, -6f)
                horizontalLineToRelative(3f)
                moveToRelative(-6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
            }
        }.build()

        return _BrightnessHigh!!
    }

@Suppress("ObjectPropertyName")
private var _BrightnessHigh: ImageVector? = null
