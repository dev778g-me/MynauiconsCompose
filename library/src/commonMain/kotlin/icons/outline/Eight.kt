package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Eight: ImageVector
    get() {
        if (_Eight != null) {
            return _Eight!!
        }
        _Eight = ImageVector.Builder(
            name = "Outline.Eight",
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
                moveTo(11.875f, 12f)
                reflectiveCurveTo(15f, 12.625f, 15f, 14.5f)
                reflectiveCurveTo(13.6f, 17f, 11.875f, 17f)
                reflectiveCurveToRelative(-3.125f, -0.625f, -3.125f, -2.5f)
                reflectiveCurveToRelative(3.125f, -2.5f, 3.125f, -2.5f)
                moveToRelative(0f, 0f)
                reflectiveCurveTo(15f, 11.375f, 15f, 9.5f)
                reflectiveCurveTo(13.6f, 7f, 11.875f, 7f)
                reflectiveCurveTo(8.75f, 7.625f, 8.75f, 9.5f)
                reflectiveCurveToRelative(3.125f, 2.5f, 3.125f, 2.5f)
            }
        }.build()

        return _Eight!!
    }

@Suppress("ObjectPropertyName")
private var _Eight: ImageVector? = null
