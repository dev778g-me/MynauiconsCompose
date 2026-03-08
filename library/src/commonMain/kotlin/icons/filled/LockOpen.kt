package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LockOpen: ImageVector
    get() {
        if (_LockOpen != null) {
            return _LockOpen!!
        }
        _LockOpen = ImageVector.Builder(
            name = "Filled.LockOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.75f, 8f)
                curveToRelative(0f, -1.283f, 0.29f, -2.36f, 0.822f, -3.096f)
                curveToRelative(0.51f, -0.703f, 1.28f, -1.154f, 2.428f, -1.154f)
                curveToRelative(0.883f, 0f, 1.53f, 0.267f, 2.004f, 0.685f)
                curveToRelative(0.485f, 0.427f, 0.843f, 1.058f, 1.049f, 1.865f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.453f, -0.371f)
                curveToRelative(-0.26f, -1.02f, -0.745f, -1.946f, -1.51f, -2.62f)
                curveTo(14.22f, 2.627f, 13.212f, 2.25f, 12f, 2.25f)
                curveToRelative(-1.613f, 0f, -2.842f, 0.668f, -3.643f, 1.775f)
                curveTo(7.58f, 5.099f, 7.25f, 6.522f, 7.25f, 8f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-0.58f)
                curveToRelative(-0.535f, 0f, -0.98f, 0f, -1.345f, 0.03f)
                curveToRelative(-0.38f, 0.031f, -0.736f, 0.098f, -1.073f, 0.27f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.202f, 1.202f)
                curveToRelative(-0.172f, 0.337f, -0.24f, 0.694f, -0.27f, 1.074f)
                curveToRelative(-0.03f, 0.364f, -0.03f, 0.81f, -0.03f, 1.344f)
                verticalLineToRelative(4.66f)
                curveToRelative(0f, 0.535f, 0f, 0.98f, 0.03f, 1.345f)
                curveToRelative(0.03f, 0.38f, 0.098f, 0.737f, 0.27f, 1.074f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.202f, 1.202f)
                curveToRelative(0.337f, 0.172f, 0.693f, 0.239f, 1.073f, 0.27f)
                curveToRelative(0.365f, 0.03f, 0.81f, 0.03f, 1.345f, 0.03f)
                horizontalLineToRelative(10.66f)
                curveToRelative(0.535f, 0f, 0.98f, 0f, 1.345f, -0.03f)
                curveToRelative(0.38f, -0.031f, 0.736f, -0.098f, 1.073f, -0.27f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.202f, -1.202f)
                curveToRelative(0.172f, -0.337f, 0.24f, -0.694f, 0.27f, -1.074f)
                curveToRelative(0.03f, -0.364f, 0.03f, -0.81f, 0.03f, -1.344f)
                verticalLineTo(13.17f)
                curveToRelative(0f, -0.534f, 0f, -0.98f, -0.03f, -1.344f)
                curveToRelative(-0.03f, -0.38f, -0.098f, -0.737f, -0.27f, -1.074f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.2f, -1.202f)
                curveToRelative(-0.338f, -0.172f, -0.694f, -0.239f, -1.074f, -0.27f)
                curveToRelative(-0.365f, -0.03f, -0.81f, -0.03f, -1.345f, -0.03f)
                horizontalLineTo(8.75f)
                close()
            }
        }.build()

        return _LockOpen!!
    }

@Suppress("ObjectPropertyName")
private var _LockOpen: ImageVector? = null
