package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.GitCommit: ImageVector
    get() {
        if (_GitCommit != null) {
            return _GitCommit!!
        }
        _GitCommit = ImageVector.Builder(
            name = "Filled.GitCommit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8.25f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.675f, 3f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(5.325f)
                arcToRelative(3.751f, 3.751f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.35f, 0f)
                horizontalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-5.325f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.675f, -3f)
            }
        }.build()

        return _GitCommit!!
    }

@Suppress("ObjectPropertyName")
private var _GitCommit: ImageVector? = null
