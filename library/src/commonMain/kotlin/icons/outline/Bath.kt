package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Bath: ImageVector
    get() {
        if (_Bath != null) {
            return _Bath!!
        }
        _Bath = ImageVector.Builder(
            name = "Outline.Bath",
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
                moveTo(21f, 12.022f)
                horizontalLineToRelative(-1.059f)
                moveToRelative(0f, 0f)
                horizontalLineTo(3.001f)
                moveToRelative(16.94f, 0f)
                curveToRelative(0f, 2.5f, 0.096f, 5.682f, -2.906f, 6.555f)
                moveTo(3f, 12.022f)
                verticalLineTo(6.037f)
                curveToRelative(0f, -4.337f, 5.5f, -3.775f, 5.5f, 0.076f)
                moveTo(3f, 12.022f)
                curveToRelative(0f, 2.5f, -0.096f, 5.682f, 2.907f, 6.555f)
                moveTo(8.5f, 6.113f)
                horizontalLineToRelative(1.059f)
                moveToRelative(-1.059f, 0f)
                horizontalLineTo(7.441f)
                moveTo(5.907f, 18.577f)
                lineTo(5.118f, 21f)
                moveToRelative(0.789f, -2.423f)
                curveToRelative(3.083f, 0.873f, 7.984f, 0.919f, 11.128f, 0f)
                moveToRelative(0f, 0f)
                lineTo(17.824f, 21f)
            }
        }.build()

        return _Bath!!
    }

@Suppress("ObjectPropertyName")
private var _Bath: ImageVector? = null
