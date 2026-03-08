package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LockOpenKeyhole: ImageVector
    get() {
        if (_LockOpenKeyhole != null) {
            return _LockOpenKeyhole!!
        }
        _LockOpenKeyhole = ImageVector.Builder(
            name = "Filled.LockOpenKeyhole",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.572f, 4.904f)
                curveTo(9.04f, 5.64f, 8.75f, 6.717f, 8.75f, 8f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(8.58f)
                curveToRelative(0.535f, 0f, 0.98f, 0f, 1.345f, 0.03f)
                curveToRelative(0.38f, 0.031f, 0.736f, 0.098f, 1.073f, 0.27f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.202f, 1.202f)
                curveToRelative(0.172f, 0.337f, 0.24f, 0.694f, 0.27f, 1.074f)
                curveToRelative(0.03f, 0.364f, 0.03f, 0.81f, 0.03f, 1.344f)
                verticalLineToRelative(4.66f)
                curveToRelative(0f, 0.535f, 0f, 0.98f, -0.03f, 1.345f)
                curveToRelative(-0.03f, 0.38f, -0.098f, 0.737f, -0.27f, 1.074f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.201f, 1.202f)
                curveToRelative(-0.338f, 0.172f, -0.694f, 0.239f, -1.074f, 0.27f)
                curveToRelative(-0.365f, 0.03f, -0.81f, 0.03f, -1.344f, 0.03f)
                horizontalLineTo(6.67f)
                curveToRelative(-0.535f, 0f, -0.98f, 0f, -1.345f, -0.03f)
                curveToRelative(-0.38f, -0.031f, -0.736f, -0.098f, -1.073f, -0.27f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.202f, -1.202f)
                curveToRelative(-0.172f, -0.337f, -0.24f, -0.694f, -0.27f, -1.074f)
                curveToRelative(-0.03f, -0.364f, -0.03f, -0.81f, -0.03f, -1.344f)
                verticalLineTo(13.17f)
                curveToRelative(0f, -0.534f, 0f, -0.98f, 0.03f, -1.344f)
                curveToRelative(0.03f, -0.38f, 0.098f, -0.737f, 0.27f, -1.074f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.252f, 9.55f)
                curveToRelative(0.337f, -0.172f, 0.693f, -0.239f, 1.073f, -0.27f)
                curveToRelative(0.365f, -0.03f, 0.81f, -0.03f, 1.345f, -0.03f)
                horizontalLineToRelative(0.58f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.478f, 0.33f, -2.901f, 1.107f, -3.975f)
                curveToRelative(0.8f, -1.107f, 2.03f, -1.775f, 3.643f, -1.775f)
                curveToRelative(1.212f, 0f, 2.221f, 0.377f, 2.996f, 1.06f)
                curveToRelative(0.765f, 0.673f, 1.25f, 1.599f, 1.51f, 2.619f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.453f, 0.371f)
                curveToRelative(-0.207f, -0.807f, -0.564f, -1.438f, -1.049f, -1.865f)
                curveToRelative(-0.474f, -0.418f, -1.121f, -0.685f, -2.004f, -0.685f)
                curveToRelative(-1.148f, 0f, -1.919f, 0.45f, -2.428f, 1.154f)
                moveToRelative(7.178f, 9.097f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
            }
        }.build()

        return _LockOpenKeyhole!!
    }

@Suppress("ObjectPropertyName")
private var _LockOpenKeyhole: ImageVector? = null
