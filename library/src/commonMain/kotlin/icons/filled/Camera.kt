package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Camera: ImageVector
    get() {
        if (_Camera != null) {
            return _Camera!!
        }
        _Camera = ImageVector.Builder(
            name = "Filled.Camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.153f, 2.249f)
                curveToRelative(0.212f, -0.004f, 0.515f, -0.009f, 0.794f, 0.036f)
                curveToRelative(0.933f, 0.152f, 1.54f, 0.743f, 1.969f, 1.158f)
                lineToRelative(0.122f, 0.118f)
                curveToRelative(0.463f, 0.441f, 0.792f, 0.689f, 1.345f, 0.689f)
                horizontalLineToRelative(8.98f)
                curveToRelative(0.688f, 0f, 1.308f, 0.335f, 1.738f, 0.86f)
                curveToRelative(0.427f, 0.523f, 0.649f, 1.204f, 0.649f, 1.89f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.686f, -0.222f, 1.367f, -0.649f, 1.89f)
                curveToRelative(-0.43f, 0.525f, -1.05f, 0.86f, -1.737f, 0.86f)
                horizontalLineTo(4.636f)
                curveToRelative(-0.687f, 0f, -1.307f, -0.335f, -1.737f, -0.86f)
                curveToRelative(-0.427f, -0.523f, -0.649f, -1.204f, -0.649f, -1.89f)
                verticalLineTo(5.997f)
                curveToRelative(0f, -0.455f, 0f, -0.834f, 0.022f, -1.146f)
                curveToRelative(0.022f, -0.324f, 0.071f, -0.63f, 0.197f, -0.926f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.925f, 2.47f)
                curveToRelative(0.296f, -0.126f, 0.602f, -0.175f, 0.926f, -0.197f)
                curveToRelative(0.312f, -0.022f, 0.691f, -0.022f, 1.146f, -0.022f)
                horizontalLineToRelative(0.025f)
                close()
                moveTo(15.25f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                moveTo(13.5f, 9.75f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 6.5f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6.5f)
            }
        }.build()

        return _Camera!!
    }

@Suppress("ObjectPropertyName")
private var _Camera: ImageVector? = null
