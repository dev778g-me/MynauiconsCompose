package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CheckSquareOne: ImageVector
    get() {
        if (_CheckSquareOne != null) {
            return _CheckSquareOne!!
        }
        _CheckSquareOne = ImageVector.Builder(
            name = "Filled.CheckSquareOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.399f, 2.551f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.202f, 0.898f)
                lineToRelative(-7.232f, 9.69f)
                arcToRelative(1.537f, 1.537f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.364f, 0.11f)
                lineToRelative(-3.561f, -3.94f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.112f, -1.006f)
                lineToRelative(3.562f, 3.94f)
                lineToRelative(0.007f, 0.004f)
                quadToRelative(0.006f, 0.003f, 0.02f, 0.003f)
                lineToRelative(0.017f, -0.004f)
                lineToRelative(0.004f, -0.004f)
                close()
                moveTo(9.367f, 2.25f)
                horizontalLineTo(9.4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 1.5f)
                curveToRelative(-1.132f, 0f, -1.937f, 0f, -2.566f, 0.052f)
                curveToRelative(-0.62f, 0.05f, -1.005f, 0.147f, -1.31f, 0.302f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, 1.42f)
                curveToRelative(-0.155f, 0.305f, -0.251f, 0.69f, -0.302f, 1.31f)
                curveToRelative(-0.051f, 0.63f, -0.052f, 1.434f, -0.052f, 2.566f)
                verticalLineToRelative(5.2f)
                curveToRelative(0f, 1.133f, 0f, 1.937f, 0.052f, 2.566f)
                curveToRelative(0.05f, 0.62f, 0.147f, 1.005f, 0.302f, 1.31f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, 1.42f)
                curveToRelative(0.305f, 0.155f, 0.69f, 0.251f, 1.31f, 0.302f)
                curveToRelative(0.63f, 0.052f, 1.434f, 0.052f, 2.566f, 0.052f)
                horizontalLineToRelative(5.2f)
                curveToRelative(1.133f, 0f, 1.937f, 0f, 2.566f, -0.052f)
                curveToRelative(0.62f, -0.05f, 1.005f, -0.147f, 1.31f, -0.302f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, -1.42f)
                curveToRelative(0.155f, -0.305f, 0.251f, -0.69f, 0.302f, -1.31f)
                curveToRelative(0.051f, -0.63f, 0.052f, -1.434f, 0.052f, -2.566f)
                verticalLineToRelative(-1.1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(1.133f)
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
            }
        }.build()

        return _CheckSquareOne!!
    }

@Suppress("ObjectPropertyName")
private var _CheckSquareOne: ImageVector? = null
