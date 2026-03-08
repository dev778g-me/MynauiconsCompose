package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.PanelTopClose: ImageVector
    get() {
        if (_PanelTopClose != null) {
            return _PanelTopClose!!
        }
        _PanelTopClose = ImageVector.Builder(
            name = "Filled.PanelTopClose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.367f, 2.25f)
                horizontalLineToRelative(5.266f)
                curveToRelative(1.092f, 0f, 1.958f, 0f, 2.655f, 0.057f)
                curveToRelative(0.714f, 0.058f, 1.317f, 0.18f, 1.869f, 0.46f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.075f, 2.077f)
                curveToRelative(0.281f, 0.55f, 0.403f, 1.154f, 0.461f, 1.868f)
                curveToRelative(0.057f, 0.697f, 0.057f, 1.563f, 0.057f, 2.655f)
                verticalLineToRelative(5.266f)
                curveToRelative(0f, 1.092f, 0f, 1.958f, -0.057f, 2.655f)
                curveToRelative(-0.058f, 0.714f, -0.18f, 1.317f, -0.46f, 1.869f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.076f, 2.075f)
                curveToRelative(-0.552f, 0.281f, -1.155f, 0.403f, -1.869f, 0.461f)
                curveToRelative(-0.697f, 0.057f, -1.563f, 0.057f, -2.655f, 0.057f)
                horizontalLineTo(9.367f)
                curveToRelative(-1.092f, 0f, -1.958f, 0f, -2.655f, -0.057f)
                curveToRelative(-0.714f, -0.058f, -1.317f, -0.18f, -1.868f, -0.46f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.076f, -2.076f)
                curveToRelative(-0.281f, -0.552f, -0.403f, -1.155f, -0.461f, -1.869f)
                curveToRelative(-0.057f, -0.697f, -0.057f, -1.563f, -0.057f, -2.655f)
                verticalLineTo(9.367f)
                curveToRelative(0f, -1.092f, 0f, -1.958f, 0.057f, -2.655f)
                curveToRelative(0.058f, -0.714f, 0.18f, -1.317f, 0.46f, -1.868f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.077f, -2.076f)
                curveToRelative(0.55f, -0.281f, 1.154f, -0.403f, 1.868f, -0.461f)
                curveToRelative(0.697f, -0.057f, 1.563f, -0.057f, 2.655f, -0.057f)
                moveTo(6.834f, 3.802f)
                curveToRelative(-0.62f, 0.05f, -1.005f, 0.147f, -1.31f, 0.302f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, 1.42f)
                curveToRelative(-0.155f, 0.305f, -0.251f, 0.69f, -0.302f, 1.31f)
                curveToRelative(-0.032f, 0.392f, -0.044f, 0.851f, -0.05f, 1.416f)
                horizontalLineToRelative(16.495f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.049f, -1.416f)
                curveToRelative(-0.05f, -0.62f, -0.147f, -1.005f, -0.302f, -1.31f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, -1.42f)
                curveToRelative(-0.305f, -0.155f, -0.69f, -0.251f, -1.31f, -0.302f)
                curveToRelative(-0.63f, -0.051f, -1.434f, -0.052f, -2.566f, -0.052f)
                horizontalLineTo(9.4f)
                curveToRelative(-1.132f, 0f, -1.937f, 0f, -2.566f, 0.052f)
                moveToRelative(4.636f, 8.668f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineTo(12f, 14.06f)
                lineToRelative(2.47f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, -1.06f)
                lineToRelative(-3f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 0f)
            }
        }.build()

        return _PanelTopClose!!
    }

@Suppress("ObjectPropertyName")
private var _PanelTopClose: ImageVector? = null
