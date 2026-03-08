package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Contactless: ImageVector
    get() {
        if (_Contactless != null) {
            return _Contactless!!
        }
        _Contactless = ImageVector.Builder(
            name = "Outline.Contactless",
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
                moveTo(17.46f, 21f)
                curveToRelative(1.32f, -2.76f, 2.04f, -5.76f, 2.04f, -9f)
                reflectiveCurveToRelative(-0.72f, -6.36f, -2.04f, -9f)
                moveToRelative(-4.32f, 15.96f)
                curveTo(14.1f, 16.8f, 14.7f, 14.4f, 14.7f, 12f)
                reflectiveCurveToRelative(-0.6f, -4.92f, -1.56f, -7.08f)
                moveToRelative(-4.32f, 12f)
                curveTo(9.54f, 15.36f, 9.9f, 13.68f, 9.9f, 12f)
                reflectiveCurveToRelative(-0.36f, -3.48f, -1.08f, -4.92f)
                moveTo(4.5f, 14.76f)
                curveToRelative(0.36f, -0.84f, 0.6f, -1.8f, 0.6f, -2.76f)
                reflectiveCurveToRelative(-0.24f, -2.04f, -0.6f, -2.88f)
            }
        }.build()

        return _Contactless!!
    }

@Suppress("ObjectPropertyName")
private var _Contactless: ImageVector? = null
