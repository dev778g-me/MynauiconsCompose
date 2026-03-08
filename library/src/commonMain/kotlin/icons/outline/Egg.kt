package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Egg: ImageVector
    get() {
        if (_Egg != null) {
            return _Egg!!
        }
        _Egg = ImageVector.Builder(
            name = "Outline.Egg",
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
                moveTo(12f, 21f)
                curveToRelative(4.004f, 0f, 7.25f, -3.224f, 7.25f, -7.2f)
                reflectiveCurveTo(16.004f, 3f, 12f, 3f)
                reflectiveCurveTo(4.75f, 9.824f, 4.75f, 13.8f)
                reflectiveCurveTo(7.996f, 21f, 12f, 21f)
            }
        }.build()

        return _Egg!!
    }

@Suppress("ObjectPropertyName")
private var _Egg: ImageVector? = null
