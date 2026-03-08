package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Cocktail: ImageVector
    get() {
        if (_Cocktail != null) {
            return _Cocktail!!
        }
        _Cocktail = ImageVector.Builder(
            name = "Outline.Cocktail",
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
                moveToRelative(12f, 14.25f)
                lineToRelative(7.777f, -9.625f)
                curveTo(20.306f, 3.97f, 19.835f, 3f, 18.988f, 3f)
                lineTo(5.012f, 3f)
                curveToRelative(-0.847f, 0f, -1.318f, 0.97f, -0.789f, 1.625f)
                close()
                moveTo(12f, 14.25f)
                lineTo(12f, 21f)
                moveTo(6.546f, 7.5f)
                horizontalLineToRelative(10.908f)
                moveTo(7.329f, 21f)
                horizontalLineToRelative(9.342f)
            }
        }.build()

        return _Cocktail!!
    }

@Suppress("ObjectPropertyName")
private var _Cocktail: ImageVector? = null
