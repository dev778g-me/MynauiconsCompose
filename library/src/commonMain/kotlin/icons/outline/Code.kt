package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Code: ImageVector
    get() {
        if (_Code != null) {
            return _Code!!
        }
        _Code = ImageVector.Builder(
            name = "Outline.Code",
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
                moveToRelative(17.09f, 7.974f)
                lineToRelative(0.23f, 0.23f)
                curveToRelative(1.789f, 1.79f, 2.684f, 2.684f, 2.684f, 3.796f)
                reflectiveCurveToRelative(-0.895f, 2.006f, -2.684f, 3.796f)
                lineToRelative(-0.23f, 0.23f)
                moveTo(13.876f, 5f)
                lineToRelative(-3.751f, 14f)
                moveTo(6.91f, 7.974f)
                lineToRelative(-0.23f, 0.23f)
                curveTo(4.892f, 9.994f, 3.997f, 10.888f, 3.997f, 12f)
                reflectiveCurveToRelative(0.895f, 2.006f, 2.685f, 3.796f)
                lineToRelative(0.23f, 0.23f)
            }
        }.build()

        return _Code!!
    }

@Suppress("ObjectPropertyName")
private var _Code: ImageVector? = null
