package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MapPinHouse: ImageVector
    get() {
        if (_MapPinHouse != null) {
            return _MapPinHouse!!
        }
        _MapPinHouse = ImageVector.Builder(
            name = "Filled.MapPinHouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveToRelative(2.408f, 0f, 4.712f, 0.984f, 6.406f, 2.727f)
                curveToRelative(2.511f, 2.582f, 2.998f, 5.61f, 2.31f, 8.504f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.947f, -0.462f)
                curveToRelative(0.553f, -2.322f, 0.173f, -4.62f, -1.797f, -6.648f)
                arcTo(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                curveToRelative(-1.86f, 0f, -3.648f, 0.76f, -4.972f, 2.121f)
                curveToRelative(-2.407f, 2.476f, -2.465f, 5.403f, -1.253f, 8.302f)
                curveToRelative(1.233f, 2.946f, 3.75f, 5.737f, 6.224f, 7.575f)
                curveToRelative(0.445f, -0.33f, 0.896f, -0.693f, 1.34f, -1.085f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.322f, 1.5f)
                quadToRelative(-0.73f, 0.642f, -1.468f, 1.19f)
                arcToRelative(1.995f, 1.995f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.386f, 0f)
                curveTo(8.13f, 20.617f, 5.338f, 17.56f, 3.93f, 14.196f)
                curveToRelative(-1.428f, -3.412f, -1.456f, -7.26f, 1.663f, -10.468f)
                arcTo(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                moveToRelative(3.5f, 9.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineToRelative(-2.36f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.411f, -0.808f)
                lineToRelative(-2.25f, -1.64f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.041f, -0.084f)
                lineToRelative(-0.137f, 0.084f)
                lineToRelative(-2.25f, 1.64f)
                curveToRelative(-0.258f, 0.188f, -0.411f, 0.49f, -0.411f, 0.809f)
                verticalLineTo(17.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                close()
            }
        }.build()

        return _MapPinHouse!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinHouse: ImageVector? = null
