package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SkipForward: ImageVector
    get() {
        if (_SkipForward != null) {
            return _SkipForward!!
        }
        _SkipForward = ImageVector.Builder(
            name = "Filled.SkipForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveTo(3.75f, 5.08f)
                curveToRelative(0f, -1.467f, 1.697f, -2.283f, 2.843f, -1.366f)
                lineToRelative(8.65f, 6.92f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.733f)
                lineToRelative(-8.65f, 6.919f)
                curveToRelative(-1.146f, 0.917f, -2.843f, 0.1f, -2.843f, -1.367f)
                close()
            }
        }.build()

        return _SkipForward!!
    }

@Suppress("ObjectPropertyName")
private var _SkipForward: ImageVector? = null
