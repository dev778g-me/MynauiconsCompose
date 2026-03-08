package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.GitBranch: ImageVector
    get() {
        if (_GitBranch != null) {
            return _GitBranch!!
        }
        _GitBranch = ImageVector.Builder(
            name = "Filled.GitBranch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.75f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(11.325f)
                arcToRelative(3.751f, 3.751f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.43f, 4.402f)
                arcToRelative(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.047f, -9.047f)
                arcToRelative(3.751f, 3.751f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.504f, -0.01f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.554f, 7.553f)
                arcToRelative(3.76f, 3.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.919f, -2.898f)
                close()
            }
        }.build()

        return _GitBranch!!
    }

@Suppress("ObjectPropertyName")
private var _GitBranch: ImageVector? = null
