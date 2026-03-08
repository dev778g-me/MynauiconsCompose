package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Logout: ImageVector
    get() {
        if (_Logout != null) {
            return _Logout!!
        }
        _Logout = ImageVector.Builder(
            name = "Filled.Logout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 3.75f)
                curveToRelative(-0.526f, 0f, -1.25f, 0.63f, -1.25f, 1.821f)
                verticalLineTo(18.43f)
                curveToRelative(0f, 1.192f, 0.724f, 1.821f, 1.25f, 1.821f)
                horizontalLineToRelative(6.996f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(6.5f)
                curveToRelative(-1.683f, 0f, -2.75f, -1.673f, -2.75f, -3.321f)
                verticalLineTo(5.57f)
                curveToRelative(0f, -1.648f, 1.067f, -3.321f, 2.75f, -3.321f)
                horizontalLineToRelative(7f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.53f, 7.97f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 0f)
                verticalLineToRelative(3.276f)
                horizontalLineTo(9.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(5.97f)
                verticalLineToRelative(3.284f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 0f)
                lineToRelative(3.5f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.22f, -0.532f)
                verticalLineToRelative(-0.002f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.269f, -0.575f)
                close()
            }
        }.build()

        return _Logout!!
    }

@Suppress("ObjectPropertyName")
private var _Logout: ImageVector? = null
