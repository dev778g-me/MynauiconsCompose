package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MapPinPlus: ImageVector
    get() {
        if (_MapPinPlus != null) {
            return _MapPinPlus!!
        }
        _MapPinPlus = ImageVector.Builder(
            name = "Filled.MapPinPlus",
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
                moveTo(16.5f, 17.5f)
                verticalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-1.5f)
                horizontalLineTo(20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
            }
        }.build()

        return _MapPinPlus!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinPlus: ImageVector? = null
