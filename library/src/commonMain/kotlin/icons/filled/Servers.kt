package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Servers: ImageVector
    get() {
        if (_Servers != null) {
            return _Servers!!
        }
        _Servers = ImageVector.Builder(
            name = "Filled.Servers",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 5.7f)
                curveToRelative(0f, -0.943f, 0.661f, -1.95f, 1.75f, -1.95f)
                horizontalLineToRelative(16f)
                curveToRelative(1.089f, 0f, 1.75f, 1.007f, 1.75f, 1.95f)
                verticalLineToRelative(3.6f)
                curveToRelative(0f, 0.943f, -0.661f, 1.95f, -1.75f, 1.95f)
                horizontalLineTo(4f)
                curveToRelative(-1.089f, 0f, -1.75f, -1.007f, -1.75f, -1.95f)
                close()
                moveTo(6f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
                moveTo(2.25f, 14.7f)
                curveToRelative(0f, -0.943f, 0.661f, -1.95f, 1.75f, -1.95f)
                horizontalLineToRelative(16f)
                curveToRelative(1.089f, 0f, 1.75f, 1.007f, 1.75f, 1.95f)
                verticalLineToRelative(3.6f)
                curveToRelative(0f, 0.943f, -0.661f, 1.95f, -1.75f, 1.95f)
                horizontalLineTo(4f)
                curveToRelative(-1.089f, 0f, -1.75f, -1.007f, -1.75f, -1.95f)
                close()
                moveTo(6f, 15.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
            }
        }.build()

        return _Servers!!
    }

@Suppress("ObjectPropertyName")
private var _Servers: ImageVector? = null
