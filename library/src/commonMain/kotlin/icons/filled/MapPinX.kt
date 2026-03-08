package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MapPinX: ImageVector
    get() {
        if (_MapPinX != null) {
            return _MapPinX!!
        }
        _MapPinX = ImageVector.Builder(
            name = "Filled.MapPinX",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.406f, 3.727f)
                arcTo(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.406f, 2.727f)
                curveToRelative(-3.12f, 3.208f, -3.09f, 7.056f, -1.663f, 10.468f)
                curveToRelative(1.407f, 3.365f, 4.2f, 6.42f, 6.876f, 8.409f)
                arcToRelative(1.995f, 1.995f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.386f, 0f)
                quadToRelative(0.739f, -0.55f, 1.468f, -1.19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.322f, -1.5f)
                curveToRelative(-0.444f, 0.39f, -0.895f, 0.754f, -1.34f, 1.084f)
                curveToRelative(-2.474f, -1.838f, -4.991f, -4.629f, -6.224f, -7.575f)
                curveToRelative(-1.212f, -2.899f, -1.154f, -5.826f, 1.253f, -8.302f)
                arcTo(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                curveToRelative(1.86f, 0f, 3.648f, 0.76f, 4.972f, 2.121f)
                curveToRelative(1.97f, 2.027f, 2.35f, 4.326f, 1.797f, 6.648f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.947f, 0.462f)
                curveToRelative(0.688f, -2.893f, 0.201f, -5.922f, -2.31f, -8.504f)
                moveToRelative(1.801f, 10.066f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 0f)
                lineTo(17.5f, 15.086f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(-0.076f, -0.068f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.406f, 1.406f)
                lineToRelative(0.068f, 0.076f)
                lineToRelative(1.293f, 1.293f)
                lineToRelative(-1.293f, 1.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.414f, 1.414f)
                lineToRelative(1.293f, -1.293f)
                lineToRelative(1.293f, 1.293f)
                lineToRelative(0.076f, 0.068f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.406f, -1.406f)
                lineToRelative(-0.068f, -0.076f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(1.293f, -1.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.414f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
            }
        }.build()

        return _MapPinX!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinX: ImageVector? = null
