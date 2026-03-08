package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Login: ImageVector
    get() {
        if (_Login != null) {
            return _Login!!
        }
        _Login = ImageVector.Builder(
            name = "Filled.Login",
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
                moveTo(20.25f, 11.996f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.75f)
                horizontalLineToRelative(-5.97f)
                verticalLineTo(7.97f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 0f)
                lineToRelative(-3.451f, 3.45f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.269f, 0.576f)
                verticalLineToRelative(0.002f)
                curveToRelative(0f, 0.193f, 0.073f, 0.385f, 0.22f, 0.532f)
                lineToRelative(3.5f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 0f)
                verticalLineToRelative(-3.284f)
                horizontalLineToRelative(5.97f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
            }
        }.build()

        return _Login!!
    }

@Suppress("ObjectPropertyName")
private var _Login: ImageVector? = null
