package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Heater: ImageVector
    get() {
        if (_Heater != null) {
            return _Heater!!
        }
        _Heater = ImageVector.Builder(
            name = "Outline.Heater",
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
                moveTo(6f, 9f)
                curveToRelative(0f, -1.5f, 2f, -3.5f, 2f, -5f)
                moveToRelative(3f, 5f)
                curveToRelative(0f, -1.5f, 2f, -3.5f, 2f, -5f)
                moveToRelative(3f, 5f)
                curveToRelative(0f, -1.5f, 2f, -3.5f, 2f, -5f)
                moveTo(4.5f, 21f)
                verticalLineToRelative(-7.4f)
                curveToRelative(0f, -1.164f, 0.364f, -1.6f, 1.6f, -1.6f)
                horizontalLineToRelative(11.8f)
                curveToRelative(1.236f, 0f, 1.6f, 0.436f, 1.6f, 1.6f)
                verticalLineTo(21f)
                moveToRelative(-15f, -2.5f)
                horizontalLineToRelative(15f)
                moveTo(7.5f, 12f)
                verticalLineToRelative(6.5f)
                moveToRelative(3f, -6.5f)
                verticalLineToRelative(6.5f)
                moveToRelative(3f, -6.5f)
                verticalLineToRelative(6.5f)
                moveToRelative(3f, -6.5f)
                verticalLineToRelative(6.5f)
            }
        }.build()

        return _Heater!!
    }

@Suppress("ObjectPropertyName")
private var _Heater: ImageVector? = null
