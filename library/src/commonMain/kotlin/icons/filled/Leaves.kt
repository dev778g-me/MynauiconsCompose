package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Leaves: ImageVector
    get() {
        if (_Leaves != null) {
            return _Leaves!!
        }
        _Leaves = ImageVector.Builder(
            name = "Filled.Leaves",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.088f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.643f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.088f, 1.24f)
                curveToRelative(0f, 4.548f, 3.524f, 8.27f, 8f, 8.647f)
                verticalLineTo(20f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-6.22f)
                curveToRelative(4.476f, -0.377f, 8f, -4.1f, 8f, -8.648f)
                quadToRelative(0f, -0.63f, -0.089f, -1.24f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.642f)
                arcTo(8.76f, 8.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8.407f)
                arcTo(8.76f, 8.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.088f, 3.25f)
            }
        }.build()

        return _Leaves!!
    }

@Suppress("ObjectPropertyName")
private var _Leaves: ImageVector? = null
