package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Pizza: ImageVector
    get() {
        if (_Pizza != null) {
            return _Pizza!!
        }
        _Pizza = ImageVector.Builder(
            name = "Filled.Pizza",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.895f, 3.514f)
                lineToRelative(4.778f, 15.928f)
                curveToRelative(0.41f, 1.367f, -0.864f, 2.641f, -2.231f, 2.231f)
                lineTo(3.514f, 16.895f)
                curveToRelative(-0.921f, -0.277f, -1.496f, -1.258f, -1.175f, -2.222f)
                arcTo(19.5f, 19.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.673f, 2.34f)
                curveToRelative(0.964f, -0.322f, 1.945f, 0.254f, 2.222f, 1.175f)
                moveToRelative(-1.747f, 0.248f)
                arcTo(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.762f, 15.148f)
                curveToRelative(-0.037f, 0.11f, 0.02f, 0.261f, 0.183f, 0.31f)
                lineToRelative(1.802f, 0.54f)
                arcTo(16.73f, 16.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 5.749f)
                lineToRelative(-0.541f, -1.803f)
                curveToRelative(-0.049f, -0.163f, -0.2f, -0.22f, -0.31f, -0.183f)
                moveToRelative(0.382f, 6.708f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.06f, 1.06f)
                lineToRelative(0.353f, 0.354f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, -1.06f)
                close()
                moveTo(11.531f, 14.471f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.06f, 1.06f)
                lineToRelative(0.353f, 0.354f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, -1.06f)
                close()
                moveTo(16.531f, 15.471f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.06f, 1.06f)
                lineToRelative(0.353f, 0.354f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, -1.06f)
                close()
            }
        }.build()

        return _Pizza!!
    }

@Suppress("ObjectPropertyName")
private var _Pizza: ImageVector? = null
