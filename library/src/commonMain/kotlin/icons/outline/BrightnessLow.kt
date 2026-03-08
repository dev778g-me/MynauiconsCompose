package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.BrightnessLow: ImageVector
    get() {
        if (_BrightnessLow != null) {
            return _BrightnessLow!!
        }
        _BrightnessLow = ImageVector.Builder(
            name = "Outline.BrightnessLow",
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
                moveTo(15f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                moveTo(3f, 12f)
                horizontalLineToRelative(1f)
                moveToRelative(1f, -7f)
                lineToRelative(0.707f, 0.707f)
                moveTo(19f, 5f)
                lineToRelative(-0.707f, 0.707f)
                moveTo(5f, 19f)
                lineToRelative(0.707f, -0.707f)
                moveTo(19f, 19f)
                lineToRelative(-0.707f, -0.707f)
                moveTo(12f, 3f)
                verticalLineToRelative(1f)
                moveToRelative(0f, 17f)
                verticalLineToRelative(-1f)
                moveToRelative(8f, -8f)
                horizontalLineToRelative(1f)
            }
        }.build()

        return _BrightnessLow!!
    }

@Suppress("ObjectPropertyName")
private var _BrightnessLow: ImageVector? = null
