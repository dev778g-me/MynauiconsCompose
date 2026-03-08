package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BookOpen: ImageVector
    get() {
        if (_BookOpen != null) {
            return _BookOpen!!
        }
        _BookOpen = ImageVector.Builder(
            name = "Filled.BookOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5.776f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.298f, -1.117f)
                curveToRelative(-0.444f, -0.227f, -0.924f, -0.321f, -1.47f, -0.366f)
                curveToRelative(-0.532f, -0.043f, -1.187f, -0.043f, -2f, -0.043f)
                horizontalLineTo(4.6f)
                curveToRelative(-0.667f, 0f, -1.337f, 0.109f, -1.803f, 0.593f)
                curveToRelative(-0.461f, 0.478f, -0.547f, 1.14f, -0.547f, 1.757f)
                verticalLineToRelative(8.887f)
                curveToRelative(-0.002f, 0.244f, -0.004f, 0.604f, 0.076f, 0.936f)
                curveToRelative(0.103f, 0.427f, 0.35f, 0.867f, 0.88f, 1.136f)
                curveToRelative(0.23f, 0.118f, 0.463f, 0.157f, 0.675f, 0.175f)
                curveToRelative(0.198f, 0.016f, 0.434f, 0.016f, 0.69f, 0.016f)
                horizontalLineToRelative(2.86f)
                curveToRelative(1.066f, 0f, 1.714f, 0.228f, 2.239f, 0.616f)
                curveToRelative(0.563f, 0.417f, 1.046f, 1.06f, 1.706f, 2.05f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.248f, 0f)
                curveToRelative(0.66f, -0.99f, 1.144f, -1.633f, 1.706f, -2.05f)
                curveToRelative(0.525f, -0.388f, 1.173f, -0.616f, 2.24f, -0.616f)
                horizontalLineToRelative(2.858f)
                curveToRelative(0.257f, 0f, 0.493f, 0f, 0.69f, -0.016f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.677f, -0.175f)
                curveToRelative(0.529f, -0.269f, 0.777f, -0.71f, 0.88f, -1.136f)
                curveToRelative(0.08f, -0.332f, 0.077f, -0.693f, 0.075f, -0.937f)
                verticalLineTo(6.6f)
                curveToRelative(0f, -0.617f, -0.086f, -1.28f, -0.547f, -1.757f)
                curveToRelative(-0.467f, -0.484f, -1.137f, -0.593f, -1.803f, -0.593f)
                horizontalLineToRelative(-2.632f)
                curveToRelative(-0.813f, 0f, -1.469f, 0f, -2f, 0.043f)
                curveToRelative(-0.546f, 0.045f, -1.027f, 0.14f, -1.47f, 0.366f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5.776f)
            }
        }.build()

        return _BookOpen!!
    }

@Suppress("ObjectPropertyName")
private var _BookOpen: ImageVector? = null
