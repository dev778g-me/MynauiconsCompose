package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Table: ImageVector
    get() {
        if (_Table != null) {
            return _Table!!
        }
        _Table = ImageVector.Builder(
            name = "Filled.Table",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.693f, 17.288f)
                curveToRelative(0.057f, -0.697f, 0.057f, -1.563f, 0.057f, -2.655f)
                verticalLineTo(10.25f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(4.883f)
                curveToRelative(1.092f, 0f, 1.958f, 0f, 2.655f, -0.057f)
                curveToRelative(0.714f, -0.058f, 1.317f, -0.18f, 1.869f, -0.46f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.075f, -2.076f)
                curveToRelative(0.281f, -0.552f, 0.403f, -1.155f, 0.461f, -1.869f)
                moveTo(17.288f, 2.307f)
                curveToRelative(-0.697f, -0.057f, -1.563f, -0.057f, -2.655f, -0.057f)
                horizontalLineTo(9.75f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(12f)
                curveToRelative(-0.002f, -0.808f, -0.011f, -1.477f, -0.057f, -2.038f)
                curveToRelative(-0.058f, -0.714f, -0.18f, -1.317f, -0.46f, -1.868f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.076f, -2.076f)
                curveToRelative(-0.552f, -0.281f, -1.155f, -0.403f, -1.869f, -0.461f)
                moveTo(2.768f, 4.844f)
                curveToRelative(-0.281f, 0.55f, -0.403f, 1.154f, -0.461f, 1.868f)
                curveToRelative(-0.046f, 0.56f, -0.055f, 1.23f, -0.057f, 2.038f)
                horizontalLineToRelative(6f)
                verticalLineTo(2.253f)
                curveToRelative(-0.59f, 0.005f, -1.097f, 0.018f, -1.538f, 0.054f)
                curveToRelative(-0.714f, 0.058f, -1.317f, 0.18f, -1.868f, 0.46f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.076f, 2.077f)
                moveToRelative(2.076f, 16.388f)
                curveToRelative(0.55f, 0.281f, 1.154f, 0.403f, 1.868f, 0.461f)
                curveToRelative(0.44f, 0.036f, 0.948f, 0.05f, 1.538f, 0.054f)
                verticalLineTo(10.25f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(4.383f)
                curveToRelative(0f, 1.092f, 0f, 1.958f, 0.057f, 2.655f)
                curveToRelative(0.058f, 0.714f, 0.18f, 1.317f, 0.46f, 1.869f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.077f, 2.075f)
            }
        }.build()

        return _Table!!
    }

@Suppress("ObjectPropertyName")
private var _Table: ImageVector? = null
