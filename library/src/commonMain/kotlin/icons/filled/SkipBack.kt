package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SkipBack: ImageVector
    get() {
        if (_SkipBack != null) {
            return _SkipBack!!
        }
        _SkipBack = ImageVector.Builder(
            name = "Filled.SkipBack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(12.907f, 1.464f)
                curveToRelative(1.146f, -0.917f, 2.843f, -0.1f, 2.843f, 1.367f)
                verticalLineToRelative(13.838f)
                curveToRelative(0f, 1.468f, -1.697f, 2.284f, -2.843f, 1.367f)
                lineToRelative(-8.65f, -6.92f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.732f)
                close()
            }
        }.build()

        return _SkipBack!!
    }

@Suppress("ObjectPropertyName")
private var _SkipBack: ImageVector? = null
