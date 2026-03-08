package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Cocktail: ImageVector
    get() {
        if (_Cocktail != null) {
            return _Cocktail!!
        }
        _Cocktail = ImageVector.Builder(
            name = "Filled.Cocktail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.012f, 2.25f)
                curveToRelative(-1.463f, 0f, -2.307f, 1.69f, -1.372f, 2.846f)
                lineToRelative(7.61f, 9.42f)
                verticalLineToRelative(5.734f)
                lineTo(7.33f, 20.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(9.341f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-3.92f)
                verticalLineToRelative(-5.735f)
                lineToRelative(7.61f, -9.419f)
                curveToRelative(0.934f, -1.157f, 0.09f, -2.846f, -1.373f, -2.846f)
                close()
                moveTo(6.905f, 6.75f)
                lineTo(4.807f, 4.153f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.205f, -0.403f)
                horizontalLineToRelative(13.976f)
                curveToRelative(0.231f, 0f, 0.33f, 0.25f, 0.206f, 0.403f)
                lineTo(17.096f, 6.75f)
                close()
            }
        }.build()

        return _Cocktail!!
    }

@Suppress("ObjectPropertyName")
private var _Cocktail: ImageVector? = null
