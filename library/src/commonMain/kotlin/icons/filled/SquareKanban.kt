package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SquareKanban: ImageVector
    get() {
        if (_SquareKanban != null) {
            return _SquareKanban!!
        }
        _SquareKanban = ImageVector.Builder(
            name = "Filled.SquareKanban",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.65f, 2.25f)
                curveToRelative(1.084f, 0f, 1.944f, 0f, 2.638f, 0.057f)
                curveToRelative(0.713f, 0.058f, 1.317f, 0.18f, 1.868f, 0.46f)
                lineToRelative(0.327f, 0.184f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.75f, 1.893f)
                lineToRelative(0.097f, 0.209f)
                curveToRelative(0.212f, 0.494f, 0.312f, 1.035f, 0.363f, 1.659f)
                curveToRelative(0.057f, 0.694f, 0.057f, 1.554f, 0.057f, 2.638f)
                verticalLineToRelative(5.3f)
                curveToRelative(0f, 1.084f, 0f, 1.944f, -0.057f, 2.638f)
                curveToRelative(-0.05f, 0.624f, -0.15f, 1.165f, -0.363f, 1.66f)
                lineToRelative(-0.098f, 0.208f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.749f, 1.893f)
                lineToRelative(-0.327f, 0.183f)
                curveToRelative(-0.55f, 0.281f, -1.155f, 0.403f, -1.868f, 0.461f)
                curveToRelative(-0.694f, 0.057f, -1.554f, 0.057f, -2.638f, 0.057f)
                horizontalLineToRelative(-5.3f)
                curveToRelative(-1.084f, 0f, -1.944f, 0f, -2.638f, -0.057f)
                curveToRelative(-0.624f, -0.05f, -1.165f, -0.15f, -1.66f, -0.363f)
                lineToRelative(-0.208f, -0.098f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.893f, -1.749f)
                lineToRelative(-0.183f, -0.327f)
                curveToRelative(-0.281f, -0.55f, -0.403f, -1.155f, -0.461f, -1.868f)
                curveToRelative(-0.057f, -0.694f, -0.057f, -1.554f, -0.057f, -2.638f)
                verticalLineToRelative(-5.3f)
                curveToRelative(0f, -1.084f, 0f, -1.944f, 0.057f, -2.638f)
                curveToRelative(0.058f, -0.713f, 0.18f, -1.317f, 0.46f, -1.868f)
                lineToRelative(0.184f, -0.327f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.893f, -1.75f)
                lineToRelative(0.209f, -0.097f)
                curveToRelative(0.494f, -0.212f, 1.035f, -0.312f, 1.659f, -0.363f)
                curveToRelative(0.694f, -0.057f, 1.554f, -0.057f, 2.638f, -0.057f)
                close()
                moveTo(12f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                moveTo(7f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                moveToRelative(10f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
            }
        }.build()

        return _SquareKanban!!
    }

@Suppress("ObjectPropertyName")
private var _SquareKanban: ImageVector? = null
